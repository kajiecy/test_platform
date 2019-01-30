package org.jsoncloud.project.mt4platform.inter.controller;

import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jsoncloud.framework.exception.ProjectException;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.sms.PropertiesUtil;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;
import org.jsoncloud.project.mt4platform.base.tableenum.OrderCommandEnum;
import org.jsoncloud.project.mt4platform.inter.Constants;
import org.jsoncloud.project.mt4platform.inter.core.OrderCore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {
    private static MTMServiceLocator mtmServiceLocator;

    public static Map<String,Object> resultMap = new HashMap<>();


    @Autowired
    private RedisDao redisDao;
    @Autowired
    private OrderCore orderCore;

    private static MTMServiceSoap_PortType mtmServiceSoap_portType = null;
    private static ManagerInfo managerInfo_demo = new ManagerInfo();
    private static ManagerInfo managerInfo_real = new ManagerInfo();

    static {
        mtmServiceLocator = new MTMServiceLocator();
        try {
            //demo服务器的管理员信息
            mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
            managerInfo_demo.setLogin(Integer.parseInt(PropertiesUtil.get("test_login")));
            managerInfo_demo.setPassword(PropertiesUtil.get("test_pwd"));
            managerInfo_demo.setServer(PropertiesUtil.get("test_addr"));
            //real服务器的管理员信息
            managerInfo_real.setLogin(Integer.parseInt(PropertiesUtil.get("real_login")));
            managerInfo_real.setPassword(PropertiesUtil.get("real_pwd"));
            managerInfo_real.setServer(PropertiesUtil.get("real_addr"));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    /**
     * 此方法用来获取用户的交易信息(此方法之只能用于本地登陆)
     * 通过用户token判断用户登陆方式
     * 如果为本地的登陆
     * 1.从数据库 获取 用户信息以及用户订单
     * 2.从redice服务器上获取实时交易信息
     * 3.循环计算每个订单的盈利情况【profit】
     * 4.获取用户的保证金
     * 5计算用户的结余 当前【balance】（用户balance） 净值【equity】（用户balance+盈亏情况）可用预付费款【margin_free】（净值-保证金）预付款比【margin_level】（净值/预付款*100）预付款【margin】
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/getOrderInfo.json")
    public Map<String, Object> getOrderInfo(HttpServletRequest request){

        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        if (server_type == LoginTypeEnum.LOCAL_SERVER.getValue()){
            Map<String, Object> condition = getCondition();
            condition.put("login_id", login_id);
            Map<String, Object> login_info = mybatisDao.selectMapOne("LoginMapper.selLogin", condition);
            List<Map<String, Object>> order_list = mybatisDao.selectMapList("OrderMapper.selOrderList", condition);

            //获取用户保证金
            Map<String, Object> marginMap = mybatisDao.selectMapOne("OrderMapper.selectSumMargin", condition);
            BigDecimal margin = new BigDecimal("0");
            if(marginMap==null){
                margin  = new BigDecimal("0");
            }else {
                margin = (BigDecimal) marginMap.get("margin_all");
            }
            // 拿到当前 symbol 的价格
            String symbolsstr = this.redisDao.getValue("symbolsmap");
            Map<String, Object> symbolMap = null;
            if (symbolsstr != null) {
                symbolMap = JSON.parseObject(symbolsstr);
            }
            BigDecimal subtract_sum = BigDecimal.ZERO;
            for (Map<String, Object> orderinfo : order_list){
                String symbol = (String) orderinfo.get("symbol");
                int command = (Integer) orderinfo.get("command");
                BigDecimal price = (BigDecimal) orderinfo.get("price");
                BigDecimal storage = (BigDecimal) orderinfo.get("storage");
                BigDecimal volume = ((BigDecimal) orderinfo.get("volume")); // 数量：该数量 0.01为一手
                BigDecimal subtract = BigDecimal.ZERO; //USD利润
                String digit = ((Map<String, String>) symbolMap.get(symbol)).get("digits");
                // ① 计算当前价与开仓价的差价
                if (command == OrderCommandEnum.OP_SELL.getValue()) { // SELL
                        String ask = ((Map<String, String>) symbolMap.get(symbol)).get("ask");
                    orderinfo.put("now_price", ask);
                    subtract = price.subtract(new BigDecimal(ask)).multiply(volume).multiply(new BigDecimal(Math.pow(10, Double.parseDouble(digit))));
                } else if (command == OrderCommandEnum.OP_BUY.getValue()) { // BUY
                    String bid = ((Map<String, String>) symbolMap.get(symbol)).get("bid");
                    orderinfo.put("now_price", bid);
                    subtract = new BigDecimal(bid).subtract(price).multiply(volume).multiply(new BigDecimal(Math.pow(10, Double.parseDouble(digit))));
                } else if (command == OrderCommandEnum.OP_BUY_LIMIT.getValue() || command == OrderCommandEnum.OP_BUY_STOP.getValue()) {
                    String ask = ((Map<String, String>) symbolMap.get(symbol)).get("ask");
                    orderinfo.put("now_price", ask);
                } else if (command == OrderCommandEnum.OP_SELL_LIMIT.getValue() || command == OrderCommandEnum.OP_SELL_STOP.getValue()) {
                    String bid = ((Map<String, String>) symbolMap.get(symbol)).get("bid");
                    orderinfo.put("now_price", bid);
                }
                subtract = orderCore.getSingleOrderUSD(symbol, command, symbolMap, subtract, mtmServiceSoap_portType, managerInfo_real, storage);
                orderinfo.put("profit", subtract.setScale(2, BigDecimal.ROUND_HALF_DOWN));
                subtract_sum = subtract_sum.add(subtract);

                orderinfo.put("volume",((BigDecimal)orderinfo.get("volume")).toString());
                orderinfo.put("price",((BigDecimal)orderinfo.get("price")).doubleValue());
                orderinfo.put("storage",((BigDecimal)orderinfo.get("storage")).doubleValue());
            }
            BigDecimal balance = (BigDecimal) login_info.get("balance");
            login_info.put("margin", margin.setScale(2, BigDecimal.ROUND_HALF_DOWN));
            login_info.put("equity", balance.add(subtract_sum).setScale(2, BigDecimal.ROUND_HALF_DOWN));
            login_info.put("margin_free", balance.add(subtract_sum).subtract(margin).setScale(2, BigDecimal.ROUND_HALF_DOWN));
//          b1.divide(b2,scale,BigDecimal.ROUND_HALF_UP)
            if(margin.doubleValue()==0){
                margin = BigDecimal.ONE;
            }
            login_info.put("margin_level", balance.add(subtract_sum).divide(margin, 4).multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_DOWN));



            getOrderInfo2(order_list);
            //将为在仓的订单分开
            List<Map<String,Object>> unOpenOrder = null;
            Iterator<Map<String,Object>> iterator = order_list.iterator();
            while (iterator.hasNext()){
                if(unOpenOrder==null){
                    unOpenOrder = new ArrayList<>();
                }
                Map<String,Object> unOpen = iterator.next();
                int command = (Integer) unOpen.get("command");
                if(command!=0&&command!=1){
                    unOpenOrder.add(unOpen);
                    iterator.remove();
                }
            }

            Map<String,Object> loginInfo = login_info;
            List<Map<String,Object>> orderList = order_list;
            DecimalFormat df = new DecimalFormat("######0.00");
            double sumprofit = 0.0;
            for(Map<String,Object> order:orderList){


                DecimalFormat df1 = new DecimalFormat("#0.00");
                switch ((Integer) order.get("digits")){
                    case 1:
                        df1 = new DecimalFormat("0.0");
                        break;
                    case 2:
                        df1 = new DecimalFormat("0.00");
                        break;
                    case 3:
                        df1 = new DecimalFormat("0.000");
                        break;
                    case 4:
                        df1 = new DecimalFormat("0.0000");
                        break;
                    case 5:
                        df1 = new DecimalFormat("0.00000");
                        break;
                }
                DecimalFormat df2 = new DecimalFormat("0.00");

                order.put("stoploss",((BigDecimal)order.get("stoploss")).doubleValue()==0?"-":df1.format(order.get("stoploss")));
                order.put("takeprofit",((BigDecimal)order.get("takeprofit")).doubleValue()==0?"-":df1.format(order.get("takeprofit")));
                order.put("price",df1.format(order.get("price")));
                order.put("now_price",df1.format(order.get("now_price")));
                order.put("storage",df2.format(order.get("storage")));



                Double profit = ((BigDecimal)order.get("profit")).doubleValue();
                String test = (String)order.get("volume");
                String volumn = df.format(Double.parseDouble(test));
                sumprofit+=profit;
                order.put("profit",df.format(profit));
                order.put("volume",volumn);

            }
            loginInfo.put("totalprofit",df.format(sumprofit));


            return ResponseMap.success("success").data("loginInfo", loginInfo).data("orderList", orderList).data("unOpenOrder",unOpenOrder).result();
        } else {
//            return ResponseMap.error("此接口仅支持传入本地Token").result();
            resultMap = new HashMap<>();
            GetBalance getBalance = new GetBalance();
            getBalance.redisUser = redisUser;
            getBalance.run();
            GetOrderInfo getOrderInfo = new GetOrderInfo();
            getOrderInfo.redisUser = redisUser;
            getOrderInfo.run();
            try {
                getBalance.join();
                getOrderInfo.join();
                List<Map<String,Object>> resultList = getOrderInfo.getOrderList();
                getOrderInfo2(resultList);
                //将为在仓的订单分开
                List<Map<String,Object>> unOpenOrder = null;
                Iterator<Map<String,Object>> iterator = resultList.iterator();
                while (iterator.hasNext()){
                    if(unOpenOrder==null){
                        unOpenOrder = new ArrayList<>();
                    }
                    Map<String,Object> unOpen = iterator.next();
                    int command = (Integer) unOpen.get("command");
                    if(command!=0&&command!=1){
//                        resultList.remove(unOpen);
                        unOpenOrder.add(unOpen);
                        iterator.remove();
                    }
                }

                Map<String,Object> loginInfo = getBalance.getLoginInfo();
                List<Map<String,Object>> orderList = resultList;
                DecimalFormat df = new DecimalFormat("######0.00");
                double sumprofit = 0.0;
                for(Map<String,Object> order:orderList){
                    DecimalFormat df1 = new DecimalFormat("#0.00");
                    switch ((Integer) order.get("digits")){
                        case 1:
                            df1 = new DecimalFormat("0.0");
                            break;
                        case 2:
                            df1 = new DecimalFormat("0.00");
                            break;
                        case 3:
                            df1 = new DecimalFormat("0.000");
                            break;
                        case 4:
                            df1 = new DecimalFormat("0.0000");
                            break;
                        case 5:
                            df1 = new DecimalFormat("0.00000");
                            break;
                    }
                    DecimalFormat df2 = new DecimalFormat("#0.00");

                    order.put("stoploss",(Double)order.get("stoploss")==0?"-":df1.format((Double)order.get("stoploss")));
                    order.put("takeprofit",(Double)order.get("takeprofit")==0?"-":df1.format((Double)order.get("takeprofit")));
                    order.put("price",df1.format((Double)order.get("price")));
                    order.put("now_price",df1.format((BigDecimal)order.get("now_price")));
                    order.put("storage",df2.format((Double)order.get("storage")));

                    Double profit = (Double) order.get("profit");
                    sumprofit+=profit;
                    order.put("profit",df.format(profit));


                }
                if(unOpenOrder!=null&&unOpenOrder.size()!=0){
                    for (Map<String,Object> waitOrder:unOpenOrder){
                        DecimalFormat df1 = new DecimalFormat("#0.00");
                        switch ((Integer) waitOrder.get("digits")){
                            case 1:
                                df1 = new DecimalFormat("0.0");
                                break;
                            case 2:
                                df1 = new DecimalFormat("0.00");
                                break;
                            case 3:
                                df1 = new DecimalFormat("0.000");
                                break;
                            case 4:
                                df1 = new DecimalFormat("0.0000");
                                break;
                            case 5:
                                df1 = new DecimalFormat("0.00000");
                                break;
                        }
                        waitOrder.put("stoploss",(Double)waitOrder.get("stoploss")==0?"-":df1.format((Double)waitOrder.get("stoploss")));
                        waitOrder.put("takeprofit",(Double)waitOrder.get("takeprofit")==0?"-":df1.format((Double)waitOrder.get("takeprofit")));
                        waitOrder.put("price",df1.format((Double)waitOrder.get("price")));
                    }
                }
                loginInfo.put("totalprofit",df.format(sumprofit));

                return ResponseMap.success("success").data("loginInfo",loginInfo).data("orderList",resultList).data("unOpenOrder",unOpenOrder).result();
            } catch (InterruptedException e){
                e.printStackTrace();
                return ResponseMap.error("获取订单失败").result();
            }
        }
    }

    public void getOrderInfo2(List<Map<String,Object>> mapList){
// 获取当前 symbol 的价格
        String symbolsstr = this.redisDao.getValue("symbolsmap");
        Map<String, Object> symbolMap = null;
        if (symbolsstr != null) {
            symbolMap = JSON.parseObject(symbolsstr);
        }

        List<Map<String, Object>> newMap = new LinkedList<>();
        for (Map map : mapList) {

            String symbol = map.get("symbol").toString();

            String value = this.redisDao.getValue((String) symbol);
            Map<String, Object> parse = (Map<String, Object>) JSON.parse(value);
            Integer digits = (Integer) parse.get("digits");

            Integer command = (Integer)(map.get("command"));
            BigDecimal volume = new BigDecimal((String) (map.get("volume"))).setScale(2, BigDecimal.ROUND_HALF_UP);
            BigDecimal price = new BigDecimal((Double) (map.get("price"))).setScale(digits, BigDecimal.ROUND_HALF_UP);
            BigDecimal storage = new BigDecimal((Double) (map.get("storage"))).setScale(digits, BigDecimal.ROUND_HALF_UP);

            Map<String, Object> resultmap = new HashMap<>();
            Map<String, Object> args = new HashMap<>();
            args.put("cmd", command);
            args.put("volume", volume);
            args.put("price", price);
            args.put("storage", storage);
            resultmap.putAll(args);
            if (symbolMap != null){
                Map<String, String> symbolPriceMap = (Map<String, String>) (symbolMap.get(symbol));
                if (symbolPriceMap == null) {
                    throw  new ProjectException(8975,symbol + "实时价格获取失败");
//                    return ResponseMap.error(symbol + "实时价格获取失败").result();
                }

                if(command.intValue() == OrderCommandEnum.OP_BUY.getValue() || command == OrderCommandEnum.OP_SELL.getValue()) {
                    // 计算差价
                    BigDecimal subtract = BigDecimal.ZERO;
                    if (command.intValue() == OrderCommandEnum.OP_BUY.getValue()) { // Buy
                        BigDecimal bid = new BigDecimal(symbolPriceMap.get("bid"));
                        subtract = bid.subtract(price).multiply(volume).multiply(BigDecimal.valueOf(100));
//                        resultmap.put("now_price", bid.setScale(digits, BigDecimal.ROUND_HALF_UP));
                        map.put("now_price", bid.setScale(digits, BigDecimal.ROUND_HALF_UP));
                    } else if (command.intValue() == OrderCommandEnum.OP_SELL.getValue()) { //Sell
                        BigDecimal ask = new BigDecimal(symbolPriceMap.get("ask"));
                        subtract = price.subtract(ask).multiply(volume).multiply(BigDecimal.valueOf(100));
//                        resultmap.put("now_price", ask.setScale(digits, BigDecimal.ROUND_HALF_UP));
                        map.put("now_price", ask.setScale(digits, BigDecimal.ROUND_HALF_UP));;
                    }
//                    BigDecimal usd = this.orderCore.getSingleOrderUSD(symbol, command, symbolMap, subtract, mtmServiceSoap_portType, managerInfo_real, storage);
//                    resultmap.put("usd", usd.setScale(digits, BigDecimal.ROUND_HALF_UP));
//                    map.put("usd", usd.setScale(digits, BigDecimal.ROUND_HALF_UP));
//                    newMap.add(resultmap);
//                    return ResponseMap.success("success").dataAll(resultmap).result();
                } else {
                    if (command == OrderCommandEnum.OP_BUY_LIMIT.getValue() || command == OrderCommandEnum.OP_BUY_STOP.getValue()) {
                        String ask = symbolPriceMap.get("ask");
//                        resultmap.put("now_price", new BigDecimal(ask).setScale(digits, BigDecimal.ROUND_HALF_UP));
                        map.put("now_price", new BigDecimal(ask).setScale(digits, BigDecimal.ROUND_HALF_UP));

                    } else if (command == OrderCommandEnum.OP_SELL_LIMIT.getValue() || command == OrderCommandEnum.OP_SELL_STOP.getValue()) {
                        String bid = symbolPriceMap.get("bid");
//                        resultmap.put("now_price", new BigDecimal(bid).setScale(digits, BigDecimal.ROUND_HALF_UP));
                        map.put("now_price", new BigDecimal(bid).setScale(digits, BigDecimal.ROUND_HALF_UP));
                    }
//                    newMap.add(resultmap);
//                    return ResponseMap.success("success").dataAll(resultmap).result();
                }
            } else {
                throw  new ProjectException(8975,"Fail");
//                return ResponseMap.error("Fail").result();
            }
        }
//        throw  new ProjectException(8975,"Fail");
//        return ResponseMap.success("success").data("list", newMap).result();
    }

    /**
     * 获取外部用户的账户信息
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/getLoginBalanceOut.json")
    public Map<String, Object> getLoginBalanceOut(HttpServletRequest request) throws RemoteException {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        MarginLevelCS loginBalanceObject = null;
        if (server_type == LoginTypeEnum.DEMO_SERVER.getValue()) {
            loginBalanceObject = mtmServiceSoap_portType.getBalance(login_id, managerInfo_demo);
        } else if (server_type == LoginTypeEnum.REAL_SERVER.getValue()) {
            loginBalanceObject = mtmServiceSoap_portType.getBalance(login_id, managerInfo_real);
        } else if (server_type == LoginTypeEnum.LOCAL_SERVER.getValue()) {
            return ResponseMap.error("此接口不支持传入本地Token").result();
        }
        Map<String, Object> login_info = new HashMap<>();
        login_info.put("balance", loginBalanceObject.getBalance());
        login_info.put("equity", loginBalanceObject.getEquity());
        login_info.put("margin_free", loginBalanceObject.getMargin_free());
        login_info.put("margin_level", loginBalanceObject.getMargin_level());
        login_info.put("margin", loginBalanceObject.getMargin());
//      用户的结余 当前【balance】 净值【equity】可用预付费款【margin_free】预付款比【margin_level】预付款【margin】
        return ResponseMap.success("success").data("loginInfo", login_info).result();
    }

    /**
     * 获取外部用户的账户信息
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/getLoginOrderOut.json")
    public Map<String, Object> getLoginOrderOut(HttpServletRequest request) throws RemoteException {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        MarginLevelCS loginBalanceObject = null;
        TradeRecordCollection ordercollection = null;
        if (server_type == LoginTypeEnum.DEMO_SERVER.getValue()) {
            ordercollection = mtmServiceSoap_portType.getTradesCurrentForce(login_id, managerInfo_demo);
        } else if (server_type == LoginTypeEnum.REAL_SERVER.getValue()) {
            ordercollection = mtmServiceSoap_portType.getTradesCurrentForce(login_id, managerInfo_real);
        } else if (server_type == LoginTypeEnum.LOCAL_SERVER.getValue()) {
            return ResponseMap.error("此接口不支持传入本地Token").result();
        }
        List<Map<String, Object>> order_list = new ArrayList<>();
        for (TradeRecordInfo orderObj : ordercollection.getItems()) {
            Map<String, Object> orderMap = new HashMap<>();
            orderMap.put("id", orderObj.getOrder());
            orderMap.put("login_id", orderObj.getLogin());
            orderMap.put("command", orderObj.getCmd());
            orderMap.put("digits", orderObj.getDigits());
            orderMap.put("comment", orderObj.getComment());
            orderMap.put("volume", orderObj.getVolume());
            orderMap.put("symbol", orderObj.getSymbol());
            orderMap.put("price", orderObj.getOpen_price());
            orderMap.put("stoploss", orderObj.getSl());
            orderMap.put("takeprofit", orderObj.getTp());
            orderMap.put("storage", orderObj.getStorage());
            orderMap.put("expiration", orderObj.getExpiration());
            orderMap.put("taxes", orderObj.getTaxes());
            orderMap.put("commission", orderObj.getCommission());
            orderMap.put("create_time", orderObj.getOpen_time());
            order_list.add(orderMap);
        }
        return ResponseMap.success("success").data("orderList", order_list).result();
    }

    @ResponseBody
    @RequestMapping("/addOrder.json")
    /**
     * 为用户添加订单
     *
     */
    public Map<String, Object> addOrder(HttpServletRequest request) throws RemoteException{
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        String applicationType = (String) redisUser.get(Constants.APPLICATION_TYPE);

        System.out.println(applicationType);


        RequestData data = new RequestBodyJSON(request);
        String symbol = data.getStringMust("symbol", "交易品种不能为null");
        Integer command = data.getIntMust("command", "请输入交易类型");
        BigDecimal volumn = new BigDecimal(data.getStringMust("volumn", "请输入手数"));
        String strsl = data.getStringDef("sl", "0");
        String strtp = data.getStringDef("tp", "0");
        if(strtp.equals("")){
            strtp = "0";
        }
        if(strsl.equals("")){
            strsl = "0";
        }
        BigDecimal sl = new BigDecimal(strsl);
        BigDecimal tp = new BigDecimal(strtp);
        BigDecimal price = null;
        Map<String,Object> symbolcondition = getCondition();
        symbolcondition.put("symbol",symbol);
        Map<String,Object> symbolinfo= mybatisDao.selectMapOne("SymbolMapper.selectFinalValueBySymbol",symbolcondition);


        if(command!=0&&command!=1){
            price = new BigDecimal(data.getStringMust("price","price不能为0"));
        }
        int order_id = 0;
        // 拿到当前 symbol 的价格
        String symbolsstr = this.redisDao.getValue("symbolsmap");
        Map<String, Object> symbolMap = null;
        if (symbolsstr != null) {
            symbolMap = JSON.parseObject(symbolsstr);
        }
        int digits = 0;
        int digitsPoint = 1;
        if (command == OrderCommandEnum.OP_BUY.getValue()){
            Map<String,String> aaa = ((Map<String, String>) symbolMap.get(symbol));
            digits = Integer.parseInt(aaa.get("digits"));
            digitsPoint = (int)Math.pow(10,digits);
            price = new BigDecimal(aaa.get("ask"));
        } else if (command == OrderCommandEnum.OP_SELL.getValue()){
            Map<String,String> aaa = ((Map<String, String>) symbolMap.get(symbol));
            digits = Integer.parseInt(aaa.get("digits"));
            digitsPoint = (int)Math.pow(10,digits);
            price = new BigDecimal(aaa.get("bid"));
        }else {
            Map<String,String> aaa = ((Map<String, String>) symbolMap.get(symbol));
            digits = Integer.parseInt(aaa.get("digits"));
            digitsPoint = (int)Math.pow(10,digits);
        }

        //先判断sl和 tp是否符合规则
        if (command == OrderCommandEnum.OP_BUY.getValue() || command == OrderCommandEnum.OP_BUY_STOP.getValue() || command == OrderCommandEnum.OP_BUY_LIMIT.getValue()) {
            if(sl.doubleValue()!=0){
                double value = price.subtract(sl).multiply(new BigDecimal(digitsPoint)).doubleValue();
                if(value < 200){
                    return ResponseMap.error("无效的止损或获利").result();
                }
            }
            if(tp.doubleValue()!=0){
                double value =tp.subtract(price).multiply(new BigDecimal(digitsPoint)).doubleValue();
                if (value < 200) {
                    return ResponseMap.error("无效的止损或获利").result();
                }
            }
        }
        if (command == OrderCommandEnum.OP_SELL.getValue() || command == OrderCommandEnum.OP_SELL_STOP.getValue() || command == OrderCommandEnum.OP_SELL_LIMIT.getValue()) {
            if(sl.doubleValue()!=0){
                double value =sl.subtract(price).multiply(new BigDecimal(digitsPoint)).doubleValue();
                if( value < 200){
                    return ResponseMap.error("无效的止损或获利").result();
                }
            }
            if(tp.doubleValue()!=0){
                double value =price.subtract(tp).multiply(new BigDecimal(digitsPoint)).doubleValue();
                if ( value < 200) {
                    return ResponseMap.error("无效的止损或获利").result();
                }
            }
        }

        if (server_type == LoginTypeEnum.LOCAL_SERVER.getValue()){
//            判断用户用户balance是否 足以支付此订单的手续费
            Integer margin = (Integer) symbolinfo.get("margin");
//            Integer digits = (Integer) symbolinfo.get("digits");
            Map<String, Object> condition = getCondition();
            condition.put("login_id", login_id);
            Map<String, Object> loginInfo = mybatisDao.selectMapOne("LoginMapper.selLogin", condition);
            BigDecimal balance = (BigDecimal) loginInfo.get("balance");
            //算法 (用户余额-手数*保证金数)<0
            if (balance.subtract(volumn.multiply(new BigDecimal(margin))).doubleValue() < 0){
                return ResponseMap.error("用户余额不足").result();
            }
            //执行添加订单的方法
            order_id = orderCore.addOrder4Local(login_id,symbol,digits,command, volumn, sl, tp, price, BigDecimal.ZERO, null);
        } else if (server_type == LoginTypeEnum.DEMO_SERVER.getValue()) {
            order_id = orderCore.addOrder4Our(login_id,symbol,command, volumn.multiply(new BigDecimal(100)), sl, tp, price, mtmServiceSoap_portType,managerInfo_demo,applicationType);
        } else if (server_type == LoginTypeEnum.REAL_SERVER.getValue()) {
            order_id = orderCore.addOrder4Our(login_id,symbol,command, volumn.multiply(new BigDecimal(100)), sl, tp, price, mtmServiceSoap_portType,managerInfo_real,applicationType);
        }
        if(order_id==-1){
            return ResponseMap.error("订单有误无法交易").result();
        }
        return ResponseMap.success("success").data("order_id", order_id).result();
    }


    @ResponseBody
    @RequestMapping("/changeOrder.json")
    /**
     * 修改订单
     *
     */
    public Map<String, Object> changeOrder(HttpServletRequest request) throws RemoteException{
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
//        修改用户订单
//        获取参数 orderid price sl tp
        RequestData data = new RequestBodyJSON(request);
        Integer orderid = data.getIntMust("orderid","必须传入orderid");
        String price_str = data.getStringNull("price");
        String sl_str = data.getStringMust("sl","必须传入sl");
        String tp_str = data.getStringMust("tp","必须传入tp");
        BigDecimal sl = new BigDecimal(sl_str);
        BigDecimal tp = new BigDecimal(tp_str);
        BigDecimal price = new BigDecimal(price_str==null?"0":price_str);
        if(server_type==1){
            //从数据库查询订单信息
            Map<String,Object> condition = getCondition();
            condition.put("id",orderid);
            List<Map<String,Object>> orderList = mybatisDao.selectMapList("OrderMapper.selOrderListById",condition);
//            比对sl tp 的规则
            int command = (Integer) orderList.get(0).get("command");
            String symbol = (String) orderList.get(0).get("symbol");
            int digits = 0;
            int digitsPoint = 1;

            Map<String,Object> upcondition = getCondition();
            upcondition.put("id",orderid);
            upcondition.put("sl",sl);
            upcondition.put("tp",tp);
            //如果是buy 或 sell 需要获取当前价格。
            if(command==0||command==1){
                // 拿到当前 symbol 的价格
                String symbolsstr = this.redisDao.getValue("symbolsmap");
                Map<String, Object> symbolMap = null;
                if (symbolsstr != null) {
                    symbolMap = JSON.parseObject(symbolsstr);
                }
                if (command == OrderCommandEnum.OP_BUY.getValue()) {
                    Map<String,String> aaa = ((Map<String, String>) symbolMap.get(symbol));
                    digits = Integer.parseInt(aaa.get("digits"));
                    digitsPoint = (int)Math.pow(10,digits);
                    price = new BigDecimal(aaa.get("ask"));
                } else if (command == OrderCommandEnum.OP_SELL.getValue()){
                    Map<String,String> aaa = ((Map<String, String>) symbolMap.get(symbol));
                    digits = Integer.parseInt(aaa.get("digits"));
                    digitsPoint = (int)Math.pow(10,digits);
                    price = new BigDecimal(aaa.get("bid"));
                }else{
                    Map<String,String> aaa = ((Map<String, String>) symbolMap.get(symbol));
                    digits = Integer.parseInt(aaa.get("digits"));
                    digitsPoint = (int)Math.pow(10,digits);
                }
                upcondition.put("price",price);
            }
            //先判断sl和 tp是否符合规则
            if (command == OrderCommandEnum.OP_BUY.getValue() || command == OrderCommandEnum.OP_BUY_STOP.getValue() || command == OrderCommandEnum.OP_BUY_LIMIT.getValue()) {
                if(sl.doubleValue()!=0){
                    double value = price.subtract(sl).multiply(new BigDecimal(digitsPoint)).doubleValue();
                    if(value < 200){
                        return ResponseMap.error("无效的止损或获利").result();
                    }
                }
                if(tp.doubleValue()!=0){
                    double value =tp.subtract(price).multiply(new BigDecimal(digitsPoint)).doubleValue();
                    if (value < 200) {
                        return ResponseMap.error("无效的止损或获利").result();
                    }
                }
            }
            if (command == OrderCommandEnum.OP_SELL.getValue() || command == OrderCommandEnum.OP_SELL_STOP.getValue() || command == OrderCommandEnum.OP_SELL_LIMIT.getValue()) {
                if(sl.doubleValue()!=0){
                    double value =sl.subtract(price).multiply(new BigDecimal(digitsPoint)).doubleValue();
                    if( value < 200){
                        return ResponseMap.error("无效的止损或获利").result();
                    }
                }
                if(tp.doubleValue()!=0){
                    double value =price.subtract(tp).multiply(new BigDecimal(digitsPoint)).doubleValue();
                    if ( value < 200) {
                        return ResponseMap.error("无效的止损或获利").result();
                    }
                }
            }
            mybatisDao.update("OrderMapper.upOrderList",upcondition);
            return ResponseMap.success("success").result();
        }else{
            //当时外部服务器登录时接口获取数据
            //---------------------------------------------------------------------------------
            MarginLevelCS loginBalanceObject = null;
            TradeRecordCollection ordercollection = null;
            ManagerInfo managerInfo2 = null;
            if (server_type == LoginTypeEnum.DEMO_SERVER.getValue()) {
                try {
                    managerInfo2 = managerInfo_demo;
                    ordercollection = mtmServiceSoap_portType.getTradesCurrentForce(login_id, managerInfo_demo);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else if (server_type == LoginTypeEnum.REAL_SERVER.getValue()){
                try {
                    managerInfo2 = managerInfo_real;
                    ordercollection = mtmServiceSoap_portType.getTradesCurrentForce(login_id, managerInfo_real);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            List<Map<String, Object>> order_list = new ArrayList<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            TradeRecordInfo changeOrder = null;
            int count = 0;
            for (TradeRecordInfo orderObj : ordercollection.getItems()){
                if(orderObj.getOrder()==orderid){
                    changeOrder = orderObj;
                    count++;
                    break;
                }
//            OrderController.resultMap.put("orderList",order_list);
            }
            if(price_str!=null){
                changeOrder.setOpen_price(Double.valueOf(price_str));
            }
            changeOrder.setSl(Double.valueOf(sl_str));
            changeOrder.setTp(Double.valueOf(tp_str));
            if (count==0) return ResponseMap.error("列表中没有此信息").result();
            mtmServiceSoap_portType.setTradeRecord(changeOrder,managerInfo2);
            return ResponseMap.success("success").result();
        }
    }
}




package org.jsoncloud.project.mt4platform.inter.controller;

import com.alibaba.fastjson.JSON;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.util.DateUtil;
import org.jsoncloud.framework.util.PropertiesUtil;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;
import org.jsoncloud.project.mt4platform.base.tableenum.OrderCommandEnum;
import org.jsoncloud.project.mt4platform.dao.LoginMapper;
import org.jsoncloud.project.mt4platform.dao.OrderMapper;
import org.jsoncloud.project.mt4platform.inter.Constants;
import org.jsoncloud.project.mt4platform.inter.core.HistoryCore;
import org.jsoncloud.project.mt4platform.inter.core.OrderCore;
import org.jsoncloud.project.mt4platform.po.Login;
import org.jsoncloud.project.mt4platform.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.*;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/9/19
 * @desc
 */
@RestController
@RequestMapping("/history")
public class HistoryController extends BaseController {

    @Autowired
    private RedisDao redisDao;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderCore orderCore;

    @Autowired
    private HistoryCore historyCore;

    private static MTMServiceLocator mtmServiceLocator;
    private static MTMServiceSoap_PortType mtmServiceSoap_portType = null;
    private static ManagerInfo managerInfo_demo = new ManagerInfo();
    private static ManagerInfo managerInfo_real = new ManagerInfo();

    static {
        mtmServiceLocator = new MTMServiceLocator();
        try {
            //demo服务器的管理员信息
            mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
            managerInfo_demo.setLogin(Integer.parseInt(org.jsoncloud.framework.sms.PropertiesUtil.get("test_login")));
            managerInfo_demo.setPassword(org.jsoncloud.framework.sms.PropertiesUtil.get("test_pwd"));
            managerInfo_demo.setServer(org.jsoncloud.framework.sms.PropertiesUtil.get("test_addr"));
            //real服务器的管理员信息
            managerInfo_real.setLogin(Integer.parseInt(org.jsoncloud.framework.sms.PropertiesUtil.get("real_login")));
            managerInfo_real.setPassword(org.jsoncloud.framework.sms.PropertiesUtil.get("real_pwd"));
            managerInfo_real.setServer(org.jsoncloud.framework.sms.PropertiesUtil.get("real_addr"));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取订单的历史记录
     *
     * @param request
     * @return
     * @throws ServiceException
     * @throws RemoteException
     */
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    public Map list(HttpServletRequest request) throws ServiceException, RemoteException {

        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);

        RequestData requestData = new RequestBodyJSON(request);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date zero = calendar.getTime();

//        Date beginTime = requestData.getDateDef("beginTime", zero);
//        Date endTime = requestData.getDateDef("endTime", null);

        String stringBeginTime = requestData.getStringDef("beginTime", null);
        String stringEndTime = requestData.getStringDef("endTime", null);
        String symbolSearch = requestData.getStringDef("symbolSearch",null);
        Date beginTime = null;
        if (stringBeginTime == null || stringBeginTime.equals("")) {
            beginTime = zero;
        } else {
            try {
                beginTime = DateUtil.string2Date(stringBeginTime, "yyyyMMdd");
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        Date endTime = null;
        if (stringEndTime != null && !stringEndTime.equals("")) {
            try {
                endTime = DateUtil.string2Date(stringEndTime, "yyyyMMdd");
                Calendar c = Calendar.getInstance();
                c.setTime(endTime);
                c.add(Calendar.DAY_OF_MONTH, 1);
                endTime = c.getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            Calendar c = Calendar.getInstance();
            c.setTime(new Date());
            c.add(Calendar.MONTH, 1);
            endTime = c.getTime();
        }


        Map responseMap;

        //获取本地服务器上的历史记录
        if (server_type.compareTo(LoginTypeEnum.LOCAL_SERVER.getValue()) == 0){
            Map args = this.getCondition();
            args.put("loginId", login_id);
            args.put("beginTime", beginTime);
            args.put("endTime", endTime);
            List<Map<String, Object>> maps = this.mybatisDao.selectMapList("HistoryMapper.selectHistoryListByLoginId", args);

            for (Map<String, Object> map : maps){
                //处理特殊数据
                Object sl = map.get("sl");
                Object tp = map.get("tp");

                Integer digits = (Integer) map.get("sdigits");
                DecimalFormat df = new DecimalFormat("#0.00");



                map.put("profit",df.format(map.get("profit")));
                map.put("storage",df.format(map.get("storage")));

                switch (digits){
                    case 1:
                        df = new DecimalFormat("#0.0");
                        break;
                    case 2:
                        df = new DecimalFormat("#0.00");
                        break;
                    case 3:
                        df = new DecimalFormat("#0.000");
                        break;
                    case 4:
                        df = new DecimalFormat("#0.0000");
                        break;
                    case 5:
                        df = new DecimalFormat("#0.00000");
                        break;
                }
                map.put("open_price",df.format(map.get("open_price")));
                map.put("close_price",df.format(map.get("close_price")));
                map.put("sl",((BigDecimal)map.get("sl")).doubleValue()==0?"-":df.format(map.get("sl")));
                map.put("tp",((BigDecimal)map.get("tp")).doubleValue()==0?"-":df.format(map.get("tp")));


            }

            ResponseMap data = ResponseMap.success("success").data("historyList", maps);

            // 获取盈亏汇总
            double profit = 0.00;
            args.put("cmdList", new int[]{OrderCommandEnum.OP_BUY.getValue(), OrderCommandEnum.OP_SELL.getValue()});
            List<Map<String, Object>> recordsMaps = this.mybatisDao.selectMapList("HistoryMapper.selectRecord", args);
            if (recordsMaps != null && recordsMaps.size() > 0) {
                Map<String, Object> records = recordsMaps.get(0);
                data.data("profit", records == null ? "0.00" : ((BigDecimal) records.get("profit")).setScale(2, BigDecimal.ROUND_HALF_UP));
                if (records == null){
                    profit = 0.00;
                } else {
                    profit = ((BigDecimal) records.get("profit")).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
            }

            //获取出金总额
            double out = 0.00;
            args.put("cmdList", new int[]{OrderCommandEnum.OP_BALANCE.getValue()});
            args.put("type", "outOfGold");
            List<Map<String, Object>> outOfGoldMaps = this.mybatisDao.selectMapList("HistoryMapper.selectRecord", args);
            if (outOfGoldMaps != null && outOfGoldMaps.size() > 0) {
                Map<String, Object> outOfGold = outOfGoldMaps.get(0);
                data.data("outOfGold", outOfGold == null ? "0.00" : ((BigDecimal) outOfGold.get("profit")).setScale(2, BigDecimal.ROUND_HALF_UP));
                if (outOfGold == null) {
                    out = 0.00;
                } else {
                    out = ((BigDecimal) outOfGold.get("profit")).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
            }

            //获取入金总额
            double in = 0.00;
            args.put("cmdList", new int[]{OrderCommandEnum.OP_BALANCE.getValue()});
            args.put("type", "inOfGold");
            List<Map<String, Object>> inOfGoldMaps = this.mybatisDao.selectMapList("HistoryMapper.selectRecord", args);
            if (outOfGoldMaps != null && outOfGoldMaps.size() > 0) {
                Map<String, Object> inOfGold = inOfGoldMaps.get(0);
                data.data("inOfGold", inOfGold == null ? "0.00" : ((BigDecimal) inOfGold.get("profit")).setScale(2, BigDecimal.ROUND_HALF_UP));
                if (inOfGold == null) {
                    out = 0.00;
                } else {
                    out = ((BigDecimal) inOfGold.get("profit")).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                }
            }

            data.data("balance", BigDecimal.valueOf(in - out + profit).setScale(2, BigDecimal.ROUND_HALF_UP));
            responseMap = data.result();
        }
        // 获取远程模拟服务器上的历史记录
        else {
            MTMServiceLocator mtmServiceLocator = new MTMServiceLocator();
            MTMServiceSoap_PortType mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
            ManagerInfo managerInfo = new ManagerInfo();
            String test_login = null, test_pwd = null, test_addr = null;
            if (server_type.compareTo(LoginTypeEnum.DEMO_SERVER.getValue()) == 0) {
                test_login = PropertiesUtil.get("test_login");
                test_pwd = PropertiesUtil.get("test_pwd");
                test_addr = PropertiesUtil.get("test_addr");
            }
            // 获取远程真实服务器上的历史记录
            else if (server_type.compareTo(LoginTypeEnum.REAL_SERVER.getValue()) == 0) {
                test_login = PropertiesUtil.get("real_login");
                test_pwd = PropertiesUtil.get("real_pwd");
                test_addr = PropertiesUtil.get("real_addr");
            }
            managerInfo.setLogin(Integer.valueOf(test_login));
            managerInfo.setPassword(test_pwd);
            managerInfo.setServer(test_addr);
            Integer beginTimeInt = Integer.parseInt((beginTime.getTime() / 1000) + "");
            Integer endTimeInt = Integer.parseInt(endTime.getTime() / 1000 + "");
            TradeRecordCollection tradesHistory = mtmServiceSoap_portType.getTradesHistory(login_id, "", managerInfo, beginTimeInt, endTimeInt);
            TradeRecordInfo[] items = tradesHistory.getItems();

            double profit = 0;
            double outOfGold = 0;
            double inOfGold = 0;
            List<Map> itemsMaps = new LinkedList<>();
            for (TradeRecordInfo info : items) {
                Map itemsMap = new HashMap();
                long close_time = (long) (info.getClose_time()) * 1000L;
                long open_time = (long) (info.getOpen_time()) * 1000L;
                Date closeTime = new Date(close_time);
                Calendar c = Calendar.getInstance();
                c.setTime(closeTime);
                c.add(Calendar.HOUR_OF_DAY, -8);
                closeTime = c.getTime();
                Date openTime = new Date(open_time);
                c = Calendar.getInstance();
                c.setTime(openTime);
                c.add(Calendar.HOUR_OF_DAY, -8);
                openTime = c.getTime();

//                if (beginTime != null && endTime == null) {
//                    if (closeTime.compareTo(beginTime) > 0) {
//                        continue;
//                    }
//                } else if (beginTime != null && endTime != null){
//                    if (closeTime.compareTo(beginTime) >= 0 && closeTime.compareTo(endTime) <= 0) {
//
//                    } else {
//                        continue;
//                    }
//                }

                DecimalFormat    df   = new DecimalFormat("######0.00");

                Integer digits = info.getDigits();
                DecimalFormat dfprice = new DecimalFormat("######0.00");
                switch (digits){
                    case 1:
                        dfprice = new DecimalFormat("######0.0");
                        break;
                    case 2:
                        dfprice = new DecimalFormat("######0.00");
                        break;
                    case 3:
                        dfprice = new DecimalFormat("######0.000");
                        break;
                    case 4:
                        dfprice = new DecimalFormat("######0.0000");
                        break;
                    case 5:
                        dfprice = new DecimalFormat("######0.00000");
                        break;
                }

                // 取出可用字段
                itemsMap.put("id", info.getOrder());
                itemsMap.put("volume",df.format(Double.valueOf(info.getVolume()+"")/100d));
                itemsMap.put("login_id", info.getLogin());
                itemsMap.put("symbol", info.getSymbol());
                itemsMap.put("close_price", dfprice.format(info.getClose_price()));
                itemsMap.put("open_time", DateUtil.date2String(openTime, "yyyy-MM-dd HH:mm:ss"));
                itemsMap.put("cmd", info.getCmd());
                itemsMap.put("close_time", DateUtil.date2String(closeTime, "yyyy-MM-dd HH:mm:ss"));
                itemsMap.put("open_price", dfprice.format(info.getOpen_price()));

                itemsMap.put("tp", info.getTp() == 0 ? "-" : dfprice.format(info.getTp()));
                itemsMap.put("sl", info.getSl() == 0 ? "-" : dfprice.format(info.getSl()));

                itemsMap.put("profit", df.format(info.getProfit()));
                itemsMap.put("storage", df.format(info.getStorage()));

                int cmd = info.getCmd();
                if (cmd == OrderCommandEnum.OP_BUY.getValue() || cmd == OrderCommandEnum.OP_SELL.getValue()) {
                    profit += info.getProfit();
                } else if (cmd == OrderCommandEnum.OP_BALANCE.getValue()) {
                    double profit__ = info.getProfit();
                    if (profit__ > 0){
                        inOfGold += profit__;
                    }else{
                        outOfGold += profit__;
                    }
                }
                //搜索框筛选
                if(symbolSearch==null||symbolSearch.equals("")){
                    itemsMaps.add(itemsMap);
                }else if(itemsMap.get("symbol").equals(symbolSearch)){
                    itemsMaps.add(itemsMap);
                }
            }

            ResponseMap data = ResponseMap.success("success").data("historyList", itemsMaps);
            data.data("profit", BigDecimal.valueOf(profit).setScale(2, BigDecimal.ROUND_HALF_UP)).
                    data("outOfGold", BigDecimal.valueOf(outOfGold).setScale(2, BigDecimal.ROUND_HALF_UP)).
                    data("inOfGold", BigDecimal.valueOf(inOfGold).setScale(2, BigDecimal.ROUND_HALF_UP)).
                    data("balance", BigDecimal.valueOf(inOfGold).subtract(BigDecimal.valueOf(outOfGold)).add(BigDecimal.valueOf(profit)).setScale(2, BigDecimal.ROUND_HALF_UP));
            responseMap = data.result();
        }
        return responseMap;
    }

    /**
     * 根据订单id获取该订单的盈亏值
     *
     * @param request
     * @return
     * @author wenka
     */
    @RequestMapping(value = "/getOrderUsd.json", method = RequestMethod.POST)
    public Map getUSDByOrderId(HttpServletRequest request){
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);

        RequestData data = new RequestBodyJSON(request);
        String stringMust = data.getStringMust("paramList", "缺失参数数组");

        List<Map<String, Object>> mapList = (List<Map<String, Object>>) (JSON.parse(stringMust));

        // 获取当前 symbol 的价格
        String symbolsstr = this.redisDao.getValue("symbolsmap");
        Map<String, Object> symbolMap = null;
        if (symbolsstr != null) {
            symbolMap = JSON.parseObject(symbolsstr);
        }

        List<Map<String, Object>> newMap = new LinkedList<>();
        for (Map map : mapList) {
//          Integer orderId = data.getIntMust("orderId", "订单Id缺失");
//          Order order = this.orderMapper.selectByPrimaryKey(orderId);
//            String symbol = data.getStringMust("symbol", "symbol缺失");
//            Integer command = data.getIntMust("cmd", "交易类型缺失");
//            BigDecimal volume = BigDecimal.valueOf(data.getDoubleMust("volume", "手数缺失"));
//            BigDecimal price = BigDecimal.valueOf(data.getDoubleMust("price", "开仓价格缺失"));
//            BigDecimal storage = BigDecimal.valueOf(data.getDoubleMust("storage", "storage缺失"));

            String symbol = map.get("symbol").toString();

            String value = this.redisDao.getValue((String) symbol);
            Map<String, Object> parse = (Map<String, Object>) JSON.parse(value);
            Integer digits = (Integer) parse.get("digits");

            Integer command = Integer.parseInt((String) (map.get("cmd")));
            BigDecimal volume = new BigDecimal((String) (map.get("volume"))).setScale(1, BigDecimal.ROUND_HALF_UP);
            BigDecimal price = new BigDecimal((String) (map.get("price"))).setScale(digits, BigDecimal.ROUND_HALF_UP);
            BigDecimal storage = new BigDecimal((String) (map.get("storage"))).setScale(digits, BigDecimal.ROUND_HALF_UP);

            Map<String, Object> resultmap = new HashMap<>();
            Map<String, Object> args = new HashMap<>();
            args.put("cmd", command);
            args.put("volume", volume);
            args.put("price", price);
            args.put("storage", storage);
            resultmap.putAll(args);
            if (symbolMap != null) {
                Map<String, String> symbolPriceMap = (Map<String, String>) (symbolMap.get(symbol));
                if (symbolPriceMap == null){
                    return ResponseMap.error(symbol + "实时价格获取失败").result();
                }

                if (command.intValue() == OrderCommandEnum.OP_BUY.getValue() || command == OrderCommandEnum.OP_SELL.getValue()) {
                    // 计算差价
                    BigDecimal subtract = BigDecimal.ZERO;
                    if (command.intValue() == OrderCommandEnum.OP_BUY.getValue()) { // Buy
                        BigDecimal bid = new BigDecimal(symbolPriceMap.get("bid"));
                        subtract = bid.subtract(price).multiply(volume).multiply(BigDecimal.valueOf(Math.pow(10, digits)));
                        resultmap.put("now_price", bid.setScale(digits, BigDecimal.ROUND_HALF_UP));
                    } else if (command.intValue() == OrderCommandEnum.OP_SELL.getValue()) { //Sell
                        BigDecimal ask = new BigDecimal(symbolPriceMap.get("ask"));
                        subtract = price.subtract(ask).multiply(volume).multiply(BigDecimal.valueOf(Math.pow(10, digits)));
                        resultmap.put("now_price", ask.setScale(digits, BigDecimal.ROUND_HALF_UP));
                    }
                    BigDecimal usd = this.orderCore.getSingleOrderUSD(symbol, command, symbolMap, subtract, mtmServiceSoap_portType, managerInfo_real, storage);
                    resultmap.put("usd", usd.setScale(digits, BigDecimal.ROUND_HALF_UP));
                    newMap.add(resultmap);
//                    return ResponseMap.success("success").dataAll(resultmap).result();
                } else {
                    if (command == OrderCommandEnum.OP_BUY_LIMIT.getValue() || command == OrderCommandEnum.OP_BUY_STOP.getValue()) {
                        String ask = symbolPriceMap.get("ask");
                        resultmap.put("now_price", new BigDecimal(ask).setScale(digits, BigDecimal.ROUND_HALF_UP));
                    } else if (command == OrderCommandEnum.OP_SELL_LIMIT.getValue() || command == OrderCommandEnum.OP_SELL_STOP.getValue()) {
                        String bid = symbolPriceMap.get("bid");
                        resultmap.put("now_price", new BigDecimal(bid).setScale(digits, BigDecimal.ROUND_HALF_UP));
                    }
                    newMap.add(resultmap);
//                    return ResponseMap.success("success").dataAll(resultmap).result();
                }
            } else {
                return ResponseMap.error("Fail").result();
            }
        }
        return ResponseMap.success("success").data("list", newMap).result();
    }

    /**
     * 平仓
     *
     * @param request
     * @return
     */
    @Transactional
    @RequestMapping(value = "/closrPosition.json", method = RequestMethod.POST)
    public Map closePosition(HttpServletRequest request) throws RemoteException {
        RequestBodyJSON data = new RequestBodyJSON(request);
        int orderId = data.getIntMust("orderId", "订单id缺失");
        double volume = data.getDouble("volume", false, "");

        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);

        if (server_type == LoginTypeEnum.LOCAL_SERVER.getValue()) {

            // 获取该订单
            Order order = this.orderMapper.selectByPrimaryKey(orderId);

            if (order == null) {
                return ResponseMap.error("订单号：" + orderId + "不存在").result();
            }

            String symbol = order.getSymbol(); // symbol
            Integer command = order.getCommand(); // 交易类型
            BigDecimal storage__ = order.getStorage(); // 库存金
            BigDecimal price = order.getPrice(); // 开仓价格
            BigDecimal volume__ = order.getVolume(); // 手数

            if (volume == 0) {
                volume = volume__.doubleValue();
            }

            if (storage__ == null) {
                storage__ = BigDecimal.ZERO;
            }

            // 处理库存金
            BigDecimal storage = new BigDecimal(volume / volume__.doubleValue()).multiply(storage__);

            // 获取当前 symbol 的实时价格
            String symbolsstr = this.redisDao.getValue("symbolsmap");
            Map<String, Object> symbolMap = null;
            if (symbolsstr != null) {
                symbolMap = JSON.parseObject(symbolsstr);
            }

            if (symbolMap == null) {
                return ResponseMap.error("error").result();
            }
            Map<String, String> symbolPrice = (Map<String, String>) (symbolMap.get(symbol));
            String digits = symbolPrice.get("digits");
            BigDecimal now_price = BigDecimal.ZERO;// 获取当前价格
            BigDecimal subprice = BigDecimal.ZERO; //计算差价
            if (command == OrderCommandEnum.OP_SELL.getValue()){
                now_price = new BigDecimal(symbolPrice.get("ask"));
                subprice = price.subtract(now_price);
                subprice = subprice.subtract(BigDecimal.valueOf(Math.pow(10,Double.parseDouble(digits))));
            } else if (command == OrderCommandEnum.OP_BUY.getValue()) {
                now_price = new BigDecimal(symbolPrice.get("bid"));
                subprice = now_price.subtract(price);
                subprice = subprice.subtract(BigDecimal.valueOf(Math.pow(10,Double.parseDouble(digits))));
            }

            // 获取盈亏值
            BigDecimal singleOrderUSD = this.orderCore.getSingleOrderUSD(symbol, command, symbolMap, subprice, mtmServiceSoap_portType, managerInfo_real, storage);

            // 若平仓数量 < 原有的数量，则剩余数量生成新的订单
            if (volume < volume__.doubleValue()) {
                Map symbolArgs = new HashMap();
                symbolArgs.put("symbol", symbol);
                List<Map<String, Object>> maps = this.mybatisDao.selectMapList("SymbolMapper.selectFinalValueBySymbol", symbolArgs);
                if (maps != null && maps.size() > 0 && maps.get(0) != null) {
                    this.orderCore.addOrder4Local(login_id, symbol, (Integer) (maps.get(0).get("digits")), command, volume__.subtract(BigDecimal.valueOf(volume)), order.getStoploss(), order.getTakeprofit(), price, storage__.subtract(storage), orderId);
                }
            }

            // 生成历史记录
            Map orderMap = new HashMap();
            orderMap.put("id", orderId);
            orderMap.put("login_id", order.getLoginId());
            orderMap.put("command", command);
            orderMap.put("margin", order.getMargin());
            orderMap.put("volume", BigDecimal.valueOf(volume));
            orderMap.put("symbol", symbol);
            orderMap.put("price", price);
            orderMap.put("stoploss", order.getStoploss());
            orderMap.put("takeprofit", order.getTakeprofit());
            orderMap.put("create_time", order.getCreateTime());
            orderMap.put("create_time", new Date());
            orderMap.put("close_price", now_price);
            orderMap.put("profit", singleOrderUSD);
            orderMap.put("storage",order.getStorage());
            this.historyCore.orderToHistory(orderMap);

            // 更改账户余额
            Map args = new HashMap();
            args.put("loginId", login_id);
            args.put("balance", singleOrderUSD);
            this.mybatisDao.update("LoginMapper.updateBalance", args);

        } else if (server_type == LoginTypeEnum.DEMO_SERVER.getValue()) {
            TradeRecordInfo info = mtmServiceSoap_portType.closeTradeRecord(orderId, managerInfo_demo);
            return ResponseMap.success("success").data("info", info).result();
        } else if (server_type == LoginTypeEnum.REAL_SERVER.getValue()) {
            TradeRecordInfo info = mtmServiceSoap_portType.closeTradeRecord(orderId, managerInfo_real);
            return ResponseMap.success("success").data("info", info).result();
        }
        return ResponseMap.success("success").result();
    }


    @Autowired
    private LoginMapper loginMapper;

    /**
     * 获取用户信息
     *
     * @return
     */
    @RequestMapping("/userInfo.json")
    public Map getUserInfo(HttpServletRequest request) {
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);

        Map args = new HashMap();
        args.put("serverType", PropertiesUtil.get(server_type.toString()));
        // 本地用户信息
        if (server_type.compareTo(LoginTypeEnum.LOCAL_SERVER.getValue()) == 0) {
            Login login = this.loginMapper.selectByPrimaryKey(login_id);
            args.put("name", login.getName());
            args.put("loginId", login.getId());
        }
        // 模拟服务器
        else if (server_type.compareTo(LoginTypeEnum.DEMO_SERVER.getValue()) == 0) {
            try {
                AccountDesc userFullRecord = mtmServiceSoap_portType.getUserFullRecord(login_id, managerInfo_demo);
                args.put("name", userFullRecord.getUser().getName());
                args.put("loginId", userFullRecord.getUser().getLogin());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        //真实服务器
        else if (server_type.compareTo(LoginTypeEnum.REAL_SERVER.getValue()) == 0) {
            try {
                AccountDesc userFullRecord = mtmServiceSoap_portType.getUserFullRecord(login_id, managerInfo_real);
                args.put("name", userFullRecord.getUser().getName());
                args.put("loginId", login_id.toString());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        return ResponseMap.success("success").dataAll(args).result();
    }

}

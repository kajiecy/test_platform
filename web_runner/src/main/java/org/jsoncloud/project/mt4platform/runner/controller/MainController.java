package org.jsoncloud.project.mt4platform.runner.controller;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.util.DateUtil;
import org.jsoncloud.framework.util.NumberUtil;
import org.jsoncloud.framework.util.PropertiesUtil;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.jsoncloud.project.mt4platform.dao.HistoryMapper;
import org.jsoncloud.project.mt4platform.dao.OrderMapper;
import org.jsoncloud.project.mt4platform.dao.SymbolMapper;
import org.jsoncloud.project.mt4platform.po.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.*;

/**
 * @author wenka
 * @email wkwenka@gmail.com
 * @Date 2017/9/11
 * @desc
 */
@Component
public class MainController extends BaseController {

    private static final Object orderTaskO = new Object();
    private static final Object closePositionO = new Object();

    private String strSymbols = "#USOIL,#UKOIL,#USINDEX,XAGUSD,XAUUSD,USDCHF,GBPUSD,EURUSD,USDJPY,USDCAD,AUDUSD,EURGBP,EURAUD,EURCHF,EURJPY,GBPCHF,CADJPY,GBPJPY,AUDJPY,CHFJPY,EURNZD,EURCAD,CADCHF,NZDJPY,NZDUSD,GBPAUD,GBPCAD,GBPNZD,NZDCAD,USDCNH,AUDCAD,AUDNZD,AUDCHF,NZDCHF,#China A50,#US30,#US500,#USTEC,#DE30,#UK100,#JP225,#USOILv,#UKOILv,#USINDEXv,XAGUSDv,XAUUSDv,USDCHFv,GBPUSDv,EURUSDv,USDJPYv,USDCADv,AUDUSDv,EURGBPv,EURAUDv,EURCHFv,EURJPYv,GBPCHFv,CADJPYv,GBPJPYv,AUDJPYv,CHFJPYv,EURNZDv,EURCADv,CADCHFv,NZDJPYv,NZDUSDv,GBPAUDv,GBPCADv,GBPNZDv,NZDCADv,USDCNHv,AUDCADv,AUDNZDv,AUDCHFv,NZDCHFv,#China A50v,#US30v,#US500v,#USTECv,#DE30v,#UK100v,#JP225v,#USOIL.,#UKOIL.,#USINDEX.,XAGUSD.,XAUUSD.,USDCHF.,GBPUSD.,EURUSD.,USDJPY.,USDCAD.,AUDUSD.,EURGBP.,EURAUD.,EURCHF.,EURJPY.,GBPCHF.,CADJPY.,GBPJPY.,AUDJPY.,CHFJPY.,EURNZD.,EURCAD.,CADCHF.,NZDJPY.,NZDUSD.,GBPAUD.,GBPCAD.,GBPNZD.,NZDCAD.,USDCNH.,AUDCAD.,AUDNZD.,AUDCHF.,NZDCHF.,#China A50.,#US30.,#US500.,#USTEC.,#DE30.,#UK100.,#JP225.";
    private List<String> symbolList;

    private static MTMServiceLocator mtmServiceLocator;

    private static MTMServiceSoap_PortType mtmServiceSoap_portType = null;

    private static Map<String, String> symbolsInfo = new HashMap<>();

    @Autowired
    private RedisDao redisDao;

    @Autowired
    private SymbolMapper symbolMapper;

    @Autowired
    private HistoryMapper historyMapper;

    @Autowired
    private OrderMapper orderMapper;

    private String today = "20171012";

    private static ManagerInfo managerInfo = new ManagerInfo();

    static {
        mtmServiceLocator = new MTMServiceLocator();
        String test_login = PropertiesUtil.get("test_login");
        String test_pwd = PropertiesUtil.get("test_pwd");
        String test_addr = PropertiesUtil.get("test_addr");
        try {
            mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
            managerInfo.setLogin(Integer.valueOf(test_login));
            managerInfo.setPassword(test_pwd);
            managerInfo.setServer(test_addr);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }

    public void init(){
        List<Map<String, Object>> infolist = mybatisDao.selectMapList("SymbolMapper.selectAllSymbols", null);
        List<String> symbols = new ArrayList<>();
        for (Map<String, Object> symbolMap : infolist){
            symbols.add((String) symbolMap.get("symbol"));
        }
        this.strSymbols = org.apache.commons.lang.StringUtils.join(symbols, ",");
        this.symbolList = symbols;
    }

    /**
     * 定时任务执行
     * 获取所有 symbols ， 并获取该时价格，储存到 redis 数据库中。
     * 从远程服务器中获取到 symbols 的实时价格，并计算当天内的买入最低价，及卖出最高价(相对于 market)。
     * 将结果存储到 redis 数据库中。
     */
    public void symbolsTask() {
        String today = DateUtil.date2String(new Date(), "yyyyMMdd"); //获取当前日期

        long startTime = new Date().getTime();

        QuoteInfo[] quotes = null;
        try {
            quotes = mtmServiceSoap_portType.getQuotes("47.75.7.160:443", strSymbols);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        if (quotes == null) {
            return;
        }

        long start_redis = new Date().getTime();
        String symbolsstr = this.redisDao.getValue("symbolsmap");
        Map<String, Object> symbolMap = null;
        if (symbolsstr != null) {
            symbolMap = JSON.parseObject(symbolsstr);
        }
        Map<String, Map<String, String>> symbols = new HashMap<>();
        for (QuoteInfo quoteInfo : quotes) {
            Map<String, String> args = new HashMap<>();
            String symbol = quoteInfo.getSymbol();
            // 获取上一次扫描得到的数据

            Map<String, String> oldMap = null;
            if (symbolMap != null){
                oldMap = (Map<String, String>) symbolMap.get(symbol);
            }

            if (oldMap != null) {
                String oldAsk = oldMap.get("ask");
                String oldBid = oldMap.get("bid");
                // 比较新旧数据
                // 比较 ask
                if (Double.valueOf(oldAsk).compareTo(quoteInfo.getAsk()) > 0) {
                    args.put("askStatus", "down");
                } else if (Double.valueOf(oldAsk).compareTo(quoteInfo.getAsk()) == 0) {
                    args.put("askStatus", "no");
                } else if (Double.valueOf(oldAsk).compareTo(quoteInfo.getAsk()) < 0) {
                    args.put("askStatus", "up");
                }

                // 比较 bid
                if (Double.valueOf(oldBid).compareTo(quoteInfo.getBid()) > 0) {
                    args.put("bidStatus", "down");
                } else if (Double.valueOf(oldBid).compareTo(quoteInfo.getBid()) == 0) {
                    args.put("bidStatus", "no");
                } else if (Double.valueOf(oldBid).compareTo(quoteInfo.getBid()) < 0) {
                    args.put("bidStatus", "up");
                }
            }

            // 新数据

            args.put("direction", quoteInfo.getDirection() + "");
            args.put("symbol", symbol);
            Object digits = null;
            try {
                String symbolInfoStr = "";
                if (symbolsInfo.size() == 0) {
                    symbolInfoStr = this.redisDao.getValue(symbol);
                } else {
                    symbolInfoStr = symbolsInfo.get(symbol);
                }
                Object parse = JSON.parse(symbolInfoStr);
                Map<String, Object> symbolInfo = (Map<String, Object>) parse;
                if (symbolInfo != null) {
                    digits = symbolInfo.get("digits");
                }
                digits = digits == null ? Integer.valueOf(0) : digits;
                args.put("digits", digits.toString());
            } catch (Exception e) {
                System.out.println(symbol);
                e.printStackTrace();
            }

            args.put("ask", BigDecimal.valueOf(quoteInfo.getAsk()).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString());
            args.put("bid", BigDecimal.valueOf(quoteInfo.getBid()).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString());

            if (this.today.equals(today)) {
                Map<String, String> stringStringMap = oldMap;

                if (oldMap != null) {
                    String maxPrice = stringStringMap.get("maxPrice");
                    String minPrice = stringStringMap.get("minPrice");
                    if (minPrice != null && Double.parseDouble(minPrice) > quoteInfo.getBid()) {
                        args.put("minPrice", BigDecimal.valueOf(quoteInfo.getBid()).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString());
                    } else {
                        args.put("minPrice", minPrice == null ? BigDecimal.valueOf(Integer.MAX_VALUE).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString() : minPrice);
                    }
                    if (maxPrice != null && Double.parseDouble(maxPrice) < quoteInfo.getAsk()) {
                        args.put("maxPrice", BigDecimal.valueOf(quoteInfo.getAsk()).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString());
                    } else {
                        args.put("maxPrice", maxPrice == null ? BigDecimal.valueOf(0).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString() : maxPrice);
                    }
                }
            } else {
                this.today = DateUtil.date2String(new Date(), "yyyyMMdd");
                args.put("minPrice", BigDecimal.valueOf(quoteInfo.getBid()).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString());
                args.put("maxPrice", BigDecimal.valueOf(quoteInfo.getAsk()).setScale((Integer) digits, BigDecimal.ROUND_HALF_UP).toString());
            }
//            args.put("time", DateUtil.date2String(new Date(new Date().getTime() - 8 * 3600 * 1000), "HH:mm:ss"));
            args.put("time",quoteInfo.getDatetime());
            symbols.put(symbol, args);
        }
        this.redisDao.deleteKeys("symbolsmap");
        this.redisDao.setValue("symbolsmap", JSON.toJSONString(symbols));

        long aaa = new Date().getTime() - start_redis;

        System.out.println("symbolsTask total time:" + (new Date().getTime() - startTime));
    }

    /**
     * 定时任务执行
     * 查询所有 order 订单，计算该用户余额，若 <= 0 ,则删除订单，并记录到 history 中。
     */
    public void orderTask() {
        synchronized (orderTaskO) {

            long startTime = new Date().getTime();

            //获取所有价格
            String symbolsstr = this.redisDao.getValue("symbolsmap");
            Map<String, Object> symbolMap = null;
            if (symbolsstr != null) {
                symbolMap = JSON.parseObject(symbolsstr);
            }

            //1 查看所有订单以用户分组
            List<Map<String, Object>> loginIdMapList = this.mybatisDao.selectMapList("LoginMapper.selectAllIds", null);

            //2 按用户遍历，通过订单 symbol 获取的实时价格
            for (Map map : loginIdMapList) {
                Object idObj = map.get("id"); //获取login_id
                BigDecimal balance = (BigDecimal) map.get("balance");
                int id = (Integer) idObj;
                Map args = new HashMap();
                args.put("loginId", id);
                List<Map<String, Object>> orderMaps = this.mybatisDao.selectMapList("OrderMapper.selectOrdersByloginId", args);//获取当前用户的所有运行中的订单

                if (symbolMap == null || symbolMap.size() == 0) {
                    break;
                }
                BigDecimal useable = this.getUserUseable(id, balance, symbolMap, orderMaps);

                if (useable.compareTo(BigDecimal.ZERO) <= 0) {
                    //清空该用户订单，并记录到历史记录中
                    for (Map var : orderMaps) { // 将每一条订单记录转换为历史记录
                        this.orderToHistory(var);
                    }

                    // 更改账户余额
                    Map loginargs = new HashMap();
                    args.put("loginId", ((Integer) idObj).intValue());
                    this.mybatisDao.update("LoginMapper.updateBalance", loginargs);
                }
            }
            System.out.println("order task total time:" + (new Date().getTime() - startTime));
        }
    }

    /**
     * 将 buy limit / but stop / sell limit / sell stop 转换为订单
     * 通过遍历所有该类型的订单，分别比对对应 symbol 的ask.bid ，
     * 若该类订单达到其临界值，则将该条订单转换为运行中的叮当。
     */
    public void createOrderTask() {
        long startTime = new Date().getTime();
        this.mybatisDao.delete("OrderMapper.deleteExpiration", null);

        // 查询所有类型为 buy limit / but stop / sell limit / sell stop 的订单
        List<Map<String, Object>> orderMaps = this.mybatisDao.selectMapList("OrderMapper.selectOrders", null);

        // 获取当前最新的价格
        String symbolsstr = this.redisDao.getValue("symbolsmap");
        Map<String, Object> symbolMap = null;
        if (symbolsstr != null) {
            symbolMap = JSON.parseObject(symbolsstr);
        }

        // 遍历查询出的所有订单，对订单进行分析，找出达到临界值的订单， 并将其转换为运行中的订单
        for (Map map : orderMaps) {
            int id = NumberUtil.parseInt(map.get("id"), null); //id
            int command = NumberUtil.parseInt(map.get("command"), null); //获取交易类型
            String symbol = StringUtil.toString(map.get("symbol")); // 获取交易品种
            BigDecimal price = (BigDecimal) map.get("price"); //临界价格
            // 获取该订单中的该交易产品的价格
            if (symbolMap == null) {
                return;
            }
            Map<String, String> singleSymbolMap = (Map<String, String>) symbolMap.get(symbol); // 获取当前订单中 symbol 对应的此时的价格
            switch (command) {
                case 2: // BUY_LIMIT
                    BigDecimal ask = new BigDecimal(singleSymbolMap.get("ask"));
                    if (price.compareTo(ask) <= 0) {
                        Map<String, Object> args = getCondition();
                        args.put("id", id);
                        args.put("command", Integer.valueOf(0));
                        this.mybatisDao.update("OrderMapper.updateCommandById", args);
                    }
                    break;
                case 3: // SELL_LIMIT
                    BigDecimal bid = new BigDecimal(singleSymbolMap.get("bid"));
                    if (price.compareTo(bid) >= 0) {
                        Map<String, Object> args = getCondition();
                        args.put("id", id);
                        args.put("command", Integer.valueOf(1));
                        this.mybatisDao.update("OrderMapper.updateCommandById", args);
                    }
                    break;
                case 4: // BUY_STOP
                    ask = new BigDecimal(singleSymbolMap.get("ask"));
                    if (price.compareTo(ask) >= 0) {
                        Map<String, Object> args = getCondition();
                        args.put("id", id);
                        args.put("command", 0);
                        this.mybatisDao.update("OrderMapper.updateCommandById", args);
                    }
                    break;
                case 5: // SELL_STOP
                    bid = new BigDecimal(singleSymbolMap.get("bid"));
                    if (price.compareTo(bid) <= 0) {
                        Map<String, Object> args = getCondition();
                        args.put("id", id);
                        args.put("command", 1);
                        this.mybatisDao.update("OrderMapper.updateCommandById", args);
                    }
                    break;
                default:
                    continue;
            }
        }
        System.out.println("createOrderTask total time:" + (new Date().getTime() - startTime));
    }

    /**
     * 订单到达 takeprofit(盈利)/stoploss(止损) 临界值时，平仓(提交订单，转换为历史记录)
     */
    public void closePositionTask() {
        synchronized (closePositionO) {
            long startTime = new Date().getTime();

            // 拿到当前 symbol 的价格
            String symbolsstr = this.redisDao.getValue("symbolsmap");
            Map<String, Object> symbolMap = null;
            if (symbolsstr != null) {
                symbolMap = JSON.parseObject(symbolsstr);
            }
            // 查询所有类型为 buy 、 sell 的订单
            List<Map<String, Object>> orders = this.mybatisDao.selectMapList("OrderMapper.selectBuyOrSell", null);
            for (Map map : orders) {
                String symbol = (String) map.get("symbol"); //symbol
                BigDecimal stoploss = (BigDecimal) map.get("stoploss"); // 止损
                BigDecimal takeprofit = (BigDecimal) map.get("takeprofit"); // 盈利
                Integer command = (Integer) map.get("command"); //订单类型 0：BUY 1：SELL
                BigDecimal volume = ((BigDecimal) map.get("volume")); // 数量：该数量 0.01为一手
                Object price = map.get("price");
                BigDecimal storage = (BigDecimal) map.get("storage");

                // 获取当前订单 symbol 的此时价格
                Map<String, String> symbolPrice = (Map<String, String>) symbolMap.get(symbol);

                if (symbolPrice == null){
                    break;
                }
                String digits = symbolPrice.get("digits");
                if (command == 0) { // BUY
                    BigDecimal bid = BigDecimal.valueOf(Double.valueOf(symbolPrice.get("bid")));
                    if (takeprofit != null && takeprofit.doubleValue() != 0 && bid.compareTo(takeprofit) >= 0) {
                        map.put("close_price", bid);
                        map.put("profit", this.getSingleOrderUSD(symbol, command, symbolMap, bid.subtract((BigDecimal) price), storage).multiply(volume).multiply(BigDecimal.valueOf(Math.pow(10,Double.parseDouble(digits)))));
                        this.orderToHistory(map);
                    }
                    if (stoploss != null && stoploss.doubleValue() != 0 && bid.compareTo(stoploss) <= 0) {
                        map.put("close_price", bid);
                        map.put("profit", this.getSingleOrderUSD(symbol, command, symbolMap, bid.subtract((BigDecimal) price), storage).multiply(volume).multiply(BigDecimal.valueOf(Math.pow(10,Double.parseDouble(digits)))));
                        this.orderToHistory(map);
                    }
                } else if (command == 1) { // SELL
                    BigDecimal ask = BigDecimal.valueOf(Double.parseDouble(symbolPrice.get("ask")));
                    if (takeprofit != null && takeprofit.doubleValue() != 0 && ask.compareTo(takeprofit) <= 0) {
                        map.put("close_price", ask);
                        map.put("profit", this.getSingleOrderUSD(symbol, command, symbolMap, ((BigDecimal) price).subtract(ask), storage).multiply(volume).multiply(BigDecimal.valueOf(Math.pow(10,Double.parseDouble(digits)))));
                        this.orderToHistory(map);
                    }

                    if (stoploss != null && stoploss.doubleValue() != 0 && ask.compareTo(stoploss) >= 0) {
                        map.put("close_price", ask);
                        map.put("profit", this.getSingleOrderUSD(symbol, command, symbolMap, ((BigDecimal) price).subtract(ask), storage).multiply(volume).multiply(BigDecimal.valueOf(Math.pow(10,Double.parseDouble(digits)))));
                        this.orderToHistory(map);
                    }
                }
            }
            System.out.println("closePositionTask total time:" + (new Date().getTime() - startTime));
        }
    }

    /**
     * 读取所有 symbol 的规格
     */
    public void readSymbolInfo(){
        System.out.println("开始获取所有 symbol的 详细信息 getSymbolInfo 10min一次↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        int i = 1;
        for (String symbol : symbolList) {
            try {
//                this.redisDao.deleteKeys(symbol);
                SymbolInfo symbolInfo = mtmServiceSoap_portType.getSymbolInfo(symbol, managerInfo);
                Map<String, Object> args = new HashMap<>();
                args.put("spread", symbolInfo.getSpread()); //点差
                args.put("digits", symbolInfo.getDigits()); //小数点位
                args.put("stops_level", symbolInfo.getStops_level()); //止损位数
                args.put("contract_size", symbolInfo.getContract_size()); // 合约大小
                args.put("margin_currency", symbolInfo.getMargin_currency()); //预付款货币
                args.put("profit_calculation_mode", symbolInfo.getProfit_mode()); // 损益计算模式
                args.put("tick_value", symbolInfo.getTick_value()); //报价值
                args.put("tick_size", symbolInfo.getTick_size()); //报价量
                args.put("margin_calculation_mode", symbolInfo.getMargin_mode()); // 预付款计算模式
                args.put("margin_initial", symbolInfo.getMargin_initial()); //起始预付款
                args.put("margin_maintenance", symbolInfo.getMargin_maintenance()); //维持预付款
                args.put("margin_head", symbolInfo.getMargin_hedged()); //锁仓预付款
                args.put("trade", symbolInfo.getTrade()); //交易
                args.put("execution", symbolInfo.getExemode()); //执行
                args.put("GTC_model", symbolInfo.getGtc_pendings()); //GTC 模式
                args.put("swap_type", symbolInfo.getSwap_type()); //调期库存费计算模式
                args.put("swap_long", symbolInfo.getSwap_long()); //买单调期库存费
                args.put("swap_short", symbolInfo.getSwap_short()); //卖单调期库存费
                String infoJson = JSON.toJSONString(args);
                this.redisDao.setValue(symbol, infoJson);
            } catch(RemoteException e){
                e.printStackTrace();
            } finally {
                System.out.println("第"+i+"完成,获取了→"+symbol);
                i++;
            }
        }

        System.out.println("所有symbol的详细信息 全部获获取完成 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
    }

    // 计算库存费
    public void updateStorage() {
        int rate = 0;
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (week != 0 && week != 6) {
            rate = 1;
            if (week == 3){
                rate = 3;
            }
        }
        // 查询所有类型为 buy 、 sell 的订单
        List<Map<String, Object>> orders = this.mybatisDao.selectMapList("OrderMapper.selectBuyOrSell", null);
        // 计算手续费
        for (Map order : orders) {
            Integer id = (Integer) order.get("id");
            String symbol = (String) order.get("symbol");
            BigDecimal volume = (BigDecimal) order.get("volume");
            BigDecimal storage = (BigDecimal) order.get("storage");
            int command = (Integer) order.get("command");

            String symbolInfoStr = "";
            try {
                if (symbolsInfo.size() == 0) {
                    symbolInfoStr = this.redisDao.getValue(symbol);
                } else {
                    symbolInfoStr = symbolsInfo.get(symbol);
                }
            } catch (Exception e) {
                System.out.println(symbol);
                e.printStackTrace();
            }

            Object parse = JSON.parse(symbolInfoStr);
            Map<String, Object> symbolInfo = (Map<String, Object>) parse;

            if (command == 0) {
                double swap_short = ((BigDecimal) symbolInfo.get("swap_short")).doubleValue();
                storage = storage.add(BigDecimal.valueOf(swap_short * rate * volume.doubleValue()));
            } else if (command == 1) {
                double swap_long = ((BigDecimal) symbolInfo.get("swap_long")).doubleValue();
                storage = storage.add(BigDecimal.valueOf(swap_long * rate * volume.doubleValue()));
            }
            Map args = getCondition();
            args.put("id", id);
            args.put("storage", storage);
            this.mybatisDao.update("OrderMapper.updateStorage", args);
        }

        System.out.println("updateStorage任务结束");
    }

    /**
     * 将 订单map对象 转换为历史记录
     *
     * @param map
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public void orderToHistory(Map map) {
        // 取出 order 中的字段
        Object id = map.get("id");
        Object loginId = map.get("login_id");
        Object command = map.get("command");
        Object margin = map.get("margin");
        Object comment = map.get("comment");
        Object volume = map.get("volume");
        Object symbol = map.get("symbol");
        Object price = map.get("price");
        Object stoploss = map.get("stoploss");
        Object takeprofit = map.get("takeprofit");
        Object create_time = map.get("create_time");
        Object close_price = map.get("close_price");
        Object profit = map.get("profit");

        // 保存为 history
        History history = new History();
        history.setLoginId(loginId == null ? null : (Integer) loginId); // LoginId
        history.setSymbol(symbol == null ? null : (String) symbol); // symbol
        history.setCmd(command == null ? null : (Integer) command); // command
        history.setVolume(volume == null ? null : (BigDecimal) volume); // volume
        history.setSl(stoploss == null ? null : (BigDecimal) stoploss); // stopless
        history.setTp(takeprofit == null ? null : (BigDecimal) takeprofit);//takeprofit
        history.setMarginRate(margin == null ? null : (Integer) margin);// margin
        history.setOpenTime(create_time == null ? null : (Date) create_time); //openTime
        history.setOpenPrice(price == null ? null : (BigDecimal) price); // openPrice
        history.setCloseTime(new Date());
        history.setClosePrice(close_price == null ? null : (BigDecimal) close_price); // close_price
        history.setProfit(profit == null ? null : (BigDecimal) profit);
        history.setCreateTime(new Date());

        String value = this.redisDao.getValue((String) symbol);
        Map<String, Object> parse = (Map<String, Object>) JSON.parse(value);
        history.setDigits((Integer) parse.get("digits"));

//        this.logger.debug("当前OrderId：" + id, );
        this.historyMapper.insert(history);

        //删除该订单
        this.orderMapper.deleteByPrimaryKey((Integer) id);
    }

    /**
     * 获取用户可用余额
     *
     * @param loginId   用户Id
     * @param balance   用户余额
     * @param symbolMap 当前所有 symbol 的价格
     * @param orderMaps 当前用户所有运行中的订单集合Map
     * @return 用户可用余额
     */
    public BigDecimal getUserUseable(int loginId, BigDecimal balance, Map<String, Object> symbolMap, List<Map<String, Object>> orderMaps) {

        //3 通过公式计算该用户下的余额
        // 遍历的为当前用户下的所有订单
        BigDecimal totalUSD = BigDecimal.ZERO; //盈利总额
        for (Map var : orderMaps) {
            String symbol = (String) var.get("symbol"); //交易品种
            BigDecimal volume = ((BigDecimal) var.get("volume")); // 数量：该数量 0.01为一手
            BigDecimal price = (BigDecimal) var.get("price"); //开仓价格
            int command = (Integer) var.get("command"); //交易类型 0：BUY 1：SELL
            BigDecimal storage = (BigDecimal) var.get("storage");
            BigDecimal subtract = BigDecimal.ZERO; //USD利润

            String digits = ((Map<String, String>) symbolMap.get(symbol)).get("digits");
            // ① 计算当前价与开仓价的差价
            if (command == 1) { // SELL
                String ask = ((Map<String, String>) symbolMap.get(symbol)).get("ask");
                var.put("close_price", new BigDecimal(ask));
                subtract = price.subtract(new BigDecimal(ask)).multiply(volume).multiply(new BigDecimal(Math.pow(10,Double.parseDouble(digits))));
            } else if (command == 0) { // BUY
                String bid = ((Map<String, String>) symbolMap.get(symbol)).get("bid");
                var.put("close_price", new BigDecimal(bid));
                subtract = new BigDecimal(bid).subtract(price).multiply(volume).multiply(new BigDecimal(Math.pow(10,Double.parseDouble(digits))));
            }
            //② 通过判断 symbol 中的 final_value判断，计算美元价
            subtract = this.getSingleOrderUSD(symbol, command, symbolMap, subtract, storage);
            var.put("profit", subtract); //将盈利盈亏存入 map 中
            totalUSD = totalUSD.add(subtract); //最终USD总和
        }

        //4 判断该用户可用是否 <= 0 ，若小于等于0 则清空该用户的订单，并记录到历史记录中
        // 余额(balance) - 保证金(bail) - USD总和(totalUSD) = 可用(usable)
        //4.1 获取去该用户的保证金
        Map args = new HashMap();
        args.put("loginId", loginId);
        List<Map<String, Object>> maps = this.mybatisDao.selectMapList("OrderMapper.selectSumMargin", args);
        BigDecimal bail = BigDecimal.ZERO;
        if (maps != null && maps.size() > 0 && maps.get(0) != null) {
            bail = (BigDecimal) maps.get(0).get("margin_all");
            if (bail.doubleValue() < 0) {
                bail = bail.multiply(BigDecimal.valueOf(-1));
            }
        }
        if (balance == null) {
            balance = BigDecimal.ZERO;
        }
        BigDecimal useable = balance.add(totalUSD).subtract(bail);
        return useable;
    }

    /**
     * 计算单个订单的 USD
     *
     * @param symbol    交易产品类型
     * @param command   交易类型
     * @param symbolMap map
     * @param subtract  现价与买入价的差价
     * @return
     */
    public BigDecimal getSingleOrderUSD(String symbol, int command, Map symbolMap, BigDecimal subtract, BigDecimal storage) {
        Map args = new HashMap();
        args.put("symbol", symbol);
        List<Map<String, Object>> selectMapList = this.mybatisDao.selectMapList("SymbolMapper.selectFinalValueBySymbol", args);
        if (selectMapList != null && selectMapList.size() == 1) {
            Map<String, Object> stringObjectMap = selectMapList.get(0);
            Object final_value = stringObjectMap.get("final_value");
            if (final_value != null) {

                int finalValue = (Integer) final_value;
                int id_ = (Integer) stringObjectMap.get("id"); // 获取当前 symbol 的主键值
                if (finalValue > 0 && finalValue != 999999) {
                    BigDecimal nowRate = BigDecimal.ONE;
                    if (command == 0) { // BUY
                        String bid = ((Map<String, String>) symbolMap.get(symbol)).get("bid");
                        nowRate = new BigDecimal(bid);
                    } else if (command == 1) { // SELL
                        String ask = ((Map<String, String>) symbolMap.get(symbol)).get("ask");
                        nowRate = new BigDecimal(ask);
                    }
                    subtract = subtract.multiply(nowRate);
                } else if (finalValue < 0) {
                    finalValue = finalValue * -1;
                    BigDecimal nowRate = BigDecimal.ONE;
                    if (finalValue == id_) {
                        if (command == 1) { // SELL
                            String ask = ((Map<String, String>) symbolMap.get(symbol)).get("ask");
                            nowRate = new BigDecimal(ask);
                        } else if (command == 0) { //BUY
                            String bid = ((Map<String, String>) symbolMap.get(symbol)).get("bid");
                            nowRate = new BigDecimal(bid);
                        }
                    } else {
                        String symbol_ = this.symbolMapper.selectByPrimaryKey(finalValue).getSymbol(); //获取 final_value 所对应的 symbol
                        if (command == 1) { // SELL
                            nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(symbol_)).get("ask"));
                        } else if (command == 0) { //BUY
                            nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(symbol_)).get("bid"));
                        }
                    }
                    subtract = subtract.divide(nowRate, 16, BigDecimal.ROUND_HALF_UP);
                } else if (finalValue == 999999) { // = (开仓价格-当前价格)*报价值/报价量
                    SymbolInfo info = null;
                    Map<String, Object> infoMap;
                    double tick_value = 0.0;
                    double tick_size = 0.0;
                    try {
                        String symbolInfo = this.redisDao.getValue(symbol);
                        Object parse = JSON.parse(symbolInfo);
                        infoMap = (Map<String, Object>) parse;
                        tick_value = ((BigDecimal) infoMap.get("tick_value")).doubleValue();
                        tick_size = ((BigDecimal) infoMap.get("tick_size")).doubleValue();
                    } catch (Exception e) {
                        try {
                            info = mtmServiceSoap_portType.getSymbolInfo(symbol, managerInfo);
                        } catch (RemoteException re) {
                            re.printStackTrace();
                        }
                        tick_value = info.getTick_value(); //报价值
                        tick_size = info.getTick_size(); //报价量
                    }
                    subtract = BigDecimal.valueOf(subtract.doubleValue() * tick_value / tick_size);
                    Object remark = stringObjectMap.get("remark");
                    if (remark != null) {
                        String remarkStr = (String) remark;
                        BigDecimal nowRate = BigDecimal.ONE;
                        if (StringUtils.isNotBlank(remarkStr)) {
                            if (command == 1) { //SELL
                                nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(remarkStr)).get("ask"));
                            } else if (command == 0) {//BUY
                                nowRate = new BigDecimal(((Map<String, String>) symbolMap.get(remarkStr)).get("bid"));
                            }
                            subtract = subtract.multiply(nowRate);
                        }
                    }
                }
            }
        }

        if (storage != null) {
            subtract = storage.subtract(storage);
        }

        return subtract;
    }
}
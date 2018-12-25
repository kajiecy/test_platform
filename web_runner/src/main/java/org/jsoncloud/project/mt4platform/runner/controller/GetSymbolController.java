package org.jsoncloud.project.mt4platform.runner.controller;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
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
public class GetSymbolController extends BaseController {

    private static final Object orderTaskO = new Object();
    private static final Object closePositionO = new Object();

    private String strSymbols = "";
    private String strSymbols1 = "";
    private String strSymbols2 = "";
    private String strSymbols3 = "";
    private String strSymbols4 = "";
    private String strSymbols5 = "";
    private String strSymbols6 = "";
    private List<String> symbolList;
    private List<String> symbolList1;
    private List<String> symbolList2;
    private List<String> symbolList3;
    private List<String> symbolList4;
    private List<String> symbolList5;
    private List<String> symbolList6;

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
        symbolList1 = symbols.subList(0,20);
        symbolList2 = symbols.subList(20,40);
        symbolList3 = symbols.subList(40,60);
        symbolList4 = symbols.subList(60,80);
        symbolList5 = symbols.subList(80,100);
        symbolList6 = symbols.subList(100,symbols.size());
        this.strSymbols = StringUtils.join(symbols, ",");
        this.strSymbols1 = StringUtils.join(symbolList1,",");
        this.strSymbols2 = StringUtils.join(symbolList2,",");
        this.strSymbols3 = StringUtils.join(symbolList3,",");
        this.strSymbols4 = StringUtils.join(symbolList4,",");
        this.strSymbols5 = StringUtils.join(symbolList5,",");
        this.strSymbols6 = StringUtils.join(symbolList6,",");
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

        SymbolInfoPart1 symbolPart1 = new SymbolInfoPart1("47.75.7.160:443",this.strSymbols1,mtmServiceSoap_portType,1);
        SymbolInfoPart1 symbolPart2 = new SymbolInfoPart1("47.75.7.160:443",this.strSymbols2,mtmServiceSoap_portType,2);
        SymbolInfoPart1 symbolPart3 = new SymbolInfoPart1("47.75.7.160:443",this.strSymbols3,mtmServiceSoap_portType,3);
        SymbolInfoPart1 symbolPart4 = new SymbolInfoPart1("47.75.7.160:443",this.strSymbols4,mtmServiceSoap_portType,4);
        SymbolInfoPart1 symbolPart5 = new SymbolInfoPart1("47.75.7.160:443",this.strSymbols5,mtmServiceSoap_portType,5);
        SymbolInfoPart1 symbolPart6 = new SymbolInfoPart1("47.75.7.160:443",this.strSymbols6,mtmServiceSoap_portType,6);

        symbolPart1.start();
        symbolPart2.start();
        symbolPart3.start();
        symbolPart4.start();
        symbolPart5.start();
        symbolPart6.start();
        try {
            symbolPart1.join();
            symbolPart2.join();
            symbolPart3.join();
            symbolPart4.join();
            symbolPart5.join();
            symbolPart6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        QuoteInfo[] quotes_p1 = symbolPart1.getQuotes();
        QuoteInfo[] quotes_p2 = symbolPart2.getQuotes();
        QuoteInfo[] quotes_p3 = symbolPart3.getQuotes();
        QuoteInfo[] quotes_p4 = symbolPart4.getQuotes();
        QuoteInfo[] quotes_p5 = symbolPart5.getQuotes();
        QuoteInfo[] quotes_p6 = symbolPart6.getQuotes();

        quotes = new QuoteInfo[quotes_p1.length+quotes_p2.length+quotes_p3.length+quotes_p4.length+quotes_p5.length+quotes_p6.length];

        System.arraycopy(quotes_p1,0,quotes,0,quotes_p1.length);
        System.arraycopy(quotes_p2,0,quotes,quotes_p1.length,quotes_p2.length);
        System.arraycopy(quotes_p3,0,quotes,quotes_p1.length+quotes_p2.length,quotes_p3.length);
        System.arraycopy(quotes_p4,0,quotes,quotes_p1.length+quotes_p2.length+quotes_p3.length,quotes_p4.length);
        System.arraycopy(quotes_p5,0,quotes,quotes_p1.length+quotes_p2.length+quotes_p3.length+quotes_p4.length,quotes_p5.length);
        System.arraycopy(quotes_p6,0,quotes,quotes_p1.length+quotes_p2.length+quotes_p3.length+quotes_p4.length+quotes_p5.length,quotes_p6.length);

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

        System.out.println("-=-------------------->getQuotes算不内容处理完成 耗时:" + (new Date().getTime() - startTime));
    }

}
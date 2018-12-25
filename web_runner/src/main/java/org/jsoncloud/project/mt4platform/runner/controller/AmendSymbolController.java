package org.jsoncloud.project.mt4platform.runner.controller;

import com.alibaba.fastjson.JSON;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.util.PropertiesUtil;
import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.*;

@Component
public class AmendSymbolController extends BaseController {

    private String strSymbols = "#USOIL,#UKOIL,#USINDEX,XAGUSD,XAUUSD,USDCHF,GBPUSD,EURUSD,USDJPY,USDCAD,AUDUSD,EURGBP,EURAUD,EURCHF,EURJPY,GBPCHF,CADJPY,GBPJPY,AUDJPY,CHFJPY,EURNZD,EURCAD,CADCHF,NZDJPY,NZDUSD,GBPAUD,GBPCAD,GBPNZD,NZDCAD,USDCNH,AUDCAD,AUDNZD,AUDCHF,NZDCHF,#China A50,#US30,#US500,#USTEC,#DE30,#UK100,#JP225,#USOILv,#UKOILv,#USINDEXv,XAGUSDv,XAUUSDv,USDCHFv,GBPUSDv,EURUSDv,USDJPYv,USDCADv,AUDUSDv,EURGBPv,EURAUDv,EURCHFv,EURJPYv,GBPCHFv,CADJPYv,GBPJPYv,AUDJPYv,CHFJPYv,EURNZDv,EURCADv,CADCHFv,NZDJPYv,NZDUSDv,GBPAUDv,GBPCADv,GBPNZDv,NZDCADv,USDCNHv,AUDCADv,AUDNZDv,AUDCHFv,NZDCHFv,#China A50v,#US30v,#US500v,#USTECv,#DE30v,#UK100v,#JP225v,#USOIL.,#UKOIL.,#USINDEX.,XAGUSD.,XAUUSD.,USDCHF.,GBPUSD.,EURUSD.,USDJPY.,USDCAD.,AUDUSD.,EURGBP.,EURAUD.,EURCHF.,EURJPY.,GBPCHF.,CADJPY.,GBPJPY.,AUDJPY.,CHFJPY.,EURNZD.,EURCAD.,CADCHF.,NZDJPY.,NZDUSD.,GBPAUD.,GBPCAD.,GBPNZD.,NZDCAD.,USDCNH.,AUDCAD.,AUDNZD.,AUDCHF.,NZDCHF.,#China A50.,#US30.,#US500.,#USTEC.,#DE30.,#UK100.,#JP225.";
    private List<String> symbolList;

    private static MTMServiceLocator mtmServiceLocator;

    private static MTMServiceSoap_PortType mtmServiceSoap_portType = null;

    private static Map<String, String> symbolsInfo = new HashMap<>();

    @Autowired
    private RedisDao redisDao;

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

    public void init() {
        List<Map<String, Object>> infolist = mybatisDao.selectMapList("SymbolMapper.selectAllSymbols", null);
        List<String> symbols = new ArrayList<>();
        for (Map<String, Object> symbolMap : infolist) {
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
    public void amendSymbol() throws RemoteException {
        System.out.println("开始修正今日的最高值与最低值↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        long starttime = new Date().getTime();
        String symbolsstr = this.redisDao.getValue("symbolsmap");
        Map<String, Object> symbolMap = null;
        if (symbolsstr != null) {
            symbolMap = JSON.parseObject(symbolsstr);
        } else {
            return;
        }
        //循环查询今天的 charts
        for (String symbolname : symbolMap.keySet()) {
            Map<String, Object> symbolinfo = (Map<String, Object>) symbolMap.get(symbolname);

//            System.out.println(symbolinfo);

            ManagerInfo managerInfo = new ManagerInfo();
            managerInfo.setLogin(org.jsoncloud.framework.sms.PropertiesUtil.getInt("test_login"));
            managerInfo.setPassword(org.jsoncloud.framework.sms.PropertiesUtil.get("test_pwd"));
            managerInfo.setServer(org.jsoncloud.framework.sms.PropertiesUtil.get("test_addr"));

            ChartNeeded chart = new ChartNeeded();
            chart.setSymbol(symbolname);
            int aa = (int) new Date().getTime() / 1000;
            chart.setStart(aa);
            chart.setEnd(aa);
            chart.setPeriod(1440);
            chart.setMode(1);
            chart.setTimesign(0);

            BarsCollection chartInfo = mtmServiceSoap_portType.getChart(chart, managerInfo);
            BarInfo[] barinfos = chartInfo.getItems();

            String symbolMapStr = this.redisDao.getValue(symbolname);
            Map<String, Object> symbolMore = (Map<String, Object>) JSON.parse(symbolMapStr);
            Integer digits = (Integer) symbolMore.get("digits");
            BigDecimal divide = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, digits.intValue())), digits, BigDecimal.ROUND_HALF_UP);

            BigDecimal a = divide.multiply(BigDecimal.valueOf(barinfos[barinfos.length - 1].getOpen() + barinfos[barinfos.length - 1].getHigh())).setScale(digits, BigDecimal.ROUND_HALF_UP);
            BigDecimal b = divide.multiply(BigDecimal.valueOf(barinfos[barinfos.length - 1].getOpen() + barinfos[barinfos.length - 1].getLow())).setScale(digits, BigDecimal.ROUND_HALF_UP);
            symbolinfo.put("maxPrice", a.toString());
            symbolinfo.put("minPrice", b.toString());
            symbolMap.put(symbolname, symbolinfo);
        }
//        更新好之后 塞回redis
        this.redisDao.setValue("symbolsmap", JSON.toJSONString(symbolMap));
        long endtime = new Date().getTime();
        System.out.println("今日的最高值与最低值修正完成↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 耗时：" + (endtime - starttime));
    }

}

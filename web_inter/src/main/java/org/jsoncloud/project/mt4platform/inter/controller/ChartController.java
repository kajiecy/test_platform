package org.jsoncloud.project.mt4platform.inter.controller;

import com.alibaba.fastjson.JSON;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.sms.PropertiesUtil;
import org.jsoncloud.framework.util.DateUtil;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.*;

@Controller
@RequestMapping("/chart")
public class ChartController extends BaseController {
    /**
     * 接口描述 根据传入的交易品种和表格所需的时间跨度，返回表格数据
     * 接口会根据当前时间以及时间跨度判断 返回固定三十个坐标点
     */


    @Autowired
    private RedisDao redisDao;

    @ResponseBody
    @RequestMapping("/getChart.json")
    public Map<String, Object> getChart(HttpServletRequest request) throws ServiceException, RemoteException {
//        ,Integer timeStep,String symbol
        RequestData data = new RequestBodyJSON(request);
        Integer timeStep = data.getIntMust("timestep", "不能缺少timeStep");
        Integer count = data.getIntMust("count", "不能缺少timeStep");
        String symbol = data.getStringMust("symbol", "不能缺少symbol");
        Long startTime = data.getLongNull("startTime");


        if(symbol.indexOf("%23")!=-1){
            symbol = symbol.replace("%23","#");
        }
        MTMServiceLocator mtmServiceLocator = new MTMServiceLocator();
        MTMServiceSoap_PortType mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();
        Date nowtime = new Date();
        Long nowtime_count = startTime==null?nowtime.getTime():startTime;
        nowtime_count = nowtime_count / 1000;
        //生成时间区间
        Long passtime_count = nowtime_count - ((long) timeStep * 60) * count;

        if(passtime_count<0){
            passtime_count = 0l;
        }

        ManagerInfo managerInfo = new ManagerInfo();
        managerInfo.setLogin(PropertiesUtil.getInt("test_login"));
        managerInfo.setPassword(PropertiesUtil.get("test_pwd"));
        managerInfo.setServer(PropertiesUtil.get("test_addr"));

        ChartNeeded chart = new ChartNeeded();
        chart.setSymbol(symbol);
        chart.setStart(passtime_count.intValue());
        chart.setEnd(nowtime_count.intValue());
        chart.setPeriod(timeStep);
        chart.setMode(1);
        chart.setTimesign(0);

        BarsCollection chartInfo = mtmServiceSoap_portType.getChart(chart, managerInfo);
        BarInfo[] barinfos = chartInfo.getItems();

        String symbolMapStr = this.redisDao.getValue(symbol);
        Map<String, Object> symbolMap = (Map<String, Object>) JSON.parse(symbolMapStr);
        Integer digits = (Integer) symbolMap.get("digits");
        BigDecimal divide = BigDecimal.valueOf(1).divide(BigDecimal.valueOf(Math.pow(10, digits.intValue())), digits, BigDecimal.ROUND_HALF_UP);

        List<Map<String, Object>> args = new LinkedList<>();
        for (BarInfo info : barinfos) {
            Map<String, Object> arg = new HashMap<>();
            int open = info.getOpen();
            int close = info.getClose();
            int high = info.getHigh();
            int low = info.getLow();
            arg.put("time",Long.valueOf(info.getCtm()+"000"));
            arg.put("open", divide.multiply(BigDecimal.valueOf(open)).setScale(digits, BigDecimal.ROUND_HALF_UP));
            arg.put("close", divide.multiply(BigDecimal.valueOf(open + close)).setScale(digits, BigDecimal.ROUND_HALF_UP));
            arg.put("high", divide.multiply(BigDecimal.valueOf(open + high)).setScale(digits, BigDecimal.ROUND_HALF_UP));
            arg.put("low", divide.multiply(BigDecimal.valueOf(open + low)).setScale(digits, BigDecimal.ROUND_HALF_UP));
            arg.put("timeFormat", DateUtil.date2String(new Date(Long.valueOf(info.getCtm()+"000"))));
            args.add(arg);
        }

        return ResponseMap.success("获取信息成功").data("barCount", barinfos.length).data("info", args).result();
    }

    @ResponseBody
    @RequestMapping("/getSymbolInfoOne.json")
    public Map<String, Object> getSymbolInfoOne(HttpServletRequest request){
        RequestData data = new RequestBodyJSON(request);
        String symbols = data.getStringMust("symbol", "symbol不能为空");
        String jsonString = this.redisDao.getValue("symbolsmap");
        Map<String, Map<String, Object>> symbolsmap = (Map<String, Map<String, Object>>) JSON.parse(jsonString);
        Map<String, Object> map = symbolsmap.get(symbols);
        if(map==null){
            return ResponseMap.error("error").result();
        }
        List<Map<String, Object>> maps = mybatisDao.selectMapList("SymbolMapper.selectFinalValueBySymbol", map);
        Map<String,Object> symbol = maps.size()>0?maps.get(0):new HashMap<String, Object>();
        map.put("symboldesc",symbol.get("symbol_desc"));

        return ResponseMap.success("success").data("info", map).result();
    }
}

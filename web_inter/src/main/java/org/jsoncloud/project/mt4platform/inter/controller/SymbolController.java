package org.jsoncloud.project.mt4platform.inter.controller;

import com.alibaba.fastjson.JSON;
import com.mysql.jdbc.StringUtils;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.util.StringUtil;
import org.jsoncloud.framework.web.request.RequestBodyJSON;
import org.jsoncloud.framework.web.request.RequestData;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4platform.inter.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

@Controller
@RequestMapping("/symbol")
public class SymbolController extends BaseController {
    @Autowired
    private RedisDao redisDao;

    /**
     * 根据传入的交易品种字符串 返回交易品种的信息
     * 交易品种数组格式如下 ABCCBA,ABCCBA,ABCCBA
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/getSymbolInfo.json")
    public Map<String, Object> getSymbolInfo(HttpServletRequest request){
        RequestData data = new RequestBodyJSON(request);
//        List<String> symbols = JSON.parseArray(data.getStringMust("symbols", "symbols不能为空"), String.class);
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);

        String applicationType = (String) redisUser.get(Constants.APPLICATION_TYPE);

        Map<String,Object> condition = getCondition();
        condition.put("login_id",login_id);
        condition.put("type",server_type);
        condition.put("applicationType",applicationType);

        List<Map<String,Object>> useSymbol = mybatisDao.selectMapList("SymbolMapper.getUseSymbol",condition);
        List<Map<String, Object>> infolist = new ArrayList<>();
        String jsonString = this.redisDao.getValue("symbolsmap");
        Map<String, Map<String, Object>> symbolsmap = (Map<String, Map<String, Object>>) JSON.parse(jsonString);
        for (Map<String,Object> symbol : useSymbol){
            Map<String, Object> map = symbolsmap.get(symbol.get("symbol"));
//            try {
//                System.out.println(redisDao.getValue((String) symbol.get("symbol")));
//            }catch (Exception e){
//                System.out.println("null");
//            }
            if(map!=null){
                map.put("symbol_desc",symbol.get("symbol_desc"));
                int digits = Integer.parseInt((String) map.get("digits"));
                Double ask = Double.parseDouble((String)map.get("ask"));
                Double bid = Double.parseDouble((String) map.get("bid"));
                Double ji = Math.pow(10,digits);
                map.put("diancha",new BigDecimal(ask*ji-bid*ji).setScale(0,BigDecimal.ROUND_HALF_DOWN).toString());
                map.put("symbol_type",symbol.get("symbol_type"));
                infolist.add(map);
            }
        }
        return ResponseMap.success("success").data("infolist", infolist).result();
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
    /**
     * 根据 symbol 值获取 symbol 的详细信息。
     *
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/symbolInfo.json")
    public Map getSymbolInfomation(HttpServletRequest request){
        RequestData data = new RequestBodyJSON(request);
        String symbol = data.getStringMust("symbol", "symbol不能为空");
        String jsonSymbolInfo = this.redisDao.getValue(symbol);
        if (!StringUtils.isNullOrEmpty(jsonSymbolInfo)){
            Map<String, Object> symbolInfo = (Map<String, Object>) (JSON.parse(jsonSymbolInfo));
            return ResponseMap.success("success").data("symbolInfo", symbolInfo).result();
        }
        return ResponseMap.error("Fail：" + symbol + "不存在").result();
    }

    /**
     * 查询用户可添加的交易品种
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/getSymbolList.json")
    public Map getSymbolList(HttpServletRequest request){
        RequestData data = new RequestBodyJSON(request);
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        String group_name = (String) redisUser.get("group_name");
        String applicationType = (String) redisUser.get(Constants.APPLICATION_TYPE);
//        String isStock = data.getStringNull("isStock");
        //由于业务修改此时组名已经不再是组名 需要通过 tbl_symbol_group表查询组名
        Map<String,Object> groupcondition = getCondition();
        if("USAStock".equals(applicationType)){
            groupcondition.put("groupname","allsymbols");
        }else {
            groupcondition.put("groupname",group_name);
        }
        groupcondition = mybatisDao.selectMapOne("SymbolGroupMapper.selGroupByServer",groupcondition);
        List<Map<String,Object>> symbollist = null;
        if(groupcondition!=null&&groupcondition.get("symbol_type")!=null){
            Map<String,Object> condition = getCondition();
            condition.put("login_id",login_id);
            condition.put("type",server_type);
            condition.put("group_name",groupcondition.get("symbol_type"));
            if(true){
                symbollist = mybatisDao.selectMapList("SymbolMapper.selSymbolFilter",condition);
            }
        }

        return  ResponseMap.success("success").data("symbollist",symbollist).result();
    }
//    /**
//     * 查询用户可添加的交易品种
//     * @param request
//     * @return
//     */
//    @ResponseBody
//    @RequestMapping("/getSymbolList4USAStock.json")
//    public Map getSymbolList4USAStock(HttpServletRequest request){
//        RequestData data = new RequestBodyJSON(request);
//        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
//        Integer login_id = (Integer) redisUser.get("id");
//        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
//        String group_name = (String) redisUser.get("group_name");
//        //由于业务修改此时组名已经不再是组名 需要通过 tbl_symbol_group表查询组名
//        Map<String,Object> groupcondition = getCondition();
//        groupcondition.put("groupname","USAStock");
//        groupcondition = mybatisDao.selectMapOne("SymbolGroupMapper.selGroupByServer",groupcondition);
//
//        List<Map<String,Object>> symbollist = null;
//        if(groupcondition!=null&&groupcondition.get("symbol_type")!=null){
//            Map<String,Object> condition = getCondition();
//            condition.put("login_id",login_id);
//            condition.put("type",server_type);
//            condition.put("group_name",groupcondition.get("symbol_type"));
//            if(true){
//                symbollist = mybatisDao.selectMapList("SymbolMapper.selSymbolFilter",condition);
//            }
//        }
//
//        return  ResponseMap.success("success").data("symbollist",symbollist).result();
//    }
    @ResponseBody
    @RequestMapping("/getSymbolUse.json")
    public Map getSymbolUse(HttpServletRequest request){
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);

        String applicationType = (String) redisUser.get(Constants.APPLICATION_TYPE);

        Map<String,Object> condition = getCondition();
        condition.put("login_id",login_id);
        condition.put("type",server_type);
        condition.put("application_type",applicationType);
        List<Map<String,Object>> symbollist;
        symbollist = mybatisDao.selectMapList("SymbolMapper.getUseSymbolWithStock",condition);
        return  ResponseMap.success("success").data("symbollist",symbollist).result();
    }
    @ResponseBody
    @RequestMapping("/addUseSymbol.json")
    public Map addUseSymbol(HttpServletRequest request){
        RequestData data = new RequestBodyJSON(request);
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        String symbols = data.getStringMust("symbol","symbol缺失");

        String applicationType = (String) redisUser.get(Constants.APPLICATION_TYPE);

        List<String> split = (List<String>)(JSON.parse(symbols));

        for (String symbol: split){
            Map<String,Object> condition = getCondition();
            condition.put("login_id",login_id);
            condition.put("type",server_type);
            condition.put("symbol",symbol);
            condition.put("application_type",applicationType);
            mybatisDao.update("SymbolMapper.addUseSymbolWithStock",condition);
        }
        return  ResponseMap.success("success").result();
    }
    @ResponseBody
    @RequestMapping("/delUseSymbol.json")
    public Map delUseSymbol(HttpServletRequest request){
        RequestData data = new RequestBodyJSON(request);
        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        String symbols = data.getStringMust("symbol","symbol缺失");

        List<String> split = (List<String>)(JSON.parse(symbols));
        for (String symbol: split){
            Map<String,Object> condition = getCondition();
            condition.put("login_id",login_id);
            condition.put("type",server_type);
            condition.put("symbol",symbol);
            List<Map<String,Object>> symbollist;
            mybatisDao.update("SymbolMapper.delUseSymbol",condition);
        }

        return  ResponseMap.success("success").result();
    }
}

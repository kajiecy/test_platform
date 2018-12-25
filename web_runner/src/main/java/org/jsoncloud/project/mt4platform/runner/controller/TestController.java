package org.jsoncloud.project.mt4platform.runner.controller;

import org.jsoncloud.framework.redis.RedisDao;
import org.jsoncloud.framework.web.controller.BaseController;
import org.jsoncloud.project.mt4platform.dao.SymbolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/test")
public class TestController extends BaseController{

    @Autowired
    private RedisDao redisDao;

    @Autowired
    private MainController mainController;


    @ResponseBody
    @RequestMapping("/test.json")
    public String testContect(){
//        String aaa= "Runner-Successs";
////        List<String> symbols = this.symbolMapper.selectAllSymbols();
//        List<Map<String,Object>> infolist = mybatisDao.selectMapList("SymbolMapper.selectAllSymbols",null);
//        for (Map<String,Object> symbolMap: infolist){
//            Set<Object> hashKeys = this.redisDao.getHashKeys((String) symbolMap.get("symbol"));
//            for (Object o: hashKeys){
//                String hashOne = this.redisDao.getHashOne((String) symbolMap.get("symbol"), (String) o);
//                aaa += (String) symbolMap.get("symbol")+"\t"+(String) o+"\t"+hashOne+"\n";
//            }
//        }
//        return aaa;
        mainController.readSymbolInfo();
        return null;
    }

    public static void main(String[] args) {
        System.out.println(BigDecimal.valueOf(0).setScale(5,BigDecimal.ROUND_HALF_UP).toString());
    }

}

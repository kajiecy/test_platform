package org.jsoncloud.project.mt4platform.inter.controller;

import org.jsoncloud.framework.sms.PropertiesUtil;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4_platform.soap.*;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;
import org.jsoncloud.project.mt4platform.inter.Constants;

import javax.xml.rpc.ServiceException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class GetOrderInfo extends Thread{
    public Map<String, Object> redisUser ;
    private static MTMServiceSoap_PortType mtmServiceSoap_portType = null;
    private static MTMServiceLocator mtmServiceLocator;
    private static ManagerInfo managerInfo_demo = new ManagerInfo();
    private static ManagerInfo managerInfo_real = new ManagerInfo();
    private List<Map<String,Object>> orderList = null;

    public List<Map<String, Object>> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Map<String, Object>> orderList) {
        this.orderList = orderList;
    }

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


    public void run(){
//        Map<String, Object> redisUser = (Map<String, Object>) request.getAttribute(Constants.TOKEN_LOGIN_USER);
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        MarginLevelCS loginBalanceObject = null;
        TradeRecordCollection ordercollection = null;
        if (server_type == LoginTypeEnum.DEMO_SERVER.getValue()) {
            try {
                ordercollection = mtmServiceSoap_portType.getTradesCurrentForce(login_id, managerInfo_demo);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else if (server_type == LoginTypeEnum.REAL_SERVER.getValue()) {
            try {
                ordercollection = mtmServiceSoap_portType.getTradesCurrentForce(login_id, managerInfo_real);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else if (server_type == LoginTypeEnum.LOCAL_SERVER.getValue()) {
//            return ResponseMap.error("此接口不支持传入本地Token").result();
        }
        List<Map<String, Object>> order_list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+0"));

        for (TradeRecordInfo orderObj : ordercollection.getItems()){
            DecimalFormat df = new DecimalFormat("######0.00");
            Map<String, Object> orderMap = new HashMap<>();
            orderMap.put("id", orderObj.getOrder());
            orderMap.put("login_id", orderObj.getLogin());
            orderMap.put("command", orderObj.getCmd());
            orderMap.put("digits", orderObj.getDigits());
            orderMap.put("comment", orderObj.getComment());
            orderMap.put("volume", df.format(Double.valueOf(orderObj.getVolume())/100d));
            orderMap.put("symbol", orderObj.getSymbol());

            switch (orderObj.getDigits()){
                case 1:
                    df = new DecimalFormat("######0.0");
                    break;
                case 2:
                    df = new DecimalFormat("######0.00");
                    break;
                case 3:
                    df = new DecimalFormat("######0.000");
                    break;
                case 4:
                    df = new DecimalFormat("######0.0000");
                    break;
                case 5:
                    df = new DecimalFormat("######0.00000");
                    break;
                case 6:
                    df = new DecimalFormat("######0.000000");
                    break;
            }

            orderMap.put("price", Double.valueOf(df.format(orderObj.getOpen_price())));
            orderMap.put("stoploss", orderObj.getSl());
            orderMap.put("takeprofit", orderObj.getTp());
            orderMap.put("storage", orderObj.getStorage());
            orderMap.put("expiration", orderObj.getExpiration());
            orderMap.put("taxes", orderObj.getTaxes());
            orderMap.put("commission", orderObj.getCommission());
            orderMap.put("create_time", orderObj.getOpen_time());
            orderMap.put("profit", orderObj.getProfit());
            long timeLong = Long.valueOf(orderObj.getOpen_time()+"000");
            orderMap.put("open_time", sdf.format(new Date(timeLong)));
            orderMap.put("open_time_long", orderObj.getOpen_time());
            order_list.add(orderMap);
//            OrderController.resultMap.put("orderList",order_list);
        }

        orderList = listSort(order_list);
//        return ResponseMap.success("success").data("orderList", order_list).result();
    }

    public List<Map<String,Object>> listSort(List<Map<String,Object>> sortList){
        List<Map<String,Object>> result = new ArrayList<>();
        Map<Integer,Map<String,Object>> monthmap = new HashMap<>();
        for(Map<String,Object> map:sortList){
            int count = 0;
            for(Map<String,Object> comMap:sortList){
                if(Double.valueOf((Integer)comMap.get("open_time_long"))>Double.valueOf((Integer)map.get("open_time_long"))){
                    count++;
                }
            }
            if(monthmap.containsKey(count)){
                count++;
            }
            monthmap.put(count,map);
        }
        for (int i=0;i<monthmap.size();i++){
            result.add(monthmap.get(i));
        }
        return result;
    }

//    public static void main(String[] args) {
//        List<Map<String,Object>> result = new ArrayList<>();
//        Map<String,Object> map1= new HashMap<>();
//        Map<String,Object> map2= new HashMap<>();
//        Map<String,Object> map3= new HashMap<>();
//        map1.put("open_time","123456");
//        map2.put("open_time","123453");
//        map3.put("open_time","123457");
//        result.add(map1);
//        result.add(map2);
//        result.add(map3);
//        result = listSort(result);
//        System.out.println();
//    }
}

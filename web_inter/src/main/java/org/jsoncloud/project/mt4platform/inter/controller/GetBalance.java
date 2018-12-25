package org.jsoncloud.project.mt4platform.inter.controller;

import org.jsoncloud.framework.sms.PropertiesUtil;
import org.jsoncloud.framework.web.response.ResponseMap;
import org.jsoncloud.project.mt4_platform.soap.MTMServiceLocator;
import org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType;
import org.jsoncloud.project.mt4_platform.soap.ManagerInfo;
import org.jsoncloud.project.mt4_platform.soap.MarginLevelCS;
import org.jsoncloud.project.mt4platform.base.tableenum.LoginTypeEnum;
import org.jsoncloud.project.mt4platform.inter.Constants;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

public class GetBalance extends Thread{
    public Map<String, Object> redisUser ;
    private static MTMServiceSoap_PortType mtmServiceSoap_portType = null;
    private static MTMServiceLocator mtmServiceLocator;
    private static ManagerInfo managerInfo_demo = new ManagerInfo();
    private static ManagerInfo managerInfo_real = new ManagerInfo();

    private Map<String,Object> loginInfo = new HashMap<>();

    public Map<String, Object> getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(Map<String, Object> loginInfo) {
        this.loginInfo = loginInfo;
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
        } catch (ServiceException e){
            e.printStackTrace();
        }
    }

    public void run(){
        Integer login_id = (Integer) redisUser.get("id");
        Integer server_type = (Integer) redisUser.get(Constants.PARAM_LOGIN_KIND);
        MarginLevelCS loginBalanceObject = null;
        if (server_type == LoginTypeEnum.DEMO_SERVER.getValue()){
            try {
                loginBalanceObject = mtmServiceSoap_portType.getBalance(login_id, managerInfo_demo);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else if (server_type == LoginTypeEnum.REAL_SERVER.getValue()) {
            try {
                loginBalanceObject = mtmServiceSoap_portType.getBalance(login_id, managerInfo_real);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        } else if (server_type == LoginTypeEnum.LOCAL_SERVER.getValue()){
//            return ResponseMap.error("此接口不支持传入本地Token").result();
        }
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
        Map<String, Object> login_info = new HashMap<>();
        login_info.put("balance", loginBalanceObject.getBalance()==0?"0.00":df.format(loginBalanceObject.getBalance()));
        login_info.put("equity", loginBalanceObject.getEquity()==0?"0.00":df.format(loginBalanceObject.getEquity()));
        login_info.put("margin_free", loginBalanceObject.getMargin_free()==0?"0.00":df.format(loginBalanceObject.getMargin_free()));
        login_info.put("margin_level", loginBalanceObject.getMargin_level()==0?"0.00":df.format(loginBalanceObject.getMargin_level()));
        login_info.put("margin", loginBalanceObject.getMargin()==0?"0.00":df.format(loginBalanceObject.getMargin()));
        OrderController.resultMap.put("loginInfo",login_info);
        loginInfo=login_info;
//      用户的结余 当前【balance】 净值【equity】可用预付费款【margin_free】预付款比【margin_level】预付款【margin】
//        return ResponseMap.success("success").data("loginInfo", login_info).result();
    }
}

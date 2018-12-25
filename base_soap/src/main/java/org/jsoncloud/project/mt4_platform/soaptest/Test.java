package org.jsoncloud.project.mt4_platform.soaptest;

import org.jsoncloud.framework.sms.PropertiesUtil;
import org.jsoncloud.project.mt4_platform.soap.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Date;

/**
 * Created by Administrator on 2017-09-03.
 */
public class Test {

    public static void main(String[] args) throws ServiceException, RemoteException {
        MTMServiceLocator mtmServiceLocator = new MTMServiceLocator();
        MTMServiceSoap_PortType mtmServiceSoap_portType = mtmServiceLocator.getMTMServiceSoap12();



        ManagerInfo managerInfo = new ManagerInfo();
        managerInfo.setLogin(204);
        managerInfo.setPassword("jifF321");
        managerInfo.setServer("118.193.129.173:1950");
        int time = mtmServiceSoap_portType.getMtServerTime(managerInfo);
//        int time = mtmServiceSoap_portType.getTradesHistoryRange(managerInfo);
        System.out.println("soaptime:"+time);
        System.out.println("javatime:"+new Date().getTime());

        QuoteInfo[] quotes = mtmServiceSoap_portType.getQuotes("149.202.39.193", "EURUSDv,AUDCAD");
        for (QuoteInfo quoteInfo: quotes){
            System.out.println(quoteInfo.toString());
        }

//        UserRecordCS userRecordCS = new UserRecordCS();
//        userRecordCS.setGroup("demoadvanced");
//        userRecordCS.setPassword("1234a");
//        userRecordCS.setEnable("1");
//        userRecordCS.setEnable_change_password("1");
//        userRecordCS.setEnable_read_only("0");
//        userRecordCS.setName("chenyang");
//        userRecordCS.setLeverage("100");
//        userRecordCS.setBalance("10000.0");
//        userRecordCS.setPrevbalance("0");
//        userRecordCS.setPrevmonthbalance("0");
//        userRecordCS.setCredit("0");
//        userRecordCS.setInterestrate("0");
//        userRecordCS.setTaxes("0");
//        userRecordCS.setPhone("18252146252");
//        userRecordCS.setEmail("815141621@qq.com");
//        userRecordCS.setComment("123");
//        userRecordCS.setLogin("");
//        userRecordCS.setPassword_investor("");
//        userRecordCS.setPassword_phone("");
//        userRecordCS.setCountry("");
//        userRecordCS.setCity("");
//        userRecordCS.setState("");
//        userRecordCS.setZipcode("");
//        userRecordCS.setAddress("");
//        userRecordCS.setId("");
//        userRecordCS.setStatus("");
//        userRecordCS.setRegdate("");
//        userRecordCS.setLastdate("");
//        userRecordCS.setAgent_account("");
//        userRecordCS.setTimestamp("");
//        userRecordCS.setPublickey("");
//        userRecordCS.setSend_reports("");
//        userRecordCS.setBalance_status("");
//        userRecordCS.setUser_color("");
//        userRecordCS.setApi_data("");
//        ManagerInfo managerInfo = new ManagerInfo();
//        managerInfo.setLogin(PropertiesUtil.getInt("test_login"));
//        managerInfo.setPassword(PropertiesUtil.get("test_pwd"));
//        managerInfo.setServer(PropertiesUtil.get("test_addr"));
//        managerInfo.setLogin(204);
//        managerInfo.setPassword("jifF321");
//        managerInfo.setServer("118.193.129.173:1950");
//        userRecordCS = mtmServiceSoap_portType.addNewUser(userRecordCS,managerInfo);
//        System.out.println(userRecordCS.getLogin());




//        ManagerInfo managerInfo = new ManagerInfo();
//        managerInfo.setLogin(204);
//        managerInfo.setPassword("jifF321");
//        managerInfo.setServer("118.193.129.173:1950");
//        int order_id = mtmServiceSoap_portType.balanceNewRecord(1994,-112,false,"system",managerInfo);
//        System.out.println(order_id);
    }

}

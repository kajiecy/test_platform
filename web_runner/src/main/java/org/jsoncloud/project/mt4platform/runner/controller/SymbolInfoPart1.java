package org.jsoncloud.project.mt4platform.runner.controller;

import org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType;
import org.jsoncloud.project.mt4_platform.soap.QuoteInfo;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.Map;

public class SymbolInfoPart1 extends Thread{

    public SymbolInfoPart1(String url,String symbolStr,MTMServiceSoap_PortType mtmServiceSoap_portType){
        this.url = url;
        this.symbolStr = symbolStr;
        this.mtmServiceSoap_portType = mtmServiceSoap_portType;
    };
    public SymbolInfoPart1(String url,String symbolStr,MTMServiceSoap_PortType mtmServiceSoap_portType,Integer num){
        this.url = url;
        this.symbolStr = symbolStr;
        this.mtmServiceSoap_portType = mtmServiceSoap_portType;
        this.num = num;
    };


    private String url;
    private String symbolStr;
    private MTMServiceSoap_PortType mtmServiceSoap_portType;
    private QuoteInfo[] quotes;
    private Integer num;
    @Override
    public void run(){
        System.out.println("线程 { "+num+" } 号开始请求getQuotes 携带请求symbol："+symbolStr);
        long starttime = new Date().getTime();
        try {
            quotes = mtmServiceSoap_portType.getQuotes(url, symbolStr);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        long endtime = new Date().getTime();
        System.out.println("线程 { "+num+" } 号 请求完成！耗时："+(endtime - starttime));
    }
    public QuoteInfo[] getQuotes() {
        return quotes;
    }
}

/**
 * MTMServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public interface MTMServiceSoap_PortType extends java.rmi.Remote {
    public int getMtServerTime(org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int checkTradableSymbol(java.lang.String symbol, int timestamp, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public void transferFunds(int login_from, int login_to, double amount_from, double amount_to, java.lang.String comment_from, java.lang.String comment_to, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_from, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_to, org.jsoncloud.project.mt4_platform.soap.holders.TransferInfoHolder transferFundsResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammTransferInfo pammTransferFunds(int loginmi_from, int login_to, double amount_from, double amount_to, java.lang.String comment_from, java.lang.String comment_to, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_from, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_to) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.TicksCollection getTicksHistory(org.jsoncloud.project.mt4_platform.soap.TicksInfo ticks, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.QuoteInfo[] getQuotes(java.lang.String server, java.lang.String symbols) throws java.rmi.RemoteException;
    public boolean setConnection(java.lang.String server, int login, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String servieInfo() throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.LoginsList restoreAccountsList(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.UserRecordCS addNewUser(org.jsoncloud.project.mt4_platform.soap.UserRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int setTradeRecord(org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo trade, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int setUserRecord(org.jsoncloud.project.mt4_platform.soap.UserRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getUserHistory(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public boolean checkUserTrades(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public boolean checkUserHistory(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.MarginLevelCS getBalance(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo closeTradeRecord(int order, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int closeTradeRecords(org.jsoncloud.project.mt4_platform.soap.OrdersList orders, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public void addNewTradeRecord(org.jsoncloud.project.mt4_platform.soap.TradeTransInfo trade, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, org.jsoncloud.project.mt4_platform.soap.holders.TradeRecordInfoHolder addNewTradeRecordResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException;
    public void balanceNewRecord(int account, double amount, java.lang.Boolean zero_funds, java.lang.String comment, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, javax.xml.rpc.holders.IntHolder balanceNewRecordResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException;
    public void creditNewRecord(int account, double amount, java.lang.Boolean zero_funds, java.lang.String comment, int expiration, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, javax.xml.rpc.holders.IntHolder creditNewRecordResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.ConGroupCS getUserGroup(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.GroupRecordCollection getGroupsList(org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.GroupNameRecordCollection getGroupsNamesList(org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.ConGroupCS getUserGroupStr(java.lang.String group, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int checkUserPassword(int account, java.lang.String password, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.UserRecordCS getUserRecord(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.UserRecordCS getUserRecordDB(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTrades(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.OrdersList orders, java.lang.String filter, java.lang.Boolean opened_only, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTradesCurrentForce(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.SymbolInfo getSymbolInfo(java.lang.String symbol, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTradesCurrent(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.AccountDesc getUserFullRecord(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.AccountCollection getAccountsList(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.AccountCollection getAccountsListBalance(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTradesHistory(int account, java.lang.String sort, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, java.lang.Integer time_from, java.lang.Integer time_to) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.BarsCollection getChart(org.jsoncloud.project.mt4_platform.soap.ChartNeeded chart, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.SymbolBarsCollection getCharts(org.jsoncloud.project.mt4_platform.soap.ChartNeededCollection charts, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int changeMailStatements(int account, int mailstatements, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int changeLeverage(int account, int leverage, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int changeEmail(int account, java.lang.String email, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int changeGroup(int account, java.lang.String group, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int changePassword(int account, java.lang.String password, java.lang.Boolean investor, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int sendMail(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, java.lang.String from, int sender, java.lang.String subject, java.lang.String body, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int sendPushNotification(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, java.lang.String message, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public int sendPushNotification2(java.lang.String metaquotes_ids, java.lang.String message, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammManagerResponseCS pammNewManager(org.jsoncloud.project.mt4_platform.soap.PammManagerRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammSetManagerCFG(org.jsoncloud.project.mt4_platform.soap.PammSetManagerCFGCS manager_cfg, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammSetManagerCommissions(org.jsoncloud.project.mt4_platform.soap.PammSetManagerCommissions manager_commissions, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammInvestorResponseCS pammNewInvestor(org.jsoncloud.project.mt4_platform.soap.PammInvestorRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammNewPortfolioResponseCS pammNewPortfolio(org.jsoncloud.project.mt4_platform.soap.PammPortfolioRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammCloseOpenedOrders(org.jsoncloud.project.mt4_platform.soap.PammCloseOpenedOrdersDataCS account_mi, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammSetRiskEquity(org.jsoncloud.project.mt4_platform.soap.PammSetRiskEquityCS equity, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammBind(org.jsoncloud.project.mt4_platform.soap.PammBindCS bind, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammGetBindInfoCS pammGetBindInfo(int login_mi, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammBindPartnerResponseCS pammBindPartner(org.jsoncloud.project.mt4_platform.soap.PammBindPartnerCS bind_partner, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammEliminateResponseCS pammEliminate(org.jsoncloud.project.mt4_platform.soap.PammEliminateCS eliminate, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerResponseCS pammUnBindPartner(org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerCS unbind_partner, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammRolloverResponseCS pammRollover(org.jsoncloud.project.mt4_platform.soap.PammRolloverCS rollover, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammWithdrawalResponseCS pammWithdrawal(org.jsoncloud.project.mt4_platform.soap.PammWithdrawalCS withdrawal, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammCreditOutResponseCS pammCreditOut(double amount, int login_mi, java.lang.String comment, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
    public org.jsoncloud.project.mt4_platform.soap.PammUnbindResponseCS pammUnbind(org.jsoncloud.project.mt4_platform.soap.PammBindCS bind, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException;
}

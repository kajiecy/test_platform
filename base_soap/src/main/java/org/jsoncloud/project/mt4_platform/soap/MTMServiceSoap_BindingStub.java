/**
 * MTMServiceSoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class MTMServiceSoap_BindingStub extends org.apache.axis.client.Stub implements org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[62];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMtServerTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetMtServerTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckTradableSymbol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "timestamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckTradableSymbolResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransferFunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "amount_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "amount_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TransferFundsResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TransferInfo"), org.jsoncloud.project.mt4_platform.soap.TransferInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammTransferFunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "loginmi_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "amount_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "amount_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammTransferInfo"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammTransferInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammTransferFundsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTicksHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ticks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksInfo"), org.jsoncloud.project.mt4_platform.soap.TicksInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.TicksCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTicksHistoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQuotes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "server"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbols"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfQuoteInfo"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.QuoteInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetQuotesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "QuoteInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "server"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SetConnectionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ServieInfo");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ServieInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RestoreAccountsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "logins"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList"), org.jsoncloud.project.mt4_platform.soap.LoginsList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.LoginsList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "RestoreAccountsListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddNewUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS"), org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AddNewUserResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetTradeRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "trade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordInfo"), org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SetTradeRecordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetUserRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS"), org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SetUserRecordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserHistoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckUserTrades");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckUserTradesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckUserHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckUserHistoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "MarginLevelCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.MarginLevelCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetBalanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CloseTradeRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordInfo"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CloseTradeRecordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CloseTradeRecords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "orders"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OrdersList"), org.jsoncloud.project.mt4_platform.soap.OrdersList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CloseTradeRecordsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddNewTradeRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "trade"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeTransInfo"), org.jsoncloud.project.mt4_platform.soap.TradeTransInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AddNewTradeRecordResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordInfo"), org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BalanceNewRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "zero_funds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BalanceNewRecordResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreditNewRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "zero_funds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "expiration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CreditNewRecordResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.ConGroupCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGroupsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GroupRecordCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.GroupRecordCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetGroupsListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGroupsNamesList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GroupNameRecordCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.GroupNameRecordCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetGroupsNamesListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserGroupStr");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "group"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.ConGroupCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserGroupStrResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckUserPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckUserPasswordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserRecordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserRecordDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserRecordDBResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTrades");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "logins"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList"), org.jsoncloud.project.mt4_platform.soap.LoginsList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "orders"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OrdersList"), org.jsoncloud.project.mt4_platform.soap.OrdersList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "opened_only"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTradesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTradesCurrentForce");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTradesCurrentForceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSymbolInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolInfo"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.SymbolInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetSymbolInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTradesCurrent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTradesCurrentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserFullRecord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountDesc"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.AccountDesc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserFullRecordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountsList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "logins"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList"), org.jsoncloud.project.mt4_platform.soap.LoginsList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.AccountCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetAccountsListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountsListBalance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "logins"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList"), org.jsoncloud.project.mt4_platform.soap.LoginsList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.AccountCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetAccountsListBalanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTradesHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "sort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "time_from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "time_to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTradesHistoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetChart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "chart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChartNeeded"), org.jsoncloud.project.mt4_platform.soap.ChartNeeded.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BarsCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.BarsCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetChartResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCharts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "charts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChartNeededCollection"), org.jsoncloud.project.mt4_platform.soap.ChartNeededCollection.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolBarsCollection"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.SymbolBarsCollection.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetChartsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeMailStatements");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "mailstatements"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeMailStatementsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeLeverage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "leverage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeLeverageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeEmailResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "group"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeGroupResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "investor"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangePasswordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendMail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "logins"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList"), org.jsoncloud.project.mt4_platform.soap.LoginsList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "sender"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "subject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "body"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SendMailResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendPushNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "logins"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList"), org.jsoncloud.project.mt4_platform.soap.LoginsList.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SendPushNotificationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendPushNotification2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "metaquotes_ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SendPushNotificationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammNewManager");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammManagerRecordCS"), org.jsoncloud.project.mt4_platform.soap.PammManagerRecordCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammManagerResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammManagerResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewManagerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammSetManagerCFG");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager_cfg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCFGCS"), org.jsoncloud.project.mt4_platform.soap.PammSetManagerCFGCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCFGResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammSetManagerCommissions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager_commissions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCommissions"), org.jsoncloud.project.mt4_platform.soap.PammSetManagerCommissions.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCommissionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammNewInvestor");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammInvestorRecordCS"), org.jsoncloud.project.mt4_platform.soap.PammInvestorRecordCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammInvestorResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammInvestorResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewInvestorResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammNewPortfolio");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammPortfolioRecordCS"), org.jsoncloud.project.mt4_platform.soap.PammPortfolioRecordCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewPortfolioResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammNewPortfolioResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewPortfolioResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammCloseOpenedOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account_mi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCloseOpenedOrdersDataCS"), org.jsoncloud.project.mt4_platform.soap.PammCloseOpenedOrdersDataCS.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCloseOpenedOrdersResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammSetRiskEquity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "equity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetRiskEquityCS"), org.jsoncloud.project.mt4_platform.soap.PammSetRiskEquityCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetRiskEquityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammBind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "bind"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindCS"), org.jsoncloud.project.mt4_platform.soap.PammBindCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammGetBindInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_mi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammGetBindInfoCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammGetBindInfoCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammGetBindInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammBindPartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "bind_partner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindPartnerCS"), org.jsoncloud.project.mt4_platform.soap.PammBindPartnerCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindPartnerResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammBindPartnerResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindPartnerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammEliminate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "eliminate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammEliminateCS"), org.jsoncloud.project.mt4_platform.soap.PammEliminateCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammEliminateResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammEliminateResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammEliminateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammUnBindPartner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "unbind_partner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnBindPartnerCS"), org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnBindPartnerResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnBindPartnerResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammRollover");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "rollover"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammRolloverCS"), org.jsoncloud.project.mt4_platform.soap.PammRolloverCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammRolloverResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammRolloverResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammRolloverResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammWithdrawal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "withdrawal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammWithdrawalCS"), org.jsoncloud.project.mt4_platform.soap.PammWithdrawalCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammWithdrawalResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammWithdrawalResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammWithdrawalResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammCreditOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_mi"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCreditOutResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammCreditOutResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCreditOutResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PammUnbind");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "bind"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindCS"), org.jsoncloud.project.mt4_platform.soap.PammBindCS.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "manager"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo"), org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnbindResponseCS"));
        oper.setReturnClass(org.jsoncloud.project.mt4_platform.soap.PammUnbindResponseCS.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnbindResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

    }

    public MTMServiceSoap_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MTMServiceSoap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MTMServiceSoap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.AccountCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountDesc");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.AccountDesc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AlignArray");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.AlignArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AlignInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.AlignInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfAccountDesc");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.AccountDesc[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountDesc");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountDesc");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfAlign");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.AlignInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AlignInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "Align");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfBarInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.BarInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BarInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BarInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfChartNeeded");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ChartNeeded[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChartNeeded");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChartNeeded");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfCommissionsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.CommissionsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CommissionsInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CommissionsInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfConSession");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ConSessionInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConSessionInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConSession");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfDouble");
            cachedSerQNames.add(qName);
            cls = double[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "double");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfExternalUnused");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ExternalUnusedInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ExternalUnusedInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ExternalUnused");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfGroupNameRecordInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ConGroupNameCS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupNameCS");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GroupNameRecordInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfGroupRecordInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ConGroupCS[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupCS");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GroupRecordInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfLoginInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfLoginsGroupsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginsGroupsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsGroupsInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsGroupsInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfLoginsInvestorsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginsInvestorsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsInvestorsInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsInvestorsInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfOrderInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.OrderInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OrderInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OrderInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfQuoteInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.QuoteInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "QuoteInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "QuoteInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfReserved");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ReservedInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ReservedInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "Reserved");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfSessions");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.SessionsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SessionsInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "Sessions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfSymbolBarsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.SymbolBarsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolBarsInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolBarsInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfTicksDesc");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TicksDesc[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksDesc");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksDesc");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfTradeRecordInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ArrayOfUnused");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.UnusedInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UnusedInfo");
            qName2 = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "Unused");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BarInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.BarInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BarsCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.BarsCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChartNeeded");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ChartNeeded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChartNeededCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ChartNeededCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CommissionsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.CommissionsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CommissionsList");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.CommissionsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ConGroupCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupNameCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ConGroupNameCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConSessionArray");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ConSessionArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConSessionInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ConSessionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ExternalUnusedArray");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ExternalUnusedArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ExternalUnusedInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ExternalUnusedInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GroupNameRecordCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.GroupNameRecordCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GroupRecordCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.GroupRecordCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsGroupsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginsGroupsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsGroupsList");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginsGroupsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsInvestorsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginsInvestorsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsInvestorsList");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginsInvestorsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "LoginsList");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.LoginsList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ManagerInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ManagerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "MarginLevelCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.MarginLevelCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.OperationDesc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OrderInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.OrderInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OrdersList");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.OrdersList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammBindCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindPartnerCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammBindPartnerCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindPartnerResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammBindPartnerResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCloseOpenedOrdersDataCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammCloseOpenedOrdersDataCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCreditOutResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammCreditOutResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammEliminateCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammEliminateCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammEliminateResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammEliminateResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammGetBindInfoCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammGetBindInfoCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammInvestorRecordCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammInvestorRecordCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammInvestorResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammInvestorResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammManagerRecordCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammManagerRecordCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammManagerResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammManagerResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewPortfolioResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammNewPortfolioResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammPortfolioRecordCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammPortfolioRecordCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammRolloverCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammRolloverCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammRolloverResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammRolloverResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCFGCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammSetManagerCFGCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCommissions");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammSetManagerCommissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetRiskEquityCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammSetRiskEquityCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammTransferInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammTransferInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnBindPartnerCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnBindPartnerResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnbindResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammUnbindResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammWithdrawalCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammWithdrawalCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammWithdrawalResponseCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.PammWithdrawalResponseCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "QuoteInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.QuoteInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ReservedArray");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ReservedArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ReservedInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.ReservedInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SessionsArray");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.SessionsArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SessionsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.SessionsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolBarsCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.SymbolBarsCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolBarsInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.SymbolBarsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.SymbolInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TicksCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksDesc");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TicksDesc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TicksInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordCollection");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeTransInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TradeTransInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TransferInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.TransferInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UnusedArray");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.UnusedArray.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UnusedInfo");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.UnusedInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS");
            cachedSerQNames.add(qName);
            cls = org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public int getMtServerTime(org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetMtServerTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetMtServerTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int checkTradableSymbol(java.lang.String symbol, int timestamp, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/CheckTradableSymbol");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckTradableSymbol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {symbol, new java.lang.Integer(timestamp), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void transferFunds(int login_from, int login_to, double amount_from, double amount_to, java.lang.String comment_from, java.lang.String comment_to, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_from, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_to, org.jsoncloud.project.mt4_platform.soap.holders.TransferInfoHolder transferFundsResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/TransferFunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TransferFunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(login_from), new java.lang.Integer(login_to), new java.lang.Double(amount_from), new java.lang.Double(amount_to), comment_from, comment_to, manager_from, manager_to});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                transferFundsResult.value = (org.jsoncloud.project.mt4_platform.soap.TransferInfo) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TransferFundsResult"));
            } catch (java.lang.Exception _exception) {
                transferFundsResult.value = (org.jsoncloud.project.mt4_platform.soap.TransferInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TransferFundsResult")), org.jsoncloud.project.mt4_platform.soap.TransferInfo.class);
            }
            try {
                error_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"))).intValue();
            } catch (java.lang.Exception _exception) {
                error_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammTransferInfo pammTransferFunds(int loginmi_from, int login_to, double amount_from, double amount_to, java.lang.String comment_from, java.lang.String comment_to, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_from, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager_to) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammTransferFunds");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammTransferFunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(loginmi_from), new java.lang.Integer(login_to), new java.lang.Double(amount_from), new java.lang.Double(amount_to), comment_from, comment_to, manager_from, manager_to});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammTransferInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammTransferInfo) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammTransferInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.TicksCollection getTicksHistory(org.jsoncloud.project.mt4_platform.soap.TicksInfo ticks, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetTicksHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTicksHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ticks, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.TicksCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.TicksCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.TicksCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.QuoteInfo[] getQuotes(java.lang.String server, java.lang.String symbols) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetQuotes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetQuotes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {server, symbols});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.QuoteInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.QuoteInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.QuoteInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean setConnection(java.lang.String server, int login, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/SetConnection");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SetConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {server, new java.lang.Integer(login), password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String servieInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/ServieInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ServieInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.LoginsList restoreAccountsList(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/RestoreAccountsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "RestoreAccountsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logins, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.LoginsList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.LoginsList) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.LoginsList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.UserRecordCS addNewUser(org.jsoncloud.project.mt4_platform.soap.UserRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/AddNewUser");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AddNewUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.UserRecordCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.UserRecordCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setTradeRecord(org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo trade, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/SetTradeRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SetTradeRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {trade, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setUserRecord(org.jsoncloud.project.mt4_platform.soap.UserRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/SetUserRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SetUserRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getUserHistory(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetUserHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean checkUserTrades(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/CheckUserTrades");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckUserTrades"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean checkUserHistory(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/CheckUserHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckUserHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.MarginLevelCS getBalance(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.MarginLevelCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.MarginLevelCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.MarginLevelCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo closeTradeRecord(int order, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/CloseTradeRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CloseTradeRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(order), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int closeTradeRecords(org.jsoncloud.project.mt4_platform.soap.OrdersList orders, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/CloseTradeRecords");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CloseTradeRecords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {orders, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void addNewTradeRecord(org.jsoncloud.project.mt4_platform.soap.TradeTransInfo trade, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, org.jsoncloud.project.mt4_platform.soap.holders.TradeRecordInfoHolder addNewTradeRecordResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/AddNewTradeRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AddNewTradeRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {trade, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                addNewTradeRecordResult.value = (org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AddNewTradeRecordResult"));
            } catch (java.lang.Exception _exception) {
                addNewTradeRecordResult.value = (org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AddNewTradeRecordResult")), org.jsoncloud.project.mt4_platform.soap.TradeRecordInfo.class);
            }
            try {
                error_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"))).intValue();
            } catch (java.lang.Exception _exception) {
                error_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void balanceNewRecord(int account, double amount, java.lang.Boolean zero_funds, java.lang.String comment, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, javax.xml.rpc.holders.IntHolder balanceNewRecordResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/BalanceNewRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BalanceNewRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), new java.lang.Double(amount), zero_funds, comment, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                balanceNewRecordResult.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BalanceNewRecordResult"))).intValue();
            } catch (java.lang.Exception _exception) {
                balanceNewRecordResult.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BalanceNewRecordResult")), int.class)).intValue();
            }
            try {
                error_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"))).intValue();
            } catch (java.lang.Exception _exception) {
                error_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void creditNewRecord(int account, double amount, java.lang.Boolean zero_funds, java.lang.String comment, int expiration, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, javax.xml.rpc.holders.IntHolder creditNewRecordResult, javax.xml.rpc.holders.IntHolder error_code) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/CreditNewRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CreditNewRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), new java.lang.Double(amount), zero_funds, comment, new java.lang.Integer(expiration), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                creditNewRecordResult.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CreditNewRecordResult"))).intValue();
            } catch (java.lang.Exception _exception) {
                creditNewRecordResult.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CreditNewRecordResult")), int.class)).intValue();
            }
            try {
                error_code.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code"))).intValue();
            } catch (java.lang.Exception _exception) {
                error_code.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_code")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.ConGroupCS getUserGroup(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetUserGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.ConGroupCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.ConGroupCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.ConGroupCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.GroupRecordCollection getGroupsList(org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetGroupsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetGroupsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.GroupRecordCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.GroupRecordCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.GroupRecordCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.GroupNameRecordCollection getGroupsNamesList(org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetGroupsNamesList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetGroupsNamesList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.GroupNameRecordCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.GroupNameRecordCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.GroupNameRecordCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.ConGroupCS getUserGroupStr(java.lang.String group, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetUserGroupStr");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserGroupStr"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {group, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.ConGroupCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.ConGroupCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.ConGroupCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int checkUserPassword(int account, java.lang.String password, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/CheckUserPassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CheckUserPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), password, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.UserRecordCS getUserRecord(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetUserRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.UserRecordCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.UserRecordCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.UserRecordCS getUserRecordDB(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetUserRecordDB");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserRecordDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.UserRecordCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.UserRecordCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.UserRecordCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTrades(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.OrdersList orders, java.lang.String filter, java.lang.Boolean opened_only, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetTrades");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTrades"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logins, orders, filter, opened_only, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTradesCurrentForce(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetTradesCurrentForce");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTradesCurrentForce"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.SymbolInfo getSymbolInfo(java.lang.String symbol, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetSymbolInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetSymbolInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {symbol, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.SymbolInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.SymbolInfo) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.SymbolInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTradesCurrent(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetTradesCurrent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTradesCurrent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.AccountDesc getUserFullRecord(int account, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetUserFullRecord");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetUserFullRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.AccountDesc) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.AccountDesc) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.AccountDesc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.AccountCollection getAccountsList(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetAccountsList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetAccountsList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logins, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.AccountCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.AccountCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.AccountCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.AccountCollection getAccountsListBalance(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetAccountsListBalance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetAccountsListBalance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logins, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.AccountCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.AccountCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.AccountCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection getTradesHistory(int account, java.lang.String sort, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager, java.lang.Integer time_from, java.lang.Integer time_to) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetTradesHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetTradesHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), sort, manager, time_from, time_to});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.TradeRecordCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.BarsCollection getChart(org.jsoncloud.project.mt4_platform.soap.ChartNeeded chart, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetChart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetChart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {chart, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.BarsCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.BarsCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.BarsCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.SymbolBarsCollection getCharts(org.jsoncloud.project.mt4_platform.soap.ChartNeededCollection charts, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/GetCharts");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetCharts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {charts, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.SymbolBarsCollection) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.SymbolBarsCollection) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.SymbolBarsCollection.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int changeMailStatements(int account, int mailstatements, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/ChangeMailStatements");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeMailStatements"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), new java.lang.Integer(mailstatements), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int changeLeverage(int account, int leverage, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/ChangeLeverage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeLeverage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), new java.lang.Integer(leverage), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int changeEmail(int account, java.lang.String email, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/ChangeEmail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), email, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int changeGroup(int account, java.lang.String group, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/ChangeGroup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangeGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), group, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int changePassword(int account, java.lang.String password, java.lang.Boolean investor, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/ChangePassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ChangePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(account), password, investor, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int sendMail(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, java.lang.String from, int sender, java.lang.String subject, java.lang.String body, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/SendMail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SendMail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logins, from, new java.lang.Integer(sender), subject, body, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int sendPushNotification(org.jsoncloud.project.mt4_platform.soap.LoginsList logins, java.lang.String message, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/SendPushNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SendPushNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {logins, message, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int sendPushNotification2(java.lang.String metaquotes_ids, java.lang.String message, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/SendPushNotification2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SendPushNotification2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {metaquotes_ids, message, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammManagerResponseCS pammNewManager(org.jsoncloud.project.mt4_platform.soap.PammManagerRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammNewManager");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewManager"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammManagerResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammManagerResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammManagerResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammSetManagerCFG(org.jsoncloud.project.mt4_platform.soap.PammSetManagerCFGCS manager_cfg, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammSetManagerCFG");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCFG"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manager_cfg, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammSetManagerCommissions(org.jsoncloud.project.mt4_platform.soap.PammSetManagerCommissions manager_commissions, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammSetManagerCommissions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCommissions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {manager_commissions, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammInvestorResponseCS pammNewInvestor(org.jsoncloud.project.mt4_platform.soap.PammInvestorRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammNewInvestor");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewInvestor"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammInvestorResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammInvestorResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammInvestorResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammNewPortfolioResponseCS pammNewPortfolio(org.jsoncloud.project.mt4_platform.soap.PammPortfolioRecordCS user, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammNewPortfolio");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammNewPortfolio"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammNewPortfolioResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammNewPortfolioResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammNewPortfolioResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammCloseOpenedOrders(org.jsoncloud.project.mt4_platform.soap.PammCloseOpenedOrdersDataCS account_mi, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammCloseOpenedOrders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCloseOpenedOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {account_mi, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammSetRiskEquity(org.jsoncloud.project.mt4_platform.soap.PammSetRiskEquityCS equity, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammSetRiskEquity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetRiskEquity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {equity, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.OperationDesc pammBind(org.jsoncloud.project.mt4_platform.soap.PammBindCS bind, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammBind");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bind, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.OperationDesc) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.OperationDesc.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammGetBindInfoCS pammGetBindInfo(int login_mi, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammGetBindInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammGetBindInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(login_mi), manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammGetBindInfoCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammGetBindInfoCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammGetBindInfoCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammBindPartnerResponseCS pammBindPartner(org.jsoncloud.project.mt4_platform.soap.PammBindPartnerCS bind_partner, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammBindPartner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindPartner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bind_partner, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammBindPartnerResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammBindPartnerResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammBindPartnerResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammEliminateResponseCS pammEliminate(org.jsoncloud.project.mt4_platform.soap.PammEliminateCS eliminate, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammEliminate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammEliminate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {eliminate, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammEliminateResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammEliminateResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammEliminateResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerResponseCS pammUnBindPartner(org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerCS unbind_partner, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammUnBindPartner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnBindPartner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {unbind_partner, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammUnBindPartnerResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammRolloverResponseCS pammRollover(org.jsoncloud.project.mt4_platform.soap.PammRolloverCS rollover, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammRollover");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammRollover"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rollover, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammRolloverResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammRolloverResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammRolloverResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammWithdrawalResponseCS pammWithdrawal(org.jsoncloud.project.mt4_platform.soap.PammWithdrawalCS withdrawal, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammWithdrawal");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammWithdrawal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {withdrawal, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammWithdrawalResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammWithdrawalResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammWithdrawalResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammCreditOutResponseCS pammCreditOut(double amount, int login_mi, java.lang.String comment, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammCreditOut");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammCreditOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Double(amount), new java.lang.Integer(login_mi), comment, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammCreditOutResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammCreditOutResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammCreditOutResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.jsoncloud.project.mt4_platform.soap.PammUnbindResponseCS pammUnbind(org.jsoncloud.project.mt4_platform.soap.PammBindCS bind, org.jsoncloud.project.mt4_platform.soap.ManagerInfo manager) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://plug.ittrendex.com/xmtm/PammUnbind");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnbind"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bind, manager});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.jsoncloud.project.mt4_platform.soap.PammUnbindResponseCS) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.jsoncloud.project.mt4_platform.soap.PammUnbindResponseCS) org.apache.axis.utils.JavaUtils.convert(_resp, org.jsoncloud.project.mt4_platform.soap.PammUnbindResponseCS.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

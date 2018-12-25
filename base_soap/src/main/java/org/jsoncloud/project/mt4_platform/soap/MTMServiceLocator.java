/**
 * MTMServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class MTMServiceLocator extends org.apache.axis.client.Service implements org.jsoncloud.project.mt4_platform.soap.MTMService {

    public MTMServiceLocator() {
    }


    public MTMServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MTMServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MTMServiceSoap
    private java.lang.String MTMServiceSoap_address = "http://mtservices.forexspace.cn/cgi/mt4gsoapsrv.dll";

    public java.lang.String getMTMServiceSoapAddress() {
        return MTMServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MTMServiceSoapWSDDServiceName = "MTMServiceSoap";

    public java.lang.String getMTMServiceSoapWSDDServiceName() {
        return MTMServiceSoapWSDDServiceName;
    }

    public void setMTMServiceSoapWSDDServiceName(java.lang.String name) {
        MTMServiceSoapWSDDServiceName = name;
    }

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MTMServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMTMServiceSoap(endpoint);
    }

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_BindingStub _stub = new org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getMTMServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMTMServiceSoapEndpointAddress(java.lang.String address) {
        MTMServiceSoap_address = address;
    }


    // Use to get a proxy class for MTMServiceSoap12
    private java.lang.String MTMServiceSoap12_address = "http://mtservices.forexspace.cn/cgi/mt4gsoapsrv.dll";

    public java.lang.String getMTMServiceSoap12Address() {
        return MTMServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MTMServiceSoap12WSDDServiceName = "MTMServiceSoap12";

    public java.lang.String getMTMServiceSoap12WSDDServiceName() {
        return MTMServiceSoap12WSDDServiceName;
    }

    public void setMTMServiceSoap12WSDDServiceName(java.lang.String name) {
        MTMServiceSoap12WSDDServiceName = name;
    }

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MTMServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMTMServiceSoap12(endpoint);
    }

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap12Stub _stub = new org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getMTMServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMTMServiceSoap12EndpointAddress(java.lang.String address) {
        MTMServiceSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_BindingStub _stub = new org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_BindingStub(new java.net.URL(MTMServiceSoap_address), this);
                _stub.setPortName(getMTMServiceSoapWSDDServiceName());
                return _stub;
            }
            if (org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap12Stub _stub = new org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap12Stub(new java.net.URL(MTMServiceSoap12_address), this);
                _stub.setPortName(getMTMServiceSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MTMServiceSoap".equals(inputPortName)) {
            return getMTMServiceSoap();
        }
        else if ("MTMServiceSoap12".equals(inputPortName)) {
            return getMTMServiceSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "MTMService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "MTMServiceSoap"));
            ports.add(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "MTMServiceSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MTMServiceSoap".equals(portName)) {
            setMTMServiceSoapEndpointAddress(address);
        }
        else 
if ("MTMServiceSoap12".equals(portName)) {
            setMTMServiceSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

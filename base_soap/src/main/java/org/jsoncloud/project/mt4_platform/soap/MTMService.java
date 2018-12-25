/**
 * MTMService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public interface MTMService extends javax.xml.rpc.Service {
    public java.lang.String getMTMServiceSoapAddress();

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap() throws javax.xml.rpc.ServiceException;

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getMTMServiceSoap12Address();

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap12() throws javax.xml.rpc.ServiceException;

    public org.jsoncloud.project.mt4_platform.soap.MTMServiceSoap_PortType getMTMServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

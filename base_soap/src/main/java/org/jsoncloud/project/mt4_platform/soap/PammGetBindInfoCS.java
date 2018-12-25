/**
 * PammGetBindInfoCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammGetBindInfoCS  implements java.io.Serializable {
    private int login_manager;

    private int login_virtual;

    private org.jsoncloud.project.mt4_platform.soap.OperationDesc result;

    public PammGetBindInfoCS() {
    }

    public PammGetBindInfoCS(
           int login_manager,
           int login_virtual,
           org.jsoncloud.project.mt4_platform.soap.OperationDesc result) {
           this.login_manager = login_manager;
           this.login_virtual = login_virtual;
           this.result = result;
    }


    /**
     * Gets the login_manager value for this PammGetBindInfoCS.
     * 
     * @return login_manager
     */
    public int getLogin_manager() {
        return login_manager;
    }


    /**
     * Sets the login_manager value for this PammGetBindInfoCS.
     * 
     * @param login_manager
     */
    public void setLogin_manager(int login_manager) {
        this.login_manager = login_manager;
    }


    /**
     * Gets the login_virtual value for this PammGetBindInfoCS.
     * 
     * @return login_virtual
     */
    public int getLogin_virtual() {
        return login_virtual;
    }


    /**
     * Sets the login_virtual value for this PammGetBindInfoCS.
     * 
     * @param login_virtual
     */
    public void setLogin_virtual(int login_virtual) {
        this.login_virtual = login_virtual;
    }


    /**
     * Gets the result value for this PammGetBindInfoCS.
     * 
     * @return result
     */
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc getResult() {
        return result;
    }


    /**
     * Sets the result value for this PammGetBindInfoCS.
     * 
     * @param result
     */
    public void setResult(org.jsoncloud.project.mt4_platform.soap.OperationDesc result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammGetBindInfoCS)) return false;
        PammGetBindInfoCS other = (PammGetBindInfoCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.login_manager == other.getLogin_manager() &&
            this.login_virtual == other.getLogin_virtual() &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getLogin_manager();
        _hashCode += getLogin_virtual();
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammGetBindInfoCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammGetBindInfoCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_manager");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_virtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_virtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

/**
 * PammInvestorResponseCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammInvestorResponseCS  implements java.io.Serializable {
    private int login_investor;

    private org.jsoncloud.project.mt4_platform.soap.OperationDesc result;

    public PammInvestorResponseCS() {
    }

    public PammInvestorResponseCS(
           int login_investor,
           org.jsoncloud.project.mt4_platform.soap.OperationDesc result) {
           this.login_investor = login_investor;
           this.result = result;
    }


    /**
     * Gets the login_investor value for this PammInvestorResponseCS.
     * 
     * @return login_investor
     */
    public int getLogin_investor() {
        return login_investor;
    }


    /**
     * Sets the login_investor value for this PammInvestorResponseCS.
     * 
     * @param login_investor
     */
    public void setLogin_investor(int login_investor) {
        this.login_investor = login_investor;
    }


    /**
     * Gets the result value for this PammInvestorResponseCS.
     * 
     * @return result
     */
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc getResult() {
        return result;
    }


    /**
     * Sets the result value for this PammInvestorResponseCS.
     * 
     * @param result
     */
    public void setResult(org.jsoncloud.project.mt4_platform.soap.OperationDesc result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammInvestorResponseCS)) return false;
        PammInvestorResponseCS other = (PammInvestorResponseCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.login_investor == other.getLogin_investor() &&
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
        _hashCode += getLogin_investor();
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammInvestorResponseCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammInvestorResponseCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_investor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_investor"));
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

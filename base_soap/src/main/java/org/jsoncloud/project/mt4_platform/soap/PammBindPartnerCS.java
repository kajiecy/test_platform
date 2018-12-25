/**
 * PammBindPartnerCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammBindPartnerCS  implements java.io.Serializable {
    private int login_p;

    private int login_v;

    private double commission;

    public PammBindPartnerCS() {
    }

    public PammBindPartnerCS(
           int login_p,
           int login_v,
           double commission) {
           this.login_p = login_p;
           this.login_v = login_v;
           this.commission = commission;
    }


    /**
     * Gets the login_p value for this PammBindPartnerCS.
     * 
     * @return login_p
     */
    public int getLogin_p() {
        return login_p;
    }


    /**
     * Sets the login_p value for this PammBindPartnerCS.
     * 
     * @param login_p
     */
    public void setLogin_p(int login_p) {
        this.login_p = login_p;
    }


    /**
     * Gets the login_v value for this PammBindPartnerCS.
     * 
     * @return login_v
     */
    public int getLogin_v() {
        return login_v;
    }


    /**
     * Sets the login_v value for this PammBindPartnerCS.
     * 
     * @param login_v
     */
    public void setLogin_v(int login_v) {
        this.login_v = login_v;
    }


    /**
     * Gets the commission value for this PammBindPartnerCS.
     * 
     * @return commission
     */
    public double getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this PammBindPartnerCS.
     * 
     * @param commission
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammBindPartnerCS)) return false;
        PammBindPartnerCS other = (PammBindPartnerCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.login_p == other.getLogin_p() &&
            this.login_v == other.getLogin_v() &&
            this.commission == other.getCommission();
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
        _hashCode += getLogin_p();
        _hashCode += getLogin_v();
        _hashCode += new Double(getCommission()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammBindPartnerCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindPartnerCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_p");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_p"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_v");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_v"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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

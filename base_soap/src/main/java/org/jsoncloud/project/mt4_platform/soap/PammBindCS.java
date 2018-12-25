/**
 * PammBindCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammBindCS  implements java.io.Serializable {
    private int login_i;

    private int login_m;

    private int login_v;

    public PammBindCS() {
    }

    public PammBindCS(
           int login_i,
           int login_m,
           int login_v) {
           this.login_i = login_i;
           this.login_m = login_m;
           this.login_v = login_v;
    }


    /**
     * Gets the login_i value for this PammBindCS.
     * 
     * @return login_i
     */
    public int getLogin_i() {
        return login_i;
    }


    /**
     * Sets the login_i value for this PammBindCS.
     * 
     * @param login_i
     */
    public void setLogin_i(int login_i) {
        this.login_i = login_i;
    }


    /**
     * Gets the login_m value for this PammBindCS.
     * 
     * @return login_m
     */
    public int getLogin_m() {
        return login_m;
    }


    /**
     * Sets the login_m value for this PammBindCS.
     * 
     * @param login_m
     */
    public void setLogin_m(int login_m) {
        this.login_m = login_m;
    }


    /**
     * Gets the login_v value for this PammBindCS.
     * 
     * @return login_v
     */
    public int getLogin_v() {
        return login_v;
    }


    /**
     * Sets the login_v value for this PammBindCS.
     * 
     * @param login_v
     */
    public void setLogin_v(int login_v) {
        this.login_v = login_v;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammBindCS)) return false;
        PammBindCS other = (PammBindCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.login_i == other.getLogin_i() &&
            this.login_m == other.getLogin_m() &&
            this.login_v == other.getLogin_v();
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
        _hashCode += getLogin_i();
        _hashCode += getLogin_m();
        _hashCode += getLogin_v();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammBindCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammBindCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_i");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_i"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_m");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_m"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_v");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_v"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

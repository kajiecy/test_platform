/**
 * PammSetRiskEquityCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammSetRiskEquityCS  implements java.io.Serializable {
    private int login_mi;

    private double risk_equity;

    private double tp_equity;

    public PammSetRiskEquityCS() {
    }

    public PammSetRiskEquityCS(
           int login_mi,
           double risk_equity,
           double tp_equity) {
           this.login_mi = login_mi;
           this.risk_equity = risk_equity;
           this.tp_equity = tp_equity;
    }


    /**
     * Gets the login_mi value for this PammSetRiskEquityCS.
     * 
     * @return login_mi
     */
    public int getLogin_mi() {
        return login_mi;
    }


    /**
     * Sets the login_mi value for this PammSetRiskEquityCS.
     * 
     * @param login_mi
     */
    public void setLogin_mi(int login_mi) {
        this.login_mi = login_mi;
    }


    /**
     * Gets the risk_equity value for this PammSetRiskEquityCS.
     * 
     * @return risk_equity
     */
    public double getRisk_equity() {
        return risk_equity;
    }


    /**
     * Sets the risk_equity value for this PammSetRiskEquityCS.
     * 
     * @param risk_equity
     */
    public void setRisk_equity(double risk_equity) {
        this.risk_equity = risk_equity;
    }


    /**
     * Gets the tp_equity value for this PammSetRiskEquityCS.
     * 
     * @return tp_equity
     */
    public double getTp_equity() {
        return tp_equity;
    }


    /**
     * Sets the tp_equity value for this PammSetRiskEquityCS.
     * 
     * @param tp_equity
     */
    public void setTp_equity(double tp_equity) {
        this.tp_equity = tp_equity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammSetRiskEquityCS)) return false;
        PammSetRiskEquityCS other = (PammSetRiskEquityCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.login_mi == other.getLogin_mi() &&
            this.risk_equity == other.getRisk_equity() &&
            this.tp_equity == other.getTp_equity();
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
        _hashCode += getLogin_mi();
        _hashCode += new Double(getRisk_equity()).hashCode();
        _hashCode += new Double(getTp_equity()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammSetRiskEquityCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetRiskEquityCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_mi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_mi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("risk_equity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "risk_equity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tp_equity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "tp_equity"));
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

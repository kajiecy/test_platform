/**
 * CommissionsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class CommissionsInfo  implements java.io.Serializable {
    private double commission;

    private int commission_limit;

    private double commission_agent;

    public CommissionsInfo() {
    }

    public CommissionsInfo(
           double commission,
           int commission_limit,
           double commission_agent) {
           this.commission = commission;
           this.commission_limit = commission_limit;
           this.commission_agent = commission_agent;
    }


    /**
     * Gets the commission value for this CommissionsInfo.
     * 
     * @return commission
     */
    public double getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this CommissionsInfo.
     * 
     * @param commission
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }


    /**
     * Gets the commission_limit value for this CommissionsInfo.
     * 
     * @return commission_limit
     */
    public int getCommission_limit() {
        return commission_limit;
    }


    /**
     * Sets the commission_limit value for this CommissionsInfo.
     * 
     * @param commission_limit
     */
    public void setCommission_limit(int commission_limit) {
        this.commission_limit = commission_limit;
    }


    /**
     * Gets the commission_agent value for this CommissionsInfo.
     * 
     * @return commission_agent
     */
    public double getCommission_agent() {
        return commission_agent;
    }


    /**
     * Sets the commission_agent value for this CommissionsInfo.
     * 
     * @param commission_agent
     */
    public void setCommission_agent(double commission_agent) {
        this.commission_agent = commission_agent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CommissionsInfo)) return false;
        CommissionsInfo other = (CommissionsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.commission == other.getCommission() &&
            this.commission_limit == other.getCommission_limit() &&
            this.commission_agent == other.getCommission_agent();
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
        _hashCode += new Double(getCommission()).hashCode();
        _hashCode += getCommission_limit();
        _hashCode += new Double(getCommission_agent()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CommissionsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CommissionsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission_limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commission_limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission_agent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commission_agent"));
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

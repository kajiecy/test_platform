/**
 * TicksInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class TicksInfo  implements java.io.Serializable {
    private java.lang.String symbol;

    private int time_from;

    private int time_to;

    private java.lang.Boolean get_raw_ticks;

    private java.lang.Boolean get_normal_ticks;

    public TicksInfo() {
    }

    public TicksInfo(
           java.lang.String symbol,
           int time_from,
           int time_to,
           java.lang.Boolean get_raw_ticks,
           java.lang.Boolean get_normal_ticks) {
           this.symbol = symbol;
           this.time_from = time_from;
           this.time_to = time_to;
           this.get_raw_ticks = get_raw_ticks;
           this.get_normal_ticks = get_normal_ticks;
    }


    /**
     * Gets the symbol value for this TicksInfo.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this TicksInfo.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the time_from value for this TicksInfo.
     * 
     * @return time_from
     */
    public int getTime_from() {
        return time_from;
    }


    /**
     * Sets the time_from value for this TicksInfo.
     * 
     * @param time_from
     */
    public void setTime_from(int time_from) {
        this.time_from = time_from;
    }


    /**
     * Gets the time_to value for this TicksInfo.
     * 
     * @return time_to
     */
    public int getTime_to() {
        return time_to;
    }


    /**
     * Sets the time_to value for this TicksInfo.
     * 
     * @param time_to
     */
    public void setTime_to(int time_to) {
        this.time_to = time_to;
    }


    /**
     * Gets the get_raw_ticks value for this TicksInfo.
     * 
     * @return get_raw_ticks
     */
    public java.lang.Boolean getGet_raw_ticks() {
        return get_raw_ticks;
    }


    /**
     * Sets the get_raw_ticks value for this TicksInfo.
     * 
     * @param get_raw_ticks
     */
    public void setGet_raw_ticks(java.lang.Boolean get_raw_ticks) {
        this.get_raw_ticks = get_raw_ticks;
    }


    /**
     * Gets the get_normal_ticks value for this TicksInfo.
     * 
     * @return get_normal_ticks
     */
    public java.lang.Boolean getGet_normal_ticks() {
        return get_normal_ticks;
    }


    /**
     * Sets the get_normal_ticks value for this TicksInfo.
     * 
     * @param get_normal_ticks
     */
    public void setGet_normal_ticks(java.lang.Boolean get_normal_ticks) {
        this.get_normal_ticks = get_normal_ticks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicksInfo)) return false;
        TicksInfo other = (TicksInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.time_from == other.getTime_from() &&
            this.time_to == other.getTime_to() &&
            ((this.get_raw_ticks==null && other.getGet_raw_ticks()==null) || 
             (this.get_raw_ticks!=null &&
              this.get_raw_ticks.equals(other.getGet_raw_ticks()))) &&
            ((this.get_normal_ticks==null && other.getGet_normal_ticks()==null) || 
             (this.get_normal_ticks!=null &&
              this.get_normal_ticks.equals(other.getGet_normal_ticks())));
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
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += getTime_from();
        _hashCode += getTime_to();
        if (getGet_raw_ticks() != null) {
            _hashCode += getGet_raw_ticks().hashCode();
        }
        if (getGet_normal_ticks() != null) {
            _hashCode += getGet_normal_ticks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicksInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "time_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "time_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_raw_ticks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "get_raw_ticks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_normal_ticks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "get_normal_ticks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

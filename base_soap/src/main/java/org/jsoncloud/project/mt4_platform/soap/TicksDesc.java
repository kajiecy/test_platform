/**
 * TicksDesc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class TicksDesc  implements java.io.Serializable {
    private java.lang.String symbol;

    private int ctm;

    private double bid;

    private double ask;

    private boolean raw_tick;

    private boolean normal_tick;

    public TicksDesc() {
    }

    public TicksDesc(
           java.lang.String symbol,
           int ctm,
           double bid,
           double ask,
           boolean raw_tick,
           boolean normal_tick) {
           this.symbol = symbol;
           this.ctm = ctm;
           this.bid = bid;
           this.ask = ask;
           this.raw_tick = raw_tick;
           this.normal_tick = normal_tick;
    }


    /**
     * Gets the symbol value for this TicksDesc.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this TicksDesc.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the ctm value for this TicksDesc.
     * 
     * @return ctm
     */
    public int getCtm() {
        return ctm;
    }


    /**
     * Sets the ctm value for this TicksDesc.
     * 
     * @param ctm
     */
    public void setCtm(int ctm) {
        this.ctm = ctm;
    }


    /**
     * Gets the bid value for this TicksDesc.
     * 
     * @return bid
     */
    public double getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this TicksDesc.
     * 
     * @param bid
     */
    public void setBid(double bid) {
        this.bid = bid;
    }


    /**
     * Gets the ask value for this TicksDesc.
     * 
     * @return ask
     */
    public double getAsk() {
        return ask;
    }


    /**
     * Sets the ask value for this TicksDesc.
     * 
     * @param ask
     */
    public void setAsk(double ask) {
        this.ask = ask;
    }


    /**
     * Gets the raw_tick value for this TicksDesc.
     * 
     * @return raw_tick
     */
    public boolean isRaw_tick() {
        return raw_tick;
    }


    /**
     * Sets the raw_tick value for this TicksDesc.
     * 
     * @param raw_tick
     */
    public void setRaw_tick(boolean raw_tick) {
        this.raw_tick = raw_tick;
    }


    /**
     * Gets the normal_tick value for this TicksDesc.
     * 
     * @return normal_tick
     */
    public boolean isNormal_tick() {
        return normal_tick;
    }


    /**
     * Sets the normal_tick value for this TicksDesc.
     * 
     * @param normal_tick
     */
    public void setNormal_tick(boolean normal_tick) {
        this.normal_tick = normal_tick;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TicksDesc)) return false;
        TicksDesc other = (TicksDesc) obj;
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
            this.ctm == other.getCtm() &&
            this.bid == other.getBid() &&
            this.ask == other.getAsk() &&
            this.raw_tick == other.isRaw_tick() &&
            this.normal_tick == other.isNormal_tick();
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
        _hashCode += getCtm();
        _hashCode += new Double(getBid()).hashCode();
        _hashCode += new Double(getAsk()).hashCode();
        _hashCode += (isRaw_tick() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNormal_tick() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TicksDesc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TicksDesc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ctm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "bid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ask");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raw_tick");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "raw_tick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normal_tick");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "normal_tick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

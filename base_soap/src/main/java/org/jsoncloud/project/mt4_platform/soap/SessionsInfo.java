/**
 * SessionsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class SessionsInfo  implements java.io.Serializable {
    private org.jsoncloud.project.mt4_platform.soap.ConSessionArray quote;

    private org.jsoncloud.project.mt4_platform.soap.ConSessionArray trade;

    private int quote_overnight;

    private int trade_overnight;

    private org.jsoncloud.project.mt4_platform.soap.ReservedArray reserved;

    public SessionsInfo() {
    }

    public SessionsInfo(
           org.jsoncloud.project.mt4_platform.soap.ConSessionArray quote,
           org.jsoncloud.project.mt4_platform.soap.ConSessionArray trade,
           int quote_overnight,
           int trade_overnight,
           org.jsoncloud.project.mt4_platform.soap.ReservedArray reserved) {
           this.quote = quote;
           this.trade = trade;
           this.quote_overnight = quote_overnight;
           this.trade_overnight = trade_overnight;
           this.reserved = reserved;
    }


    /**
     * Gets the quote value for this SessionsInfo.
     * 
     * @return quote
     */
    public org.jsoncloud.project.mt4_platform.soap.ConSessionArray getQuote() {
        return quote;
    }


    /**
     * Sets the quote value for this SessionsInfo.
     * 
     * @param quote
     */
    public void setQuote(org.jsoncloud.project.mt4_platform.soap.ConSessionArray quote) {
        this.quote = quote;
    }


    /**
     * Gets the trade value for this SessionsInfo.
     * 
     * @return trade
     */
    public org.jsoncloud.project.mt4_platform.soap.ConSessionArray getTrade() {
        return trade;
    }


    /**
     * Sets the trade value for this SessionsInfo.
     * 
     * @param trade
     */
    public void setTrade(org.jsoncloud.project.mt4_platform.soap.ConSessionArray trade) {
        this.trade = trade;
    }


    /**
     * Gets the quote_overnight value for this SessionsInfo.
     * 
     * @return quote_overnight
     */
    public int getQuote_overnight() {
        return quote_overnight;
    }


    /**
     * Sets the quote_overnight value for this SessionsInfo.
     * 
     * @param quote_overnight
     */
    public void setQuote_overnight(int quote_overnight) {
        this.quote_overnight = quote_overnight;
    }


    /**
     * Gets the trade_overnight value for this SessionsInfo.
     * 
     * @return trade_overnight
     */
    public int getTrade_overnight() {
        return trade_overnight;
    }


    /**
     * Sets the trade_overnight value for this SessionsInfo.
     * 
     * @param trade_overnight
     */
    public void setTrade_overnight(int trade_overnight) {
        this.trade_overnight = trade_overnight;
    }


    /**
     * Gets the reserved value for this SessionsInfo.
     * 
     * @return reserved
     */
    public org.jsoncloud.project.mt4_platform.soap.ReservedArray getReserved() {
        return reserved;
    }


    /**
     * Sets the reserved value for this SessionsInfo.
     * 
     * @param reserved
     */
    public void setReserved(org.jsoncloud.project.mt4_platform.soap.ReservedArray reserved) {
        this.reserved = reserved;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionsInfo)) return false;
        SessionsInfo other = (SessionsInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quote==null && other.getQuote()==null) || 
             (this.quote!=null &&
              this.quote.equals(other.getQuote()))) &&
            ((this.trade==null && other.getTrade()==null) || 
             (this.trade!=null &&
              this.trade.equals(other.getTrade()))) &&
            this.quote_overnight == other.getQuote_overnight() &&
            this.trade_overnight == other.getTrade_overnight() &&
            ((this.reserved==null && other.getReserved()==null) || 
             (this.reserved!=null &&
              this.reserved.equals(other.getReserved())));
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
        if (getQuote() != null) {
            _hashCode += getQuote().hashCode();
        }
        if (getTrade() != null) {
            _hashCode += getTrade().hashCode();
        }
        _hashCode += getQuote_overnight();
        _hashCode += getTrade_overnight();
        if (getReserved() != null) {
            _hashCode += getReserved().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SessionsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "quote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConSessionArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "trade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConSessionArray"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quote_overnight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "quote_overnight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_overnight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "trade_overnight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "reserved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ReservedArray"));
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

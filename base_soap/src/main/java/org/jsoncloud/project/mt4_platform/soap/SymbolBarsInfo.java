/**
 * SymbolBarsInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class SymbolBarsInfo  implements java.io.Serializable {
    private java.lang.String symbol;

    private org.jsoncloud.project.mt4_platform.soap.BarsCollection getChartsResult;

    public SymbolBarsInfo() {
    }

    public SymbolBarsInfo(
           java.lang.String symbol,
           org.jsoncloud.project.mt4_platform.soap.BarsCollection getChartsResult) {
           this.symbol = symbol;
           this.getChartsResult = getChartsResult;
    }


    /**
     * Gets the symbol value for this SymbolBarsInfo.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this SymbolBarsInfo.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the getChartsResult value for this SymbolBarsInfo.
     * 
     * @return getChartsResult
     */
    public org.jsoncloud.project.mt4_platform.soap.BarsCollection getGetChartsResult() {
        return getChartsResult;
    }


    /**
     * Sets the getChartsResult value for this SymbolBarsInfo.
     * 
     * @param getChartsResult
     */
    public void setGetChartsResult(org.jsoncloud.project.mt4_platform.soap.BarsCollection getChartsResult) {
        this.getChartsResult = getChartsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SymbolBarsInfo)) return false;
        SymbolBarsInfo other = (SymbolBarsInfo) obj;
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
            ((this.getChartsResult==null && other.getGetChartsResult()==null) || 
             (this.getChartsResult!=null &&
              this.getChartsResult.equals(other.getGetChartsResult())));
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
        if (getGetChartsResult() != null) {
            _hashCode += getGetChartsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SymbolBarsInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SymbolBarsInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getChartsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "GetChartsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BarsCollection"));
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

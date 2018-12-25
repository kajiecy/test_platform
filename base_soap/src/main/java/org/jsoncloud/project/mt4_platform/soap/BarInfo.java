/**
 * BarInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class BarInfo  implements java.io.Serializable {
    private int ctm;

    private int open;

    private int high;

    private int low;

    private int close;

    private double vol;

    public BarInfo() {
    }

    public BarInfo(
           int ctm,
           int open,
           int high,
           int low,
           int close,
           double vol) {
           this.ctm = ctm;
           this.open = open;
           this.high = high;
           this.low = low;
           this.close = close;
           this.vol = vol;
    }


    /**
     * Gets the ctm value for this BarInfo.
     * 
     * @return ctm
     */
    public int getCtm() {
        return ctm;
    }


    /**
     * Sets the ctm value for this BarInfo.
     * 
     * @param ctm
     */
    public void setCtm(int ctm) {
        this.ctm = ctm;
    }


    /**
     * Gets the open value for this BarInfo.
     * 
     * @return open
     */
    public int getOpen() {
        return open;
    }


    /**
     * Sets the open value for this BarInfo.
     * 
     * @param open
     */
    public void setOpen(int open) {
        this.open = open;
    }


    /**
     * Gets the high value for this BarInfo.
     * 
     * @return high
     */
    public int getHigh() {
        return high;
    }


    /**
     * Sets the high value for this BarInfo.
     * 
     * @param high
     */
    public void setHigh(int high) {
        this.high = high;
    }


    /**
     * Gets the low value for this BarInfo.
     * 
     * @return low
     */
    public int getLow() {
        return low;
    }


    /**
     * Sets the low value for this BarInfo.
     * 
     * @param low
     */
    public void setLow(int low) {
        this.low = low;
    }


    /**
     * Gets the close value for this BarInfo.
     * 
     * @return close
     */
    public int getClose() {
        return close;
    }


    /**
     * Sets the close value for this BarInfo.
     * 
     * @param close
     */
    public void setClose(int close) {
        this.close = close;
    }


    /**
     * Gets the vol value for this BarInfo.
     * 
     * @return vol
     */
    public double getVol() {
        return vol;
    }


    /**
     * Sets the vol value for this BarInfo.
     * 
     * @param vol
     */
    public void setVol(double vol) {
        this.vol = vol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BarInfo)) return false;
        BarInfo other = (BarInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ctm == other.getCtm() &&
            this.open == other.getOpen() &&
            this.high == other.getHigh() &&
            this.low == other.getLow() &&
            this.close == other.getClose() &&
            this.vol == other.getVol();
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
        _hashCode += getCtm();
        _hashCode += getOpen();
        _hashCode += getHigh();
        _hashCode += getLow();
        _hashCode += getClose();
        _hashCode += new Double(getVol()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BarInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "BarInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ctm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ctm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "open"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("high");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "high"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("low");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "low"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "close"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "vol"));
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

/**
 * ConSessionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class ConSessionInfo  implements java.io.Serializable {
    private int open_hour;

    private int open_min;

    private int close_hour;

    private int close_min;

    private int open;

    private int close;

    private org.jsoncloud.project.mt4_platform.soap.AlignArray align;

    public ConSessionInfo() {
    }

    public ConSessionInfo(
           int open_hour,
           int open_min,
           int close_hour,
           int close_min,
           int open,
           int close,
           org.jsoncloud.project.mt4_platform.soap.AlignArray align) {
           this.open_hour = open_hour;
           this.open_min = open_min;
           this.close_hour = close_hour;
           this.close_min = close_min;
           this.open = open;
           this.close = close;
           this.align = align;
    }


    /**
     * Gets the open_hour value for this ConSessionInfo.
     * 
     * @return open_hour
     */
    public int getOpen_hour() {
        return open_hour;
    }


    /**
     * Sets the open_hour value for this ConSessionInfo.
     * 
     * @param open_hour
     */
    public void setOpen_hour(int open_hour) {
        this.open_hour = open_hour;
    }


    /**
     * Gets the open_min value for this ConSessionInfo.
     * 
     * @return open_min
     */
    public int getOpen_min() {
        return open_min;
    }


    /**
     * Sets the open_min value for this ConSessionInfo.
     * 
     * @param open_min
     */
    public void setOpen_min(int open_min) {
        this.open_min = open_min;
    }


    /**
     * Gets the close_hour value for this ConSessionInfo.
     * 
     * @return close_hour
     */
    public int getClose_hour() {
        return close_hour;
    }


    /**
     * Sets the close_hour value for this ConSessionInfo.
     * 
     * @param close_hour
     */
    public void setClose_hour(int close_hour) {
        this.close_hour = close_hour;
    }


    /**
     * Gets the close_min value for this ConSessionInfo.
     * 
     * @return close_min
     */
    public int getClose_min() {
        return close_min;
    }


    /**
     * Sets the close_min value for this ConSessionInfo.
     * 
     * @param close_min
     */
    public void setClose_min(int close_min) {
        this.close_min = close_min;
    }


    /**
     * Gets the open value for this ConSessionInfo.
     * 
     * @return open
     */
    public int getOpen() {
        return open;
    }


    /**
     * Sets the open value for this ConSessionInfo.
     * 
     * @param open
     */
    public void setOpen(int open) {
        this.open = open;
    }


    /**
     * Gets the close value for this ConSessionInfo.
     * 
     * @return close
     */
    public int getClose() {
        return close;
    }


    /**
     * Sets the close value for this ConSessionInfo.
     * 
     * @param close
     */
    public void setClose(int close) {
        this.close = close;
    }


    /**
     * Gets the align value for this ConSessionInfo.
     * 
     * @return align
     */
    public org.jsoncloud.project.mt4_platform.soap.AlignArray getAlign() {
        return align;
    }


    /**
     * Sets the align value for this ConSessionInfo.
     * 
     * @param align
     */
    public void setAlign(org.jsoncloud.project.mt4_platform.soap.AlignArray align) {
        this.align = align;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConSessionInfo)) return false;
        ConSessionInfo other = (ConSessionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.open_hour == other.getOpen_hour() &&
            this.open_min == other.getOpen_min() &&
            this.close_hour == other.getClose_hour() &&
            this.close_min == other.getClose_min() &&
            this.open == other.getOpen() &&
            this.close == other.getClose() &&
            ((this.align==null && other.getAlign()==null) || 
             (this.align!=null &&
              this.align.equals(other.getAlign())));
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
        _hashCode += getOpen_hour();
        _hashCode += getOpen_min();
        _hashCode += getClose_hour();
        _hashCode += getClose_min();
        _hashCode += getOpen();
        _hashCode += getClose();
        if (getAlign() != null) {
            _hashCode += getAlign().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConSessionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConSessionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open_hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "open_hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "open_min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close_hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "close_hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close_min");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "close_min"));
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
        elemField.setFieldName("close");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "close"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("align");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "align"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AlignArray"));
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

/**
 * PammUnBindPartnerResponseCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammUnBindPartnerResponseCS  implements java.io.Serializable {
    private java.lang.String error_string;

    public PammUnBindPartnerResponseCS() {
    }

    public PammUnBindPartnerResponseCS(
           java.lang.String error_string) {
           this.error_string = error_string;
    }


    /**
     * Gets the error_string value for this PammUnBindPartnerResponseCS.
     * 
     * @return error_string
     */
    public java.lang.String getError_string() {
        return error_string;
    }


    /**
     * Sets the error_string value for this PammUnBindPartnerResponseCS.
     * 
     * @param error_string
     */
    public void setError_string(java.lang.String error_string) {
        this.error_string = error_string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammUnBindPartnerResponseCS)) return false;
        PammUnBindPartnerResponseCS other = (PammUnBindPartnerResponseCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.error_string==null && other.getError_string()==null) || 
             (this.error_string!=null &&
              this.error_string.equals(other.getError_string())));
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
        if (getError_string() != null) {
            _hashCode += getError_string().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammUnBindPartnerResponseCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnBindPartnerResponseCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_string");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "error_string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

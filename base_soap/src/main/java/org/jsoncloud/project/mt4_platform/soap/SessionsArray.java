/**
 * SessionsArray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class SessionsArray  implements java.io.Serializable {
    private org.jsoncloud.project.mt4_platform.soap.SessionsInfo[] items;

    public SessionsArray() {
    }

    public SessionsArray(
           org.jsoncloud.project.mt4_platform.soap.SessionsInfo[] items) {
           this.items = items;
    }


    /**
     * Gets the items value for this SessionsArray.
     * 
     * @return items
     */
    public org.jsoncloud.project.mt4_platform.soap.SessionsInfo[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this SessionsArray.
     * 
     * @param items
     */
    public void setItems(org.jsoncloud.project.mt4_platform.soap.SessionsInfo[] items) {
        this.items = items;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionsArray)) return false;
        SessionsArray other = (SessionsArray) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems())));
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
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionsArray.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SessionsArray"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "SessionsInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "Sessions"));
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

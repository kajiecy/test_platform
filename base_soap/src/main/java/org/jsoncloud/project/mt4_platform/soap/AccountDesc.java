/**
 * AccountDesc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class AccountDesc  implements java.io.Serializable {
    private org.jsoncloud.project.mt4_platform.soap.UserRecordCS user;

    private org.jsoncloud.project.mt4_platform.soap.ConGroupCS group;

    private org.jsoncloud.project.mt4_platform.soap.MarginLevelCS margin;

    public AccountDesc() {
    }

    public AccountDesc(
           org.jsoncloud.project.mt4_platform.soap.UserRecordCS user,
           org.jsoncloud.project.mt4_platform.soap.ConGroupCS group,
           org.jsoncloud.project.mt4_platform.soap.MarginLevelCS margin) {
           this.user = user;
           this.group = group;
           this.margin = margin;
    }


    /**
     * Gets the user value for this AccountDesc.
     * 
     * @return user
     */
    public org.jsoncloud.project.mt4_platform.soap.UserRecordCS getUser() {
        return user;
    }


    /**
     * Sets the user value for this AccountDesc.
     * 
     * @param user
     */
    public void setUser(org.jsoncloud.project.mt4_platform.soap.UserRecordCS user) {
        this.user = user;
    }


    /**
     * Gets the group value for this AccountDesc.
     * 
     * @return group
     */
    public org.jsoncloud.project.mt4_platform.soap.ConGroupCS getGroup() {
        return group;
    }


    /**
     * Sets the group value for this AccountDesc.
     * 
     * @param group
     */
    public void setGroup(org.jsoncloud.project.mt4_platform.soap.ConGroupCS group) {
        this.group = group;
    }


    /**
     * Gets the margin value for this AccountDesc.
     * 
     * @return margin
     */
    public org.jsoncloud.project.mt4_platform.soap.MarginLevelCS getMargin() {
        return margin;
    }


    /**
     * Sets the margin value for this AccountDesc.
     * 
     * @param margin
     */
    public void setMargin(org.jsoncloud.project.mt4_platform.soap.MarginLevelCS margin) {
        this.margin = margin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountDesc)) return false;
        AccountDesc other = (AccountDesc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.margin==null && other.getMargin()==null) || 
             (this.margin!=null &&
              this.margin.equals(other.getMargin())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getMargin() != null) {
            _hashCode += getMargin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountDesc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "AccountDesc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupCS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "MarginLevelCS"));
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

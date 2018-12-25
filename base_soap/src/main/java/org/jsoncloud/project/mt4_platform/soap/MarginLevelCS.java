/**
 * MarginLevelCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class MarginLevelCS  implements java.io.Serializable {
    private int login;

    private java.lang.String group;

    private int leverage;

    private int updated;

    private double balance;

    private double equity;

    private int volume;

    private double margin;

    private double margin_free;

    private double margin_level;

    private int margin_type;

    private int level_type;

    private double margin_available;

    public MarginLevelCS() {
    }

    public MarginLevelCS(
           int login,
           java.lang.String group,
           int leverage,
           int updated,
           double balance,
           double equity,
           int volume,
           double margin,
           double margin_free,
           double margin_level,
           int margin_type,
           int level_type,
           double margin_available) {
           this.login = login;
           this.group = group;
           this.leverage = leverage;
           this.updated = updated;
           this.balance = balance;
           this.equity = equity;
           this.volume = volume;
           this.margin = margin;
           this.margin_free = margin_free;
           this.margin_level = margin_level;
           this.margin_type = margin_type;
           this.level_type = level_type;
           this.margin_available = margin_available;
    }


    /**
     * Gets the login value for this MarginLevelCS.
     * 
     * @return login
     */
    public int getLogin() {
        return login;
    }


    /**
     * Sets the login value for this MarginLevelCS.
     * 
     * @param login
     */
    public void setLogin(int login) {
        this.login = login;
    }


    /**
     * Gets the group value for this MarginLevelCS.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this MarginLevelCS.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the leverage value for this MarginLevelCS.
     * 
     * @return leverage
     */
    public int getLeverage() {
        return leverage;
    }


    /**
     * Sets the leverage value for this MarginLevelCS.
     * 
     * @param leverage
     */
    public void setLeverage(int leverage) {
        this.leverage = leverage;
    }


    /**
     * Gets the updated value for this MarginLevelCS.
     * 
     * @return updated
     */
    public int getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this MarginLevelCS.
     * 
     * @param updated
     */
    public void setUpdated(int updated) {
        this.updated = updated;
    }


    /**
     * Gets the balance value for this MarginLevelCS.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this MarginLevelCS.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the equity value for this MarginLevelCS.
     * 
     * @return equity
     */
    public double getEquity() {
        return equity;
    }


    /**
     * Sets the equity value for this MarginLevelCS.
     * 
     * @param equity
     */
    public void setEquity(double equity) {
        this.equity = equity;
    }


    /**
     * Gets the volume value for this MarginLevelCS.
     * 
     * @return volume
     */
    public int getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this MarginLevelCS.
     * 
     * @param volume
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }


    /**
     * Gets the margin value for this MarginLevelCS.
     * 
     * @return margin
     */
    public double getMargin() {
        return margin;
    }


    /**
     * Sets the margin value for this MarginLevelCS.
     * 
     * @param margin
     */
    public void setMargin(double margin) {
        this.margin = margin;
    }


    /**
     * Gets the margin_free value for this MarginLevelCS.
     * 
     * @return margin_free
     */
    public double getMargin_free() {
        return margin_free;
    }


    /**
     * Sets the margin_free value for this MarginLevelCS.
     * 
     * @param margin_free
     */
    public void setMargin_free(double margin_free) {
        this.margin_free = margin_free;
    }


    /**
     * Gets the margin_level value for this MarginLevelCS.
     * 
     * @return margin_level
     */
    public double getMargin_level() {
        return margin_level;
    }


    /**
     * Sets the margin_level value for this MarginLevelCS.
     * 
     * @param margin_level
     */
    public void setMargin_level(double margin_level) {
        this.margin_level = margin_level;
    }


    /**
     * Gets the margin_type value for this MarginLevelCS.
     * 
     * @return margin_type
     */
    public int getMargin_type() {
        return margin_type;
    }


    /**
     * Sets the margin_type value for this MarginLevelCS.
     * 
     * @param margin_type
     */
    public void setMargin_type(int margin_type) {
        this.margin_type = margin_type;
    }


    /**
     * Gets the level_type value for this MarginLevelCS.
     * 
     * @return level_type
     */
    public int getLevel_type() {
        return level_type;
    }


    /**
     * Sets the level_type value for this MarginLevelCS.
     * 
     * @param level_type
     */
    public void setLevel_type(int level_type) {
        this.level_type = level_type;
    }


    /**
     * Gets the margin_available value for this MarginLevelCS.
     * 
     * @return margin_available
     */
    public double getMargin_available() {
        return margin_available;
    }


    /**
     * Sets the margin_available value for this MarginLevelCS.
     * 
     * @param margin_available
     */
    public void setMargin_available(double margin_available) {
        this.margin_available = margin_available;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MarginLevelCS)) return false;
        MarginLevelCS other = (MarginLevelCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.login == other.getLogin() &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            this.leverage == other.getLeverage() &&
            this.updated == other.getUpdated() &&
            this.balance == other.getBalance() &&
            this.equity == other.getEquity() &&
            this.volume == other.getVolume() &&
            this.margin == other.getMargin() &&
            this.margin_free == other.getMargin_free() &&
            this.margin_level == other.getMargin_level() &&
            this.margin_type == other.getMargin_type() &&
            this.level_type == other.getLevel_type() &&
            this.margin_available == other.getMargin_available();
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
        _hashCode += getLogin();
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        _hashCode += getLeverage();
        _hashCode += getUpdated();
        _hashCode += new Double(getBalance()).hashCode();
        _hashCode += new Double(getEquity()).hashCode();
        _hashCode += getVolume();
        _hashCode += new Double(getMargin()).hashCode();
        _hashCode += new Double(getMargin_free()).hashCode();
        _hashCode += new Double(getMargin_level()).hashCode();
        _hashCode += getMargin_type();
        _hashCode += getLevel_type();
        _hashCode += new Double(getMargin_available()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MarginLevelCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "MarginLevelCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "leverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "equity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_free");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_free"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "level_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_available"));
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

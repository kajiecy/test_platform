/**
 * PammSetManagerCFGCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammSetManagerCFGCS  implements java.io.Serializable {
    private int login_v;

    private double commission;

    private double commission_agent;

    private org.jsoncloud.project.mt4_platform.soap.CommissionsList commissions_list;

    private double visible_capital;

    private int auto_increase_mc;

    private int commission_apply_time;

    public PammSetManagerCFGCS() {
    }

    public PammSetManagerCFGCS(
           int login_v,
           double commission,
           double commission_agent,
           org.jsoncloud.project.mt4_platform.soap.CommissionsList commissions_list,
           double visible_capital,
           int auto_increase_mc,
           int commission_apply_time) {
           this.login_v = login_v;
           this.commission = commission;
           this.commission_agent = commission_agent;
           this.commissions_list = commissions_list;
           this.visible_capital = visible_capital;
           this.auto_increase_mc = auto_increase_mc;
           this.commission_apply_time = commission_apply_time;
    }


    /**
     * Gets the login_v value for this PammSetManagerCFGCS.
     * 
     * @return login_v
     */
    public int getLogin_v() {
        return login_v;
    }


    /**
     * Sets the login_v value for this PammSetManagerCFGCS.
     * 
     * @param login_v
     */
    public void setLogin_v(int login_v) {
        this.login_v = login_v;
    }


    /**
     * Gets the commission value for this PammSetManagerCFGCS.
     * 
     * @return commission
     */
    public double getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this PammSetManagerCFGCS.
     * 
     * @param commission
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }


    /**
     * Gets the commission_agent value for this PammSetManagerCFGCS.
     * 
     * @return commission_agent
     */
    public double getCommission_agent() {
        return commission_agent;
    }


    /**
     * Sets the commission_agent value for this PammSetManagerCFGCS.
     * 
     * @param commission_agent
     */
    public void setCommission_agent(double commission_agent) {
        this.commission_agent = commission_agent;
    }


    /**
     * Gets the commissions_list value for this PammSetManagerCFGCS.
     * 
     * @return commissions_list
     */
    public org.jsoncloud.project.mt4_platform.soap.CommissionsList getCommissions_list() {
        return commissions_list;
    }


    /**
     * Sets the commissions_list value for this PammSetManagerCFGCS.
     * 
     * @param commissions_list
     */
    public void setCommissions_list(org.jsoncloud.project.mt4_platform.soap.CommissionsList commissions_list) {
        this.commissions_list = commissions_list;
    }


    /**
     * Gets the visible_capital value for this PammSetManagerCFGCS.
     * 
     * @return visible_capital
     */
    public double getVisible_capital() {
        return visible_capital;
    }


    /**
     * Sets the visible_capital value for this PammSetManagerCFGCS.
     * 
     * @param visible_capital
     */
    public void setVisible_capital(double visible_capital) {
        this.visible_capital = visible_capital;
    }


    /**
     * Gets the auto_increase_mc value for this PammSetManagerCFGCS.
     * 
     * @return auto_increase_mc
     */
    public int getAuto_increase_mc() {
        return auto_increase_mc;
    }


    /**
     * Sets the auto_increase_mc value for this PammSetManagerCFGCS.
     * 
     * @param auto_increase_mc
     */
    public void setAuto_increase_mc(int auto_increase_mc) {
        this.auto_increase_mc = auto_increase_mc;
    }


    /**
     * Gets the commission_apply_time value for this PammSetManagerCFGCS.
     * 
     * @return commission_apply_time
     */
    public int getCommission_apply_time() {
        return commission_apply_time;
    }


    /**
     * Sets the commission_apply_time value for this PammSetManagerCFGCS.
     * 
     * @param commission_apply_time
     */
    public void setCommission_apply_time(int commission_apply_time) {
        this.commission_apply_time = commission_apply_time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammSetManagerCFGCS)) return false;
        PammSetManagerCFGCS other = (PammSetManagerCFGCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.login_v == other.getLogin_v() &&
            this.commission == other.getCommission() &&
            this.commission_agent == other.getCommission_agent() &&
            ((this.commissions_list==null && other.getCommissions_list()==null) || 
             (this.commissions_list!=null &&
              this.commissions_list.equals(other.getCommissions_list()))) &&
            this.visible_capital == other.getVisible_capital() &&
            this.auto_increase_mc == other.getAuto_increase_mc() &&
            this.commission_apply_time == other.getCommission_apply_time();
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
        _hashCode += getLogin_v();
        _hashCode += new Double(getCommission()).hashCode();
        _hashCode += new Double(getCommission_agent()).hashCode();
        if (getCommissions_list() != null) {
            _hashCode += getCommissions_list().hashCode();
        }
        _hashCode += new Double(getVisible_capital()).hashCode();
        _hashCode += getAuto_increase_mc();
        _hashCode += getCommission_apply_time();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammSetManagerCFGCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammSetManagerCFGCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login_v");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login_v"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission_agent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commission_agent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissions_list");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commissions_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CommissionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visible_capital");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "visible_capital"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auto_increase_mc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "auto_increase_mc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission_apply_time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commission_apply_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

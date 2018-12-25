/**
 * PammUnbindResponseCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammUnbindResponseCS  implements java.io.Serializable {
    private double balance_investor;

    private double balance_manager;

    private double balance_virtual;

    private org.jsoncloud.project.mt4_platform.soap.OperationDesc pammUnbindOperationResult;

    public PammUnbindResponseCS() {
    }

    public PammUnbindResponseCS(
           double balance_investor,
           double balance_manager,
           double balance_virtual,
           org.jsoncloud.project.mt4_platform.soap.OperationDesc pammUnbindOperationResult) {
           this.balance_investor = balance_investor;
           this.balance_manager = balance_manager;
           this.balance_virtual = balance_virtual;
           this.pammUnbindOperationResult = pammUnbindOperationResult;
    }


    /**
     * Gets the balance_investor value for this PammUnbindResponseCS.
     * 
     * @return balance_investor
     */
    public double getBalance_investor() {
        return balance_investor;
    }


    /**
     * Sets the balance_investor value for this PammUnbindResponseCS.
     * 
     * @param balance_investor
     */
    public void setBalance_investor(double balance_investor) {
        this.balance_investor = balance_investor;
    }


    /**
     * Gets the balance_manager value for this PammUnbindResponseCS.
     * 
     * @return balance_manager
     */
    public double getBalance_manager() {
        return balance_manager;
    }


    /**
     * Sets the balance_manager value for this PammUnbindResponseCS.
     * 
     * @param balance_manager
     */
    public void setBalance_manager(double balance_manager) {
        this.balance_manager = balance_manager;
    }


    /**
     * Gets the balance_virtual value for this PammUnbindResponseCS.
     * 
     * @return balance_virtual
     */
    public double getBalance_virtual() {
        return balance_virtual;
    }


    /**
     * Sets the balance_virtual value for this PammUnbindResponseCS.
     * 
     * @param balance_virtual
     */
    public void setBalance_virtual(double balance_virtual) {
        this.balance_virtual = balance_virtual;
    }


    /**
     * Gets the pammUnbindOperationResult value for this PammUnbindResponseCS.
     * 
     * @return pammUnbindOperationResult
     */
    public org.jsoncloud.project.mt4_platform.soap.OperationDesc getPammUnbindOperationResult() {
        return pammUnbindOperationResult;
    }


    /**
     * Sets the pammUnbindOperationResult value for this PammUnbindResponseCS.
     * 
     * @param pammUnbindOperationResult
     */
    public void setPammUnbindOperationResult(org.jsoncloud.project.mt4_platform.soap.OperationDesc pammUnbindOperationResult) {
        this.pammUnbindOperationResult = pammUnbindOperationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammUnbindResponseCS)) return false;
        PammUnbindResponseCS other = (PammUnbindResponseCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.balance_investor == other.getBalance_investor() &&
            this.balance_manager == other.getBalance_manager() &&
            this.balance_virtual == other.getBalance_virtual() &&
            ((this.pammUnbindOperationResult==null && other.getPammUnbindOperationResult()==null) || 
             (this.pammUnbindOperationResult!=null &&
              this.pammUnbindOperationResult.equals(other.getPammUnbindOperationResult())));
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
        _hashCode += new Double(getBalance_investor()).hashCode();
        _hashCode += new Double(getBalance_manager()).hashCode();
        _hashCode += new Double(getBalance_virtual()).hashCode();
        if (getPammUnbindOperationResult() != null) {
            _hashCode += getPammUnbindOperationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammUnbindResponseCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnbindResponseCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_investor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "balance_investor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_manager");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "balance_manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_virtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "balance_virtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pammUnbindOperationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammUnbindOperationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "OperationDesc"));
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

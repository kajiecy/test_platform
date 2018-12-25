/**
 * PammWithdrawalResponseCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammWithdrawalResponseCS  implements java.io.Serializable {
    private int order;

    private double aggregated_investment;

    private double equity;

    private double withdrawal_amount_fakt;

    private java.lang.String error_string;

    public PammWithdrawalResponseCS() {
    }

    public PammWithdrawalResponseCS(
           int order,
           double aggregated_investment,
           double equity,
           double withdrawal_amount_fakt,
           java.lang.String error_string) {
           this.order = order;
           this.aggregated_investment = aggregated_investment;
           this.equity = equity;
           this.withdrawal_amount_fakt = withdrawal_amount_fakt;
           this.error_string = error_string;
    }


    /**
     * Gets the order value for this PammWithdrawalResponseCS.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this PammWithdrawalResponseCS.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * Gets the aggregated_investment value for this PammWithdrawalResponseCS.
     * 
     * @return aggregated_investment
     */
    public double getAggregated_investment() {
        return aggregated_investment;
    }


    /**
     * Sets the aggregated_investment value for this PammWithdrawalResponseCS.
     * 
     * @param aggregated_investment
     */
    public void setAggregated_investment(double aggregated_investment) {
        this.aggregated_investment = aggregated_investment;
    }


    /**
     * Gets the equity value for this PammWithdrawalResponseCS.
     * 
     * @return equity
     */
    public double getEquity() {
        return equity;
    }


    /**
     * Sets the equity value for this PammWithdrawalResponseCS.
     * 
     * @param equity
     */
    public void setEquity(double equity) {
        this.equity = equity;
    }


    /**
     * Gets the withdrawal_amount_fakt value for this PammWithdrawalResponseCS.
     * 
     * @return withdrawal_amount_fakt
     */
    public double getWithdrawal_amount_fakt() {
        return withdrawal_amount_fakt;
    }


    /**
     * Sets the withdrawal_amount_fakt value for this PammWithdrawalResponseCS.
     * 
     * @param withdrawal_amount_fakt
     */
    public void setWithdrawal_amount_fakt(double withdrawal_amount_fakt) {
        this.withdrawal_amount_fakt = withdrawal_amount_fakt;
    }


    /**
     * Gets the error_string value for this PammWithdrawalResponseCS.
     * 
     * @return error_string
     */
    public java.lang.String getError_string() {
        return error_string;
    }


    /**
     * Sets the error_string value for this PammWithdrawalResponseCS.
     * 
     * @param error_string
     */
    public void setError_string(java.lang.String error_string) {
        this.error_string = error_string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammWithdrawalResponseCS)) return false;
        PammWithdrawalResponseCS other = (PammWithdrawalResponseCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.order == other.getOrder() &&
            this.aggregated_investment == other.getAggregated_investment() &&
            this.equity == other.getEquity() &&
            this.withdrawal_amount_fakt == other.getWithdrawal_amount_fakt() &&
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
        _hashCode += getOrder();
        _hashCode += new Double(getAggregated_investment()).hashCode();
        _hashCode += new Double(getEquity()).hashCode();
        _hashCode += new Double(getWithdrawal_amount_fakt()).hashCode();
        if (getError_string() != null) {
            _hashCode += getError_string().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammWithdrawalResponseCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammWithdrawalResponseCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregated_investment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "aggregated_investment"));
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
        elemField.setFieldName("withdrawal_amount_fakt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "withdrawal_amount_fakt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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

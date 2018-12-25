/**
 * PammTransferInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammTransferInfo  implements java.io.Serializable {
    private int ticket_from;

    private int ticket_to;

    private double aggregated_investment;

    private double equity;

    private double withdrawal_amount_fakt;

    private double deposit_amount_fakt;

    private double transfer_coeff;

    private java.lang.String error_string;

    public PammTransferInfo() {
    }

    public PammTransferInfo(
           int ticket_from,
           int ticket_to,
           double aggregated_investment,
           double equity,
           double withdrawal_amount_fakt,
           double deposit_amount_fakt,
           double transfer_coeff,
           java.lang.String error_string) {
           this.ticket_from = ticket_from;
           this.ticket_to = ticket_to;
           this.aggregated_investment = aggregated_investment;
           this.equity = equity;
           this.withdrawal_amount_fakt = withdrawal_amount_fakt;
           this.deposit_amount_fakt = deposit_amount_fakt;
           this.transfer_coeff = transfer_coeff;
           this.error_string = error_string;
    }


    /**
     * Gets the ticket_from value for this PammTransferInfo.
     * 
     * @return ticket_from
     */
    public int getTicket_from() {
        return ticket_from;
    }


    /**
     * Sets the ticket_from value for this PammTransferInfo.
     * 
     * @param ticket_from
     */
    public void setTicket_from(int ticket_from) {
        this.ticket_from = ticket_from;
    }


    /**
     * Gets the ticket_to value for this PammTransferInfo.
     * 
     * @return ticket_to
     */
    public int getTicket_to() {
        return ticket_to;
    }


    /**
     * Sets the ticket_to value for this PammTransferInfo.
     * 
     * @param ticket_to
     */
    public void setTicket_to(int ticket_to) {
        this.ticket_to = ticket_to;
    }


    /**
     * Gets the aggregated_investment value for this PammTransferInfo.
     * 
     * @return aggregated_investment
     */
    public double getAggregated_investment() {
        return aggregated_investment;
    }


    /**
     * Sets the aggregated_investment value for this PammTransferInfo.
     * 
     * @param aggregated_investment
     */
    public void setAggregated_investment(double aggregated_investment) {
        this.aggregated_investment = aggregated_investment;
    }


    /**
     * Gets the equity value for this PammTransferInfo.
     * 
     * @return equity
     */
    public double getEquity() {
        return equity;
    }


    /**
     * Sets the equity value for this PammTransferInfo.
     * 
     * @param equity
     */
    public void setEquity(double equity) {
        this.equity = equity;
    }


    /**
     * Gets the withdrawal_amount_fakt value for this PammTransferInfo.
     * 
     * @return withdrawal_amount_fakt
     */
    public double getWithdrawal_amount_fakt() {
        return withdrawal_amount_fakt;
    }


    /**
     * Sets the withdrawal_amount_fakt value for this PammTransferInfo.
     * 
     * @param withdrawal_amount_fakt
     */
    public void setWithdrawal_amount_fakt(double withdrawal_amount_fakt) {
        this.withdrawal_amount_fakt = withdrawal_amount_fakt;
    }


    /**
     * Gets the deposit_amount_fakt value for this PammTransferInfo.
     * 
     * @return deposit_amount_fakt
     */
    public double getDeposit_amount_fakt() {
        return deposit_amount_fakt;
    }


    /**
     * Sets the deposit_amount_fakt value for this PammTransferInfo.
     * 
     * @param deposit_amount_fakt
     */
    public void setDeposit_amount_fakt(double deposit_amount_fakt) {
        this.deposit_amount_fakt = deposit_amount_fakt;
    }


    /**
     * Gets the transfer_coeff value for this PammTransferInfo.
     * 
     * @return transfer_coeff
     */
    public double getTransfer_coeff() {
        return transfer_coeff;
    }


    /**
     * Sets the transfer_coeff value for this PammTransferInfo.
     * 
     * @param transfer_coeff
     */
    public void setTransfer_coeff(double transfer_coeff) {
        this.transfer_coeff = transfer_coeff;
    }


    /**
     * Gets the error_string value for this PammTransferInfo.
     * 
     * @return error_string
     */
    public java.lang.String getError_string() {
        return error_string;
    }


    /**
     * Sets the error_string value for this PammTransferInfo.
     * 
     * @param error_string
     */
    public void setError_string(java.lang.String error_string) {
        this.error_string = error_string;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammTransferInfo)) return false;
        PammTransferInfo other = (PammTransferInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ticket_from == other.getTicket_from() &&
            this.ticket_to == other.getTicket_to() &&
            this.aggregated_investment == other.getAggregated_investment() &&
            this.equity == other.getEquity() &&
            this.withdrawal_amount_fakt == other.getWithdrawal_amount_fakt() &&
            this.deposit_amount_fakt == other.getDeposit_amount_fakt() &&
            this.transfer_coeff == other.getTransfer_coeff() &&
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
        _hashCode += getTicket_from();
        _hashCode += getTicket_to();
        _hashCode += new Double(getAggregated_investment()).hashCode();
        _hashCode += new Double(getEquity()).hashCode();
        _hashCode += new Double(getWithdrawal_amount_fakt()).hashCode();
        _hashCode += new Double(getDeposit_amount_fakt()).hashCode();
        _hashCode += new Double(getTransfer_coeff()).hashCode();
        if (getError_string() != null) {
            _hashCode += getError_string().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammTransferInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammTransferInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_from");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ticket_from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_to");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ticket_to"));
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
        elemField.setFieldName("deposit_amount_fakt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "deposit_amount_fakt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transfer_coeff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "transfer_coeff"));
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

/**
 * TradeTransInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class TradeTransInfo  implements java.io.Serializable {
    private int account;

    private int command;

    private java.lang.String comment;

    private int volume;

    private java.lang.String symbol;

    private double price;

    private double stoploss;

    private double takeprofit;

    public TradeTransInfo() {
    }

    public TradeTransInfo(
           int account,
           int command,
           java.lang.String comment,
           int volume,
           java.lang.String symbol,
           double price,
           double stoploss,
           double takeprofit) {
           this.account = account;
           this.command = command;
           this.comment = comment;
           this.volume = volume;
           this.symbol = symbol;
           this.price = price;
           this.stoploss = stoploss;
           this.takeprofit = takeprofit;
    }


    /**
     * Gets the account value for this TradeTransInfo.
     * 
     * @return account
     */
    public int getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TradeTransInfo.
     * 
     * @param account
     */
    public void setAccount(int account) {
        this.account = account;
    }


    /**
     * Gets the command value for this TradeTransInfo.
     * 
     * @return command
     */
    public int getCommand() {
        return command;
    }


    /**
     * Sets the command value for this TradeTransInfo.
     * 
     * @param command
     */
    public void setCommand(int command) {
        this.command = command;
    }


    /**
     * Gets the comment value for this TradeTransInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TradeTransInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the volume value for this TradeTransInfo.
     * 
     * @return volume
     */
    public int getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this TradeTransInfo.
     * 
     * @param volume
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }


    /**
     * Gets the symbol value for this TradeTransInfo.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this TradeTransInfo.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the price value for this TradeTransInfo.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this TradeTransInfo.
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Gets the stoploss value for this TradeTransInfo.
     * 
     * @return stoploss
     */
    public double getStoploss() {
        return stoploss;
    }


    /**
     * Sets the stoploss value for this TradeTransInfo.
     * 
     * @param stoploss
     */
    public void setStoploss(double stoploss) {
        this.stoploss = stoploss;
    }


    /**
     * Gets the takeprofit value for this TradeTransInfo.
     * 
     * @return takeprofit
     */
    public double getTakeprofit() {
        return takeprofit;
    }


    /**
     * Sets the takeprofit value for this TradeTransInfo.
     * 
     * @param takeprofit
     */
    public void setTakeprofit(double takeprofit) {
        this.takeprofit = takeprofit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TradeTransInfo)) return false;
        TradeTransInfo other = (TradeTransInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.account == other.getAccount() &&
            this.command == other.getCommand() &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            this.volume == other.getVolume() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.price == other.getPrice() &&
            this.stoploss == other.getStoploss() &&
            this.takeprofit == other.getTakeprofit();
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
        _hashCode += getAccount();
        _hashCode += getCommand();
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        _hashCode += getVolume();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += new Double(getPrice()).hashCode();
        _hashCode += new Double(getStoploss()).hashCode();
        _hashCode += new Double(getTakeprofit()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TradeTransInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeTransInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "command"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stoploss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "stoploss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takeprofit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "takeprofit"));
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

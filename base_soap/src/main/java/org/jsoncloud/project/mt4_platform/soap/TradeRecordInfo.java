/**
 * TradeRecordInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class TradeRecordInfo  implements java.io.Serializable {
    private int order;

    private int login;

    private java.lang.String symbol;

    private int digits;

    private int cmd;

    private int volume;

    private int open_time;

    private int open_reserv;

    private double open_price;

    private double sl;

    private double tp;

    private int close_time;

    private int value_date;

    private int expiration;

    private int conv_reserv;

    private double[] conv_rates;

    private double commission;

    private double commission_agent;

    private double storage;

    private double close_price;

    private double profit;

    private double taxes;

    private int magic;

    private java.lang.String comment;

    private int internal_id;

    private int activation;

    private int spread;

    private double margin_rate;

    private int timestamp;

    public TradeRecordInfo() {
    }

    public TradeRecordInfo(
           int order,
           int login,
           java.lang.String symbol,
           int digits,
           int cmd,
           int volume,
           int open_time,
           int open_reserv,
           double open_price,
           double sl,
           double tp,
           int close_time,
           int value_date,
           int expiration,
           int conv_reserv,
           double[] conv_rates,
           double commission,
           double commission_agent,
           double storage,
           double close_price,
           double profit,
           double taxes,
           int magic,
           java.lang.String comment,
           int internal_id,
           int activation,
           int spread,
           double margin_rate,
           int timestamp) {
           this.order = order;
           this.login = login;
           this.symbol = symbol;
           this.digits = digits;
           this.cmd = cmd;
           this.volume = volume;
           this.open_time = open_time;
           this.open_reserv = open_reserv;
           this.open_price = open_price;
           this.sl = sl;
           this.tp = tp;
           this.close_time = close_time;
           this.value_date = value_date;
           this.expiration = expiration;
           this.conv_reserv = conv_reserv;
           this.conv_rates = conv_rates;
           this.commission = commission;
           this.commission_agent = commission_agent;
           this.storage = storage;
           this.close_price = close_price;
           this.profit = profit;
           this.taxes = taxes;
           this.magic = magic;
           this.comment = comment;
           this.internal_id = internal_id;
           this.activation = activation;
           this.spread = spread;
           this.margin_rate = margin_rate;
           this.timestamp = timestamp;
    }


    /**
     * Gets the order value for this TradeRecordInfo.
     * 
     * @return order
     */
    public int getOrder() {
        return order;
    }


    /**
     * Sets the order value for this TradeRecordInfo.
     * 
     * @param order
     */
    public void setOrder(int order) {
        this.order = order;
    }


    /**
     * Gets the login value for this TradeRecordInfo.
     * 
     * @return login
     */
    public int getLogin() {
        return login;
    }


    /**
     * Sets the login value for this TradeRecordInfo.
     * 
     * @param login
     */
    public void setLogin(int login) {
        this.login = login;
    }


    /**
     * Gets the symbol value for this TradeRecordInfo.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this TradeRecordInfo.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the digits value for this TradeRecordInfo.
     * 
     * @return digits
     */
    public int getDigits() {
        return digits;
    }


    /**
     * Sets the digits value for this TradeRecordInfo.
     * 
     * @param digits
     */
    public void setDigits(int digits) {
        this.digits = digits;
    }


    /**
     * Gets the cmd value for this TradeRecordInfo.
     * 
     * @return cmd
     */
    public int getCmd() {
        return cmd;
    }


    /**
     * Sets the cmd value for this TradeRecordInfo.
     * 
     * @param cmd
     */
    public void setCmd(int cmd) {
        this.cmd = cmd;
    }


    /**
     * Gets the volume value for this TradeRecordInfo.
     * 
     * @return volume
     */
    public int getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this TradeRecordInfo.
     * 
     * @param volume
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }


    /**
     * Gets the open_time value for this TradeRecordInfo.
     * 
     * @return open_time
     */
    public int getOpen_time() {
        return open_time;
    }


    /**
     * Sets the open_time value for this TradeRecordInfo.
     * 
     * @param open_time
     */
    public void setOpen_time(int open_time) {
        this.open_time = open_time;
    }


    /**
     * Gets the open_reserv value for this TradeRecordInfo.
     * 
     * @return open_reserv
     */
    public int getOpen_reserv() {
        return open_reserv;
    }


    /**
     * Sets the open_reserv value for this TradeRecordInfo.
     * 
     * @param open_reserv
     */
    public void setOpen_reserv(int open_reserv) {
        this.open_reserv = open_reserv;
    }


    /**
     * Gets the open_price value for this TradeRecordInfo.
     * 
     * @return open_price
     */
    public double getOpen_price() {
        return open_price;
    }


    /**
     * Sets the open_price value for this TradeRecordInfo.
     * 
     * @param open_price
     */
    public void setOpen_price(double open_price) {
        this.open_price = open_price;
    }


    /**
     * Gets the sl value for this TradeRecordInfo.
     * 
     * @return sl
     */
    public double getSl() {
        return sl;
    }


    /**
     * Sets the sl value for this TradeRecordInfo.
     * 
     * @param sl
     */
    public void setSl(double sl) {
        this.sl = sl;
    }


    /**
     * Gets the tp value for this TradeRecordInfo.
     * 
     * @return tp
     */
    public double getTp() {
        return tp;
    }


    /**
     * Sets the tp value for this TradeRecordInfo.
     * 
     * @param tp
     */
    public void setTp(double tp) {
        this.tp = tp;
    }


    /**
     * Gets the close_time value for this TradeRecordInfo.
     * 
     * @return close_time
     */
    public int getClose_time() {
        return close_time;
    }


    /**
     * Sets the close_time value for this TradeRecordInfo.
     * 
     * @param close_time
     */
    public void setClose_time(int close_time) {
        this.close_time = close_time;
    }


    /**
     * Gets the value_date value for this TradeRecordInfo.
     * 
     * @return value_date
     */
    public int getValue_date() {
        return value_date;
    }


    /**
     * Sets the value_date value for this TradeRecordInfo.
     * 
     * @param value_date
     */
    public void setValue_date(int value_date) {
        this.value_date = value_date;
    }


    /**
     * Gets the expiration value for this TradeRecordInfo.
     * 
     * @return expiration
     */
    public int getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this TradeRecordInfo.
     * 
     * @param expiration
     */
    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the conv_reserv value for this TradeRecordInfo.
     * 
     * @return conv_reserv
     */
    public int getConv_reserv() {
        return conv_reserv;
    }


    /**
     * Sets the conv_reserv value for this TradeRecordInfo.
     * 
     * @param conv_reserv
     */
    public void setConv_reserv(int conv_reserv) {
        this.conv_reserv = conv_reserv;
    }


    /**
     * Gets the conv_rates value for this TradeRecordInfo.
     * 
     * @return conv_rates
     */
    public double[] getConv_rates() {
        return conv_rates;
    }


    /**
     * Sets the conv_rates value for this TradeRecordInfo.
     * 
     * @param conv_rates
     */
    public void setConv_rates(double[] conv_rates) {
        this.conv_rates = conv_rates;
    }


    /**
     * Gets the commission value for this TradeRecordInfo.
     * 
     * @return commission
     */
    public double getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this TradeRecordInfo.
     * 
     * @param commission
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }


    /**
     * Gets the commission_agent value for this TradeRecordInfo.
     * 
     * @return commission_agent
     */
    public double getCommission_agent() {
        return commission_agent;
    }


    /**
     * Sets the commission_agent value for this TradeRecordInfo.
     * 
     * @param commission_agent
     */
    public void setCommission_agent(double commission_agent) {
        this.commission_agent = commission_agent;
    }


    /**
     * Gets the storage value for this TradeRecordInfo.
     * 
     * @return storage
     */
    public double getStorage() {
        return storage;
    }


    /**
     * Sets the storage value for this TradeRecordInfo.
     * 
     * @param storage
     */
    public void setStorage(double storage) {
        this.storage = storage;
    }


    /**
     * Gets the close_price value for this TradeRecordInfo.
     * 
     * @return close_price
     */
    public double getClose_price() {
        return close_price;
    }


    /**
     * Sets the close_price value for this TradeRecordInfo.
     * 
     * @param close_price
     */
    public void setClose_price(double close_price) {
        this.close_price = close_price;
    }


    /**
     * Gets the profit value for this TradeRecordInfo.
     * 
     * @return profit
     */
    public double getProfit() {
        return profit;
    }


    /**
     * Sets the profit value for this TradeRecordInfo.
     * 
     * @param profit
     */
    public void setProfit(double profit) {
        this.profit = profit;
    }


    /**
     * Gets the taxes value for this TradeRecordInfo.
     * 
     * @return taxes
     */
    public double getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this TradeRecordInfo.
     * 
     * @param taxes
     */
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the magic value for this TradeRecordInfo.
     * 
     * @return magic
     */
    public int getMagic() {
        return magic;
    }


    /**
     * Sets the magic value for this TradeRecordInfo.
     * 
     * @param magic
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }


    /**
     * Gets the comment value for this TradeRecordInfo.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TradeRecordInfo.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the internal_id value for this TradeRecordInfo.
     * 
     * @return internal_id
     */
    public int getInternal_id() {
        return internal_id;
    }


    /**
     * Sets the internal_id value for this TradeRecordInfo.
     * 
     * @param internal_id
     */
    public void setInternal_id(int internal_id) {
        this.internal_id = internal_id;
    }


    /**
     * Gets the activation value for this TradeRecordInfo.
     * 
     * @return activation
     */
    public int getActivation() {
        return activation;
    }


    /**
     * Sets the activation value for this TradeRecordInfo.
     * 
     * @param activation
     */
    public void setActivation(int activation) {
        this.activation = activation;
    }


    /**
     * Gets the spread value for this TradeRecordInfo.
     * 
     * @return spread
     */
    public int getSpread() {
        return spread;
    }


    /**
     * Sets the spread value for this TradeRecordInfo.
     * 
     * @param spread
     */
    public void setSpread(int spread) {
        this.spread = spread;
    }


    /**
     * Gets the margin_rate value for this TradeRecordInfo.
     * 
     * @return margin_rate
     */
    public double getMargin_rate() {
        return margin_rate;
    }


    /**
     * Sets the margin_rate value for this TradeRecordInfo.
     * 
     * @param margin_rate
     */
    public void setMargin_rate(double margin_rate) {
        this.margin_rate = margin_rate;
    }


    /**
     * Gets the timestamp value for this TradeRecordInfo.
     * 
     * @return timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this TradeRecordInfo.
     * 
     * @param timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TradeRecordInfo)) return false;
        TradeRecordInfo other = (TradeRecordInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.order == other.getOrder() &&
            this.login == other.getLogin() &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            this.digits == other.getDigits() &&
            this.cmd == other.getCmd() &&
            this.volume == other.getVolume() &&
            this.open_time == other.getOpen_time() &&
            this.open_reserv == other.getOpen_reserv() &&
            this.open_price == other.getOpen_price() &&
            this.sl == other.getSl() &&
            this.tp == other.getTp() &&
            this.close_time == other.getClose_time() &&
            this.value_date == other.getValue_date() &&
            this.expiration == other.getExpiration() &&
            this.conv_reserv == other.getConv_reserv() &&
            ((this.conv_rates==null && other.getConv_rates()==null) || 
             (this.conv_rates!=null &&
              java.util.Arrays.equals(this.conv_rates, other.getConv_rates()))) &&
            this.commission == other.getCommission() &&
            this.commission_agent == other.getCommission_agent() &&
            this.storage == other.getStorage() &&
            this.close_price == other.getClose_price() &&
            this.profit == other.getProfit() &&
            this.taxes == other.getTaxes() &&
            this.magic == other.getMagic() &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            this.internal_id == other.getInternal_id() &&
            this.activation == other.getActivation() &&
            this.spread == other.getSpread() &&
            this.margin_rate == other.getMargin_rate() &&
            this.timestamp == other.getTimestamp();
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
        _hashCode += getLogin();
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        _hashCode += getDigits();
        _hashCode += getCmd();
        _hashCode += getVolume();
        _hashCode += getOpen_time();
        _hashCode += getOpen_reserv();
        _hashCode += new Double(getOpen_price()).hashCode();
        _hashCode += new Double(getSl()).hashCode();
        _hashCode += new Double(getTp()).hashCode();
        _hashCode += getClose_time();
        _hashCode += getValue_date();
        _hashCode += getExpiration();
        _hashCode += getConv_reserv();
        if (getConv_rates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConv_rates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConv_rates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getCommission()).hashCode();
        _hashCode += new Double(getCommission_agent()).hashCode();
        _hashCode += new Double(getStorage()).hashCode();
        _hashCode += new Double(getClose_price()).hashCode();
        _hashCode += new Double(getProfit()).hashCode();
        _hashCode += new Double(getTaxes()).hashCode();
        _hashCode += getMagic();
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        _hashCode += getInternal_id();
        _hashCode += getActivation();
        _hashCode += getSpread();
        _hashCode += new Double(getMargin_rate()).hashCode();
        _hashCode += getTimestamp();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TradeRecordInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "TradeRecordInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "login"));
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
        elemField.setFieldName("digits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "digits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "cmd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open_time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "open_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open_reserv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "open_reserv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("open_price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "open_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "sl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "tp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close_time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "close_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "value_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conv_reserv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "conv_reserv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conv_rates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "conv_rates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "double"));
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
        elemField.setFieldName("storage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "storage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close_price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "close_price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "profit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "magic"));
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
        elemField.setFieldName("internal_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "internal_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "activation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spread");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "spread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "timestamp"));
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

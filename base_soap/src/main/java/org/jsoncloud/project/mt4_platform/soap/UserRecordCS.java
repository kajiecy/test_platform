/**
 * UserRecordCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class UserRecordCS  implements java.io.Serializable {
    private int login;

    private java.lang.String group;

    private java.lang.String password;

    private int enable;

    private int enable_change_password;

    private int enable_read_only;

    private java.lang.String password_investor;

    private java.lang.String password_phone;

    private java.lang.String name;

    private java.lang.String country;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zipcode;

    private java.lang.String address;

    private java.lang.String phone;

    private java.lang.String email;

    private java.lang.String comment;

    private java.lang.String id;

    private java.lang.String status;

    private int regdate;

    private int lastdate;

    private int leverage;

    private int agent_account;

    private int timestamp;

    private double balance;

    private double prevmonthbalance;

    private double prevbalance;

    private double credit;

    private double interestrate;

    private double taxes;

    private java.lang.String publickey;

    private int send_reports;

    private int balance_status;

    private int user_color;

    private java.lang.String api_data;

    public UserRecordCS() {
    }

    public UserRecordCS(
           int login,
           java.lang.String group,
           java.lang.String password,
           int enable,
           int enable_change_password,
           int enable_read_only,
           java.lang.String password_investor,
           java.lang.String password_phone,
           java.lang.String name,
           java.lang.String country,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zipcode,
           java.lang.String address,
           java.lang.String phone,
           java.lang.String email,
           java.lang.String comment,
           java.lang.String id,
           java.lang.String status,
           int regdate,
           int lastdate,
           int leverage,
           int agent_account,
           int timestamp,
           double balance,
           double prevmonthbalance,
           double prevbalance,
           double credit,
           double interestrate,
           double taxes,
           java.lang.String publickey,
           int send_reports,
           int balance_status,
           int user_color,
           java.lang.String api_data) {
           this.login = login;
           this.group = group;
           this.password = password;
           this.enable = enable;
           this.enable_change_password = enable_change_password;
           this.enable_read_only = enable_read_only;
           this.password_investor = password_investor;
           this.password_phone = password_phone;
           this.name = name;
           this.country = country;
           this.city = city;
           this.state = state;
           this.zipcode = zipcode;
           this.address = address;
           this.phone = phone;
           this.email = email;
           this.comment = comment;
           this.id = id;
           this.status = status;
           this.regdate = regdate;
           this.lastdate = lastdate;
           this.leverage = leverage;
           this.agent_account = agent_account;
           this.timestamp = timestamp;
           this.balance = balance;
           this.prevmonthbalance = prevmonthbalance;
           this.prevbalance = prevbalance;
           this.credit = credit;
           this.interestrate = interestrate;
           this.taxes = taxes;
           this.publickey = publickey;
           this.send_reports = send_reports;
           this.balance_status = balance_status;
           this.user_color = user_color;
           this.api_data = api_data;
    }


    /**
     * Gets the login value for this UserRecordCS.
     * 
     * @return login
     */
    public int getLogin() {
        return login;
    }


    /**
     * Sets the login value for this UserRecordCS.
     * 
     * @param login
     */
    public void setLogin(int login) {
        this.login = login;
    }


    /**
     * Gets the group value for this UserRecordCS.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this UserRecordCS.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the password value for this UserRecordCS.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserRecordCS.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the enable value for this UserRecordCS.
     * 
     * @return enable
     */
    public int getEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this UserRecordCS.
     * 
     * @param enable
     */
    public void setEnable(int enable) {
        this.enable = enable;
    }


    /**
     * Gets the enable_change_password value for this UserRecordCS.
     * 
     * @return enable_change_password
     */
    public int getEnable_change_password() {
        return enable_change_password;
    }


    /**
     * Sets the enable_change_password value for this UserRecordCS.
     * 
     * @param enable_change_password
     */
    public void setEnable_change_password(int enable_change_password) {
        this.enable_change_password = enable_change_password;
    }


    /**
     * Gets the enable_read_only value for this UserRecordCS.
     * 
     * @return enable_read_only
     */
    public int getEnable_read_only() {
        return enable_read_only;
    }


    /**
     * Sets the enable_read_only value for this UserRecordCS.
     * 
     * @param enable_read_only
     */
    public void setEnable_read_only(int enable_read_only) {
        this.enable_read_only = enable_read_only;
    }


    /**
     * Gets the password_investor value for this UserRecordCS.
     * 
     * @return password_investor
     */
    public java.lang.String getPassword_investor() {
        return password_investor;
    }


    /**
     * Sets the password_investor value for this UserRecordCS.
     * 
     * @param password_investor
     */
    public void setPassword_investor(java.lang.String password_investor) {
        this.password_investor = password_investor;
    }


    /**
     * Gets the password_phone value for this UserRecordCS.
     * 
     * @return password_phone
     */
    public java.lang.String getPassword_phone() {
        return password_phone;
    }


    /**
     * Sets the password_phone value for this UserRecordCS.
     * 
     * @param password_phone
     */
    public void setPassword_phone(java.lang.String password_phone) {
        this.password_phone = password_phone;
    }


    /**
     * Gets the name value for this UserRecordCS.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserRecordCS.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the country value for this UserRecordCS.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this UserRecordCS.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the city value for this UserRecordCS.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this UserRecordCS.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this UserRecordCS.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this UserRecordCS.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zipcode value for this UserRecordCS.
     * 
     * @return zipcode
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this UserRecordCS.
     * 
     * @param zipcode
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the address value for this UserRecordCS.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this UserRecordCS.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the phone value for this UserRecordCS.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this UserRecordCS.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the email value for this UserRecordCS.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this UserRecordCS.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the comment value for this UserRecordCS.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this UserRecordCS.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the id value for this UserRecordCS.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this UserRecordCS.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the status value for this UserRecordCS.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UserRecordCS.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the regdate value for this UserRecordCS.
     * 
     * @return regdate
     */
    public int getRegdate() {
        return regdate;
    }


    /**
     * Sets the regdate value for this UserRecordCS.
     * 
     * @param regdate
     */
    public void setRegdate(int regdate) {
        this.regdate = regdate;
    }


    /**
     * Gets the lastdate value for this UserRecordCS.
     * 
     * @return lastdate
     */
    public int getLastdate() {
        return lastdate;
    }


    /**
     * Sets the lastdate value for this UserRecordCS.
     * 
     * @param lastdate
     */
    public void setLastdate(int lastdate) {
        this.lastdate = lastdate;
    }


    /**
     * Gets the leverage value for this UserRecordCS.
     * 
     * @return leverage
     */
    public int getLeverage() {
        return leverage;
    }


    /**
     * Sets the leverage value for this UserRecordCS.
     * 
     * @param leverage
     */
    public void setLeverage(int leverage) {
        this.leverage = leverage;
    }


    /**
     * Gets the agent_account value for this UserRecordCS.
     * 
     * @return agent_account
     */
    public int getAgent_account() {
        return agent_account;
    }


    /**
     * Sets the agent_account value for this UserRecordCS.
     * 
     * @param agent_account
     */
    public void setAgent_account(int agent_account) {
        this.agent_account = agent_account;
    }


    /**
     * Gets the timestamp value for this UserRecordCS.
     * 
     * @return timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this UserRecordCS.
     * 
     * @param timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the balance value for this UserRecordCS.
     * 
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this UserRecordCS.
     * 
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    /**
     * Gets the prevmonthbalance value for this UserRecordCS.
     * 
     * @return prevmonthbalance
     */
    public double getPrevmonthbalance() {
        return prevmonthbalance;
    }


    /**
     * Sets the prevmonthbalance value for this UserRecordCS.
     * 
     * @param prevmonthbalance
     */
    public void setPrevmonthbalance(double prevmonthbalance) {
        this.prevmonthbalance = prevmonthbalance;
    }


    /**
     * Gets the prevbalance value for this UserRecordCS.
     * 
     * @return prevbalance
     */
    public double getPrevbalance() {
        return prevbalance;
    }


    /**
     * Sets the prevbalance value for this UserRecordCS.
     * 
     * @param prevbalance
     */
    public void setPrevbalance(double prevbalance) {
        this.prevbalance = prevbalance;
    }


    /**
     * Gets the credit value for this UserRecordCS.
     * 
     * @return credit
     */
    public double getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this UserRecordCS.
     * 
     * @param credit
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }


    /**
     * Gets the interestrate value for this UserRecordCS.
     * 
     * @return interestrate
     */
    public double getInterestrate() {
        return interestrate;
    }


    /**
     * Sets the interestrate value for this UserRecordCS.
     * 
     * @param interestrate
     */
    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }


    /**
     * Gets the taxes value for this UserRecordCS.
     * 
     * @return taxes
     */
    public double getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this UserRecordCS.
     * 
     * @param taxes
     */
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the publickey value for this UserRecordCS.
     * 
     * @return publickey
     */
    public java.lang.String getPublickey() {
        return publickey;
    }


    /**
     * Sets the publickey value for this UserRecordCS.
     * 
     * @param publickey
     */
    public void setPublickey(java.lang.String publickey) {
        this.publickey = publickey;
    }


    /**
     * Gets the send_reports value for this UserRecordCS.
     * 
     * @return send_reports
     */
    public int getSend_reports() {
        return send_reports;
    }


    /**
     * Sets the send_reports value for this UserRecordCS.
     * 
     * @param send_reports
     */
    public void setSend_reports(int send_reports) {
        this.send_reports = send_reports;
    }


    /**
     * Gets the balance_status value for this UserRecordCS.
     * 
     * @return balance_status
     */
    public int getBalance_status() {
        return balance_status;
    }


    /**
     * Sets the balance_status value for this UserRecordCS.
     * 
     * @param balance_status
     */
    public void setBalance_status(int balance_status) {
        this.balance_status = balance_status;
    }


    /**
     * Gets the user_color value for this UserRecordCS.
     * 
     * @return user_color
     */
    public int getUser_color() {
        return user_color;
    }


    /**
     * Sets the user_color value for this UserRecordCS.
     * 
     * @param user_color
     */
    public void setUser_color(int user_color) {
        this.user_color = user_color;
    }


    /**
     * Gets the api_data value for this UserRecordCS.
     * 
     * @return api_data
     */
    public java.lang.String getApi_data() {
        return api_data;
    }


    /**
     * Sets the api_data value for this UserRecordCS.
     * 
     * @param api_data
     */
    public void setApi_data(java.lang.String api_data) {
        this.api_data = api_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserRecordCS)) return false;
        UserRecordCS other = (UserRecordCS) obj;
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
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.enable == other.getEnable() &&
            this.enable_change_password == other.getEnable_change_password() &&
            this.enable_read_only == other.getEnable_read_only() &&
            ((this.password_investor==null && other.getPassword_investor()==null) || 
             (this.password_investor!=null &&
              this.password_investor.equals(other.getPassword_investor()))) &&
            ((this.password_phone==null && other.getPassword_phone()==null) || 
             (this.password_phone!=null &&
              this.password_phone.equals(other.getPassword_phone()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.regdate == other.getRegdate() &&
            this.lastdate == other.getLastdate() &&
            this.leverage == other.getLeverage() &&
            this.agent_account == other.getAgent_account() &&
            this.timestamp == other.getTimestamp() &&
            this.balance == other.getBalance() &&
            this.prevmonthbalance == other.getPrevmonthbalance() &&
            this.prevbalance == other.getPrevbalance() &&
            this.credit == other.getCredit() &&
            this.interestrate == other.getInterestrate() &&
            this.taxes == other.getTaxes() &&
            ((this.publickey==null && other.getPublickey()==null) || 
             (this.publickey!=null &&
              this.publickey.equals(other.getPublickey()))) &&
            this.send_reports == other.getSend_reports() &&
            this.balance_status == other.getBalance_status() &&
            this.user_color == other.getUser_color() &&
            ((this.api_data==null && other.getApi_data()==null) || 
             (this.api_data!=null &&
              this.api_data.equals(other.getApi_data())));
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += getEnable();
        _hashCode += getEnable_change_password();
        _hashCode += getEnable_read_only();
        if (getPassword_investor() != null) {
            _hashCode += getPassword_investor().hashCode();
        }
        if (getPassword_phone() != null) {
            _hashCode += getPassword_phone().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getRegdate();
        _hashCode += getLastdate();
        _hashCode += getLeverage();
        _hashCode += getAgent_account();
        _hashCode += getTimestamp();
        _hashCode += new Double(getBalance()).hashCode();
        _hashCode += new Double(getPrevmonthbalance()).hashCode();
        _hashCode += new Double(getPrevbalance()).hashCode();
        _hashCode += new Double(getCredit()).hashCode();
        _hashCode += new Double(getInterestrate()).hashCode();
        _hashCode += new Double(getTaxes()).hashCode();
        if (getPublickey() != null) {
            _hashCode += getPublickey().hashCode();
        }
        _hashCode += getSend_reports();
        _hashCode += getBalance_status();
        _hashCode += getUser_color();
        if (getApi_data() != null) {
            _hashCode += getApi_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserRecordCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "UserRecordCS"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable_change_password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "enable_change_password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable_read_only");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "enable_read_only"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password_investor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "password_investor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "password_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "zipcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "regdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "lastdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "leverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agent_account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "agent_account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "timestamp"));
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
        elemField.setFieldName("prevmonthbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "prevmonthbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "prevbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "interestrate"));
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
        elemField.setFieldName("publickey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "publickey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_reports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "send_reports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "balance_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "user_color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("api_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "api_data"));
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

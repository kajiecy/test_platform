/**
 * PammManagerRecordCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class PammManagerRecordCS  implements java.io.Serializable {
    private java.lang.String group;

    private java.lang.String name;

    private java.lang.String password;

    private java.lang.String password_investor;

    private java.lang.String email;

    private java.lang.String country;

    private java.lang.String state;

    private java.lang.String city;

    private java.lang.String address;

    private java.lang.String comment;

    private java.lang.String phone;

    private java.lang.String phone_password;

    private java.lang.String status;

    private java.lang.String zipcode;

    private java.lang.String id;

    private int leverage;

    private int agent_account;

    private int send_reports;

    private double commission;

    private double commission_agent;

    private double visible_capital;

    private int auto_increase_mc;

    private org.jsoncloud.project.mt4_platform.soap.CommissionsList commissions_list;

    public PammManagerRecordCS() {
    }

    public PammManagerRecordCS(
           java.lang.String group,
           java.lang.String name,
           java.lang.String password,
           java.lang.String password_investor,
           java.lang.String email,
           java.lang.String country,
           java.lang.String state,
           java.lang.String city,
           java.lang.String address,
           java.lang.String comment,
           java.lang.String phone,
           java.lang.String phone_password,
           java.lang.String status,
           java.lang.String zipcode,
           java.lang.String id,
           int leverage,
           int agent_account,
           int send_reports,
           double commission,
           double commission_agent,
           double visible_capital,
           int auto_increase_mc,
           org.jsoncloud.project.mt4_platform.soap.CommissionsList commissions_list) {
           this.group = group;
           this.name = name;
           this.password = password;
           this.password_investor = password_investor;
           this.email = email;
           this.country = country;
           this.state = state;
           this.city = city;
           this.address = address;
           this.comment = comment;
           this.phone = phone;
           this.phone_password = phone_password;
           this.status = status;
           this.zipcode = zipcode;
           this.id = id;
           this.leverage = leverage;
           this.agent_account = agent_account;
           this.send_reports = send_reports;
           this.commission = commission;
           this.commission_agent = commission_agent;
           this.visible_capital = visible_capital;
           this.auto_increase_mc = auto_increase_mc;
           this.commissions_list = commissions_list;
    }


    /**
     * Gets the group value for this PammManagerRecordCS.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this PammManagerRecordCS.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the name value for this PammManagerRecordCS.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PammManagerRecordCS.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the password value for this PammManagerRecordCS.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PammManagerRecordCS.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the password_investor value for this PammManagerRecordCS.
     * 
     * @return password_investor
     */
    public java.lang.String getPassword_investor() {
        return password_investor;
    }


    /**
     * Sets the password_investor value for this PammManagerRecordCS.
     * 
     * @param password_investor
     */
    public void setPassword_investor(java.lang.String password_investor) {
        this.password_investor = password_investor;
    }


    /**
     * Gets the email value for this PammManagerRecordCS.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PammManagerRecordCS.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the country value for this PammManagerRecordCS.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PammManagerRecordCS.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the state value for this PammManagerRecordCS.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this PammManagerRecordCS.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the city value for this PammManagerRecordCS.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this PammManagerRecordCS.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the address value for this PammManagerRecordCS.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PammManagerRecordCS.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the comment value for this PammManagerRecordCS.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this PammManagerRecordCS.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the phone value for this PammManagerRecordCS.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PammManagerRecordCS.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the phone_password value for this PammManagerRecordCS.
     * 
     * @return phone_password
     */
    public java.lang.String getPhone_password() {
        return phone_password;
    }


    /**
     * Sets the phone_password value for this PammManagerRecordCS.
     * 
     * @param phone_password
     */
    public void setPhone_password(java.lang.String phone_password) {
        this.phone_password = phone_password;
    }


    /**
     * Gets the status value for this PammManagerRecordCS.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PammManagerRecordCS.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the zipcode value for this PammManagerRecordCS.
     * 
     * @return zipcode
     */
    public java.lang.String getZipcode() {
        return zipcode;
    }


    /**
     * Sets the zipcode value for this PammManagerRecordCS.
     * 
     * @param zipcode
     */
    public void setZipcode(java.lang.String zipcode) {
        this.zipcode = zipcode;
    }


    /**
     * Gets the id value for this PammManagerRecordCS.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PammManagerRecordCS.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the leverage value for this PammManagerRecordCS.
     * 
     * @return leverage
     */
    public int getLeverage() {
        return leverage;
    }


    /**
     * Sets the leverage value for this PammManagerRecordCS.
     * 
     * @param leverage
     */
    public void setLeverage(int leverage) {
        this.leverage = leverage;
    }


    /**
     * Gets the agent_account value for this PammManagerRecordCS.
     * 
     * @return agent_account
     */
    public int getAgent_account() {
        return agent_account;
    }


    /**
     * Sets the agent_account value for this PammManagerRecordCS.
     * 
     * @param agent_account
     */
    public void setAgent_account(int agent_account) {
        this.agent_account = agent_account;
    }


    /**
     * Gets the send_reports value for this PammManagerRecordCS.
     * 
     * @return send_reports
     */
    public int getSend_reports() {
        return send_reports;
    }


    /**
     * Sets the send_reports value for this PammManagerRecordCS.
     * 
     * @param send_reports
     */
    public void setSend_reports(int send_reports) {
        this.send_reports = send_reports;
    }


    /**
     * Gets the commission value for this PammManagerRecordCS.
     * 
     * @return commission
     */
    public double getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this PammManagerRecordCS.
     * 
     * @param commission
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }


    /**
     * Gets the commission_agent value for this PammManagerRecordCS.
     * 
     * @return commission_agent
     */
    public double getCommission_agent() {
        return commission_agent;
    }


    /**
     * Sets the commission_agent value for this PammManagerRecordCS.
     * 
     * @param commission_agent
     */
    public void setCommission_agent(double commission_agent) {
        this.commission_agent = commission_agent;
    }


    /**
     * Gets the visible_capital value for this PammManagerRecordCS.
     * 
     * @return visible_capital
     */
    public double getVisible_capital() {
        return visible_capital;
    }


    /**
     * Sets the visible_capital value for this PammManagerRecordCS.
     * 
     * @param visible_capital
     */
    public void setVisible_capital(double visible_capital) {
        this.visible_capital = visible_capital;
    }


    /**
     * Gets the auto_increase_mc value for this PammManagerRecordCS.
     * 
     * @return auto_increase_mc
     */
    public int getAuto_increase_mc() {
        return auto_increase_mc;
    }


    /**
     * Sets the auto_increase_mc value for this PammManagerRecordCS.
     * 
     * @param auto_increase_mc
     */
    public void setAuto_increase_mc(int auto_increase_mc) {
        this.auto_increase_mc = auto_increase_mc;
    }


    /**
     * Gets the commissions_list value for this PammManagerRecordCS.
     * 
     * @return commissions_list
     */
    public org.jsoncloud.project.mt4_platform.soap.CommissionsList getCommissions_list() {
        return commissions_list;
    }


    /**
     * Sets the commissions_list value for this PammManagerRecordCS.
     * 
     * @param commissions_list
     */
    public void setCommissions_list(org.jsoncloud.project.mt4_platform.soap.CommissionsList commissions_list) {
        this.commissions_list = commissions_list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PammManagerRecordCS)) return false;
        PammManagerRecordCS other = (PammManagerRecordCS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.password_investor==null && other.getPassword_investor()==null) || 
             (this.password_investor!=null &&
              this.password_investor.equals(other.getPassword_investor()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phone_password==null && other.getPhone_password()==null) || 
             (this.phone_password!=null &&
              this.phone_password.equals(other.getPhone_password()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.zipcode==null && other.getZipcode()==null) || 
             (this.zipcode!=null &&
              this.zipcode.equals(other.getZipcode()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.leverage == other.getLeverage() &&
            this.agent_account == other.getAgent_account() &&
            this.send_reports == other.getSend_reports() &&
            this.commission == other.getCommission() &&
            this.commission_agent == other.getCommission_agent() &&
            this.visible_capital == other.getVisible_capital() &&
            this.auto_increase_mc == other.getAuto_increase_mc() &&
            ((this.commissions_list==null && other.getCommissions_list()==null) || 
             (this.commissions_list!=null &&
              this.commissions_list.equals(other.getCommissions_list())));
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
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPassword_investor() != null) {
            _hashCode += getPassword_investor().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPhone_password() != null) {
            _hashCode += getPhone_password().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getZipcode() != null) {
            _hashCode += getZipcode().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getLeverage();
        _hashCode += getAgent_account();
        _hashCode += getSend_reports();
        _hashCode += new Double(getCommission()).hashCode();
        _hashCode += new Double(getCommission_agent()).hashCode();
        _hashCode += new Double(getVisible_capital()).hashCode();
        _hashCode += getAuto_increase_mc();
        if (getCommissions_list() != null) {
            _hashCode += getCommissions_list().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PammManagerRecordCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "PammManagerRecordCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "group"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "email"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "state"));
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
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "address"));
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
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone_password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "phone_password"));
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
        elemField.setFieldName("zipcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "zipcode"));
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
        elemField.setFieldName("send_reports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "send_reports"));
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
        elemField.setFieldName("commissions_list");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "commissions_list"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "CommissionsList"));
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

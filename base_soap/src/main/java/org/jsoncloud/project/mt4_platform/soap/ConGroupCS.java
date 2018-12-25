/**
 * ConGroupCS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.jsoncloud.project.mt4_platform.soap;

public class ConGroupCS  implements java.io.Serializable {
    private java.lang.String group;

    private int enable;

    private int timeout;

    private int adv_security;

    private java.lang.String company;

    private java.lang.String signature;

    private java.lang.String smtp_server;

    private java.lang.String smtp_login;

    private java.lang.String smtp_password;

    private java.lang.String support_email;

    private java.lang.String templates;

    private int copies;

    private int reports;

    private int default_leverage;

    private double default_deposit;

    private int maxsecurities;

    private int secmargins_total;

    private java.lang.String currency;

    private double credit;

    private int margin_call;

    private int margin_mode;

    private int margin_stopout;

    private double interestrate;

    private int use_swap;

    private int news;

    private int rights;

    private int check_ie_prices;

    private int maxpositions;

    private int close_reopen;

    private int unused_rights;

    private java.lang.String securities_hash;

    private int margin_type;

    private int archive_period;

    private int archive_max_balance;

    private int stopout_skip_hedged;

    public ConGroupCS() {
    }

    public ConGroupCS(
           java.lang.String group,
           int enable,
           int timeout,
           int adv_security,
           java.lang.String company,
           java.lang.String signature,
           java.lang.String smtp_server,
           java.lang.String smtp_login,
           java.lang.String smtp_password,
           java.lang.String support_email,
           java.lang.String templates,
           int copies,
           int reports,
           int default_leverage,
           double default_deposit,
           int maxsecurities,
           int secmargins_total,
           java.lang.String currency,
           double credit,
           int margin_call,
           int margin_mode,
           int margin_stopout,
           double interestrate,
           int use_swap,
           int news,
           int rights,
           int check_ie_prices,
           int maxpositions,
           int close_reopen,
           int unused_rights,
           java.lang.String securities_hash,
           int margin_type,
           int archive_period,
           int archive_max_balance,
           int stopout_skip_hedged) {
           this.group = group;
           this.enable = enable;
           this.timeout = timeout;
           this.adv_security = adv_security;
           this.company = company;
           this.signature = signature;
           this.smtp_server = smtp_server;
           this.smtp_login = smtp_login;
           this.smtp_password = smtp_password;
           this.support_email = support_email;
           this.templates = templates;
           this.copies = copies;
           this.reports = reports;
           this.default_leverage = default_leverage;
           this.default_deposit = default_deposit;
           this.maxsecurities = maxsecurities;
           this.secmargins_total = secmargins_total;
           this.currency = currency;
           this.credit = credit;
           this.margin_call = margin_call;
           this.margin_mode = margin_mode;
           this.margin_stopout = margin_stopout;
           this.interestrate = interestrate;
           this.use_swap = use_swap;
           this.news = news;
           this.rights = rights;
           this.check_ie_prices = check_ie_prices;
           this.maxpositions = maxpositions;
           this.close_reopen = close_reopen;
           this.unused_rights = unused_rights;
           this.securities_hash = securities_hash;
           this.margin_type = margin_type;
           this.archive_period = archive_period;
           this.archive_max_balance = archive_max_balance;
           this.stopout_skip_hedged = stopout_skip_hedged;
    }


    /**
     * Gets the group value for this ConGroupCS.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this ConGroupCS.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the enable value for this ConGroupCS.
     * 
     * @return enable
     */
    public int getEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this ConGroupCS.
     * 
     * @param enable
     */
    public void setEnable(int enable) {
        this.enable = enable;
    }


    /**
     * Gets the timeout value for this ConGroupCS.
     * 
     * @return timeout
     */
    public int getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this ConGroupCS.
     * 
     * @param timeout
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the adv_security value for this ConGroupCS.
     * 
     * @return adv_security
     */
    public int getAdv_security() {
        return adv_security;
    }


    /**
     * Sets the adv_security value for this ConGroupCS.
     * 
     * @param adv_security
     */
    public void setAdv_security(int adv_security) {
        this.adv_security = adv_security;
    }


    /**
     * Gets the company value for this ConGroupCS.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ConGroupCS.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the signature value for this ConGroupCS.
     * 
     * @return signature
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this ConGroupCS.
     * 
     * @param signature
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the smtp_server value for this ConGroupCS.
     * 
     * @return smtp_server
     */
    public java.lang.String getSmtp_server() {
        return smtp_server;
    }


    /**
     * Sets the smtp_server value for this ConGroupCS.
     * 
     * @param smtp_server
     */
    public void setSmtp_server(java.lang.String smtp_server) {
        this.smtp_server = smtp_server;
    }


    /**
     * Gets the smtp_login value for this ConGroupCS.
     * 
     * @return smtp_login
     */
    public java.lang.String getSmtp_login() {
        return smtp_login;
    }


    /**
     * Sets the smtp_login value for this ConGroupCS.
     * 
     * @param smtp_login
     */
    public void setSmtp_login(java.lang.String smtp_login) {
        this.smtp_login = smtp_login;
    }


    /**
     * Gets the smtp_password value for this ConGroupCS.
     * 
     * @return smtp_password
     */
    public java.lang.String getSmtp_password() {
        return smtp_password;
    }


    /**
     * Sets the smtp_password value for this ConGroupCS.
     * 
     * @param smtp_password
     */
    public void setSmtp_password(java.lang.String smtp_password) {
        this.smtp_password = smtp_password;
    }


    /**
     * Gets the support_email value for this ConGroupCS.
     * 
     * @return support_email
     */
    public java.lang.String getSupport_email() {
        return support_email;
    }


    /**
     * Sets the support_email value for this ConGroupCS.
     * 
     * @param support_email
     */
    public void setSupport_email(java.lang.String support_email) {
        this.support_email = support_email;
    }


    /**
     * Gets the templates value for this ConGroupCS.
     * 
     * @return templates
     */
    public java.lang.String getTemplates() {
        return templates;
    }


    /**
     * Sets the templates value for this ConGroupCS.
     * 
     * @param templates
     */
    public void setTemplates(java.lang.String templates) {
        this.templates = templates;
    }


    /**
     * Gets the copies value for this ConGroupCS.
     * 
     * @return copies
     */
    public int getCopies() {
        return copies;
    }


    /**
     * Sets the copies value for this ConGroupCS.
     * 
     * @param copies
     */
    public void setCopies(int copies) {
        this.copies = copies;
    }


    /**
     * Gets the reports value for this ConGroupCS.
     * 
     * @return reports
     */
    public int getReports() {
        return reports;
    }


    /**
     * Sets the reports value for this ConGroupCS.
     * 
     * @param reports
     */
    public void setReports(int reports) {
        this.reports = reports;
    }


    /**
     * Gets the default_leverage value for this ConGroupCS.
     * 
     * @return default_leverage
     */
    public int getDefault_leverage() {
        return default_leverage;
    }


    /**
     * Sets the default_leverage value for this ConGroupCS.
     * 
     * @param default_leverage
     */
    public void setDefault_leverage(int default_leverage) {
        this.default_leverage = default_leverage;
    }


    /**
     * Gets the default_deposit value for this ConGroupCS.
     * 
     * @return default_deposit
     */
    public double getDefault_deposit() {
        return default_deposit;
    }


    /**
     * Sets the default_deposit value for this ConGroupCS.
     * 
     * @param default_deposit
     */
    public void setDefault_deposit(double default_deposit) {
        this.default_deposit = default_deposit;
    }


    /**
     * Gets the maxsecurities value for this ConGroupCS.
     * 
     * @return maxsecurities
     */
    public int getMaxsecurities() {
        return maxsecurities;
    }


    /**
     * Sets the maxsecurities value for this ConGroupCS.
     * 
     * @param maxsecurities
     */
    public void setMaxsecurities(int maxsecurities) {
        this.maxsecurities = maxsecurities;
    }


    /**
     * Gets the secmargins_total value for this ConGroupCS.
     * 
     * @return secmargins_total
     */
    public int getSecmargins_total() {
        return secmargins_total;
    }


    /**
     * Sets the secmargins_total value for this ConGroupCS.
     * 
     * @param secmargins_total
     */
    public void setSecmargins_total(int secmargins_total) {
        this.secmargins_total = secmargins_total;
    }


    /**
     * Gets the currency value for this ConGroupCS.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ConGroupCS.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the credit value for this ConGroupCS.
     * 
     * @return credit
     */
    public double getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this ConGroupCS.
     * 
     * @param credit
     */
    public void setCredit(double credit) {
        this.credit = credit;
    }


    /**
     * Gets the margin_call value for this ConGroupCS.
     * 
     * @return margin_call
     */
    public int getMargin_call() {
        return margin_call;
    }


    /**
     * Sets the margin_call value for this ConGroupCS.
     * 
     * @param margin_call
     */
    public void setMargin_call(int margin_call) {
        this.margin_call = margin_call;
    }


    /**
     * Gets the margin_mode value for this ConGroupCS.
     * 
     * @return margin_mode
     */
    public int getMargin_mode() {
        return margin_mode;
    }


    /**
     * Sets the margin_mode value for this ConGroupCS.
     * 
     * @param margin_mode
     */
    public void setMargin_mode(int margin_mode) {
        this.margin_mode = margin_mode;
    }


    /**
     * Gets the margin_stopout value for this ConGroupCS.
     * 
     * @return margin_stopout
     */
    public int getMargin_stopout() {
        return margin_stopout;
    }


    /**
     * Sets the margin_stopout value for this ConGroupCS.
     * 
     * @param margin_stopout
     */
    public void setMargin_stopout(int margin_stopout) {
        this.margin_stopout = margin_stopout;
    }


    /**
     * Gets the interestrate value for this ConGroupCS.
     * 
     * @return interestrate
     */
    public double getInterestrate() {
        return interestrate;
    }


    /**
     * Sets the interestrate value for this ConGroupCS.
     * 
     * @param interestrate
     */
    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }


    /**
     * Gets the use_swap value for this ConGroupCS.
     * 
     * @return use_swap
     */
    public int getUse_swap() {
        return use_swap;
    }


    /**
     * Sets the use_swap value for this ConGroupCS.
     * 
     * @param use_swap
     */
    public void setUse_swap(int use_swap) {
        this.use_swap = use_swap;
    }


    /**
     * Gets the news value for this ConGroupCS.
     * 
     * @return news
     */
    public int getNews() {
        return news;
    }


    /**
     * Sets the news value for this ConGroupCS.
     * 
     * @param news
     */
    public void setNews(int news) {
        this.news = news;
    }


    /**
     * Gets the rights value for this ConGroupCS.
     * 
     * @return rights
     */
    public int getRights() {
        return rights;
    }


    /**
     * Sets the rights value for this ConGroupCS.
     * 
     * @param rights
     */
    public void setRights(int rights) {
        this.rights = rights;
    }


    /**
     * Gets the check_ie_prices value for this ConGroupCS.
     * 
     * @return check_ie_prices
     */
    public int getCheck_ie_prices() {
        return check_ie_prices;
    }


    /**
     * Sets the check_ie_prices value for this ConGroupCS.
     * 
     * @param check_ie_prices
     */
    public void setCheck_ie_prices(int check_ie_prices) {
        this.check_ie_prices = check_ie_prices;
    }


    /**
     * Gets the maxpositions value for this ConGroupCS.
     * 
     * @return maxpositions
     */
    public int getMaxpositions() {
        return maxpositions;
    }


    /**
     * Sets the maxpositions value for this ConGroupCS.
     * 
     * @param maxpositions
     */
    public void setMaxpositions(int maxpositions) {
        this.maxpositions = maxpositions;
    }


    /**
     * Gets the close_reopen value for this ConGroupCS.
     * 
     * @return close_reopen
     */
    public int getClose_reopen() {
        return close_reopen;
    }


    /**
     * Sets the close_reopen value for this ConGroupCS.
     * 
     * @param close_reopen
     */
    public void setClose_reopen(int close_reopen) {
        this.close_reopen = close_reopen;
    }


    /**
     * Gets the unused_rights value for this ConGroupCS.
     * 
     * @return unused_rights
     */
    public int getUnused_rights() {
        return unused_rights;
    }


    /**
     * Sets the unused_rights value for this ConGroupCS.
     * 
     * @param unused_rights
     */
    public void setUnused_rights(int unused_rights) {
        this.unused_rights = unused_rights;
    }


    /**
     * Gets the securities_hash value for this ConGroupCS.
     * 
     * @return securities_hash
     */
    public java.lang.String getSecurities_hash() {
        return securities_hash;
    }


    /**
     * Sets the securities_hash value for this ConGroupCS.
     * 
     * @param securities_hash
     */
    public void setSecurities_hash(java.lang.String securities_hash) {
        this.securities_hash = securities_hash;
    }


    /**
     * Gets the margin_type value for this ConGroupCS.
     * 
     * @return margin_type
     */
    public int getMargin_type() {
        return margin_type;
    }


    /**
     * Sets the margin_type value for this ConGroupCS.
     * 
     * @param margin_type
     */
    public void setMargin_type(int margin_type) {
        this.margin_type = margin_type;
    }


    /**
     * Gets the archive_period value for this ConGroupCS.
     * 
     * @return archive_period
     */
    public int getArchive_period() {
        return archive_period;
    }


    /**
     * Sets the archive_period value for this ConGroupCS.
     * 
     * @param archive_period
     */
    public void setArchive_period(int archive_period) {
        this.archive_period = archive_period;
    }


    /**
     * Gets the archive_max_balance value for this ConGroupCS.
     * 
     * @return archive_max_balance
     */
    public int getArchive_max_balance() {
        return archive_max_balance;
    }


    /**
     * Sets the archive_max_balance value for this ConGroupCS.
     * 
     * @param archive_max_balance
     */
    public void setArchive_max_balance(int archive_max_balance) {
        this.archive_max_balance = archive_max_balance;
    }


    /**
     * Gets the stopout_skip_hedged value for this ConGroupCS.
     * 
     * @return stopout_skip_hedged
     */
    public int getStopout_skip_hedged() {
        return stopout_skip_hedged;
    }


    /**
     * Sets the stopout_skip_hedged value for this ConGroupCS.
     * 
     * @param stopout_skip_hedged
     */
    public void setStopout_skip_hedged(int stopout_skip_hedged) {
        this.stopout_skip_hedged = stopout_skip_hedged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConGroupCS)) return false;
        ConGroupCS other = (ConGroupCS) obj;
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
            this.enable == other.getEnable() &&
            this.timeout == other.getTimeout() &&
            this.adv_security == other.getAdv_security() &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.smtp_server==null && other.getSmtp_server()==null) || 
             (this.smtp_server!=null &&
              this.smtp_server.equals(other.getSmtp_server()))) &&
            ((this.smtp_login==null && other.getSmtp_login()==null) || 
             (this.smtp_login!=null &&
              this.smtp_login.equals(other.getSmtp_login()))) &&
            ((this.smtp_password==null && other.getSmtp_password()==null) || 
             (this.smtp_password!=null &&
              this.smtp_password.equals(other.getSmtp_password()))) &&
            ((this.support_email==null && other.getSupport_email()==null) || 
             (this.support_email!=null &&
              this.support_email.equals(other.getSupport_email()))) &&
            ((this.templates==null && other.getTemplates()==null) || 
             (this.templates!=null &&
              this.templates.equals(other.getTemplates()))) &&
            this.copies == other.getCopies() &&
            this.reports == other.getReports() &&
            this.default_leverage == other.getDefault_leverage() &&
            this.default_deposit == other.getDefault_deposit() &&
            this.maxsecurities == other.getMaxsecurities() &&
            this.secmargins_total == other.getSecmargins_total() &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            this.credit == other.getCredit() &&
            this.margin_call == other.getMargin_call() &&
            this.margin_mode == other.getMargin_mode() &&
            this.margin_stopout == other.getMargin_stopout() &&
            this.interestrate == other.getInterestrate() &&
            this.use_swap == other.getUse_swap() &&
            this.news == other.getNews() &&
            this.rights == other.getRights() &&
            this.check_ie_prices == other.getCheck_ie_prices() &&
            this.maxpositions == other.getMaxpositions() &&
            this.close_reopen == other.getClose_reopen() &&
            this.unused_rights == other.getUnused_rights() &&
            ((this.securities_hash==null && other.getSecurities_hash()==null) || 
             (this.securities_hash!=null &&
              this.securities_hash.equals(other.getSecurities_hash()))) &&
            this.margin_type == other.getMargin_type() &&
            this.archive_period == other.getArchive_period() &&
            this.archive_max_balance == other.getArchive_max_balance() &&
            this.stopout_skip_hedged == other.getStopout_skip_hedged();
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
        _hashCode += getEnable();
        _hashCode += getTimeout();
        _hashCode += getAdv_security();
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSmtp_server() != null) {
            _hashCode += getSmtp_server().hashCode();
        }
        if (getSmtp_login() != null) {
            _hashCode += getSmtp_login().hashCode();
        }
        if (getSmtp_password() != null) {
            _hashCode += getSmtp_password().hashCode();
        }
        if (getSupport_email() != null) {
            _hashCode += getSupport_email().hashCode();
        }
        if (getTemplates() != null) {
            _hashCode += getTemplates().hashCode();
        }
        _hashCode += getCopies();
        _hashCode += getReports();
        _hashCode += getDefault_leverage();
        _hashCode += new Double(getDefault_deposit()).hashCode();
        _hashCode += getMaxsecurities();
        _hashCode += getSecmargins_total();
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        _hashCode += new Double(getCredit()).hashCode();
        _hashCode += getMargin_call();
        _hashCode += getMargin_mode();
        _hashCode += getMargin_stopout();
        _hashCode += new Double(getInterestrate()).hashCode();
        _hashCode += getUse_swap();
        _hashCode += getNews();
        _hashCode += getRights();
        _hashCode += getCheck_ie_prices();
        _hashCode += getMaxpositions();
        _hashCode += getClose_reopen();
        _hashCode += getUnused_rights();
        if (getSecurities_hash() != null) {
            _hashCode += getSecurities_hash().hashCode();
        }
        _hashCode += getMargin_type();
        _hashCode += getArchive_period();
        _hashCode += getArchive_max_balance();
        _hashCode += getStopout_skip_hedged();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConGroupCS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "ConGroupCS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "group"));
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
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adv_security");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "adv_security"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtp_server");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "smtp_server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtp_login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "smtp_login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smtp_password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "smtp_password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("support_email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "support_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "templates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "copies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "reports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_leverage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "default_leverage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "default_deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxsecurities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "maxsecurities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secmargins_total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "secmargins_total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_call");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_call"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_mode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_stopout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_stopout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interestrate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "interestrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use_swap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "use_swap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("news");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "news"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "rights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("check_ie_prices");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "check_ie_prices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpositions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "maxpositions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("close_reopen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "close_reopen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unused_rights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "unused_rights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securities_hash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "securities_hash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin_type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "margin_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archive_period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "archive_period"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archive_max_balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "archive_max_balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopout_skip_hedged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://plug.ittrendex.com/xmtm/", "stopout_skip_hedged"));
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

package org.jsoncloud.project.mt4platform.po;

import java.util.Date;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.login_token
     *
     * @mbggenerated
     */
    private String loginToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.last_time
     *
     * @mbggenerated
     */
    private Date lastTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.super_admin
     *
     * @mbggenerated
     */
    private Boolean superAdmin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_admin.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.id
     *
     * @return the value of tbl_admin.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.id
     *
     * @param id the value for tbl_admin.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.username
     *
     * @return the value of tbl_admin.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.username
     *
     * @param username the value for tbl_admin.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.password
     *
     * @return the value of tbl_admin.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.password
     *
     * @param password the value for tbl_admin.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.create_time
     *
     * @return the value of tbl_admin.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.create_time
     *
     * @param createTime the value for tbl_admin.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.login_token
     *
     * @return the value of tbl_admin.login_token
     *
     * @mbggenerated
     */
    public String getLoginToken() {
        return loginToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.login_token
     *
     * @param loginToken the value for tbl_admin.login_token
     *
     * @mbggenerated
     */
    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken == null ? null : loginToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.last_time
     *
     * @return the value of tbl_admin.last_time
     *
     * @mbggenerated
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.last_time
     *
     * @param lastTime the value for tbl_admin.last_time
     *
     * @mbggenerated
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.super_admin
     *
     * @return the value of tbl_admin.super_admin
     *
     * @mbggenerated
     */
    public Boolean getSuperAdmin() {
        return superAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.super_admin
     *
     * @param superAdmin the value for tbl_admin.super_admin
     *
     * @mbggenerated
     */
    public void setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.ip
     *
     * @return the value of tbl_admin.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.ip
     *
     * @param ip the value for tbl_admin.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.email
     *
     * @return the value of tbl_admin.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.email
     *
     * @param email the value for tbl_admin.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_admin.real_name
     *
     * @return the value of tbl_admin.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_admin.real_name
     *
     * @param realName the value for tbl_admin.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }
}
package org.jsoncloud.project.mt4platform.po;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.qqnum
     *
     * @mbggenerated
     */
    private String qqnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.login_pwd
     *
     * @mbggenerated
     */
    private String loginPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.login_token
     *
     * @mbggenerated
     */
    private String loginToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.login_overtime
     *
     * @mbggenerated
     */
    private Date loginOvertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.flag
     *
     * @mbggenerated
     */
    private Integer flag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.color
     *
     * @mbggenerated
     */
    private String color;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_from
     *
     * @mbggenerated
     */
    private String userFrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_group_id
     *
     * @mbggenerated
     */
    private Integer userGroupId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.id
     *
     * @return the value of tbl_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.id
     *
     * @param id the value for tbl_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.name
     *
     * @return the value of tbl_user.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.name
     *
     * @param name the value for tbl_user.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.phone
     *
     * @return the value of tbl_user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.phone
     *
     * @param phone the value for tbl_user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.qqnum
     *
     * @return the value of tbl_user.qqnum
     *
     * @mbggenerated
     */
    public String getQqnum() {
        return qqnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.qqnum
     *
     * @param qqnum the value for tbl_user.qqnum
     *
     * @mbggenerated
     */
    public void setQqnum(String qqnum) {
        this.qqnum = qqnum == null ? null : qqnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.email
     *
     * @return the value of tbl_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.email
     *
     * @param email the value for tbl_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.login_name
     *
     * @return the value of tbl_user.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.login_name
     *
     * @param loginName the value for tbl_user.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.login_pwd
     *
     * @return the value of tbl_user.login_pwd
     *
     * @mbggenerated
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.login_pwd
     *
     * @param loginPwd the value for tbl_user.login_pwd
     *
     * @mbggenerated
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.login_token
     *
     * @return the value of tbl_user.login_token
     *
     * @mbggenerated
     */
    public String getLoginToken() {
        return loginToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.login_token
     *
     * @param loginToken the value for tbl_user.login_token
     *
     * @mbggenerated
     */
    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken == null ? null : loginToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.login_overtime
     *
     * @return the value of tbl_user.login_overtime
     *
     * @mbggenerated
     */
    public Date getLoginOvertime() {
        return loginOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.login_overtime
     *
     * @param loginOvertime the value for tbl_user.login_overtime
     *
     * @mbggenerated
     */
    public void setLoginOvertime(Date loginOvertime) {
        this.loginOvertime = loginOvertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.flag
     *
     * @return the value of tbl_user.flag
     *
     * @mbggenerated
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.flag
     *
     * @param flag the value for tbl_user.flag
     *
     * @mbggenerated
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.update_time
     *
     * @return the value of tbl_user.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.update_time
     *
     * @param updateTime the value for tbl_user.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.create_time
     *
     * @return the value of tbl_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.create_time
     *
     * @param createTime the value for tbl_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.remark
     *
     * @return the value of tbl_user.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.remark
     *
     * @param remark the value for tbl_user.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.color
     *
     * @return the value of tbl_user.color
     *
     * @mbggenerated
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.color
     *
     * @param color the value for tbl_user.color
     *
     * @mbggenerated
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_from
     *
     * @return the value of tbl_user.user_from
     *
     * @mbggenerated
     */
    public String getUserFrom() {
        return userFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_from
     *
     * @param userFrom the value for tbl_user.user_from
     *
     * @mbggenerated
     */
    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom == null ? null : userFrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_group_id
     *
     * @return the value of tbl_user.user_group_id
     *
     * @mbggenerated
     */
    public Integer getUserGroupId() {
        return userGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_group_id
     *
     * @param userGroupId the value for tbl_user.user_group_id
     *
     * @mbggenerated
     */
    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }
}
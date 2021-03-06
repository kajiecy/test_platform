package org.jsoncloud.project.mt4platform.po;

public class Group {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_group.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_group.group_name
     *
     * @mbggenerated
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_group.default_leverage
     *
     * @mbggenerated
     */
    private Integer defaultLeverage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_group.id
     *
     * @return the value of tbl_group.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_group.id
     *
     * @param id the value for tbl_group.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_group.group_name
     *
     * @return the value of tbl_group.group_name
     *
     * @mbggenerated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_group.group_name
     *
     * @param groupName the value for tbl_group.group_name
     *
     * @mbggenerated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_group.default_leverage
     *
     * @return the value of tbl_group.default_leverage
     *
     * @mbggenerated
     */
    public Integer getDefaultLeverage() {
        return defaultLeverage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_group.default_leverage
     *
     * @param defaultLeverage the value for tbl_group.default_leverage
     *
     * @mbggenerated
     */
    public void setDefaultLeverage(Integer defaultLeverage) {
        this.defaultLeverage = defaultLeverage;
    }
}
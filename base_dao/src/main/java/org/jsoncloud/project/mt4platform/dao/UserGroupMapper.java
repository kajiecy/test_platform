package org.jsoncloud.project.mt4platform.dao;

import org.jsoncloud.project.mt4platform.po.UserGroup;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_group
     *
     * @mbggenerated
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_group
     *
     * @mbggenerated
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_group
     *
     * @mbggenerated
     */
    UserGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserGroup record);
}
package org.jsoncloud.project.mt4platform.dao;

import org.jsoncloud.project.mt4platform.po.Login;

public interface LoginMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_login
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_login
     *
     * @mbggenerated
     */
    int insert(Login record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_login
     *
     * @mbggenerated
     */
    int insertSelective(Login record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_login
     *
     * @mbggenerated
     */
    Login selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Login record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_login
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Login record);
}
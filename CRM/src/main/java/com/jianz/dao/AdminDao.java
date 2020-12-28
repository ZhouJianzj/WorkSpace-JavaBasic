package com.jianz.dao;

import com.jianz.pojo.Admin;

import java.sql.SQLException;

/**
 * @ClassName AdminDao
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public interface AdminDao {
    Admin checkLogin(String account) throws SQLException;
}

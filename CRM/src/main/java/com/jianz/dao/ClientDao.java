package com.jianz.dao;

import com.jianz.pojo.Client;

import java.sql.SQLException;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public interface ClientDao {
    Client checkLogin(String account) throws SQLException;

}

package com.jianz.service;

import com.jianz.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public interface AdminService {
    ResultEntity checkLogin(String username, String password);
}

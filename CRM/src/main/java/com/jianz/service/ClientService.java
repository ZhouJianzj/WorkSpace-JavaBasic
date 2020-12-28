package com.jianz.service;

import com.jianz.utils.ResultEntity;

/**
 * @ClassName ClientService
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public interface ClientService {
    ResultEntity checkLogin(String username, String password);
}

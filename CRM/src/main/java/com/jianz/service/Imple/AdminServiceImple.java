package com.jianz.service.Imple;

import com.jianz.dao.AdminDao;
import com.jianz.factory.DaoFactory;
import com.jianz.pojo.Admin;
import com.jianz.service.AdminService;
import com.jianz.utils.ResultEntity;

import java.sql.SQLException;

/**
 * @ClassName AdminServiceImple
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class AdminServiceImple implements AdminService {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();
    @Override
    public ResultEntity checkLogin(String username, String password) {
        Admin admin = null;
        ResultEntity resultEntity;
        try {
            admin = adminDao.checkLogin(username);
        } catch (SQLException throwables) {
            System.err.println("根据账号查找管理员信息出现SQL异常");
        }
        if (admin != null) {
            if (password.equals(admin.getPassword())) {
                resultEntity = ResultEntity.builder().code(0).message("登录成功").data(admin).build();
            } else {    //账号存在，密码错误
                resultEntity = ResultEntity.builder().code(1).message("密码错误").build();
            }
        } else {
            resultEntity = ResultEntity.builder().code(2).message("账号不存在").build();
        }
        return resultEntity;
    }
    }


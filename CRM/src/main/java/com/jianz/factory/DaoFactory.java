package com.jianz.factory;

import com.jianz.dao.AdminDao;
import com.jianz.dao.Imple.AdminDaoImple;

/**
 * @ClassName DaoFactory
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class DaoFactory {
    /**
     * 获得AdminDao实例
     */
    public static AdminDao getAdminDaoInstance() {
        return new AdminDaoImple();
    }
}

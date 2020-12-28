package com.jianz.factory;

import com.jianz.service.AdminService;
import com.jianz.service.Imple.AdminServiceImple;

/**
 * @ClassName ServiceFactory
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class ServiceFactory {
    public static AdminService getAdminServiceInstance() {
        return new AdminServiceImple();
    }
}

package com.shy;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName JDBCTest3
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/23
 **/
public class Test{
    public static void main(String[] args) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
        Enumeration<String> keys = resourceBundle.getKeys();

    }
}

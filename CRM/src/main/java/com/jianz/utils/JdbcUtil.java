package com.jianz.utils;

import java.sql.*;

/**
 * @ClassName JDBC
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/

/**
 * JDBC连接工具类，使用了单列模式，封装了连接和关闭方法
 */
public class JdbcUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/crm?useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&serverTimezone=GMT%2B8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static Connection connection = null;
    private static JdbcUtil jdbcUtil = null;

    /**
     * 获取实例
     * @return jdbcUtil实例
     */
    public static JdbcUtil getInitJdbcUtil() {
        if (jdbcUtil == null) {
            //线程加锁
            synchronized (JdbcUtil.class) {
                if (jdbcUtil == null) {
                    //懒汉式加载
                    jdbcUtil = new JdbcUtil();
                }
            }
        }
        return jdbcUtil;
    }

    private JdbcUtil() {
    }

    /**
     * 使用静态代码块，加载驱动，保证注册的时候执行一次
     */
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接
     * @return  Connection
     */
    public Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return connection;

    }

    /**
     * 关闭连接
     */
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Connection connection = JdbcUtil.getInitJdbcUtil().getConnection();
        if (connection != null) {
            System.out.println("连接成功");
        }
    }
}

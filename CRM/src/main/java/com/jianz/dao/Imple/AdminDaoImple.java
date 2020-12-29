package com.jianz.dao.Imple;

import com.jianz.dao.AdminDao;
import com.jianz.pojo.Admin;
import com.jianz.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName AdminDaoImple
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/

    public class AdminDaoImple implements AdminDao {
        @Override
        public Admin checkLogin(String account) throws SQLException {
//            加载驱动
            JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
//            获取连接
            Connection connection = jdbcUtil.getConnection();
//             sql语句
            String sql = "SELECT * FROM `admin` WHERE username = ? ";
            PreparedStatement pstmt = connection.prepareStatement(sql);

            pstmt.setString(1,account);
            ResultSet rs = pstmt.executeQuery();

            Admin admin = null;
            while (rs.next()) {
                String id = rs.getString("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                int type = rs.getInt("type");
                admin = new Admin();
                admin.setId(id);
                admin.setUsername(username);
                admin.setPassword(password);
                admin.setType(type);
            }
            rs.close();
            pstmt.close();
            jdbcUtil.closeConnection();
            return admin;
        }
    }


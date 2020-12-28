package com.jianz.dao.Imple;

import com.jianz.dao.ClientDao;
import com.jianz.pojo.Client;
import com.jianz.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName ClientDaoImple
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class ClientDaoImple implements ClientDao {
    @Override
    public Client checkLogin(String account) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql = "SELECT * FROM `admin` WHERE username = ? ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1,account);
        ResultSet rs = pstmt.executeQuery();
       Client client = null;
        while (rs.next()) {
            String id = rs.getString("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            int type = rs.getInt("type");
            client = new Client();
            client.setId(id);
            client.setUsername(username);
            client.setPassword(password);
            client.setType(type);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return client;
    }
}

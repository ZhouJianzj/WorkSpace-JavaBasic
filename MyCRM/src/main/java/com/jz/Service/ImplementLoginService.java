package Service;

import Entity.login;
import Utils.JdbcUtil;
import jdk.nashorn.internal.ir.IfNode;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName ImplementLoginService
 * @Description TODO
 * @Author
 * @Date 2021/1/4
 **/
public class ImplementLoginService implements loginService {
    @Override
    public Boolean checkedLogin(login login) {
        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = initJdbcUtil.getConnection();
        Statement statement =null;
        ResultSet resultSet =null;
        String sql = "select * from login ";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String useName = resultSet.getString("username");
                String password = resultSet.getString("password");
                String type = resultSet.getString("type");
                System.out.println(useName + " " +password +" "+ type);
                login.setType(type);
                if (useName .equals(login.getUserName())){
                    if (password.equals(login.getPassWord())){
                            return true;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if ( resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            initJdbcUtil.closeConnection();
        }


        return false;
    }

    public static void main(String[] args) {
        ImplementLoginService implementLoginService = new ImplementLoginService();
        implementLoginService.checkedLogin(new login());
    }
}

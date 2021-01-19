package TextClass;

import sun.net.ConnectionResetException;

import java.sql.*;

/**
 * @ClassName DataBase
 * @Description TODO
 *                             数据库语句的使用
 * @Author
 * @Date 2021/1/19
 **/
public class DataBase {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("");
            Statement statement = connection.createStatement();
            String sql = "create database databaseName ";
            String sql1 = "alter database databaseName  Character set UTF-8";
            String sql2 = "Show Engines";

            ResultSet resultSet = statement.executeQuery("");
            while (resultSet.next()){

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

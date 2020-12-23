package Jbdc.ConnTest1;

import sun.security.util.Password;

import java.sql.*;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName JDBCTest3
 * @Description TODO
 *                                  查询结果集的处理   select的例子
 * @Author ZhouJian
 * @Date 2020/12/23
 **/
public class JDBCTest3 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            Class aClass = Class.forName("com.mysql.jdbc.Driver");
            String  url = "jdbc:mysql://127.0.0.1:3306/ZhouJian";
            String user = "root";
            String passWord = "123456";
            connection = DriverManager.getConnection(url,user, passWord);
            statement= connection.createStatement();
            String sql = "select * from student1 ";
//            声明中的executeQuery中的方法是执行的DML语句
            ResultSet resultSet = statement.executeQuery(sql);
//            执行select语句的时候返回的是一个结果集,next()方法是使得指针下移的，获得结果集就像exce表格一样的，next一下就到下一行
            while (resultSet.next()) {
//                里面的参数指的是表格的列  从1开始的
                String sname = resultSet.getString(1);
                String sno = resultSet.getString(2);
//                也可以使用属性的名字
                String sclass = resultSet.getString("sclass");
                System.out.println("名字：" + sname + " " +
                        "编号：" + sno + " " +
                        "班级：" + sclass);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}

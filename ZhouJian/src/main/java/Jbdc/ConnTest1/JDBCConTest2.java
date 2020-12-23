package Jbdc.ConnTest1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName JDBCConTest2
 * @Description TODO
 *                                       使用反射来创建jdbc连接
 * @Author ZhouJian
 * @Date 2020/12/23
 **/
public class JDBCConTest2 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class class1 = Class.forName("com.mysql.jdbc.Driver");
//            其实下面的代买就不学要写了，因为里面的静态代买块已经执行了
            Object o = class1.newInstance();
            Driver dirver = (Driver) o;
            DriverManager.registerDriver(dirver);
//            一直到这里

//            下面的代码可以使用ResourceBundle实现
            String url = "jdbc:mysql://127.0.0.1:3306/ZhouJian";
            String user = "root";
            String passWord = "123456";
            connection = DriverManager.getConnection(url,user,passWord);
            System.out.println(connection);
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            e.printStackTrace();
        }finally{
            if (connection != null) {
                try {
                    connection.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

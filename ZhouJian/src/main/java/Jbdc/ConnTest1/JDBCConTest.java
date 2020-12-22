package Jbdc.ConnTest1;

import com.mysql.cj.jdbc.ConnectionImpl;

import java.sql.*;

/**
 * @ClassName JDBCConTest
 * @Description TODO
 * @Author
 * @Date 2020/12/22
 **/
public class JDBCConTest {
    public static void main(String[] args) {
//        获取驱动
        try {
            //这里是java的接口实现类，实现类就是Sql写的类，接口是java写的接口
            Driver driver = new com.mysql.jdbc.Driver();
            //驱动管理的静态方法  登记表
            DriverManager.registerDriver(driver);

//        建立连接
            String url = "jdbc:mysql://127.0.0.1:3306/ZhouJian";
            String user = "root";
            String passWord = "123456";
            Connection conn = DriverManager.getConnection(url, user, passWord);
            System.out.println(conn);
//        获取数据库操作对象
            //下面的因为意思就是创建一个声明类来执行拼接String类型的SQL语句
            Statement statement = conn.createStatement();
            String sql = "select * from table student;";
            //调用里面的executeQuery方法去执行sql语句
            statement.executeQuery(sql);
//        处理结果集

        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}

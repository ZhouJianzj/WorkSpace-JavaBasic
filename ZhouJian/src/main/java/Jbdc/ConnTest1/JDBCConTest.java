package Jbdc.ConnTest1;


import java.sql.*;
import java.sql.Driver;


/**
 * @ClassName JDBCConTest
 * @Description TODO
 * @Author
 * @Date 2020/12/22
 **/
public class JDBCConTest {
    public static void main(String[] args) throws SQLException {
        //        获取驱动
        Connection conn = null;
        Statement statement = null;
        try {
            //这里是java的接口实现类，实现类就是Sql写的类，接口是java写的接口
              Driver driver = new com.mysql.jdbc.Driver();
            //驱动管理的静态方法  登记表
            DriverManager.registerDriver(driver);

//        建立连接
            String url = "jdbc:mysql://127.0.0.1:3306/ZhouJian";
            String user = "root";
            String passWord = "123456";
            conn = DriverManager.getConnection(url, user, passWord);
            System.out.println(conn);
//        获取数据库操作对象
            //下面的因为意思就是创建一个声明类来执行拼接String类型的SQL语句
             statement = conn.createStatement();

             //jdbc中不需要写分号
            String sql = "insert into student1(sname,age,sclass) value('周健',22,'软件2036') ";
            String sql1 = "delete from student1 where sname = '周健'";
            String sql2 = "Update student1  set sclass = '软件2036' where sclass = '机械' ";
            //调用里面的executeQuery方法去执行sql语句
            //statement.executeQuery(sql);
            //专门执行DML语句的,返回值是int类型表示影响数据库中表的记录条数
            int executeUpdate = statement.executeUpdate(sql2);
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println(executeUpdate);


//        处理结果集

        }catch(SQLException e){
            e.printStackTrace();
        }finally{
//            释放资源，从内到外
            if (statement != null) {
                try {
                    statement.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }

        }

    }
}

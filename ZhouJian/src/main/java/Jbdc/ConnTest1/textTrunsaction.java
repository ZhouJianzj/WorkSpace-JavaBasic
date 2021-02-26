package Jbdc.ConnTest1;

import IO.InputStream.Read;
import com.mysql.cj.protocol.Resultset;

import java.security.cert.TrustAnchor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ClassName textTrunsaction
 * @Description TODO
 * @Author
 * @Date 2021/2/26
 **/
public class textTrunsaction {
//    测试事务
public static void main(String[] args)  {
    Connection connection = null;
    try {
        String sql = null;

        connection = DriverManager.getConnection("");
//    下面就是事务的处理的声明 start transaction
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement = connection.prepareStatement("");
        String sql_one = sql + "...";
        String sql_two = sql + "...";
        try {
//            只要有一个sql语句执行不成功整个事务都算不成功所以要放一起处理异常
            preparedStatement.executeUpdate(sql_one);
            preparedStatement.executeUpdate(sql_two);
//            一个是提交
            connection.commit();
        }catch(SQLException e){
//            有异常的时候就需要被打回，之前备份的文件替换掉修改没有完成的文件
            connection.rollback();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }finally{
//       最后进行关闭连接
    }




}
}

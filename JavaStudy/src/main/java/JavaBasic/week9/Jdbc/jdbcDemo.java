package JavaBasic.week9.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import static java.lang.Class.forName;

/**
 * @ClassName jdbcDemo
 * @Description TODO
 * @Author Zhoujian
 * @Date 2020/12/14
 **/
public class jdbcDemo {
    private final static String JDBC_DRIVER = "";
    private final static String UserName = "";
    private final static String PASSWORD = "";

    public static void main(String[] args) throws SQLException {
        try {
//            加载JDBC驱动
            forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//       建立数据库的连接
        Connection conn = DriverManager.getConnection("");
//        实例化PreparedStatement对象
        Statement statement = conn.createStatement();
//        拼接SQL语句
        String sql = "SELECT * FROM T_STUDNET";
//
    }

}

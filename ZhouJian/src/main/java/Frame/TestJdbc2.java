package Frame;

import java.sql.*;

/**
 * @ClassName TestJdbc2
 * @Description TODO
 * @Author csy
 * @Date 2020-11-8
 */
public class TestJdbc2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet =null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql:///test1", "root", "123456");
            String sql = "INSERT INTO TestUser VALUES('001','zhoujian','123456')";
            String sql1 = "update student set sname='111' where sno='3'";
            String sql2 = "delete from student where sno='3'";
            String sql3 = "select * from student";
            statement = connection.createStatement();
            int count = statement.executeUpdate(sql);
//            resultSet =statement.executeQuery(sql3);
            System.out.println(count);
//            while (resultSet.next()){
//                int sno1 = resultSet.getInt(1);
//                String name=resultSet.getString("sname");
//                double sno2= resultSet.getDouble(1);
//                System.out.println(sno1+"-"+name+"-"+sno2);
//            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

}

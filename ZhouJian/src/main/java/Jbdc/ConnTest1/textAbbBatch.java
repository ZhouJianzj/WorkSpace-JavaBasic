package Jbdc.ConnTest1;

import java.sql.*;

/**
 * @ClassName textAbbBatch
 * @Description TODO
 * @Author
 * @Date 2021/2/26
 **/

//一批一批的先用list集合存储起来最后再一下子执行
public class textAbbBatch {
    public static void main(String[] args) {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String sql = "select id name age from tableName where id = ?";
            Connection connection = DriverManager.getConnection("");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            for (int a = 0;a < 10 ;a++){
                preparedStatement.setString(1,"a");
//                关键点在这里面 像子弹压弹夹一样的最后一家伙的执行
                preparedStatement.addBatch();

            }
            ResultSet resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

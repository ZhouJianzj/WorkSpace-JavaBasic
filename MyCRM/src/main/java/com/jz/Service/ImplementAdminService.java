package Service;

import Utils.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 * @ClassName ImplementAdminService
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class ImplementAdminService implements AdminService {
    public static Vector<Vector<Object>> data = new Vector<>();
    @Override
    public void planTable() {
        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection ;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = initJdbcUtil.getConnection();
            statement = connection.createStatement();
            String sql = "select * from plan";
            resultSet = statement.executeQuery(sql);
//            创建数据，方便JFrame里面的数据model
            while(resultSet.next()){
                Vector<Object> vector = new Vector<>();
                vector.addElement(resultSet.getString(1));
                vector.addElement(resultSet.getString(2));
                vector.addElement(resultSet.getString(3));
                vector.addElement(resultSet.getString(4));
                vector.addElement(resultSet.getString(5));
                vector.addElement(resultSet.getString(6));
                data.addElement(vector);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
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
    }
}

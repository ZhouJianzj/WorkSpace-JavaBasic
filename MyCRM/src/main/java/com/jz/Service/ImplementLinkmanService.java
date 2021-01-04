package Service;

import Utils.JdbcUtil;

import javax.xml.bind.ValidationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 * @ClassName ImplementLinkmanService
 * @Description TODO
 * @Author
 * @Date 2021/1/4
 **/
public class ImplementLinkmanService implements Linkman {
    public static Vector<Vector<Object>> data = new Vector<>();
    @Override
    public void search() {

    }
    public void linkJdbc(){
        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection ;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = initJdbcUtil.getConnection();
            statement = connection.createStatement();
            String sql = "select * from linkman";
            resultSet = statement.executeQuery(sql);
//            创建数据，方便JFrame里面的数据model
            while(resultSet.next()){
                Entity.Linkman linkman = new Entity.Linkman();
                Vector<Object> vector = new Vector<>();
                linkman.setId(resultSet.getInt(1));
                vector.addElement(linkman.getId());
                linkman.setName(resultSet.getString(2));
                vector.addElement(linkman.getName());
                linkman.setDep(resultSet.getString(3));
                vector.addElement(linkman.getDep());
                linkman.setProtype(resultSet.getString(4));
                vector.addElement(linkman.getProtype());
                linkman.setPlanid(resultSet.getInt(5));
                vector.addElement(linkman.getPlanid());
                linkman.setSalary(resultSet.getDouble(6));
                vector.addElement(linkman.getSalary());
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

    public static void main(String[] args) {
        ImplementLinkmanService implementLinkmanService = new ImplementLinkmanService();
        implementLinkmanService.linkJdbc();
    }
}

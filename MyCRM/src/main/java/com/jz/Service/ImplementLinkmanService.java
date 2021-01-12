package Service;

import Utils.JdbcUtil;

import java.sql.*;
import java.util.Vector;

/**
 * @ClassName ImplementLinkmanService
 * @Description TODO
 * @Author
 * @Date 2021/1/4
 **/
public class ImplementLinkmanService implements LinkmanService {
    public static Vector<Vector<Object>> data = new Vector<>();
    @Override
    public void search(String  bianHao) {
        data = new Vector<>();
        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection ;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = initJdbcUtil.getConnection();
            StringBuffer sql = new StringBuffer();
            sql.append("select * from linkman where id = '");
           preparedStatement = connection.prepareStatement(sql.toString());
            sql.append( bianHao +"'" );
            resultSet = preparedStatement.executeQuery(sql.toString());
            while (resultSet.next()){
                Vector<Object> vector = new Vector<>();
                vector.addElement(resultSet.getString(1));
                vector.addElement(resultSet.getString(2));
                vector.addElement(resultSet.getString(3));
                vector.addElement(resultSet.getString(4));
                vector.addElement(resultSet.getString(5));
                vector.addElement(resultSet.getString(6));
                System.out.println(vector.toString());
                data.add(vector);
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
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            initJdbcUtil.closeConnection();
        }
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
                linkman.setId(resultSet.getString(1));
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

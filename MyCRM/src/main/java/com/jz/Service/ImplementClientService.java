package Service;

import Entity.Client_product;
import Utils.JdbcUtil;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 * @ClassName ImplementClientService
 * @Description TODO
 * @Author
 * @Date 2021/1/5
 **/
public class ImplementClientService implements ClientService {
    public  Vector<Vector<Object>> data1 =  new Vector<>();
    public  Vector<Vector<Object>> data = new Vector<>();
    @Override
    public void search(String testSql) {
//        StringBuffer sql = new StringBuffer();
//        sql.append("select * from product where name = '");
//        sql.append(testSql + "'");
//        System.out.println(sql);
//        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
//        Connection connection = initJdbcUtil.getConnection();
//        Statement statement = null;
//        ResultSet resultSet = null;
//        try {
//             statement = connection.createStatement();
//             if (!sql.equals("' '")) {
//                 resultSet = statement.executeQuery(String.valueOf(sql));
//                 while (resultSet.next()) {
//                     Vector<Object> vector = new Vector<>();
//                     vector.add(resultSet.getString(1));
//                     vector.add(resultSet.getString(2));
//                     vector.add(resultSet.getString(3));
//                     vector.add(resultSet.getString(4));
//                     vector.add(resultSet.getString(5));
//                     data.addElement(vector);
//                 }
//             }else {
//                 System.out.println("没有输入");
//             }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                resultSet.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            try {
//                statement.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            initJdbcUtil.closeConnection();
//        }
    }
    /**
     * 建立数据连接
     */
    public void linkJdbc(){
        JdbcUtil initJdbcUtil =null ;
        Connection connection ;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            initJdbcUtil = JdbcUtil.getInitJdbcUtil();
            connection = initJdbcUtil.getConnection();
            statement = connection.createStatement();
            String sql = "select * from  product";
            resultSet  = statement.executeQuery(sql);
            while (resultSet.next()){
                Client_product client_product = new Client_product();
                Vector<Object> vector = new Vector<>();
                client_product.setId(resultSet.getInt("id"));
                vector.addElement(client_product.getId());
                client_product.setName(resultSet.getString("name"));
                vector.addElement(client_product.getName());
                client_product.setProducttime(resultSet.getString("producttime"));
                vector.addElement(client_product.getProducttime());
                client_product.setProducttype(resultSet.getString("producttype"));
                vector.addElement(client_product.getProducttype());
                client_product.setPrice(resultSet.getDouble("price"));
                vector.addElement(client_product.getPrice());
                data.addElement(vector);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            initJdbcUtil.closeConnection();
        }
    }
}

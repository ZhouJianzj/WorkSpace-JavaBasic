package Service;

import Entity.Client_product;
import Utils.JdbcUtil;

import javax.xml.crypto.Data;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.Vector;

/**
 * @ClassName ImplementClientService
 * @Description TODO
 * @Author
 * @Date 2021/1/4
 **/
public class ImplementClientService implements ClientService {
    public static Vector<Vector<Object>> data =  new Vector<>();
    @Override
    public void search() {

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

    public static void main(String[] args) {
        ImplementClientService implementClientService = new ImplementClientService();
        implementClientService.linkJdbc();
    }
}

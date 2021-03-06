package Service.ClientServicePackage;
import Utils.JdbcUtil;



import javax.swing.*;
import java.sql.*;
import java.util.Vector;

/**
 * @ClassName ImplementClientService
 * @Description TODO
 * @Author
 * @Date 2021/1/5
 **/
public class ImplementClientService implements ClientService {
    public static  Vector<Vector<Object>> data = null;
    static private JTable jTable;

    /**
     * 查询表的数据
     *
     * @param testSql
     */
    @Override
    public void search(String testSql) {
        StringBuffer sql = new StringBuffer();
        data = new Vector<>();
        sql.append("select * from product where name = '");
        sql.append(testSql + "'");
        String s = String.valueOf(sql);

        if (!sql.equals("select * from product where name = '' ")) {
            JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
            Connection connection = initJdbcUtil.getConnection();
            Statement Statement = null;
            try {
                Statement = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            ResultSet resultSet1 = null;
            try {
                resultSet1 = Statement.executeQuery(s);
                while (resultSet1.next()) {
                    Vector<Object> vector = new Vector<>();
                    vector.addElement(resultSet1.getString("id"));
                    vector.addElement(resultSet1.getString("name"));
                    vector.addElement(resultSet1.getString("producttime"));
                    vector.addElement(resultSet1.getString("producttype"));
                    vector.addElement(resultSet1.getString("price"));
                    data.add(vector);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (resultSet1 != null) {
                    try {
                        resultSet1.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (Statement != null) {
                    try {
                        Statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                initJdbcUtil.closeConnection();

            }
        } else {
            System.out.println("没有输出");
        }
    }

    /**
     * 商店表的数据
     */
    @Override
    public void linkJdbc() {
        String sql = "select * from  product";
        data = new Vector<>();

        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = initJdbcUtil.getConnection();
        Statement Statement = null;
        try {
            Statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = Statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector<Object> vector = new Vector<>();
                vector.addElement(resultSet.getString("id"));
                vector.addElement(resultSet.getString("name"));
                vector.addElement(resultSet.getString("producttime"));
                vector.addElement(resultSet.getString("producttype"));
                vector.addElement(resultSet.getString("price"));
                data.add(vector);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (Statement != null) {
                try {
                    Statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            initJdbcUtil.getConnection();
        }
    }

    /**
     * 反馈信息的数据存储
     */
    @Override
    public void backInformation(String id, String name, String time, String productid, String solve, String backInfor) {
        data = new Vector<>();
        StringBuffer sql = new StringBuffer();
        sql.append("insert into backinfo(id,name,time,content,proid,solve)  values(?,?,?,?,?,?)");
        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = initJdbcUtil.getConnection();
        PreparedStatement Statement = null;
        try {
            Statement = connection.prepareStatement(String.valueOf(sql));
            Statement.setString(1, id);
            Statement.setString(2, name);
            Statement.setString(3, time);
            Statement.setString(4, productid);
            Statement.setString(5, solve);
            Statement.setString(6, backInfor);

            int resultSet = Statement.executeUpdate();
            //添加的记录
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (Statement != null) {
                try {
                    Statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            initJdbcUtil.getConnection();
        }
    }

    /**
     * 订单存数据
     * @param jTable
     */
    @Override
    public void dingDanTableCun(JTable jTable) {
        ImplementClientService.jTable = jTable;

        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = initJdbcUtil.getConnection();

        //输出数据到table中的语句
        PreparedStatement statement = null;
        try {
            int selectedRow = jTable.getSelectedRow();
            StringBuffer  sql = new StringBuffer();
            sql.append( "insert into dingdan(id,name,protime,protype,price)values(?,?,?,?,?)");
            statement = connection.prepareStatement(String.valueOf(sql));
            for (int a = 0;a < 5; a++){
                //遇见的问题就是这里的行号是从0开始的
                String s = jTable.getValueAt(selectedRow, a).toString();
                statement.setString(a+1,s);
                System.out.println(s);
            }
            //执行返回的是插入的记录条数
            int i1 = statement.executeUpdate();
            System.out.println(i1);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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

    @Override
    public void dingDanTable() {
        data = new Vector<>();
        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = initJdbcUtil.getConnection();
        String sql = "select * from dingDan";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector<Object> vector = new Vector<>();
                vector.addElement(resultSet.getString(1));
                vector.addElement(resultSet.getString(2));
                vector.addElement(resultSet.getString(3));
                vector.addElement(resultSet.getString(4));
                vector.addElement(resultSet.getString(5));
                vector.addElement("删除订单请联系管理员");
                data.addElement(vector);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
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

    /**
     * 删除订单表中选中的数据
     */
    @Override
    public void dingDanTableDelete(JTable table) {
        ImplementClientService.jTable = table;

        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = initJdbcUtil.getConnection();

        PreparedStatement statement = null;
        try {
            StringBuffer  sql = new StringBuffer();
            sql.append( "delete from dingdan where id = ? ");
            statement = connection.prepareStatement(String.valueOf(sql));
            //获取选中的行号，这里只需要where一个条件就好了 就选取id
            int selectedRow1 = table.getSelectedRow();
            String s = table.getValueAt(selectedRow1, 0).toString();
            statement.setString(1,s);

            //执行返回的是插入的记录条数
            int i1 = statement.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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

    @Override
    public void client() {
        data = new Vector<>();
        JdbcUtil initJdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = initJdbcUtil.getConnection();
        String sql = "select * from client";
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Vector<Object> vector = new Vector<>();
                vector.addElement(resultSet.getString(1));
                vector.addElement(resultSet.getString(2));
                vector.addElement(resultSet.getString(3));
                vector.addElement(resultSet.getString(4));
                vector.addElement(resultSet.getString(5));
                vector.addElement(resultSet.getString(6));
                vector.addElement(resultSet.getString(7));
                vector.addElement(resultSet.getString(8));
                data.addElement(vector);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
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


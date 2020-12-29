package com.jianz.dao.Imple;

import com.jianz.pojo.Linkman;
import com.jianz.utils.JdbcUtil;
import sun.awt.SunHints;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 * @ClassName LinnkMan
 * @Description TODO
 * @Author
 * @Date 2020/12/29
 **/
public class LinkMan {
   public ResultSet resultSet = null;
   public Linkman linkman = null;
   public ArrayList list = null;
    public LinkMan(){
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();

        try {
            Statement statement = connection.createStatement();
            String sql = "select * from linkman";
             resultSet = statement.executeQuery(sql);
//              创建一个list集合
             list = new ArrayList();
             while (resultSet.next()){
                 linkman = new Linkman();
                linkman.setId(resultSet.getString("id"));
                linkman.setName(resultSet.getString("name"));
                linkman.setDep(resultSet.getString("dep"));
                linkman.setProtype(resultSet.getString("protype"));
                 linkman.setPlanid(resultSet.getString("planid"));
                 linkman.setSalary(resultSet.getString("salary"));


                 list.add(linkman);
             }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * 测试一下
     * @param args
     */
    public static void main(String[] args) {
        new LinkMan();
    }

}

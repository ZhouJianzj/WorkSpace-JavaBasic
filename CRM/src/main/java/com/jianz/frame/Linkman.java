package com.jianz.frame;

import com.jianz.dao.Imple.LinkMan;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @ClassName Linkman
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class Linkman extends JFrame {
private Object[][] vector1 = null;


    public Linkman()  {
        setBounds(200,200,1200,860);
        setTitle("linkMan");
        Container contentPane = getContentPane();

        //        创建一个表的类型集合
        Vector<String> vector = new Vector<String>();
        vector.add("员工编号");
        vector.add("员工姓名");
        vector.add("部门");
        vector.add("售卖类型");
        vector.add("计划实施表编号");
        vector.add("薪水");
//       创建表格模型
        LinkMan linkMan = new LinkMan();
       vector1 = new Object[linkMan.list.size()][vector.size()];
            for (int a = 0;a < linkMan.list.size();a++){
                for (int b = 0;b < vector.size();b++){

                }
            }

//        DefaultTableModel dtm = new DefaultTableModel(vector1,vector);
//        创建表格
//        JTable jTable = new JTable(dtm);
//        创建滚动面板
//        JScrollPane jScrollPane = new JScrollPane(jTable);
//        contentPane.add(jScrollPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}

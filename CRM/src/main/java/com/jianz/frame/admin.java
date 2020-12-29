package com.jianz.frame;

import sun.security.util.Length;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @ClassName admin
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class admin extends JFrame {
    public admin(){
        setTitle("admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1200,600);
        Container contentPane = getContentPane();
        setLayout(null);


//        创建绑定数据的按钮
        JButton jb = new JButton("员工获取数据");
        jb.setBounds(10,10,100,20);
        contentPane.add(jb);
        setVisible(true);

//       数据导入的事件监听
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Linkman();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        new admin();
    }
}

package com.jianz.frame;

import javax.swing.*;
import java.awt.*;

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
        setLayout(null);
        setBounds(100,100,500,200);
        setVisible(true);
        Container contentPane = getContentPane();
        JButton jButton = new JButton("按钮");
        jButton.setBounds(100,100,100,40);
        contentPane.add(jButton);

    }

    public static void main(String[] args) {
        new admin();
    }
}

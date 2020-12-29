package com.jianz.frame;

import javax.swing.*;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class Client extends JFrame {
    public Client(){
        setTitle("Client");
        setBounds(200,200,1200,860);
        JTable jTable = new JTable();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Client();
    }
}

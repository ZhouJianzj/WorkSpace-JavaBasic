package com.jianz.frame;

import com.jianz.factory.ServiceFactory;
import com.jianz.pojo.Admin;
import com.jianz.utils.ResultEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


/**
 * @ClassName login
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class login extends JFrame {
    JTextField usernameField = new JTextField("用户名");
    JPasswordField passwordField = new JPasswordField("123456");
    JButton 重置Button = new JButton();
    JButton 登录Button = new JButton();
    public login() {
        setTitle("login");
        setBounds(200, 200, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        重置Button.setText("重置");
        登录Button.setText("登录");
        setLayout(null);
        Container contentPane = getContentPane();
        contentPane.add(usernameField);
        usernameField.setBounds(20, 20, 200, 30);
        contentPane.add(passwordField);
        passwordField.setEchoChar('\u2605');
        passwordField.setBounds(20, 70, 200, 30);
        contentPane.add(重置Button);
        重置Button.setBounds(20,120,80,30);
        contentPane.add(登录Button);
        登录Button.setBounds(140,120,80,30);
        setVisible(true);

    }
    public void actionEvent() {
        //        对按钮添加事件
            登录Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = usernameField.getText().trim();
                    String password = passwordField.getText().trim();
                    ResultEntity resultEntity = ServiceFactory.getAdminServiceInstance().checkLogin(username, password);
                    Admin admin = (Admin) resultEntity.getData();
                    JOptionPane.showMessageDialog(passwordField.getParent(), resultEntity.getMessage());
                        switch (admin.getType()) {
                            case 0:
                                login.this.dispose();
                                new admin();
                                break;
                            case 1:
                                login.this.dispose();
                                try {
                                    new Linkman();
                                } catch (SQLException ex) {
                                    ex.printStackTrace();
                                }
                                break;
                            case 2:
                                login.this.dispose();
                                new Client();
                                break;
                        }

                        usernameField.setText("");
                        passwordField.setText("");

                }
            });

            重置Button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    usernameField.setText("");
                    passwordField.setText("");
                }
            });
        }

    public static void main(String[] args) {
        login login = new login();
        login.actionEvent();
    }

}
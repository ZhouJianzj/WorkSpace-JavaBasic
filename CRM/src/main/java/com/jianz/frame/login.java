package com.jianz.frame;

import com.jianz.factory.ServiceFactory;
import com.jianz.pojo.Admin;
import com.jianz.utils.ResultEntity;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @ClassName login
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class login extends JFrame {
    private JPanel mainPanel;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton 登录Button;
    private JButton 重置Button;
    public login(){
       setTitle("login");
       setBounds(200,200,666,666);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

//        对按钮添加事件
        登录Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = passwordField.getText().trim();
                ResultEntity resultEntity = ServiceFactory.getAdminServiceInstance().checkLogin(username, password);
                Admin admin = (Admin) resultEntity.getData();
                JOptionPane.showMessageDialog(mainPanel, resultEntity.getMessage());
                if (resultEntity.getCode() == 0) {
                    switch (admin.getType()) {
                        case 0:
                            login.this.dispose();
                            new admin();
                            break;
                        case 1:
                            login.this.dispose();
                            new Linkman();
                            break;
                        case 2:
                            login.this.dispose();
                            new Client();
                            break;
                    }
                } else {
                    usernameField.setText("");
                    passwordField.setText("");
                }
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
        new login();
    }
}
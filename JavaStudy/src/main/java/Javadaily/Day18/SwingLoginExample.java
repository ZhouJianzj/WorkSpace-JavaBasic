package Javadaily.Day18;

import sun.security.util.Password;

import javax.swing.*;
import java.lang.management.ManagementFactory;

/**
 * @ClassName SwingLoginExample
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/8
 **/
public class SwingLoginExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Example");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel jPanel){
        jPanel.setLayout(null);
        JLabel userLabel = new JLabel("user");
        userLabel.setBounds(10,20,80,25);
        jPanel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        jPanel.add(userText);

        JLabel passWordLabel = new JLabel("Password");
        passWordLabel.setBounds(10,50,80,25);
        jPanel.add(passWordLabel);

        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(100,50,165,25);
        jPanel.add(passwordField);

        JButton LoginButton = new JButton("Login");
        LoginButton.setBounds(10,80,80,25);
        jPanel.add(LoginButton);
    }
}

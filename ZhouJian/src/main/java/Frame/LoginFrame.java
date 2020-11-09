package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.omg.CORBA.ORB.init;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author
 * @Date 2020/11/9
 **/
public class LoginFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel lastPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel logo;
    private JPanel login;
    private JButton button1;
    private JButton button2;
    private JLabel liveshow;
    private JButton denglu;
    private JTextField textField1;
    private JPasswordField passwordField1;

    public LoginFrame (){
        init();
        denglu.addActionListener(e ->{
            LoginService ll = new LoginService();
            String account = textField1.getText();
            char[] password = passwordField1.getPassword();
            String passString = new String(password);
            boolean result = ll.login(account,passString);
            if(result){
                JOptionPane.showMessageDialog(null,"傻逼方鹏已就位！");
                LoginFrame.this.dispose();
            }
        });
    }

    private void init(){
        setTitle("LoginFrame"   );
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }





 }


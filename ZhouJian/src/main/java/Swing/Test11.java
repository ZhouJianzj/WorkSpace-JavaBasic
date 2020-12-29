package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @ClassName Test11
 * @Description TODO
 * @Author
 * @Date 2020/12/29
 **/
public class Test11 extends JFrame {
    public Test11(){
        setTitle("JPassword");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(20,20,220,220);
        Container cp = getContentPane();
        cp.setBackground(Color.BLACK);
        setLayout(new FlowLayout());

//      设置输入的密码最大长度为20
        JPasswordField jpf = new JPasswordField(10);
//        设置回显字符
        jpf.setEchoChar('\u2605');
        cp.add(jpf);
        jpf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        JButton jb = new JButton("登录");
        cp.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] password = jpf.getPassword();

                if ("123456".equals(new String(password))){
                   JDialog jdi = new JDialog();
                   jdi.setBounds(10,10,100,100);
//                   jdi.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
                   jdi.setTitle("登录成功！");
                   JLabel success = new JLabel("登录成功");
                   jdi.getContentPane().add(success);
                   jdi.setVisible(true);
               }else{
                   JDialog jdi = new JDialog();
                    jdi.setBounds(10,10,100,100);
//                    jdi.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
                    jdi.setTitle("登录失败！");
                   JLabel  falied= new JLabel("登录失败");
                   jdi.getContentPane().add(falied);
                   jdi.setVisible(true);
               }
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        new Test11();
    }
}

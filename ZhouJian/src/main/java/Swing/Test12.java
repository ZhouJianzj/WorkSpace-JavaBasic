package Swing;

import org.omg.CORBA.SetOverrideType;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Test12
 * @Description TODO
 *                      文本域
 * @Author
 * @Date 2020/12/29
 **/
public class Test12 extends JFrame {
    public Test12(){
        setTitle("JTextArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10,10,200,200);
        Container cp = getContentPane();
        cp.setBackground(Color.BLACK);
        setLayout(new FlowLayout());

        JTextArea jt =new JTextArea(10,10);
        jt.setText("请输入！");
        jt.setFont(new Font("楷体",Font.BOLD,15));
        cp.add(jt);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test12();
    }
}

package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Test06
 * @Description TODO
 * @Author
 *                          网格布局
 * @Date 2020/12/29
 **/
public class Test06 extends JFrame {
    public Test06(){
        setBounds(200,200,200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new GridLayout(5,5,5,5));
        Container contentPane = getContentPane();
        for (int a =1;a<=50;a++){
            contentPane.add(new JButton("按钮" + a));
        }
    }

    public static void main(String[] args) {
        new Test06();
    }
}

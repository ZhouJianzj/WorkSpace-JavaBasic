package Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @ClassName Test04
 * @Description TODO
 * @Author
 * @Date 2020/12/28
 **/
public class Test04 extends JFrame {
    public Test04(){
        setTitle("Icon");
        setBounds(200,200,500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
//        图片是放在JLabel中
        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("img/1.jpg"));
        contentPane.add(jLabel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test04();
    }
}

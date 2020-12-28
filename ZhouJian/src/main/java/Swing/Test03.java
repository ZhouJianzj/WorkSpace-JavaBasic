package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Test03
 * @Description TODO
 *                      标签的字体\颜色\内容设置
 * @Author
 * @Date 2020/12/28
 **/
public class Test03 extends JFrame {
    public Test03(){
        setBounds(200,200,500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Container contentPane = getContentPane();
        JLabel jLabel = new JLabel("这是一个标签!");
        contentPane.add(jLabel);
//        设置标签
        jLabel.setText("这是一个修改后的标签!");
//        获取标签
        System.out.println(jLabel.getText());
//        设置字体
        jLabel.setFont(new Font("楷体",Font.BOLD,15));
//        设置字体的颜色
        jLabel.setForeground(Color.blue);
    }

    public static void main(String[] args) {
        new Test03();
    }
}

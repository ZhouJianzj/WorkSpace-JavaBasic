package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Test08
 * @Description TODO
 *                          下拉框的学习
 *                              三种方式创建下拉框
 * @Author
 * @Date 2020/12/29
 **/
public class Test08 extends JFrame {
    public Test08(){
        setTitle("comBox下拉框");
        setBounds(20,20,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
//        设置下拉框值的第一种方法
        String[] itmes  = {"我","你","他","她"};
        JComboBox<String> jComboBox = new JComboBox<>(itmes);

//        设置下拉框可编辑的
        jComboBox.setEditable(true);
        jComboBox.setBounds(30,30,100,20);

        Container contentPane = getContentPane();
        contentPane.add(jComboBox);
//        contentPane.setBackground(Color.BLACK);

        JButton jButton = new JButton("确定");
        jButton.setBounds(150,30,100,30);
        contentPane.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("获取元素的下标：" + jComboBox.getSelectedIndex());
                System.out.println("获取元素的值：" + jComboBox.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        new Test08();
    }
}

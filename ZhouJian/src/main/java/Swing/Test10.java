package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Test10
 * @Description TODO
 *                  JTestField  文本框
 *
 * @Author
 * @Date 2020/12/29
 **/
public class Test10 extends JFrame {
        public Test10(){
            setTitle("JTestField");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(20,20,220,220);
            setLayout(null);
            Container cp = getContentPane();
            cp.setBackground(Color.BLACK);

            JTextField jTextField = new JTextField();
            jTextField.setText("Please Input ！");
//            表示可以输的字符个数
            jTextField.setColumns(10);
            jTextField.setBounds(10,10,100,30);
            cp.add(jTextField);


//           添加监听事件来获取输入框的文字
            JButton jButton = new JButton("确定");
            jButton.setBounds(10,50,80,30);
            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(jTextField.getText());

                }
            });
            JButton jButton1 = new JButton("重置");
            jButton1.setBounds(100,50,80,30);
            jButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    表示的是对JTextLabel 进行清空处理
                    jTextField.setText("");
//                    表示的就是移除之后的鼠标还在输入框中
                    jTextField.requestFocus();
                }
            });
            cp.add(jButton);
            cp.add(jButton1);
            setVisible(true);
        }

    public static void main(String[] args) {
        new Test10();
    }
}

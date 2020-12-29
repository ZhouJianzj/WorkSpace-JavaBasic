package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Test05
 * @Description TODO
 * @Author
 * @Date 2020/12/29
 **/
public class Test05 extends JFrame {
    public Test05(){
        setTitle("AA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(22,20,400,400);
        setVisible(true);
        setLayout(new BorderLayout());
        Container contentPane = getContentPane();
        contentPane.add(new JButton("center"),BorderLayout.CENTER);
        contentPane.add(new JButton("West"),BorderLayout.WEST);
        contentPane.add(new JButton("North"),BorderLayout.NORTH);
        contentPane.add(new JButton("East"),BorderLayout.EAST);
        contentPane.add(new JButton("south"),BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Test05();
    }
}

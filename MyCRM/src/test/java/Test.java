package test.java;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @ClassName Test
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/
public class Test extends JFrame {
    public Test(){
        super("小熊" );
        setLocationRelativeTo(null);
        setSize(500,500);
//        设置一下图标
        URL resource = Test.class.getClassLoader().getResource("pic1.jpg");
        Image image = new ImageIcon(resource).getImage();
        setIconImage(image);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
    new Test();
    }
}

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
        URL url = Test04.class.getResource("src/main/java/Swing/img-1604549008355ae5281e2e76450ec60d656ce895d9002.jpg");

        Icon icon = new ImageIcon(url.getPath());
        JLabel jLabel = new JLabel();
        jLabel.setIcon(icon);
        contentPane.add(jLabel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test04();
    }
}

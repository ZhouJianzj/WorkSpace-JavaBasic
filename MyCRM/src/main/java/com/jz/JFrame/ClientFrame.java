package JFrame;

import javax.swing.*;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/
public class ClientFrame extends JFrame {
    public ClientFrame(){
        setTitle("个人中心");
        setBounds(20,20,800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClientFrame();
    }
}

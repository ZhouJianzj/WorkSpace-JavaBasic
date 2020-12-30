package JFrame;

import javax.swing.*;

/**
 * @ClassName Linkman
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/

/**
 * 设计的理念
 *      1、员工自己登录成功之后会跳转到的界面
 *      2、可以看见自己的信息
 *      3、可以看见自己客户的信息
 */
public class LinkmanFrame extends JFrame {
    public LinkmanFrame(){
        setTitle("个人中心");
        setBounds(20,20,800,800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LinkmanFrame();
    }
}

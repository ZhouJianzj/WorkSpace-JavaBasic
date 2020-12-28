package Swing;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;

/**
 * @ClassName SwingTestJFrame
 * @Description TODO
 *                      创建窗口
 * @Author
 * @Date 2020/12/28
 **/
public class SwingTestJFrame {
    /**
     * 下面的方法可以全部写到构造方法中
     * @param args
     */
    public static void main(String[] args) {
//       创建一个窗口，设置窗口标题
        JFrame jFrame = new JFrame("window");
//        设置是否可见的
        jFrame.setVisible(true);
//        设置打开的时候的大小和位置
        jFrame.setBounds(200,200,500,300);
//        点击关闭后的状态
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        获取窗体容器
        Container container = jFrame.getContentPane();
//        设置窗体容器的背景
        container.setBackground(Color.YELLOW);
//        往容器中添加别的标签组件
        JLabel j = new JLabel("你好！");
//        添加组件
        container.add(j);
//        移除组件
        container.remove(j);
//        移除完需要验证一下子
        container.validate();
//        设置窗体不可以改变大小
        jFrame.setResizable(false);
    }
}
class MyJFrame extends JFrame{
    public MyJFrame(){
        setTitle("窗体！");
        setVisible(true);
        setBounds(200,200,500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.add(new JLabel("你好！"));
        setResizable(false);
    }

    public static void main(String[] args) {
        new MyJFrame();
    }
}
package Javadaily.Day18;

import javax.swing.*;

/**
 * @ClassName HelloWorldSwing
 * @Description TODO
 * HelloWorld窗体程序
 *  创建并显示GUI,出于线程安全的考虑
 *  这个方法在事件调用线程中调用
 * @Author
 * @Date 2020/11/8
 **/
public class HelloWorldSwing {
    private static void creatAndShowGUI(){
//        确保一个漂亮的外观
        JFrame.setDefaultLookAndFeelDecorated(true);
//        船舰及设置窗口
        JFrame frame =new JFrame("Hello World Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        添加HelloWorld标签
        JFrame label = new JFrame("Hello World");
        frame.getContentPane().add(label);
//        显示窗口
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
//        显示GUI窗口
        javax.swing.SwingUtilities.invokeLater(HelloWorldSwing::creatAndShowGUI);
    }
}

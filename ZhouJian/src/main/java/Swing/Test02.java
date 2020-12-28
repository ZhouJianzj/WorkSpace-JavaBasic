package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @ClassName Test02
 * @Description TODO
 *                      创建Dialog 里面放置一个JLable
 *                      然后再把Dialog放到JFrame中，JFrame中的一个JButton
 *                      添加监听事件来触发Dialog
 * @Author
 * @Date 2020/12/28
 **/
public class Test02 extends JDialog{
    public Test02(JFrame jFrame) {
//        使其对话框阻塞JFrame
        /**
         * 第一个参数:父窗口
         * 第二个参数:对话框的标题
         * 应许阻塞:true
         */
        super(jFrame,"Dialog",true );
        Container contentPane = getContentPane();
        contentPane.add(new JLabel("你好"));
        setBounds(200,200,200,200);
        contentPane.setBackground(Color.BLACK);
        setVisible(true);
        setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(400,400,200,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//          新建一个按钮
        JButton jButton = new JButton("点击到JDialog");
//        获取容器
        Container contentPane = jFrame.getContentPane();
//        往容器中添加按钮
        contentPane.add(jButton);
        jFrame.setVisible(true);
//        设置容器里面为流式布局
        contentPane.setLayout(new FlowLayout());
//        为JButton设置监听事件
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Test02(jFrame);
            }
        });
    }
}

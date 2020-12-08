package JavaBasic.week8.Work;

import com.sun.org.apache.xml.internal.security.Init;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName NumberFrame
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/8
 **/
public class NumberFrame extends JFrame implements ActionListener {
    private  JButton pauseBtn ,resumeBtn;
    private NumberThread numberThread;
    public NumberFrame(){
        init();
        setTitle("线程的暂停与恢复");
        setSize(500,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void init() {
        pauseBtn = new JButton("暂停");
        resumeBtn = new JButton("恢复");
        pauseBtn.addActionListener(this);
        resumeBtn.addActionListener(this);
        JLabel numberLabel = new JLabel();
        Font font = new Font("微软雅黑", Font.BOLD , 50);
        numberLabel.setFont(font);
        setLayout(new FlowLayout(FlowLayout.CENTER,30,100));
        add(numberLabel);
        add(pauseBtn);
        add(resumeBtn);
        numberThread = new NumberThread();
        numberThread.setNumLabel(numberLabel);
        Thread thread = new Thread(numberThread );
        thread.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pauseBtn   ){
            numberThread.pauseThread();
        }
        if (e.getSource() == resumeBtn){
            numberThread.resumeThread();
        }
    }
    public static void main(String[] args){
        new NumberFrame();
    }
}

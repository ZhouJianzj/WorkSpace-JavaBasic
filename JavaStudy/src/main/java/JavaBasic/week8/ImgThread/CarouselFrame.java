package JavaBasic.week8.ImgThread;

import com.sun.org.apache.xml.internal.security.Init;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName CarouselFrame
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/7
 **/
public class CarouselFrame  extends JFrame{
    private JLabel titleLabel;
    private JLabel bgLabel;
    private JLabel timeLabel;
    public CarouselFrame(){
       Init();
        setTitle("CarouselFrame");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private  void Init(){



        bgLabel = new JLabel();
       ImageThread ct = new ImageThread();
        ct.setBgLabel(bgLabel);
        new Thread(ct).start();
        this.getContentPane().add(bgLabel, BorderLayout.CENTER);
//        时间线程后标签
        timeLabel = new JLabel( );
        timeLabel.setFont(new Font("微软雅黑",Font.BOLD,24));
        this.getContentPane().add(timeLabel,BorderLayout.SOUTH );
        TimeThread tt = new TimeThread();
        tt.setTimeLabel(timeLabel);
        new Thread(tt).start();


        titleLabel = new JLabel();
        titleLabel.setFont(new Font("微软雅黑",Font.BOLD,24));
        this.getContentPane().add(titleLabel,BorderLayout.NORTH);
        TitleThread titleThread = new TitleThread();
        titleThread.setTitleLabel(titleLabel);
        new Thread(titleThread).start();
    }
    public static void main (String[] args){
        new CarouselFrame();
    }
}

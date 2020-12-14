package JavaBasic.week9;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

/**
 * @ClassName WindowsTime
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class WindowsTime extends JFrame implements ActionListener {
    JTextField text;
    JButton bStart,bStop,bCountine;
    Timer time;

    WindowsTime(){
        time = new Timer(1000,this);
        text = new JTextField(10);
        bStart = new JButton("开始");
        bStop = new JButton("暂停");
        bCountine = new JButton("继续");
        bStart.addActionListener(this);
        bStart.addActionListener(this);
        bCountine.addActionListener(this);
        setLayout(new FlowLayout());
        add(bStart);
        add(bStop);
        add(bCountine);
        add(text);
        setSize(400,400);
        validate();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == time){
            LocalTime localTime = LocalTime.now();
            String timeSrc = localTime.getHour() + ":" + localTime.getMinute() +":" + localTime.getSecond();
            text.setText(timeSrc);
        }else if (e.getSource() == bStart){
            time.start();
        }else if(e.getSource() == bStop){
            time.stop();
        }else if (e.getSource() == bCountine){
            time.restart();
        }
    }
}
class Test{
    public static void main(String[] args) {
       WindowsTime time = new WindowsTime();
        time.setTitle("计时器");
    }
}
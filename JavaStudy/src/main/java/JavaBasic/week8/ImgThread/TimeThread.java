package JavaBasic.week8.ImgThread;

import javax.swing.*;
import java.net.Inet4Address;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @ClassName TimeThread
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/7
 **/
public class TimeThread implements Runnable{
    private  JLabel timeLabel;
    public void setTimeLabel(JLabel timeLabel){
        this.timeLabel = timeLabel;
    }
    @Override
    public void run() {
        while (true){
            Date date = new Date();
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
            timeLabel.setText(s.format(date));
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

package Service.ClientServicePackage;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @ClassName TimeThread
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class TimeThread implements Runnable {
    private JLabel timeLable;
    public TimeThread(){}
    public TimeThread(JLabel timeLable){
        this.timeLable = timeLable;
        timeLable.setFont(new Font("微软雅黑", Font.BOLD,22));
        timeLable.setForeground(Color.BLACK);
    }

    @Override
    public void run() {
        while(true) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒", Locale.SIMPLIFIED_CHINESE);

            String format = simpleDateFormat.format(date);
            timeLable.setText(format);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

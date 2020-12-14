package JavaBasic.week9;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;
import java.util.TimerTask;

/**
 * @ClassName ClockFrame
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class ClockFrame extends JFrame  {
    private JLabel timeLabel;
    private JPanel timePanel;
    private TimerTask timerTask;
    private Timer timer;
       public ClockFrame(){
           init();
           setTitle("闹钟窗体");
           setSize(new Dimension(400,400));
           setLocationRelativeTo(null);
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       }
       public void init(){
           timeLabel = new JLabel();
//           创建一个带背景图的面板
           timePanel = new JPanel(){
               @Override
               protected void paintComponent(Graphics g) {
//                   绘制背景图

                   try {
                       Image bg = ImageIO.read(new File("C:\\Users\\Administrator\\Pictures\\311086759.jpg"));
                       g.drawImage(bg,0,0,getWidth(),getHeight(),null);

                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
           };
           Font font = new Font("微软雅黑",Font.BOLD,20);
           timeLabel.setFont(font);
           timePanel.setPreferredSize(new Dimension(200,200));
           timePanel.add(timeLabel);
           add(timePanel);
           timerTask  = new TimerTask() {
               @Override
               public void run() {
                   Date date = new Date();
                   SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                   String timeString = adf.format(date);
                   timeLabel.setText(timeString);
                   if("2020-12-14 14:29:00".equals(timeString)){
                       JOptionPane.showMessageDialog(timePanel,"第一个闹钟时间到了");

                   }
                   if ("2020-12-14 14:28:00".equals(timeString)){
                       JOptionPane.showMessageDialog(timePanel,"第二个闹钟时间到了");
                       this.cancel();
                   }
               }
           };
       }
}
class Test1{
    public static void main(String[] args) {
        new ClockFrame();
    }
}
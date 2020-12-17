package ThreadStudy.TimerTest;

import IO.InputStream.FileInputStreamOrOutputStream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName TimerTest1
 * @Description TODO
 *                              定时器
 *                                  间隔一定时间执行某种操作
 * @Author ZhouJian
 * @Date 2020/12/16
 **/
public class TimerTest1 {
    public static void main(String[] args)  {
        Timer timer = new Timer();
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startTime = null;
        try {
            startTime = sdm.parse("2020-12-17 00:24:40");
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        schedule 表示课程表的意思，里面的参数表示需要执行的timer定时器任务，从什么时间开始，间隔多少秒
        timer.schedule(new MyTimer(),startTime,2000);
    }
}
class MyTimer extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat sdm = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        String noTime = sdm.format(new Date());
        System.out.println(noTime + "备份完成！");
    }
}

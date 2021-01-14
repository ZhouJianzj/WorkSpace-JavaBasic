package IO.OutputStream;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName SimpleLogTxt
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class SimpleLogTxt {
    public SimpleLogTxt (){
    }
    public void log(String msg){
        try {
//            创建输出的路径
            PrintStream p = new PrintStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Log.txt",true));
//            改变输出路径
            System.setOut(p);
//            获取当前的时间
            Date date = new Date();
//            选择时间格式
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
//            设置时间格式并以string类型输出
            String format = s.format(date);
//            输出字符串到指定的文件夹
            System.out.println(format + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


        public static void main(String[] args) {
            SimpleLogTxt print = new SimpleLogTxt();
            print.log("这是一个日志的基本框架");
        }
    }


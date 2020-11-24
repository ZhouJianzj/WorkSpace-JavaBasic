package Package.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Date
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/24
 **/
public class Date02 {
    public static void main(String[] args) {
//        new Date（）后面可以更参数代表在1970-1-1之后加1毫秒
//        也就是Date的秒构造器
        Date date = new Date(1);
        SimpleDateFormat sbf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        String time = sbf.format(date);
        System.out.println(time);


//        获取昨天这个时候的时间
        Date time01 = new Date(System.currentTimeMillis() - 1000* 60 *60 * 24);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        String yesToday01 = sdf.format(time01);
        System.out.println(yesToday01);
    }
}

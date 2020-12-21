package Package.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Date01
 * @Description TODO
 * @Author
 * @Date 2020/11/23
 **/
public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date  = new Date();
//        这里的toString已经重写了，但是不符合国人的习惯
        System.out.println(date);
//        接下来我们就重写以下Date下的toString，符合国人的习惯
//            可惜了这样不行
//        所以采取下面的方法来解决

        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        System.out.println(sdf.format(date));

//        String转换成Date类型
        String date1 = "2020-12-11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
//        这里会报异常
        System.out.println(simpleDateFormat.parse(date1));

//      这里的方法时得到19700101到现在的秒数，目的是为了给程序计时
                long time = System.currentTimeMillis();
                System.out.println(time);
//        见下一个class
                }
                }

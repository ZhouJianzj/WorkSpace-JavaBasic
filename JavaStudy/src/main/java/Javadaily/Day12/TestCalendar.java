package Javadaily.Day12;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TestCanlendar
 * @Description 测试日历类
 * 在Calender 类中，月份的表示 是以0-11代表1-12
 * @Author ZhouJian
 * @Date 2020/11/1
 **/
public class TestCalendar {
    public static void main(String[] args) {
//        创建Calendar对象
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar call = Calendar.getInstance();
        call.set(Calendar.YEAR,2011);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar cal2 = Calendar.getInstance();
        System.out.println(year + "年" +month + "月" + dayOfMonth + "日");

//        加2天
        cal2.add(Calendar.DAY_OF_MONTH,2);
//        减去三天
        cal2.add(Calendar.YEAR,-3);
        System.out.println(year + "年" + month + "月" + dayOfMonth + "日");

        Calendar cal3 = Calendar.getInstance();
        Date date = cal3.getTime();
        System.out.println(date);
    }
}

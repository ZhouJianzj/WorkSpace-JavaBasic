package Javadaily.Day09;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Date;

/**
 * @ClassName LocalDateTest
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/29
 **/
public class LocalDateTest {
    public static void main(String[] args){
//        getCurrentDate();
        getDetailDate();
    }

    /**
     * 获取今天的日期
     */
    public static void getCurrentDate(){
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local Date " + today);
//        这个是作为对比
        Date data = new Date();
        System.out.println(data);
        System.out.println("*****************");
        getDetailDate();
        System.out.println("*****************");
        handleSpecialDate();
        System.out.println("*****************");
        compareDate();
        System.out.println("******************");
        cycleDate();
    }
    /**
     * 获取年月日
     */
    public static void getDetailDate(){
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.printf("year : %d Month :%d Day : %d t %n",year,month,day );

    }
    /**
     * 特定的日期
     */
    public static void handleSpecialDate(){
        LocalDate dateOfBirth = LocalDate.of(2018,10,21);
        System.out.println("the special date is :" + dateOfBirth);
    }

    /**
     * 判断 两个日期是否相等
     */
    public static void  compareDate(){
        LocalDate today = LocalDate.now();
        LocalDate date1 = LocalDate.of(2018,01,02);
        if (date1.equals(today)){
            System.out.printf("TODAY  %s and DATE1 %s are same date %n ",today,date1 );

        }
    }

    /**
     * 处理周期性的日期
     */
    public static void cycleDate(){
    LocalDate today = LocalDate.now();
    LocalDate dateOfBirth = LocalDate.of(1999,7,26);
    MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(),dateOfBirth.getDayOfMonth());
    MonthDay currentMonthDay = MonthDay.from(today);
    if(currentMonthDay == birthday){
        System.out.println(" this day is your birthday Happy Birthday To Your!");
    }else{
        System.out.println("Today is not your Birthday!");
    }

    }
}

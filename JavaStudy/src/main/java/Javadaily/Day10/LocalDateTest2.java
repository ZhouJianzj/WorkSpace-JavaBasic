package Javadaily.Day10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @ClassName LocalDateTest2
 * @Description      *********************重点     **日期的操作
 * @Author ZhouJian
 * @Date 2020/10/30
 **/

/**
 * 获取当前的时间
 */
public class LocalDateTest2 {
    public static void getCurrentTime(){
        LocalTime time = LocalTime.now();
        System.out.println("Local time now :" + time );
    }

    /**
     * 增加小时
     */
    public static void plusHour(){
        LocalTime time = LocalTime.now();
        //增加两个小时
        LocalTime newTime = time.plusHours(2);
    }

    /**
     * 如何计算一周后的日期
     *
     */
    public static void nextWeek() {
        LocalTime time = LocalTime.now();
        LocalTime newTime = time.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is :" + time);
        System.out.println("Date after 1 week :" + newTime);
    }


    /**
     * 计算一年前或一年后的日期
     */
        public static void minusDate(){}

    /**
     * 时钟类
     */
    public static void clock(){
//        根据系统时间返回当前时间并且设置为UTC
        Clock clock = Clock.systemUTC();
        System.out.println("Clock :" + clock);
//        根据系统时钟区域返回时间
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : "+ clock);
    }

    /**
     * 使用YearMonth类处理特定的日期
     */
public static void checkCardExpiry(){
    YearMonth currentYearMonth = YearMonth.now();
    System.out.printf("Day in month year %s: %d%n",currentYearMonth,currentYearMonth.lengthOfMonth());
    YearMonth creditCardExpiry = YearMonth.of(2028, Month.FEBRUARY);
    System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
}

/**
 * 检查闰年
 */
public static void isLeapYear(){
    LocalDate today = LocalDate.now();
    if (today.isLeapYear()){
        System.out.println("This year is Leap year");
    }else{
        System.out.println("2018 is not Leap year");
    }
}

/**
 * 如何判断一个日期是否早于还是晚于另个一日期
 */
public static void isBeforeOrIsAfter(){
    LocalDate today = LocalDate.now();
    LocalDate tomorrow = LocalDate.of(2018,1,12);

    if(tomorrow.isAfter(today)){
        System.out.println("Tomorrow comes after today" );

    }
//    减去一天

    LocalDate yesterday = today.minus(1,ChronoUnit.DAYS);
    if (yesterday.isBefore(today)){
        System.out.println("Yesterday is day before today");
    }
}

/**
 * 获取特定的时区下面的时间
 */
public static void getZoneTime(){
//    设置时区
    ZoneId americe = ZoneId.of("America/New_York");
    LocalDateTime localDateAndTime = LocalDateTime.now();
   ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateAndTime,americe);
    System.out.println("现在的日期和时间 在特定的时区 ： " + dateAndTimeInNewYork);
}

/**
 * 计算两个日期之间的天数和月数
 */
public static void calcDateDays(){
    LocalDate today = LocalDate.now();
    LocalDate java8Release = LocalDate.of(2018,Month.MAY,14);
    Period periodToNextJavaRelease = Period.between(today,java8Release);
    System.out.println("Months left between today and java8 release :" + periodToNextJavaRelease.getMonths());

}
/**
 * 使用预定义的格式化工具去解析或格式化日期
 *
 */
public static void formatDate(){
    String dayAfterTomorrow = "201802019";
    LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
    System.out.printf("Date generated from String %s %n", dayAfterTomorrow,formatted);
}
public static void main (){
    getCurrentTime();
    plusHour();
    nextWeek();
    minusDate();
    clock();
    isBeforeOrIsAfter();
    getZoneTime();
    checkCardExpiry();
    isBeforeOrIsAfter();
    calcDateDays();
    formatDate();
}
}




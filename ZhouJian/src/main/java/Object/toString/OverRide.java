package Object.toString;

import java.time.LocalDate;

/**
 * @ClassName OverRide
 * @Description TODO
 * toString 的方法的重写
 *      官方文档建议对toString方法进行重写
 *      原文档源码
 *          public String toString(){
 *              return getClass().get.Name() + "@" + Integer.toHexString(HarXiCode());
 *          }
 * @Author
 * @Date 2020/11/4
 **/
public class OverRide {
    private int year;
    private int month;
    private int day;
    public OverRide(){}
    public OverRide(int year, int month,int day){
        this.year = year;
        this.month = month;
        this.day =day;

    }
    @Override
    public String toString(){
        return this.year + "年" + this.month + "月" + this.day + "日";
    }


}
class Test{
    public static void main(String[] args){
        OverRide a = new OverRide(2020,11,3);
        System.out.println(a);
        NewDate date = new NewDate();
        System.out.println(date);
    }
}
class NewDate{
       LocalDate date = LocalDate.now();
        int year = date.getYear();
        int  month = date.getMonthValue();
        int day = date.getDayOfMonth();

//        public NewDate() {
//            this. month = date.;
//            this. year = date.getYear();
//            this.day = date.getDay();
//        }
//        @Override
//        public String toString(){
//            return year+ "年" +  month + "月" +day + "日";
//        }
}
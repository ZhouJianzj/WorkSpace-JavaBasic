package Object.Equals;

import java.util.Objects;

/**
 * @ClassName Test01
 * @Description
 * OverRide equals方法
 *  涉及到的知识点：
 *      向下类型转换
 * @Author
 * @Date 2020/11/4
 **/
public class Test01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        MyTime t1 = null;
        MyTime t2 = new MyTime();
//      可以比较两个数值
        System.out.println(a == b);
//        ==不能判断两个类是否相等 因为比较的是两个对象的内存地址
        System.out.println(t1 == t2);
//        overRide 方法之后的
        System.out.println(t1.equals(t2));
    }
}
class MyTime{
    int year ;
    int month ;
    int day;
    public MyTime(){

    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        int year = this.year;
        int month = this.month;
        int day = this.day;
        if(obj instanceof MyTime){
//            MyTime t = (MyTime) obj;
           int year1=  ((MyTime) obj).year;
           int month1 = ((MyTime) obj).month;
           int day1 = ((MyTime) obj).day;
//           下面的短路关系&&关系执行原理：当第一个为false的时候就直接的跳过后面的判断，最终的判断的结构就是false
//            当一个为true 的时候就会继续执行下面的判断
//            我们再来回忆下||的执行原理： 当第一个判断结果是true的时候最终的判断的结果就是true,只有当第一个为false的时候才会继续执行下面的判断
            if (year ==year1 && month == month1 && day ==day1){
                return true;
            }
        }
       return false;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MyTime myTime = (MyTime) o;
//        return year == myTime.year &&
//                month == myTime.month &&
//                day == myTime.day;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(year, month, day);
//    }

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
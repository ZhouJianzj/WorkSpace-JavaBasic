package Javadaily.Day04;


/**
 * @ClassName MyClass
 * @Description TODO
 * @Author zj
 * @Date 2020/10/23
 **/
public class MyClass {
    int num;

    static int numStatic;

    public void method(){
        System.out.println("这是一个成员变方法");
//        成员方法可以访问成员bianliang
        System.out.println(num);
//        成员方法可以访问静态的变量
        System.out.println(numStatic);
    }

    public  static void methodStatic(){
        System.out.println("这是一个静态的方法");
//        静态的方法只能访问静态的变量
        System.out.println(numStatic);
//        不能直接访问非静态的
//                不能存在this关键字
//        System.out.println(num);
    }
}

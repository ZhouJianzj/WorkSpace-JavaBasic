package JavaBasic.week5;

import java.util.Scanner;

/**
 * @ClassName Exception01
 * @Description java当中的自带的异常
 * @Author ZhouJian
 * @Date 2020/11/2
 **/
public class Exception01 {
    public static void main(String[] args){
//        1、ArithmeticException 算数异常
        int result = 0;
        try {
            result = 3 / 0;
        }catch (Exception e){
            System.err.println("除数不能为0！");
            System.err.println(e.getMessage());
//            e.printStackTrace()
        }
        System.out.println(result);
        System.out.println("=============================");





//        ArrayIndexOutOfBoundsException  数组索引越界异常
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(a[5]);
        try {
            System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("异常的信息" + e.getMessage());
            System.err.println("数组索引越界异常");
            System.err.println("异常原因：" + e.getCause());
            System.err.println("异常的对象" + e.toString());
            e.printStackTrace();
        }


//        NumberFormatException   数据格式异常
        Scanner scanner = new Scanner(System.in);
//        从键盘读入一串字符串
        String printlnStr = scanner.nextLine();
//        将字符串转化微整形的123
        int price = Integer.parseInt(printlnStr);
        System.out.println("price = " + price);
        try {
            System.out.println("price = " + price);
        }catch (NumberFormatException e) {
            System.err.println(e.getCause());
            System.err.println(e.getMessage());
            System.err.println(e.toString());
            e.getStackTrace();
        }



//        NullPointerException  空指针的异常


    }
}

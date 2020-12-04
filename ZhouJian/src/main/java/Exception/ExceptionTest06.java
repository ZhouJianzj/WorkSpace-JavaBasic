package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest06
 * @Description TODO
 *                      这一节将的就是在程序调试的时候如何看捕获到的异常是在哪里
 *                          应该蓝色的Exception 第一行的异常就是最底下的最根源的Exception
 * @Author ZhouJian
 * @Date 2020/12/4
 **/
public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            method1();
        }catch(FileNotFoundException e){
           e.printStackTrace();
        }

    }
    private static void method1() throws FileNotFoundException {
        method2();
    }
    private static void method2() throws FileNotFoundException {
        method3();
    }
    private static void method3() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("adadnk   ");

    }
}

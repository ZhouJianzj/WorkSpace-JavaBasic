package Exception;

import com.sun.org.apache.xpath.internal.axes.FilterExprWalker;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest05
 * @Description TODO
 *                             注释:Exception前面的方法会执行,Exception方法之后的程序不执行
 * @Author
 * @Date 2020/12/3
 **/
public class ExceptionTest05 {
    public static void main(String[] args) {
        doSome1();
    }
    public static void doSome1(){
        System.out.println("try catch处理Exception前面的程序");
        try {
            doSome2();
        }catch(FileNotFoundException s){
//          return;这里要是没有写的话就会执行下面的方法,然而不会执行doSome2,doSome3 Exception下面的方法
        }
        System.out.println("doSome1方法里的异常try catch处理后的下面的程序");
    }
    public static void doSome2() throws FileNotFoundException{
        System.out.println("Exception前面的方法执行了");
        doSome3();
        System.out.println("Exception后面的方法");
    }
    public static void doSome3 () throws FileNotFoundException {
        System.out.println("异常   上    面的程序执行了");
//        这里是Exception
        new FileInputStream("C:\\Users\\Administrator\\Desktop\\xt");
//        当使用throws处理Exception的时候下面的方法不会执行
        System.out.println("异常  下   面的程序执行了");
    }
}

/**
 * JDK8 的新特性.
 */
class Jdk8NewSpecial{
    public static void main(String[] args) {
        try {
            File file;
            FileInputStream fileInputStream = new FileInputStream("adadad");
        }catch (FileNotFoundException | ArrayIndexOutOfBoundsException p ) {
//            上面的写法时jdk8的新的特性jdk8以下的不可以使用
            System.out.println("文件不存在,或者数组溢出");
        }
    }
        }



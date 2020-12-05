package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.TrustAnchor;

/**
 * @ClassName ExceptionFinally
 * @Description TODO
 * @Author
 * @Date 2020/12/4
 **/
public class ExceptionFinally {
    private static  FileInputStream fileInputStream = null;
    public static void main(String[] args) {
        try {
            method1();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
//            finally语句中的代码是最后执行的是一定执行的
        } finally {
            try {
                fileInputStream.close();
//                这里的代码是不会执行的，当上面的异常发生的时候
                System.out.println("你好呀！");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() throws FileNotFoundException {
        fileInputStream = new FileInputStream("adaddad");
        String string = null;
        string.toString();
    }
}

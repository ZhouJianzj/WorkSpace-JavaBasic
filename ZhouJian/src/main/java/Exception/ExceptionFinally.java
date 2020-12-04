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
        }finally {
            try {
                fileInputStream.close();
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

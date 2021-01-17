package TextClass;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import sun.applet.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Comparator;

/**
 * @ClassName StringText
 * @Description TODO
 * @Author
 * @Date 2021/1/15
 **/
public class StringText {
    public static void main(String[] args) {
        try {

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\新建文本文档 (2).txt");

            while (true){
                byte[] bytes = new byte[10];
                int read = fileInputStream.read(bytes);
                if (read != -1) {
                    System.out.println(new String(bytes, 0, read));
                    break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

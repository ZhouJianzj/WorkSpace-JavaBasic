package IO.Copy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName WriteCopy
 * @Description TODO
 *
 *                                字符流只能拷贝简单的文件
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class WriteCopy {
    public static void main(String[] args) {
         FileReader r = null;
         FileWriter w = null;
         int a = 0;
         char[] c = new char[1024 *1024];
        try {
//            创建输入字符流管道
            r = new FileReader("C:\\Users\\Administrator\\Desktop\\AAA.txt");
            w = new FileWriter("C:\\Users\\Administrator\\Desktop\\AA.txt");
             while ( (a = r.read(c)) != -1){
                 w.write(c);
                 w.flush();
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

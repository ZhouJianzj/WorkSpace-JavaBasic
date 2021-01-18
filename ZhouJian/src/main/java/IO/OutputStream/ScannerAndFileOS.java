package IO.OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName ScannerAndFileOS
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/8
 **/
public class ScannerAndFileOS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("随手记：");
        String s = input.nextLine();
        FileOutputStream f = null;
        try {
             f = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt", true);
//             以数组的形式进行读取文本的信息
             f.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("文本AAA.txt中的内容：");
        FileInputStream ff = null;
        try {
            ff = new FileInputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt");
//            创建一个byte数组每一次读取
            byte[] bt = new byte[5];
//            表示读取所剩下的字节数没有了就不循环了
            while (ff.available()!=0) {
//                以数组为单位读出文本中的字节，并且返回数组中元素的个数
                int a = ff.read(bt);
//                控制台输出
                System.out.print( new String(bt, 0, a));
            }
//            这种发法对不出来早就被抛弃使用了
//            int len = ff.available();
//            byte[] tt = new byte[len];
//            System.out.println("AAA.txt中的文件内容是："+new String(tt,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ff != null) {
                try {
                    ff.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

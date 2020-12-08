package IO.OutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileCopy
 * @Description TODO
 *
 *                          文件的复制
 * @Author ZhouJian
 * @Date 2020/12/8
 **/
public class FileCopy {
    public static void main(String[] args) {
        FileInputStream f  = null;
        byte[] b =new byte[4];
        String s = null ;
        try {
            f = new FileInputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt");
            int a =0;
            while (f.available() != 0) {
                a = f.read(b);
                 s = new String(b, 0, a);
        }
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

        FileOutputStream ff = null;
        try {
            ff = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\AAAA.txt",true);
            byte[] bytes = s.getBytes();
            ff.write(bytes);
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






















package IO.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName WriteAndAppend
 * @Description TODO
 *                                  append：追加 是为每一次的输出不是清除再输出的
 * @Author ZhouJian
 * @Date 2020/12/8
 **/
public class WriteAndAppend {
    public static void main(String[] args) {
        FileOutputStream f = null;
        try {
//            没有预先创建文件FileOutputStream会自动的创建文件
             f  = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt", true);
             byte[] b = {97,98,99,100};
//             byte数组传入输出字符串
             f.write(b);
//             预先输出的字符串
             String s = "你好世界！";
//             字符串转换成byte数组
             s.getBytes();
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
    }
}

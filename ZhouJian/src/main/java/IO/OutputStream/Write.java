package IO.OutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @ClassName Write
 * @Description TODO
 *                      FileWriter
 * @Author JianZhou
 * @Date 2020/12/9
 **/
public class Write {
    public static void main(String[] args) {
        Writer w = null;

        try {
            //append表示可以追加的意思，当第二次写入的时候第一次写入的不会被覆盖掉
            w = new FileWriter("C:\\Users\\Administrator\\Desktop\\AAA.txt",true);
            String s = "你好呀";
            w.write(s);
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (w != null) {
                try {
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

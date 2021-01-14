package IO.InputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName BufferReader
 * @Description TODO
 *                                  bufferedReader 只能缓存字符流
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class BufferReader {
    public static void main(String[] args) {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        String ss = null;
        try {
//            节点流
            reader = new FileReader("C:\\Users\\Administrator\\Desktop\\BufferReader.java");
//            包装流，bufferReader里面的方法会去关闭节点流的，所以最后的时候就只需要关闭bufferReader包装流
//            bufferReader只能接受字符流
            bufferedReader = new BufferedReader(reader);
//            读一行,当没有的时候readLine返回的是null
//            String s = bufferedReader.readLine();
//            System.out.println(s);
            while ((ss = bufferedReader.readLine()) != null){
                System.out.println(ss);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

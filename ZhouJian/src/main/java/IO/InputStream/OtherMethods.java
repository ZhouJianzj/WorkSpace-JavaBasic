package IO.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName OtherMethods
 * @Description TODO
 *                      available() 返回的是一个读取完还剩多少字节没有度
 *                      skip()     跳过多少个字节开始读取
 * @Author ZhouJian
 * @Date 2020/12/8
 **/
public class OtherMethods {
    public static void main(String[] args) {
        FileInputStream f = null;
        int a = 0;
        try {
            f = new FileInputStream("D:\\workSpace\\ZhouJian\\src\\main\\java\\IO\\txt");
//            表示的是整个文件的字节长度
             a = f.available();
            System.out.println(a);
            byte[] bytes = new byte[a];
            System.out.println("你好！");
//            这种方法不建议去使用，因为数组的长度有限不能太大
            System.out.println(new String(bytes,0,bytes.length));
            System.out.println("nihao");

//          跳一个字节开始读取
            f.skip(1);
            System.out.println(f.read());
            byte[] b = new byte[2];
            f.read(b);
//           表示还剩下多少个字节可以读
            System.out.println(f.available());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if ( f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

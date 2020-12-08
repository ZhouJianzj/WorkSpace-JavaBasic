package IO.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName GaiJingByteArrayRead
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/8
 **/
public class GaiJingByteArrayRead {
    public static void main(String[] args) {

         byte[] bytes = new byte[5];
        FileInputStream fileInputStream = null;
        try {
//            创建一个渠道
            fileInputStream = new FileInputStream( "D:\\workSpace\\ZhouJian\\src\\main\\java\\IO\\txt");
//            读取字节并且返回一个值

            int a = 0;



//             *****************关键******************
//             使用一个循环，条件就是不等于-1的时候执行byte数组转换成字符串
            while ( (a = fileInputStream.read(bytes))!= -1){
                System.out.print( new String(bytes,0,a));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            输入输出流结束的时候一定要关闭
            if (fileInputStream !=null)
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

package IO.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.FieldPosition;

/**
 * @ClassName ByteArrageRead
 * @Description TODO
 *                      read（byte[] bytes） 返回值是读取的字节数字
 *                      read（）放会的值是字节，读完返回值是 -1
 * @Author Zhoujian
 * @Date 2020/12/7
 **/
public class ByteArragRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        int a = 0;
        byte[] bytes = new byte[4];
        try {
//            默认的当前路径是工程的根目录
            fileInputStream = new FileInputStream("D:\\workSpace\\ZhouJian\\src\\main\\java\\IO\\txt");
//            这里返回的值是读取的字节数，如果数组读满的话返回值就是数组的长度 4
//            如果数组没有读完的话就是里面元素的个数
//            简而言之就是读取的字符数
            a = fileInputStream.read(bytes);
//            输出为4，
            System.out.println(a);
//            byte数组转换成String类型主要参数  数组，起始位置，长度
            System.out.println(new String(bytes,0,a));
//            输出为2
            a = fileInputStream.read(bytes);
            System.out.println(a);

//            byte数组转换成字符串
//            如果使用下面注释掉的代码会是efcd，说明使用数组度的时候是覆盖的，当读取的字节数不满数组长度的时候，后面没有被覆盖的就还在
            System.out.println(new String(bytes) + "改近++++++");
            System.out.println(new String(bytes,0,a));


//            读完的时候返回值是-1,表示没有读到任何字节
            System.out.println(fileInputStream.read(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

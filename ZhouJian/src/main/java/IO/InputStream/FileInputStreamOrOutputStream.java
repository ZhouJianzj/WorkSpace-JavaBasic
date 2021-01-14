package IO.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileInputStreamOrOutputStream
 * @Description TODO
 *          FileInputStream 当中放一个文件的路径
 *          使用read方法一个字节一个字节的读取
 * @Author ZhouJian
 * @Date 2020/12/7
 **/
public class FileInputStreamOrOutputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        int a = 0 ;
        try {
//            会出现异常
//            这里的文件路径默认可以直接的创建在项目的文件下，可以直接写文件名字，不适用绝对路径 absolute
            fileInputStream = new FileInputStream("D:\\workspace\\ZhouJian\\src\\main\\resources\\新建文本文档.txt");
//            当读取到最后一个字节的是时候没有了就返回一个  -1
//             while (true){
//                  a = fileInputStream.read();
//                 if (a == -1) {
//                     break;
//                 }
//                 System.out.println(a);
//             }

//            改进的写法
            while ((a = fileInputStream.read()) != -1){
                //这里返回的是数组的现在读取的长度
//                System.out.println(new String(byte ,0,byte.length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            避免空指针异常
            if (fileInputStream == null) {
                try {
//                  关闭字节输入流
                    fileInputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}

package IO.InputStream;

import java.io.*;

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
        FileReader fileReader= null;
        FileWriter fileWriter = null;
        try {
//            会出现异常
//            这里的文件路径默认可以直接的创建在项目的文件下，可以直接写文件名字，不适用绝对路径 absolute
            fileReader = new FileReader("D:\\workspace\\ZhouJian\\src\\main\\resources\\新建文本文档.txt");
            fileWriter = new FileWriter("D:\\workspace\\ZhouJian\\src\\main\\resources\\新建文本文档.txt", true);

//
            char[] chars = new char[10];
//            改进的写法
            while (true){
                int a = fileReader.read(chars);
                if (a != -1) {
                    break;
                }
                fileWriter.write(chars, 0, a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            避免空指针异常
            if (fileReader == null) {
                try {
//                  关闭字节输入流
                    fileReader.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }

    }
}

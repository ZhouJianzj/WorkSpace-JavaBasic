package Javadaily.Day07;

import java.io.*;

/**
 * @ClassName FileReadDemo
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/26
 **/
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
//        创建一个文件File对象，注意需要的显示出异常（IDException是编译时候的异常）
//        可以用try catch 捕获，也可以在方法签名处使用throws 跳出
        File inputFile = new File("Users/Administrator/Downloads/Day06.png");
//        创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(inputFile);
//        准备和文件大小一致的字节数组
        byte[] b = new byte[(int) inputFile.length()];
//        通过字节输出流将文件读入数组
        is.read(b);
//        准备输出文件对象
        File outputFile = new File("Users/Administrator/Downloads/Day06.png");
//        准备输出流
        OutputStream os = new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}

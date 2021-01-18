package IO.OutputStream;

import java.io.*;

/**
 * @ClassName PrintlnWriteText
 * @Description TODO
 *                          PrintStream
 *                              控制台输出救赎标准的输出流
 *                              标准的输出流不需要关闭流不需要使用close（）方法
 *
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class PrintWriteText {
    public static void main(String[] args) throws FileNotFoundException {
//        控制台输出的就是标准的输出流
//        PrintStream out = System.out;
//        创建一个标准输出流的输出路径


        PrintStream p = new PrintStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt"));
//        改变控制台输出路径
        System.setOut(p);
//        输出的结果
        System.out.println("我爱中华!");

    }
}

package JavaBasic.week5;

import java.io.*;

/**
 * @ClassName Exception02
 * @Description java运行时候的异常Exception
 * @Author ZhouJian
 * @Date 2020/11/2
 **/
public class Exception02 {
    public static void main(String[] args) throws FileNotFoundException {
//在方法调用处捕获异常，这样的好处就是：即使出现异常，也不会影响其它代码段的运行
       try {
           byte[] b = readFile("/u/Desktop");
           System.out.println(b.length);
       }catch (IOException e ){
           System.err.println(e.getCause());
           System.err.println(e.getMessage());
           System.out.println("出现IO异常Exception");
       }finally {//常常用于数据库连接的关闭，线程资源的回放，IO流的关闭
           System.out.println("无论有无异常都会执行的代码段");
       }
//        File file = new File("/c/桌面");
//        InputStream is = new FileInputStream(file);
//
    }

    /**
     *
     */
    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] b = new byte [(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result  );
        is.close();
        return b;
    }
}

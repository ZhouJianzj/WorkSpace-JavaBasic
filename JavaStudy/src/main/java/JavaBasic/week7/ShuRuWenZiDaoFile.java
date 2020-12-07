package JavaBasic.week7;

import java.awt.image.WritableRenderedImage;
import java.io.*;
import java.util.Scanner;

/**
 * @ClassName ShuRuWenZiDaoFile
 * @Description TODO
 *
 *                  输入一段文字到文件里面去
 * @Author
 * @Date 2020/11/30
 **/
public class ShuRuWenZiDaoFile {
    public static void main(String[] args) throws IOException {
//        将键盘输入的一串文字保存到文件中

        Scanner txt = new Scanner(System.in);
        System.out.println("请输入！");
        String s = txt.nextLine();
        char[] chars = s.toCharArray();
//       方法一
        File file = new File("C:/User/Administrator/Desktop/Result.txt");
//        追加
        Writer out = new FileWriter(file,true);
//        调用write方法以字符串的形式输出
        out.write(chars);
//        关闭流
        out.close();

//        方法二
        File file1 = new File("C:/User/Administrator/Desktop/Result1.txt");
//        字符流输出，是否追加是
        Writer writer = new FileWriter(file1,true);
//        缓存字符流输出
        BufferedWriter bW = new BufferedWriter(writer);
//        追加字符串
        bW.write(s);
//        刷新
        bW.flush();
//        关闭流
        bW.close();

//        方法三
        File file2 =  new File("C:/User/Administrator/Desktop/Result2.txt");
//        指定字节流输出的路径absolute
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        PrintWriter ps =new PrintWriter(fileOutputStream,true);
//        跟write（）;差不多的意思，给指定的字符串输出
        ps.print(s);
//        关闭流
        ps.close();
    }
}

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
        out.write(chars);
        out.close();

//        方法二
        File file1 = new File("C:/User/Administrator/Desktop/Result1.txt");
        Writer writer = new FileWriter(file1,true);
        BufferedWriter bW = new BufferedWriter(writer);
        bW.write(s);
        bW.flush();
        bW.close();

//        方法三
        File file2 =  new File("C:/User/Administrator/Desktop/Result2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        PrintWriter ps =new PrintWriter(fileOutputStream,true);
        ps.print(s);
        ps.close();
    }
}

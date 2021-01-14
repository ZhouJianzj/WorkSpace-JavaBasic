package TextClass;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @ClassName ShuiShouJi
 * @Description TODO
 * @Author
 * @Date 2021/1/14
 **/
public class ShuiShouJi {
    public static void main(String[] args) {
        System.out.println("随手记");
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();
        try {
            PrintStream printWriter = new PrintStream("D:\\workspace\\ZhouJian\\src\\main\\resources\\新建文本文档.txt");
            System.setOut(printWriter);
            System.out.println(test);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

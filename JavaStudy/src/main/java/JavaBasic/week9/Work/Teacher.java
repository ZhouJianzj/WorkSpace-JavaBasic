package JavaBasic.week9.Work;

import JavaBasic.week2.Student;

import java.util.Scanner;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author ZHouJian
 * @Date 2020/12/14
 **/
public class Teacher {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        s1.setName("学生1");
        s2.setName("学生2");
        s1.start();
        s2.start();
        if (ss.equals("上课")){
            s1.interrupt();
            s2.interrupt();
        }
    }
}

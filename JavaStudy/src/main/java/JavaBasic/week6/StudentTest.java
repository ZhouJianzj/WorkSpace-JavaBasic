package JavaBasic.week6;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author
 * @Date 2020/11/16
 **/
public class StudentTest {
    public static void main(String[] args) {


        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Set<Student> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}

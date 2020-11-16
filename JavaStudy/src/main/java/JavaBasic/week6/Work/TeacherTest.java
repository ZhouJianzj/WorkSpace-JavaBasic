package JavaBasic.week6.Work;

import java.sql.SQLOutput;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TeacherTest
 * @Description TODO
 * @Author
 * @Date 2020/11/16
 **/
public class TeacherTest {
    public static void main(String[] args) {


        Teacher t1 = new Teacher("Tom", "Core Java");
        Teacher t2 = new Teacher("John", "Oracle");
        Teacher t3 = new Teacher("Susan", "Oracle");
        Teacher t4 = new Teacher("Jerry", "JDBC");
        Teacher t5 = new Teacher("Jim", "Unix");
        Teacher t6 = new Teacher("Kevin", "JSP");
        Teacher t7 = new Teacher("Lucy", "JSP");
        Teacher t8 = new Teacher("Allen", "JDBC");

        Set<Teacher> set = new TreeSet<>();
        set.add(t8);
        set.add(t6);
        set.add(t7);
        set.add(t5);
        set.add(t4);
        set.add(t3);
        set.add(t2);
        set.add(t1);
        System.out.println(set);

    }
}

package IO.SerializeObjectInOutps;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SerializableMoreObject
 * @Description TODO
 *                          序列化多个对象的时候使用一个List集合来进行
 *                          反序列化readObject的时候返回的是一个集合类型的数据也是String类型的数据
 *                          tran
 * @Author ZhouJian
 * @Date 2020/12/11
 **/
public class SerializableMoreObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("xiaozhang",1);
        Student s2 = new Student("xiaozhang",2);
        Student s3 = new Student("xiaozhang",3);
        Student s4 = new Student("xiaozhang",4);
        Student s5 = new Student("xiaozhang",5);
//        创建一个集合来装对象
        List<Student> l = new ArrayList<>();
        l.add(s5);
        l.add(s4);
        l.add(s3);
        l.add(s2);
        l.add(s1);
        ObjectOutputStream oops = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\A.txt"));
//        写出的是以object 对象
       oops.writeObject(l);
        oops.flush();
        oops.close();

//        反序列化
        ObjectInputStream oips = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\A.txt"));
//        Object o = oips.readObject();
//        使用集合序列化之后再一次的进行反序列化读出来的也是一个集合/也是String类型

       List<Student> ls  =(List<Student>) oips.readObject();
       oips.close();
//        System.out.println(o);
//       集合的相关的知识，for循环的时候类型取集合的类型对象，也就是集合里面装的元素的数据类型
        for(Student lll: ls){
            System.out.println(ll  l);
        }

    }
}

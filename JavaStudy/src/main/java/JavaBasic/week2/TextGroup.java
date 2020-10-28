package JavaBasic.week2;

import java.util.Date;

/**
 * @ClassName TextGroup
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/12
 **/
public class TextGroup {
    public static void main(String[] args) {
    Phone phone1 = new Phone("华为",5555);
    Phone phone2 = new Phone("小米",4444);
    Phone phone3 = new Phone("iphone",6666);


    Book book1 = new Book("java基础",20,new Date());
    Book book2 = new Book("java进阶",30,new Date());
    Book book3 = new Book("java高级",40,new Date());
    Book book4 = new Book("java顶尖教程",50,new Date());


    Student student1 = new Student("小张","1001","男",new Book[]{book1},phone1);
    Student student2 = new Student("小明","1002","男",new Book[]{book1,book2},phone2);
    Student student3 = new Student("小红","1003","男",new Book[]{book1,book2,book3},phone3);

    Group group1 =new Group("第一组",new Student[]{student1,student2});
    Group group2 = new Group("第二组",new Student[]{student3});
    Student[] students = group2.getStudents();
    for (Student student : students){
        System.out.println(student.getName());
    }

    
    }
}

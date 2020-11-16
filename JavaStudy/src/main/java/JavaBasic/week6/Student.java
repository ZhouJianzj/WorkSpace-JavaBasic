package JavaBasic.week6;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @ClassName Student
 * @Description TODO
 * @Author ZHouJIan
 * @Date 2020/11/16
 **/

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAge() < o.getAge()) {
            return 1;
        }else if(this.getAge() > o.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}

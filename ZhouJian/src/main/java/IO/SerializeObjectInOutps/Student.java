package IO.SerializeObjectInOutps;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 *                      需要被序列化的对象类需要实现标志性接口Serializable
 *
 * @Author ZhouJian
 * @Date 2020/12/10
 **/
public class Student implements Serializable {
    private  String name;
    private int no;

    public Student() {
    }

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}

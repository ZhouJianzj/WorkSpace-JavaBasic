package JavaBasic.week6.Work;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author
 * @Date 2020/11/16
 **/
public class Teacher implements Comparable<Teacher>  {
    private String name;
    private String classes;

    public Teacher(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}

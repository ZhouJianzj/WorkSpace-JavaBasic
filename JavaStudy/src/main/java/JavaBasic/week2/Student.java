package JavaBasic.week2;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/12
 **/
public class Student {
    private String name;
    private String id;
    private String gender;
    private Book[] books;
    private Phone phones;

    public Student(String 白胡子, int i, int i1) {
    }

    public Student(String s) {

    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Phone getPhones() {
        return phones;
    }

    public void setPhones(Phone phones) {
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String genter) {
        this.gender = genter;
    }


    public Student(String name, String id, String gender, Book[] books, Phone phones) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.books = books;
        this.phones = phones;
    }

    public void getStature() {
    }
}

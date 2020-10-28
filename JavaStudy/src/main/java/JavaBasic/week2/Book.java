package JavaBasic.week2;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/12
 **/

public class Book {
    private String name;
    private Integer price;
    private Date date;
/**
 * 无参构造器，下面用到方法的重载机制
 */
public Book (){

}
public Book(String name,Integer price,Date date){
    this.name = name;
    this.price = price;
    this.date = date;
}

/**
 * 私有化的调用
 */

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }

@Override
    public String toString(){
        return "《" + this.name + "》" + this.price + this.date;
    }
    public static void main(String[] args) {
        Book book = new Book("java",122,new Date());
        System.out.println(book);
    }

}

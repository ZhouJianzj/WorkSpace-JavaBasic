package JavaBasic.week5.Work;

/**
 * @ClassName Books
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/2
 **/
public class Books  {
    static int ISBN ;
    private  String name ;
    private  double price ;



    public Books(){

    }
    public Books(String name,int price){
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

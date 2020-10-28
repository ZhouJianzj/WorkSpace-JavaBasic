package JavaBasic.week2;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/12
 **/
public class Phone {
    private String brank;
    private Integer price;
    public Phone(){}
    public Phone(String brank, int price) {
        this.brank = brank;
        this.price = price;
    }

    public String getBrank() {
        return brank;
    }

    public void setBrank(String brank) {
        this.brank = brank;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

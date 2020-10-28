package DaBao;

/**
 * @ClassName Data
 * @Description TODO
 * @Author
 * @Date 2020/10/23
 **/
public class Data {
    public static void main(String[] args) {
        MyData a = new MyData();
        a.toString();
        System.out.println(a);
    }
}

class MyData{
    private int year;
    private int month;
    private int time;


    public MyData(){
        this(1970,1,1);
    }
    public MyData(int year,int month, int time){
        this.year = year;
        this.time = time;
        this.month = month;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + time + "日";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
package JavaBasic.week3;
/**
 * @ClassName OverLoad
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/19
 **/
public class OverLoad1 {
    public OverLoad1() {

    }
    public void OverLoad1(int a2,int a1) {
        int a = a1 + a2;
        //这是多少分钟
        int b = a / 60;
        //这里时剩下的秒
        int b1 = a % 60;
        //这里是多少时
        int time = b / 60;

        int time1 = b % 60;

        System.out.println("时间为：" + time + "小时" + time1 + "分钟" + b1 + "秒");
    }

}





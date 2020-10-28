package Javadaily.Day04;

/**
 * @ClassName MathDemo
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/23
 **/
public class MathDemo {
    public static void main(String[] args) {
//        获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("+================");

//        向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(0));
        System.out.println(Math.ceil(3.0));
        System.out.println("+================");

//        向下取整,抹零
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));
        System.out.println("+===============");

//        四舍五入
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.6));
        System.out.println("+===============");

//        计算在-10.5到5.9之间，绝对值大于6或者小于2.1的整数有多少？
//        符合要求的数量
        int count  = 0;
        double min = -10.8;
        double max = 5.9;
//        这样处理变量i就是区间之内的所有的整数
        for(int i =(int) min; i< max; i++){
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有：" + count + "个");
    }
}

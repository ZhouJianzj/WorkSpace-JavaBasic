package JavaBasic.week1;

/**
 * @ClassName Factorily
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/5
 **/
public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        int result = 1;
        for (int b = 1; b<= a; b++){
            result=result*b;
        }
        System.out.println(a+"的阶乘是"+result);
    }
}

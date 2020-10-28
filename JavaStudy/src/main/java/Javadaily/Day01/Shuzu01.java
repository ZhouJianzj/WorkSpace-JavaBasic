package Javadaily.Day01;

/**
 * @ClassName Shuzu01
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/20
 **/
public class Shuzu01 {
    public static void main(String[] args) {
        int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int b = 12;
        for(int a = 1; a <=b ; a++){
            System.out.println( a + "月有" + day[a] + "天" );
        }

    }
}

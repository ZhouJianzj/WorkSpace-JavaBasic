package Package.number;

import java.util.Random;

/**
 * @ClassName RandonNumber
 * @Description TODO
 *
 *                      产生随机数Random
 * @Author ZhouJian
 * @Date 2020/11/24
 **/
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
//       返回的是一个随机数
        int a =random.nextInt();
        System.out.println(a);
//        返回的是一个0-100 的随机数
        Random number = new Random();
        int b = number.nextInt(101);
        System.out.println(b);
    }
}

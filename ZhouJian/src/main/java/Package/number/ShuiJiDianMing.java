package Package.number;

import java.util.Random;

/**
 * @ClassName ShuiJiDianMing
 * @Description TODO
 * @Author ZhouJIan
 * @Date 2020/11/24
 **/
public class ShuiJiDianMing {
    public static void main(String[] args) {
        Random01();
        Array();
        PaiChu();
    }
/**
 * 思路：
 */

    /**
     * 产生一个随机数
     */
    public static int Random01(){
        Random a = new Random();
        return a.nextInt(101);
    }
    public static void Array(){
        int[] a = new int[100];
        for (int i = 0;i< a.length;i++){
            a[i] = i;
        }
    }
    public static void PaiChu(){
//       一共100个人标号0-100
        int number = Random01();
        int[] a = new int[100];
        for (int i = 0;i<a.length;i++){
            if (a[i] == number ){
                a[i] = -2;
                System.out.println(number);

            }
        }
        for (int b = 0;b<a.length; b++) {
            if (a[b] != number) {
                Random01();
                return;
            }
        }
    }

}

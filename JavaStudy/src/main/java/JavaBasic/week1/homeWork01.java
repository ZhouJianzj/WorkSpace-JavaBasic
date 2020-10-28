package JavaBasic.week1;

import java.util.Random;

/**
 * @ClassName homeWork01
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/7
 **/
public class homeWork01 {
    static int MAX = 5;
    public static void main(String[] args){
        int max = 0;
        int min = 1000;
        //创建一个整型的数组
        int[] a = new int[MAX];
        //创建随机数种子
        Random random = new Random();
        //数组原始值为
        for(int i  = 0;i< MAX;i++){
            //循环生成100以内随机整数赋值给数组
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
            if (max < a[i]){
                max = a[i];
            }
            if(min > a[i]){
                int b = a[i];
                min = b;
            }
        }
//        max = a[1];
//        min = a[1];
//        for (int i = 0; i < a.length; i++) {
//            if (max < a[i]){
//                max = a[i];
//            }
//            if (min > a[i]){
//                min = a[i];
//            }
//
//        }
        System.out.println("\n"+max);
        System.out.println("最小值"+ min);
    }

}

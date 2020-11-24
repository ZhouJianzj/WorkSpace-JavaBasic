package Package.number;

import java.util.Random;
import java.util.Arrays;

/**
 * @ClassName ShuiJiDianMIngSystem
 * @Description TODO
 * @Author ZHouJian
 * @Date 2020/11/24
 **/
public class ShuiJiDianMIngSystem {
    public static void main(String[] args) {
        RandomTest();
    }



    public static void RandomTest() {
//        生成一个数组来存储100个学生
        int[] count = new int[100];
//        在0-100这个范围当中生成一个随机数
        Random random = new Random();
//        随机生成5个学生的序号
//            随机产生五个数
        for (int a = 0; a < 5; a++) {
            int student = random.nextInt(101);
//                判断产生的数据是否彼此相等,如果相等的话就移除，输出数据
//                当下一个随机数产生的时候在与数组当中的数据比较，如果相等的话说明没有
//                重复的取到这个学生，如果不相等就说明前面的数据就已经被取到然后移除了
            for (int i = 0; i < count.length; i++) {
                count[i] = i;

                if (count[i] == student) {
//                    移除取到的元素
                    count[i] = -2;
                    System.out.println(student);
                } else {
//                        RandomTest();
                }
            }
        }
    }
}


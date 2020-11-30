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
//        创建一个数组来存存储随机数
        int[] array = new int[5];
//        以免随机数取到0和数组的默认值相同的时候就会影响
        arrayFuZhi(array);
//        数组的下标
        int index = 0;
//        生成一个随机数
        Random random = new Random();
        while (index < array.length){
//           生成一个随机数int来接受
            int num = random.nextInt(5);
            if (!connect(array,num)) {
                System.out.println("生成的随机数是：" + num);
                array[index++] = num;
            }
        }


    }
    public static boolean connect(int[] arr,int key){
        for (int a = 0;a<arr.length;a++){
            if (arr[a] == key){
                return true;
            }
        }
        return false;
    }
    public static void arrayFuZhi(int[] array1){
        for (int i = 0; i<array1.length;i++){
            array1[i] = -1;
        }
    }
}
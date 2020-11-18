package Array.ArraysUtil;

import java.awt.event.FocusEvent;

/**
 * @ClassName ArrayTest03
 * @Description TODO
 *                          选择排序
 * @Author ZhouJian
 * @Date 2020/11/18
 **/
public class ArrayTest03 {
    public static void main(String[] args) {
        int [] array = {3,5,6,1,2};
        for (int a = 0; a < array.length; a++){
//            这里先假设第一个元素是最小的
            int min = a;

            for(int b = a + 1;b< array.length; b++){
//                第一个元素与其他的剩下的元素近行判断
                if (array[min] >array[b]){
//                    如果最小的元素不是事先预设的，就给现在元素最小的下标赋值给min
                    min = b;
                }
            }
//            里面的if进行判断过了并且改变了事先预设的最小元素的下标
            if (min != a){
//                创建一个空的位置来进行元素的换位
                int temp ;
//                最小的元素放到空的位置上去
                temp = array[min];
//                最小的位置上空下来了放上事先预设好的最小的元素,实现预设好的元素已经不是最小的了
                array[min] = array[a];
//                实现预设好的位置上放上最小的元素
                array[a] = temp;
            }
        }
        for(int i = 0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}

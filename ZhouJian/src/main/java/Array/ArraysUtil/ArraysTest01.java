package Array.ArraysUtil;

import java.util.Arrays;
/**
 * @ClassName ArraysTest01
 * @Description TODO
 *                       java数组的工具
 * @Author  ZhouJian
 * @Date 2020/11/15
 **/

/**
 *                          数组的排序Arrays.sort();
 * @author Administrator
 */

public class ArraysTest01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = {5,4,3,2,1};
        a = b;
//        数组的排序
        Arrays.sort(a);
        for (int i = 0;i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}

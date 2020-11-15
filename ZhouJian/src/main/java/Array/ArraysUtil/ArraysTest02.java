package Array.ArraysUtil;

/**
 * @ClassName ArraysTest02
 * @Description TODO   Arrays 数组的工具
 * @Author
 * @Date 2020/11/15
 **/

/**
 *  冒泡排序算法
 * @author Administrator
 */

public class ArraysTest02 {
    public static void main(String[] args){
       int[] a = {10,4,23,22,133};

       for (int i = a.length - 1;i> 0;i--){
           for (int j = 0;j < i; j++){
               if(a[j] > a[j+1]) {
//               需要引入一个空的存储的空间
                   int temp;
//                   腾出a[j]的位置
                   temp = a[j];
//                   腾出a[j]位置后给a[J+1]的值方法a[j]位置上去
                   a[j] = a[j+1];
//                   给原先a[j]的值转移到a[j+1]位置上去
                   a[j+1] = temp;
               }
           }
       }
       for (int i = 0; i <a.length;i++){
           System.out.print(a[i] + " ");
       }
    }
}

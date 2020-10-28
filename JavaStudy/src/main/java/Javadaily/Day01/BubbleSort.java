package Javadaily.Day01;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/20
 **/
public class BubbleSort {
    /**
     *冒泡排序的一种数显，没有任何优化
     *
     */
    public  static  void bubbleSort1(int[] a,int n){
        int i,j;
        ///表似乎N次排序的过程
        for(i = 0;i< n; i++){
            for (j = 1;j< n - 1;j++){
                if(a[j - 1] > a[j]){
                    int temp;
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,12,7,8,3,4,65};
        BubbleSort.bubbleSort1(arr,arr.length);
        for(int i:arr){
            System.out.println(i + ",");
        }
    }
}

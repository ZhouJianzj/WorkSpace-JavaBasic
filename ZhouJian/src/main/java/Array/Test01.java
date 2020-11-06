package Array;

/**
 * @ClassName Test
 * @Description TODO
 * 这里需要注意的就是数值的下标千万不要越界不然的话在编译的时候会报这样的错误
 *Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
 * 	at Array.Test.main(Test.java:40)
 * @Author ZhouJian
 * @Date 2020/11/6
 **/
public class Test01 {
    public static void main(String[] args) {
//        创建数组
        int[] array ;
//        静态的初始化数组
        int[] array1 = {1,2,3,4,5,6,7,8};
//        动态的初始化数组,默认的是 8个0
        int[] array2 = new int[8];
//        当数组用来存储对象的时候里面是对象的内存地址默认的是null
        Object[] object = new Object[8];

//        数组中的元素的方法，就那个array1来demo
//        也可以这样子修改数组中的元素  array1 [这里是index 也就是数组元素的下标]
        array1[0] = 1;
        System.out.println("array1数组的第一个元素是：" + array1[1]);
//         数组的遍历
        for(int i = 0; i< array1.length;i++){
            System.out.print( array1[i] );
        }
//        数组的倒叙
        for(int i = array1.length - 1; i >= 0 ;i--){
            System.out.print(array1[i]);
        }
//        int[] array1 = new int[];
        for (int i = 0; i <array2.length;i++){
            System.out.print(array2[i]);
        }
//        Object[] object = new Object[];
        for (int i = object.length - 1 ;i>= 0 ;i--){
            System.out.print(object[i]);
        }
    }
}

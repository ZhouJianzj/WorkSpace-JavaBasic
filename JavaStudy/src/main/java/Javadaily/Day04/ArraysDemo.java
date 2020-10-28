package Javadaily.Day04;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/23
 *
 *
 * 注意：
 *         如果是数值sort默认的排序方式是从小到大
 *         如果是字符串sort默认按照字母升序
 *         如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持
 **/
public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
//      讲int[]数组按照默认的格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

//       对整型的数组进行排序
        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

//      对字符串数组进行排序
        String[] array2 = {"bbb", "aaa" , "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

//      将随机的一个字符串中的所有字符串进行升序排序，并且倒序打印出来
        String str = "adajdkljawldoaiwjdoaasdj39";
//        如何进行升序排序 使用sort
//        必须是一个数组才能使用Arrays.sort方法
//        String 数组使用toCharArray
        char[] chars = str.toCharArray();
//        对数组进行升序排序
        Arrays.sort(chars);
//       daolibianli
        for( int i = chars.length - 1; i>= 0; i--){
            System.out.println(chars[i] + " ");
        }
    }
}

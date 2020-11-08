package Array;

/**
 * @ClassName DoubleAeeay
 * @Description 二维数组：也就是特殊的一维数组
 *      特殊在二维数组当中每一个元素是一个一维数组
 *      语法格式： int [][] a = {{},{},{},{},{}}
 * @Author
 * @Date 2020/11/8
 **/
public class DoubleArray {
    public static void main(String[] args) {
        int[][] a ={
                {1,2,3,4},
                {1,3,2},
                {1,2},
                {1}
        };
        System.out.println(a.length);
//        表示的是一维数组的长度
        System.out.println(a[0].length);
//        这里输出的是数组当中下标为1 的元素也就是一维数组{1，3，2}然后再选一维数组当中的下标为1的元素
        System.out.println(a[1][1]);
    }
}

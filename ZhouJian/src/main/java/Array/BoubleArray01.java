package Array;

/**
 * @ClassName BoubleArray01
 * @Description *****************二维数组的遍历
 * @Author ZHouJian
 * @Date 2020/11/8
 **/
public class BoubleArray01 {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
//        int[][] b = {{12,2},{1}};
        a = new int[][]{
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {6, 7, 8, 9}
        };
//        遍历二维数组
        for (int i = 0; i < a.length;i++){
            for(int i1 = 0;i1< a[i].length; i1++){
                System.out.print(a[i][i1] + " ");
            }
        }
    }
}

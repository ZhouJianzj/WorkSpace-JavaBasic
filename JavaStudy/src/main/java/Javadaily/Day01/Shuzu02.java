package Javadaily.Day01;

/**
 * @ClassName Shuzu02
 * @Description TODO
 * @Author ZHouJIan
 * @Date 2020/10/20
 **/
public class Shuzu02 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1},{2,3},{4,5,6}};
        for(int i = 0;i <arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}



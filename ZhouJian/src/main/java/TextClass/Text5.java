package TextClass;

import javax.xml.transform.Result;

/**
 * @ClassName Text5
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/10
 **/
public class Text5 {
    public static void main(String[] args) {
//        int result = 1;
//        for (int a = 1 ; a<= 5; a++){
//            result = result* a;
//        }
//        System.out.println(result);


//        J(5);

        Sum(2);
    }
    public static void J(int n){
        int result = 1;
        for (int a = n; a> 0; a-- ){
            result = result * a;
        }
        System.out.println(result);
    }
    public static void Sum(int n){
        int result = 0 ;
        for (int a = 1;a<= n;a++ ){
         result =result + a;
        }
        System.out.println(result);
    }
    public static void SumRecursion(int n) {
        if (n==1){
            System.out.println(1) ;
        }
//        int result = n + SumRecursion(n-1);  递归
    }
}

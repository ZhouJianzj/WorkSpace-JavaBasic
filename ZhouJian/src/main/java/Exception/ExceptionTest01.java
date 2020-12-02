package Exception;

/**
 * @ClassName ExceptionTest01
 * @Description TODO
 *          异常机制的使用：
 *              当程序在执行的时候会发生不正常的情况会给出提示，并且打印到
 *              控制台。（是JVM打印输出的）
 *
 *          异常的作用就是增强程序的健壮性。
 * @Author ZhouJian
 * @Date 2020/12/2
 **/

/**
 * 异常的处理最基本的概念理解
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
      divide(10,0);
    }
    public static void divide(int a, int b){
//        出现不正常的的时候就直接return结束执行程序
        if (b == 0){
            System.out.println("分母不能为零");
           return;
        }
        int c = a / b;
        System.out.println(c);
    }
}

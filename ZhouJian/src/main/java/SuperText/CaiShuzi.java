package SuperText;


import java.util.Scanner;

/**
 * @ClassName CaiShuzi
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/23
 **/
public class CaiShuzi {
    public static void main(String[] args) {
        B1 b1 = new B1();
    }
}

/**
 * 是键盘接收一个 数其为实例变量，使其为正整数
 */
class A1 {
    int in111;
    public A1(int a) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("请输入答案数字");
        int in11 = in1.nextInt();
         in111 = Math.abs(in11);

    }

    public A1() {

    }
}

class B1 extends A1{
    public B1(){
        super(1);
        Scanner in2= new Scanner(System.in );
        System.out.println("请输入猜测的数字");
        int in22 =in2.nextInt();
        int in222 = Math.abs(in22);

        if (in111== in222){
            System.out.println("猜测正确");
        }else if ( in111
                < in222){
            System.out.println("你猜测大了");
        }else if (in111
                > in222){
            System.out.println("你猜测小了");
        }
    }




}


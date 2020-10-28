package DaBao;

import java.util.Scanner;

/**
 * @ClassName JiSuanQi
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/12
 **/
public class JiSuanQi {
//    java.util.Scanner Input1 = new Scanner(System.in);
//    System.out.println("请输入");
//    int one = Input1.nextInt();
//    java.util.Scanner Input2 = new Scanner(System.in);
//    System.out.println("请输入");
//    int two = Input2.nextInt();
    /**
     *计算器的设计
     */

public static void main(String[] args) {
    Scanner Input1 = new Scanner(System.in);
    System.out.println("请输入");
    int num1 = Input1.nextInt();

    Scanner Input = new Scanner(System.in);
    System.out.println("请输入运算符");
    String operater = Input.next();

    Scanner Input2 = new Scanner(System.in);
    System.out.println("请输入");
    int num2 =Input2.nextInt();
    int Result = 0;
    switch (operater) {
        case "+":
            System.out.println(Result = num1 + num2);
            break;
        case "-":
            System.out.println(Result = num1 - num2);
            break;
        case "*":
            System.out.println(Result = num1 * num2);
            break;
        case "/":
            System.out.println(Result = num1 / num2);
            break;
        case "%":
            System.out.println(Result = num1 % num2);
            break;
        default:
            System.out.println("你输入的对吗？");

    }

    }
}
//class Swith{
//    public Swith(){
//
//    }
//    public Swith(){
//
//    }
//}

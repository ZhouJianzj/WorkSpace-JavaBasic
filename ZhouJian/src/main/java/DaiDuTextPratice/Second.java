package DaiDuTextPratice;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

/**
 * @ClassName Second
 * @Description TODO
 * @Author ZhouJIan
 * @Date 2020/11/20
 **/
public class Second {
    public static void main(String[] args){
//      输出是一个等腰三角形
//       等腰三角形的高度，也就是理解成层数，这里的层数跟每一层的标记符号的个数有关系2*cen-1
        Scanner higth1 = new Scanner(System.in);
        int higth  = higth1.nextInt();


        for (int cen = 1; cen <= higth;cen ++){
            int empty = 1;



//            表示前面输出多少占位符
            for ( empty =1;empty <=higth - cen;empty++) {
                System.out.print(" ");

            }


//            什么时候开始输出标记符
            if (empty > higth - cen) {
//            表示的是输出标记符的个数
                for (int startPrint = 1; startPrint <= 2 * cen - 1; startPrint++) {
                    System.out.print("*");
                }
                    System.out.println();
                }



            }

        }

    }


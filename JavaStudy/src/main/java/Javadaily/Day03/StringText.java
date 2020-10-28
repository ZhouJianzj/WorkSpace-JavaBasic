package Javadaily.Day03;

import java.util.Scanner;

/**
 * @ClassName StringText
 * @Description TODO
 * @Author
 * @Date 2020/10/22
 **/
public class StringText {
    public static void main(String[] args) {
        //        获取键盘输入并赋值给S1字符串
        Scanner s1 = new Scanner(System.in);
        System.out.println("请给字符串a赋值");
        String a =s1.nextLine();
        Scanner s2 = new Scanner(System.in);
        System.out.println("请给字符串b赋值");
        String b = s2.nextLine();
        System.out.println("字符串a的内容为：" +  a);
        System.out.println("字符串b的内容为：" +  b);


//        将两个字符串比较是否相同
        System.out.println("两个字符串是否相等？" + a.equals(b));
//        比较连个字符串是否为同一个对象
        System.out.println( a == b);
//        比较两个字符串内容是否相同
        System.out.println("字符串内容是否相同：" + a.equals(b));
//        比较两个字符串（忽略大小写）
        System.out.println(a.equalsIgnoreCase(b));
//        将两个字符串合并成一个新的字符串
        String c = a + b;
        System.out.println(a + b );
//        查找某一个字符串是否包含在此字符串之中，如果包含，包含了多少次
        Scanner s3 = new Scanner(System.in);
        System.out.println("请输入你要查找的字符串");
        String d = s3.nextLine();
//        子字符串是否包含在从字符串之中，包含输出true，不包含则输出false
        boolean con = c.contains(d);
        System.out.println("子字符串是否被包换在此字符串当中：" + con);
//        调用count输出包含次数
        System.out.println("包含次数：" +repetitions(c,d));
//        把字符串替换成其它新的指定的字符串
        Scanner s4  = new Scanner(System.in);
        System.out.println("请选择是否替换字符串： 确定（1）/拒绝（2）" );
        int e = s4.nextInt();
        switch (e){
            case 1 :
                Scanner s5 = new Scanner(System.in);
                System.out.println("请输入想要替换的原字符");
                String f = s5.nextLine();
                Scanner s6 = new Scanner(System.in);
                String g = s6.nextLine();
//               将f替换为g
                String z  =c.replace(f,g);
                System.out.println("替换前：" + c);
                System.out.println("替换后：" + z);
                break;
//               查询类型2，不替换
            case 2 :
                System.out.println("最终的字符串内容为：\n" + c);
            default:
                System.out.println("该字符串有误");
        }


    }
    public static int repetitions(String c ,String d){
//        创建repetition统计出现次数
//        创建一个计数器，统计次数
        int count = 0;
        int fromIndex = 0;
//        循环到没有输出-1是就停止循环
        while ((fromIndex = c.indexOf(d, fromIndex)) != -1){
//            字符串一次出现的位置+长度=下一次的起始位置
            fromIndex = fromIndex + d.length();
            count++;
        }
        return count;
    }
}

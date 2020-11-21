package StringMethods;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.sql.SQLOutput;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equal;

/**
 * @ClassName StringConstruct
 * @Description TODO
 * @Author
 * @Date 2020/11/18
 **/
public class StringConstruct  {
    public static void main(String[] args) {
//        指定字符串的下标输出字符
        char a = "周健".charAt(1);
        System.out.println(a);



//        比较字符串
//       注意：的是要是第一个字符串就比较能分出胜负就不在比较了
//        输出为0表示两个字符串相等
        System.out.println("abc".compareTo("abc"));
//        输出为-1表示前小后大
        System.out.println("abcd".compareTo("abce"));
//        输出为1表示前大后小
        System.out.println("abce".compareTo("abcd"));
//        只要是第一个能比较出来后面就不在比较了，这里输出的是-1
        System.out.println("adfaf".compareTo("basda"));
        String a1 = "abc";
        String a2 = "abc";
        System.out.println("========>"+ a1.equals(a2));
        System.out.println( "========>"+ a1.compareTo(a2));
        System.out.println(equal("abc", "abc"));

//        判断前面的字符串是否包含后面的字符串，返回值是一个Boolean类型的
//        输出为true
        System.out.println("https://wwww.java".contains(".java"));
//        输出为false
        System.out.println("https://www.java".contains("http://"));


//        判断某一个字符串是否以某一个字符串结尾
        System.out.println("WoAiNiZhongGuo".endsWith("Guo"));


//        判断两个字符串是否相等忽略大小写
        System.out.println("Adc".equalsIgnoreCase("abc"));

//        将字符串对象转换成byte数组，转换成 byte
        byte[] aa = "abc".getBytes();
        for (int i = 0;i < aa.length;i++){
            System.out.print(aa[i] + " ");
        }


//        判断某一个子字符串出现在字符串的索引
//        下面的例子输出为22也就是.出现的下标
        System.out.println();
        System.out.println("https://www.javascript.com".indexOf(".com"));

//        split 后面跟的是一个正则表达式 拆分字符串，返回的是一个字符型数组 String[]
        String[] split = "1999-06-27".split("-");
        for (int i = 0;i<split.length;i++) {
            System.out.print(split[i] + " ");
        }
//       替换的使用replace
        System.out.println("zhoujianzhoujianzhoujianzhoujian".replace("zhoujian", "周健"));


//        startsWith 表示的是以什么开始的字符串，返回值是一个boolean
        System.out.println("http://www.zhoujian.com".startsWith("https://"));

//        截取字符串 subString
        System.out.println("https://www.baidu.com".substring(8, 11));


        char[] chars = "zhoujian".toCharArray();
            for (int i = 0;i<chars.length;i++){
            System.out.println(chars[i]);
        }

//       字符串转换大小写 toLowerCase  toUpperCase
        System.out.println("zhoujian".toUpperCase());
        System.out.println("ZHOUJIAN".toLowerCase());

//        trim方法是去除字符串的前后的空白的

//     String.valueOf((需要转换成字符串的数据)new Students())
//      注意：当需要转换的数据是一个引用的时候，没有OverRide方法的时候就会是一个内存地址
//      valueOf方法当中时调用你new的类的toString方法的，但是你需要给一个对象转换成字符串就需要重写toString方法

        String string = String.valueOf(new Student());
        System.out.println(string);

    }
}
class Student{
    @Override
    public String toString() {
        return "你是一个好学生";
    }
}

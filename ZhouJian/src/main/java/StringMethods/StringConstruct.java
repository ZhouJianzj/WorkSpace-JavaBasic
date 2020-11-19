package StringMethods;

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


//        
    }
}

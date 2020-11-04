package Javadaily.Day15;

import java.lang.annotation.Repeatable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.text.DecimalFormat;

import static jdk.nashorn.internal.objects.NativeArray.concat;

/**
 * @ClassName StringUtil
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/4
 **/


public class StringUtil<index> {
    /**
     * 判断是否是空字符串 null 和 “” 都返回true
     */
    public static boolean isEmpty(String str){
        return str == null || "".equals(str);
    }
    /**
     * 字符串省略截取
     * 字符串截取到指定的长度 size+...的形式
     * @subject 需要处理的字符串
     * @size 截取的长度
     * @retrun 处理后的字符串
     */
    public static String subStringOmit(String subject,int size){
        if(subject != null && subject.length() >size){
            subject = subject.substring(0,size) + "...";
        }
        return subject;
    }
    /**
     * 隐藏邮件地址的前缀
     * Email 邮件的地址
     * @return 隐藏之后的邮件地址
     */
    public static String getHideEmailsPrefix(String email){
        if(null != email){
            int index = email .lastIndexOf('@');
            if(index >0){
                email = repeat("*",index).concat(email.substring(index));
            }
        }
        return  email;
    }
    /**
     * repeat 通过源字符串重复的生成N次组成新的字符串
     * src    源字符串
     * num      重复生成的字符串的次数
     */
    public static String repeat(String src ,int num){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < num; i++){
            s.append(src);
        }
        return s.toString();
    }
    /**
     * 截取字符串的左侧Num位一直到末尾
     * @str1 处理的字符串
     * @num 开始位置
     * return  返回截取后的字符串
     */
    public static String LTrim(String str1 ,int num){
        String tt = "";
        if(!isEmpty(str1) && str1.length() < num){
            tt = str1.substring(num,str1.length());
        }
        return tt;
    }
    /**
     * 根据指定的字符串把原来的字符串分割成一个List
     *
     * src  处理的字符串
     * pattern 分割字符串
     * return 处理后的List
     */
    public static List<String> parseString2List(String src ,String pattern){
        List<String> list = new ArrayList<>();
        if (src != null){
            String[] tt = src .split(pattern);
            list.addAll(Arrays.asList(tt));
        }
        return list;
    }

    /**
     *
     * @param f
     * @param format 要格式化的格式
     * @return 格式化后的字符串
     */
    public static String formatDouble(double f,String format){
        DecimalFormat df= new DecimalFormat(format);
        return df.format(f);
    }

    /**
     * 截取字符串的左侧的指定的字符串长度
     * @param input 输入的字符串
     * @param count 需要截取的长度
     * @return  截取后的字符串
     */
    public static String left(String input ,int count){
        if(isEmpty(input)){
            return "";
        }
        count = Math.min(count,input.length());
        return input.substring(0,count);

    }

    /**
     * 删除所有的标点符号
     * @param str 处理的字符串
     * @return
     */
    public static String trimPunct(String str){
        if(!isEmpty(str)){
            return str.replaceAll("[\\pP\\p{Punct}]","");
        }
        return "";
    }

    /**
     * 获取字符串str 在 String中出现的次数
     * @param string    处理字符串
     * @param str   子字符串
     * @return
     */
    public static int countSubStr(String string ,String str){
        if ((str == null) || (str.length() == 0) || (string == null) || string.length() == 0 ){
            return 0;
        }

        int count = 0;
        int index = 0;

        while( (index = string.indexOf(str,index)) != -1){
            count++;
            index +=str.length();
        }
        return count;
    }


}
class Test{
    public static void main(String[] args) {
//        字符串出现在另一个字符串当中的次数
       int a = StringUtil.countSubStr("我爱中国","我");
        System.out.println(a);
//        删除所有标点符号
        System.out.println(StringUtil.trimPunct("我在我自己呀！我太喜欢我自己了呀！"));
//        获取截取字符串的
        System.out.println(StringUtil.left("今天你和我约会了吗！",5));
//       格式化
        System.out.println(StringUtil.formatDouble(2.0,"2"));
    }
}

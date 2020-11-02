package Javadaily.Day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName TestRegex
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/2
 **/
public class TestRegex {
    public static void main(String[] args) {


        String str = "";
        String regex = "";
//    匹配
        regex = "[1-9][a-z]";
        getMatches(str, regex);
//        分割
        str = "la<a>:abc123:</a>";
        regex = ":";
        getSplit(str, regex);
//        替换
        str = "1223334444aaabbc";
        String oldChar = "(.)\\1+";
        regex = "$1";
        getReplace(str, oldChar, regex);

//        截取
        str = "<title>test string </title><a>url</a><content>abc123<content>";
        regex = "<a>(.x)</a>";
        getSubstring(str, regex);
    }

    public static void getMatches(String str, String regex) {
        System.out.println(str.matches(regex));
    }

    public static void getSplit(String str, String regex) {
        String[] array = str.split(regex);
        for (String t : array) {
            System.out.println(t);
        }

    }

    public static void getReplace(String str, String oldChar, String regex) {
        System.out.println(str.replaceAll(oldChar, regex));

    }
    public static void getSubstring(String str ,String regex){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if (m.find()){
            System.out.println(m.group(1));
        }
    }
}
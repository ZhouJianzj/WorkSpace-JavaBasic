package JavaBasic.week6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
//        创建一个
       ArrayList<String> list =  new ArrayList<>();

       list.add("java");
       list.add("javaScript");
       list.add("java");
//       随机取出list中的元素
        System.out.println(list.get(2));
//        使用for循环
        System.out.println("=======================================");
        for (String s : list){
            System.out.println(s + ",");
        }
//        使用Iterator迭代器
        System.out.println("=======================================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + ",");
        }
//        使用lambda表达式
        System.out.println("=======================================");
        list.forEach(s -> System.out.println(s));
//        终极简单版
        list.forEach(System.out :: println);
    }
}

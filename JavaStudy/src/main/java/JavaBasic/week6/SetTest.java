package JavaBasic.week6;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description TODO
 *                                        Set接口的测试
 * @Author ZhouJian
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
//        Set集合
        Set<String> set = new TreeSet<>();
        set.add("C");
        set.add("A");
        set.add("B");
        System.out.println(set);
        System.out.println("==============================");
//        使用for循环遍历
        for (String s:set){
            System.out.println(s);
        }
        System.out.println("==============================");
//        使用迭代器
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
//        使用lambda表达式
       set.forEach(System.out::println);
       set.forEach(s ->System.out.print(s));
        System.out.println("==============================");
        int[] a = {1,4,5,6,7};
        for (int b : a){
            System.out.println(b);
        }
    }
}

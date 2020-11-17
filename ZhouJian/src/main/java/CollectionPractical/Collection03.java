package CollectionPractical;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @ClassName Collection03
 * @Description TODO
 *                                              HashSet集合
 * @Author
 * @Date 2020/11/17
 **/
public class Collection03 {
    public static void main(String[]args){
//        HashSet当中的元素不可以重复的
        Collection a  = new HashSet();
        a.add("nihao");
        a.add("nihao");
        a.add("你好");
        a.add(123);
//        迭代器
        Iterator iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        使用高级的for循环
       int[] b = {1,2,3,4};
        for (int c:b){
            System.out.println(c);
        }
    }
}

package CollectionPractical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName Collectio02
 * @Description TODO
 *                          ArrayList集合
 * @Author
 * @Date 2020/11/17
 **/
public class Collection02 {
    public static void main(String[] args) {
//        ArrayList 当中的元素可以重复
        Collection a = new ArrayList();
        a.add("nihao");
        a.add("nihao");
        a.add("你好");
        a.add(123)  ;
//        迭代器的使用
        Iterator iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName CollectionItertor
 * @Description TODO
 *              Iterator 迭代器不可以在map当中使用
 * @Author
 * @Date 2020/11/16
 **/
public class CollectionIterator {
    public static void main(String[] args) {
        Collection collection  = new ArrayList();
        collection.add("123");
        collection.add("周健");
        collection.add("niHao");
        collection.add("zhonguo");

//        使用迭代器遍历
        Iterator iterator = collection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

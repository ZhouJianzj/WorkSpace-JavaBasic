import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName Collection
 * @Description TODO
 *                                          Collection 接口
 * @Author
 * @Date 2020/11/16
 **/
public class Collection01 {
    public static void main(String[] args) {
//        collection 当中的基本常用的方法，这里先不说泛型的概念
    Collection collection = new ArrayList();
    collection.add("nihao");
    collection.add("中国");
    collection.add(123);
    collection.add("wo");
//    集合的长度
        System.out.println(collection.size());
//    移除集合当中的元素
        collection.remove("wo");
        System.out.println(collection);
//    判断集合是否为空的
        System.out.println(collection.isEmpty());
//    清空集合
        collection.clear();
        System.out.println(collection.isEmpty());
//     把集合转换成数组
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        Object[] objects = collection.toArray();
//        数组的遍历for循环高级写法
        for (Object a : objects){
            System.out.println(a);
        }

//        判断集合当中是否包含一个元素,返回是一个布尔类型的数据
        System.out.println(collection.contains("5"));
    }
}

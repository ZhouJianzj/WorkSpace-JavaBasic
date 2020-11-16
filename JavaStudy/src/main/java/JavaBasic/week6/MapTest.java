package JavaBasic.week6;

import sun.awt.SunHints;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 *                                        Map接口测试程序
 * @Author
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>(8  );
        map.put("apple",8);
        map.put("pear",8);
        map.put("banana",8);
        System.out.println(map);
//          for循环
        for (String key:map.keySet()){
            Integer integer = map.get(key);
            System.out.println(key + "单价为：" + integer);
        }
//        迭代的遍历
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
//        lambda遍历
        map.forEach((Key,value) -> System.out.println("key:" + Key + " ,value" + value));
    }
}

package JavaBasic.week6.work01;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Teacher01
 * @Description TODO
 * @Author
 * @Date 2020/11/16
 **/
public class Teacher01 {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>(8  );
        map.put("Tom","oracle");
        map.put("john","oracle");
        map.put("susan","oracle");
        map.put("jerry","jdbc");
        map.put("jim","unix");
        map.put("kevin","jsp");
        map.put("lucy","jsp");

        map.put("allen","jdbc");
        map.replace("lucy","CoreJava");
//      第一种遍历
        for (Map.Entry<String ,String> entry : map.entrySet()){
            System.out.println("老师" + entry.getKey() + "课程" +entry.getValue() );
        }

    }
}
package ReflectTest.KuangJiaRelize;

import java.util.Properties;
import java.util.Set;

/**
 * @ClassName PropertiesBianLian
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/18
 **/
public class PropertiesBianLian {
    public static void main(String[] args) {
        show01();
    }

    /*
        使用Properties集合存储数据，遍历取出Properties集合中的数据
        Properties集合是一个双列集合，key和value默认都是字符串
        Propertoes集合有一些操作字符串的特有方法
            Object setProperty(String key,String value) 调用Hashtable的方法 put
            String getProperty(String key) 通过key找到value值，此方法相当于Map集合中的get(key)方法
            Set(String) stringPropertyNames() 返回此属性列表中的键值，其中该键值及其对应值是字符串，此方法相当于Map 集合中的keySet方法

    */
    private static void show01() {
        //创建Properties集合对象
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","167");
        prop.setProperty("迪丽热巴","169");
        prop.setProperty("古力娜扎","170");

        //使用StringPropertyNames把Properties集合中的键取出，存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();

        //遍历Set集合，取出Properties集合的每一个键
        for (String key : set) {
            //使用getProperty方法通过key获取value
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }

    }
}


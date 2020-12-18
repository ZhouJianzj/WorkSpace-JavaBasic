package ReflectTest.KuangJiaRelize;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName TestReflect01
 * @Description TODO
 * @Author ZHouJian
 * @Date 2020/12/18
 **/
public class TestReflect01 {
    public static void main(String[] args) {
        try {
//            建立管道
            FileReader reader = new FileReader("D:\\workspace\\ZhouJian\\src\\main\\java\\ReflectTest\\KuangJiaRelize\\Config");
//            建立好存储池类似map集合的propertied
            Properties properties = new Properties();
//            装载
            properties.load(reader);
//            记得关闭流
            reader.close();
//            键和值分开，key使用一个set集合存储
//            Set<String> set = properties.stringPropertyNames();
//            接下来的map数组就有数据了,就开始获取key的 value的值了
//            for (String key : set){
//               通过key获取value
//                String className = properties.getProperty(properties.getProperty(key));
                try {
//                    获取点class文件
//     注意：这里的key必须是复制的最好要不然一直的报错，所以这样的循环不可以
                    String classNameOne = properties.getProperty("ClassNameOne");
                    Class c = Class.forName(classNameOne);
//                    点class文件反射机制，实例对象
                    try {
                        Object o = c.newInstance();
                        System.out.println(o);

                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
//                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


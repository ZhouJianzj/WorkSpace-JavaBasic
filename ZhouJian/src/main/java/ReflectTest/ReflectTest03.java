package ReflectTest;

import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName ReflectTest03
 * @Description TODO
 *                         使用获取点class文件的方式实例化对象的优点
 *                          OCP开发原则（扩展开放，修改关闭）
 * @Author ZhouJian
 * @Date 2020/12/18
 **/
public class ReflectTest03 {
    public static void main(String[] args) {
            //  创建输入管道
            try {
                FileReader reader = new FileReader("D:\\workspace\\JavaStudy\\UserNameAndPassWord");
//            创建存储容器
                Properties pro = new Properties();
                pro.load(reader);
//           关闭流
                reader.close();
                String useName = pro.getProperty("UseName");
//            使用第二种方法去获取class
                Class c = null;
                try {
//                这里需要使用的是第一中方式去实现
                    c = Class.forName(useName);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                try {
//               反射机制的实例class成为之前的对象，返回值是一个Object
                    Object o = c.newInstance();
                    System.out.println(o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

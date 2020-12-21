package ReflectTest;

import java.io.InputStream;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName GetPath
 * @Description TODO
 *                                  拿到src下的文件的绝对路径
 *                                      1、返回String
 *                                      2、以流的方式返回
 *          上下都是在类路径下面
 *                                  资源绑定器
 *                                       1、java.util下的
 *                                       2、 绑定的是扩展名是properties文件name的时候必须去掉扩展名
 * @Author ZhouJian
 * @Date 2020/12/19
 **/
public class GetPath {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
//        1、获取当前线程
//        2、获取当前的类加载器
//        3、获取资源、当在同一个类下直接写参照，不在同一个类下需要写完整的src/。。。。
        String reflectPath = Thread.currentThread().getContextClassLoader()
                .getResource("src/main/resources/GetPath.kt").getPath();
//        可以直接以流的形式返回
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("");

//        System.out.println(reflectPath);

//        资源绑定器，获取配置文件中内容，使用下面方法的时候只能是点properties文件
//        不可以带后缀
         ResourceBundle resourceBundle = ResourceBundle.getBundle("");
//        返回的className的value值，之前的properties容器的什么的可以换成这的写法
        String value = resourceBundle.getString("className");
    }
}

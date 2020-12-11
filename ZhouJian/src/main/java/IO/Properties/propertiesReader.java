package IO.Properties;

import java.io.*;
import java.util.Properties;

/**
 * @ClassName propertiesReader
 * @Description TODO
 *                      UserNameAndPassWord像这种文件就是属性配置文件，
 *                      一般是以.properties结尾
 *                          主要的方法就是load（）；
 *
 * @Author ZhouJian
 * @Date 2020/12/11
 **/
public class propertiesReader {
    public static void main(String[] args) {
        try {
//            创建文件夹
//            File f = new File("UserNameAndPassWord");
//            f.createNewFile();
            Reader reader = new FileReader("UserNameAndPassWord");
//            创建一个集合使得输入的数据能够有点方存储
            Properties properties = new Properties();
//            map数组去装载数据
            properties.load(reader);
//            获取key 的value
            String property = properties.getProperty("UseName");
            System.out.println(property);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

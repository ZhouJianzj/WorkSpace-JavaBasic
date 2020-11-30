package JavaBasic.week7;

import java.io.File;
import java.util.Date;

/**
 * @ClassName FileTest
 * @Description TODO
 * @Author ZhouJian'
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
        File fileTest = new File("C:\\Users\\Administrator\\Desktop\\离散数学");
//        查看路径
        System.out.println(fileTest.getAbsolutePath());
//        查看文件的名字
        System.out.println(fileTest.getName());

        File dir = new File("C:\\Users\\Administrator\\Desktop\\目录");
        if(!dir.exists()){
            boolean flag = dir.mkdirs();
            System.out.println(flag);

        }
    }
}

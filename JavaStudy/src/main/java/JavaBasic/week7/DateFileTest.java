package JavaBasic.week7;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 * @ClassName DateFileTest
 * @Description TODO
 *                     创建一个文件夹并且命名为当天的日期
 *                     使用到的方法：
 *                      mkDirs
 *                      getFileAbsoluterPath()
 *                      getName()
 * @Author ZHouJIan
 * @Date 2020/11/30
 **/
public class DateFileTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-HH-dd HH:mm:ss");
        String dirName = today.getYear() + "-" + today.getMonthValue()+ "-"+ today.getDayOfMonth();
//        给定一个路径 并且按照自己的想法定义文件夹的名字
        File file = new File("C:\\Users\\Administrator\\Desktop\\" + dirName);
//        增强程序的逻辑性,判断文件夹是否已经存在了
        if (!file.exists()){
//            创建文件夹返回一个Boolean类型的值来判断是否创建好文件夹了
            Boolean flag = file.mkdirs();
            System.out.println("创建文件夹成功与否" + flag);
        }
//        输出文件的绝对的路径
        System.out.println(file.getAbsolutePath());
//        输出文件的名字
        System.out.println(file.getName());
//      删除文件夹
//        if (file.exists()){
//            boolean flag = file.delete();
//            System.out.println("文件是否被删除："+ flag);
//        }


    }

}

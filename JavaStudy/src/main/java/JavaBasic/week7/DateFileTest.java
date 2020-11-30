package JavaBasic.week7;

import java.io.File;
import java.time.LocalDate;

/**
 * @ClassName DateFileTest
 * @Description TODO
 * @Author ZHouJIan
 * @Date 2020/11/30
 **/
public class DateFileTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String dirName = today.getYear() + "-" + today.getMonthValue()+ "-"+ today.getDayOfMonth();
        File file = new File("C:\\Users\\Administrator\\Desktop\\" + dirName);
        if (!file.exists()){
            Boolean flag = file.mkdirs();
            System.out.println(flag);
        }
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
//      删除文件夹
        if (file.exists()){
            boolean flag = file.delete();
            System.out.println("文件是否被删除："+ flag);
        }


    }

}

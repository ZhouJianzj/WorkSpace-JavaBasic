package JavaBasic.week7;

import java.io.File;
import java.time.LocalDate;

/**
 * @ClassName DiGuiChuangJianWenJianJia
 * @Description TODO
 * @Author
 * @Date 2020/11/30
 **/
public class DiGuiChuangJianWenJianJia {
    public static  int a = 1;
    public static void main(String[] args) {
        FileDate();
    }
    public static void FileDate(){
        //        递归创建文件夹
        LocalDate localDate = LocalDate.now();
        String today = localDate.getYear()+"-"+ localDate.getMonthValue()+"-"+localDate.getDayOfMonth() + a;
        File file1 = new File("C:\\Users\\Administrator\\Desktop\\" + today);
        a++;
        if(!file1.exists()) {
            boolean flag = file1.mkdirs();
            System.out.println(flag);
        }
            if( a <= 3){
                FileDate();
            }
        }
    }


package IO.FIle;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName CreatNewFileText
 * @Description TODO
 *                                              创建一个文件
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class CreatNewFileText {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Administrator\\Desktop\\A.txt");
        try {
            if (!f.exists()){
                f.createNewFile();
                System.out.println("!!!!!!!!!!!");
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

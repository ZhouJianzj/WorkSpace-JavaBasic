package IO.Copy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileCopy02
 * @Description TODO
 *                                      改近之后的文件的拷贝
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class FileCopy02 {
    public static void main(String[] args) {
        FileInputStream f = null;
        FileOutputStream ff = null;
        byte[] b = new byte[1024*1024];
        try {
            f = new FileInputStream("D:\\嗨格式录屏文件\\AA.mp4");
            ff = new FileOutputStream("D:\\嗨格式录屏文件\\A\\A.mp4");
            Button button = new Button();
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                }
            });
//          改近之后的写法
            while (f.available() != 0){
                int a = f.read(b);
                ff.write(b,0,a);
//                刷新的意思，清理输出管道防止防止数据丢失
                ff.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ff != null) {
                try {
                    ff.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (f != null) {
                    f.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

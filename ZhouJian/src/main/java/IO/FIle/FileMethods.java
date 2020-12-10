package IO.FIle;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName FileMethods
 * @Description TODO
 *                              File 类中的方法
 * @Author ZhouJian
 * @Date 2020/12/10
 **/
public class FileMethods {
    public static void main(String[] args) throws IOException {
//    创建一个文件
        File f = new File(""    );
//       生成一个文件
        if (!f.exists()) {
            f.createNewFile();
//       创建一个文件的路径
            f.mkdirs();
//            获取文件/路径的绝对路径
            String absolutePath = f.getAbsolutePath();
            File absoluteFile = f.getAbsoluteFile();
//       判断是否是一个文件/路径
            boolean file = f.isFile();
            boolean directory = f.isDirectory();
//       判断文件/路径是否是一个隐藏的文件
            boolean hidden = f.isHidden();
//       获取文件的最后一次修改时间
            long l = f.lastModified();
            Date d = new Date(l);
            SimpleDateFormat s = new SimpleDateFormat("EEEE, dd MMMM yyyy");
            String format = s.format(d);
//       获取当前目录下的所有的子文件
            File[] files = f.listFiles();
            for ( File file1 : files){
                System.out.println(file1.getName());
            }
        }


    }
}

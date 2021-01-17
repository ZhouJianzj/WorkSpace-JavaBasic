package IO.FIle;

import jdk.nashorn.internal.ir.IfNode;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName MkDirs
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class MkDirs {
    public static void main(String[] args) {
//        File对象范指的是一个文件或者是一个文件夹，里面的参数是文件的名称以及path
        File file = new File("C:\\Users\\Administrator\\Desktop\\a\\c.txt");
        try {
            if (!file.exists()) {
//               这里创建是一个文件，不是一个文件夹
//                file.createNewFile();
//                这里创建是一个文件夹
                file.mkdirs();
                file.mkdir();
                file.delete();
                String absolutePath = file.getAbsolutePath();
                System.out.println(absolutePath);
//                返回的是上一级的文件名
                String parent = file.getParent();
                System.out.println(parent);
//                返回的是上一级的文件夹
                File parentFile = file.getParentFile();
                System.out.println(parentFile);
            }
            file.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

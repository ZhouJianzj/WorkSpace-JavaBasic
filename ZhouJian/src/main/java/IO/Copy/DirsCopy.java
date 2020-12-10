package IO.Copy;

import java.io.*;
import java.nio.channels.FileLockInterruptionException;

/**
 * @ClassName DirsCopy
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/10
 **/
public class DirsCopy {
    public static void main(String[] args) {
//        拷贝源
        File file1 = new File("C:\\Users\\Administrator\\Desktop\\A");
//        粘贴路径
        File file2 = new File("D:\\嗨格式录屏文件");
//        调用复制的方法
        dircopy(file1,file2 );
    }
    public static void dircopy(File file1,File file2){
/**
 * 参数传递
 * file1 拷贝源            file2    粘贴到
 * 第一步：考虑拷贝之后的文件的名字路径安排
 * 第二步：判断copy是文件还是文件夹
 * 第三步：字节流输出文件
 */
//      得到的一个父路径的子路径数组
        File[] file1Name = file1.listFiles();
//        得到输出的路径的原始路径，为后面的正真的粘贴路径地址拼接做好准备
        String  ff = file2.getAbsolutePath();
//        使用循环遍历
       for (File file : file1Name){
//           当拷贝的是文件夹的时候
           if (file.isDirectory()){
//       预先得到输出路径的绝对的路径，从绝地路径字符串的第3个元素开始截取字符串,得到除盘符之外的字符串
                String fileSub = file.getAbsolutePath().substring(3);
//       拼接路径为拷贝之后文件路径
                file2  = new File(ff+"\\" + fileSub);
//                控制台预览一下
                System.out.println(file2.getAbsolutePath());
//                创建路径
                file2.mkdirs();
           }
//           不是路径就是文件
           else{
//               一样的方法，得到去除盘符的最初的输出路径
               String fileSub = file.getAbsolutePath().substring(3);
//              拼接拷贝之后文件路径
               file2  = new File(ff+"\\" + fileSub);
//               创建输入输出的管道
               FileInputStream in =null;
               FileOutputStream out = null;
               try {
//                   这里的输出路径应该是拼接好的路径并且可以追加
                   out = new FileOutputStream(file2,true);

               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               }
//               Exception的处理
               try {
//                   文件的输入当时文件的时候才会被被出入
                    in = new FileInputStream(file);
//                    建一个数组，以这个byte数组进行读取
                    byte[] b= new byte[10];
//                   文件的输入输出
                            while(in.available() !=0){
//                                边读取边输出
                                int read = in.read(b);
                                out.write(b,0,read);
//                                清空管道
                                out.flush();
                            }
                   System.out.println(file2);
;               } catch (IOException e) {
                   e.printStackTrace();
               }finally {
                   if (out != null) {
                       try {
                           out.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
                   if (in != null) {
                       try {
                           in.close();
                       } catch (IOException e) {
                           e.printStackTrace();
                       }
                   }
               }
           }

//
       }
    }

}

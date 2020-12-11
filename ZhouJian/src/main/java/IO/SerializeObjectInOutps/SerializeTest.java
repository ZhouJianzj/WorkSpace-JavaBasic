package IO.SerializeObjectInOutps;

import java.io.*;

/**
 * @ClassName SerializeTest
 * @Description TODO
 *                          serializable  是一个标志接口 里面没有方法
 *                          序列化
 *                          当JVM看到标志性接口时候会自动生成一个序列化版本号
 * @Author
 * @Date 2020/12/10
 **/
public class SerializeTest {
    public static void main(String[] args) throws IOException {
        Student s =new Student("zhoujian",88888888);
        ObjectOutputStream o = null;
        try {
             o = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\A.txt",true));
            o.writeObject(s);
            o.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                o.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//          下面的代码是反序列化的实现
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\A.txt"));
        try {
            Object o1 = ois.readObject();
            System.out.println(o1.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ois != null) {
                ois.close();
            }

        }
    }
}

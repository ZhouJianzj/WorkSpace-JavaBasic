package TextClass;

import java.io.*;
import java.util.Random;

/**
 * @ClassName ShuJuJiaMi
 * @Description TODO
 * @Author
 * @Date 2021/1/14
 **/
public class ShuJuJiaMi {
    public static void main(String[] args) {
        int a  = 520;
        String b = "我爱你";
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt"));
            dataOutputStream.writeInt(a);
            dataOutputStream.writeUTF(b);
            dataOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt"));
            int i1 = dataInputStream.readInt();
            System.out.println(i1);
            String s = dataInputStream.readUTF();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package IO.OutputStream;



import javax.lang.model.element.VariableElement;
import java.io.*;

/**
 * @ClassName DataOutputStream
 * @Description TODO
 *                          Data数据输出流
 *                          可以输出数据的类型:使用这种方法可以进行加密
 * @Author ZhouJian
 * @Date 2020/12/9
 **/
public class DataOutputStreamShuJuJiaMi {
    public static void main(String[] args) {
        DataOutputStream dataOutputStream = null;
        try {
             dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt"));
            byte b =1;
            short s = 3;
            int i = 5;
            long l = 1000;
            boolean falg = false;
            char c = '我';
            String ss = "是中国人";
            double d = 3.14;
            float f = 0.3F;
            dataOutputStream.writeByte(b);
             dataOutputStream.writeInt(i);
            dataOutputStream.writeShort(s);
            dataOutputStream.writeLong(l);
            dataOutputStream.writeBoolean(falg);
            dataOutputStream.writeChar(c);
            dataOutputStream.writeUTF(ss);
            dataOutputStream.writeFloat(f);
            dataOutputStream.writeDouble(d);
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        DataInputStream dataIn = null;
        try {
            dataIn = new DataInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\AAA.txt"));
            byte b = dataIn.readByte();
            int i = dataIn.readInt();
            short s = dataIn.readShort();
            long l = dataIn.readLong();
            boolean bb = dataIn.readBoolean();
            char c = dataIn.readChar();
            String s1 = dataIn.readUTF();
            float f = dataIn.readFloat();
            double d = dataIn.readDouble();
            System.out.println(b +" "+ " " +s+" " +" "+ i +" "+l );
            System.out.println(bb);
            System.out.println(c + s1);
            System.out.println(f +" "+ d);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dataIn != null) {
                try {
                    dataIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

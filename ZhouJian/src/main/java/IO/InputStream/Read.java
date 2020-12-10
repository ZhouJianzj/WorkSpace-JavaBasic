package IO.InputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName Read
 * @Description TODO
 * @Author
 * @Date 2020/12/9
 **/
public class Read {
    public static void main(String[] args) {
        Reader r = null;
        int a = 0;
        try {
            r = new FileReader("C:\\Users\\Administrator\\Desktop\\AAA.txt");
            char[] c = new char[4];
            while (( a = r.read(c)) != -1){
                System.out.println(new String(c,0,a));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

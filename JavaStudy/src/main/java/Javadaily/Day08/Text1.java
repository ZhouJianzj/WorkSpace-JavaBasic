package Javadaily.Day08;

import javax.sound.midi.Soundbank;

/**
 * @ClassName Text1
 * @Description TODO
 * @Author
 * @Date 2020/10/28
 **/
public class Text1 {
    public static void main(String[] args) {
        String a = new String("ab");
        String b = new String("ab");
        String aa = "ab";
        String bb = "ab";

        if( a == b){
            System.out.println(a == b);
        }else{
            System.out.println("a类 ！=  b类");
        }
        if( aa == bb){
            System.out.println(aa == bb);
        }
        if( a.equals(b)){
            System.out.println(a.equals(b));
        }
        if(42 == 42.0){
            System.out.println( 42 == 42.0);
        }
    }
}

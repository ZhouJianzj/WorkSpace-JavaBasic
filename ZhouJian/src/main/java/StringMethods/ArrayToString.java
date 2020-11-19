package StringMethods;

/**
 * @ClassName ArrayToString
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/18
 **/
public class ArrayToString {
    public static void main(String[] args) {
        byte[] a = {97,98,99,100};
        String aa = new String(a);
        System.out.println(aa);
//      可以像下面这个样子去new一个字符串
        String ab = new String(a,2,2);
        System.out.println(ab);
    }
}

package Package;

/**
 * @ClassName JavaInteger
 * @Description TODO
 *                          8种基本数据类型的包装类型之Integer
 * @Author ZhouJian
 * @Date 2020/11/22
 **/
public class JavaInteger {
    public static void main(String[] args) {
//        这个叫做装箱
        Integer i = new Integer(1223);
//        这个叫做拆箱
        int i1 = i.intValue();
        System.out.println(i);
        System.out.println(i1);
    }
}

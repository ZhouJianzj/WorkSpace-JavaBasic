package Package.Integer;

/**
 * @ClassName IntegerAndStringAndInt
 * @Description TODO
 * @Author
 * @Date 2020/11/23
 **/
public class IntegerAndStringAndInt {
    public static void main(String[] args) {
//        String 转成 int
        String a = "123";
        int a1 = Integer.parseInt(a);

//        int 转换成 String
        int b = 123;
        String b1 = String.valueOf(b);
        String b2 = b + "";

//        int 转换成 Integer
        int c = 123;
        Integer c1 = Integer.valueOf(c);

//        Integer 传换成 int,这里涉及到拆箱的概念，以此类推其它继承Numberde
//        都有什么什么Value（）方法
        Integer d = new Integer(123);
        int d1 = d.intValue();
        int d2 = d;

//        Integer 转换成 String
        Integer e = new Integer("123");
        String e1 = e.toString();
        String e2 = String.valueOf(e);

//        String 转换成 Integer
        String  f = "123";
        Integer f1 = Integer.valueOf(f);

/**
 * 总结:
 *      要转换到的.valueOf()：
 *          前面的苏剧类型就是你需要转换到的数据类型，例如：Integer a = Integer.valueOf()
 *
 *
 *
 *      要转换的引用数据.要转到的数据类型Value():
 *      要转换的数据类型.parse要转到的数据类型();
 *          是8大包装类型的一个特有的方法，valueOf都有，前面是一个引用的数据类型，也就是你需要转换的数据的引用地址，
 *          例如：   Integer b = new Integer(123)
 *                  int a = b.intValue();
 *                  int a =  Integer.parseInt(b)；
 */

    }
}

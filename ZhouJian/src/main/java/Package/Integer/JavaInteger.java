package Package.Integer;

/**
 * @ClassName JavaInteger
 * @Description TODO
 *                          8种基本数据类型的包装类型之Integer
 * @Author ZhouJian
 * @Date 2020/11/22
 **/
public class JavaInteger {
    public static void main(String[] args) {
//        重要的方法在后面
//        这个叫做装箱
        Integer i = new Integer(1223);
//        这个叫做拆箱
        int i1 = i.intValue();
        System.out.println(i);
        System.out.println(i1);
//        jdk5之后就开始自动装箱自动拆箱，就是方便编程
        Integer a = 900;
//        拆箱的时候会转换成基本的数据类型，一开始引用数据类型是不可以与1相加的
        int b = a + 1;
        System.out.println(b);
//        下面是一个自动装箱的过程
         Integer aa = 1000;
         Integer bb = 1000;
//         输出是false
        System.out.println(aa == bb);
        aa = bb;
//        输出是true
        System.out.println(aa == (bb));

        Integer x = 128;
        Integer y = 128;
//        这里输出的是一个false
        System.out.println(x == y);
        Integer xx = 127;
        Integer yy = 127;
//        这里的是true是因为保存的内存地址正好是Integer
//        常量池的同一个内存地址，127是最大的范围超过了要去堆内存当中去new
//        了，所以当为128的时候就输出false了
//        内部是一个Integer的数组最小是-128，最大是127
        System.out.println(xx == yy);

//        会出现NumberFormatException异常的报错
//        Integer aaa =new Integer("中国");
//        System.out.println(aaa);



//        重要的一个静态的方法
        Integer bbb =Integer.parseInt("123");
        System.out.println(bbb + 123);
//        以下的方法作为了解
//              转换成进制字符串
//                  把3转换成二进制
       String  number = Integer.toBinaryString(2);
//                  转换成16进制
       String number01 = Integer.toHexString(16);
//                  转换成8进制
        String number02 = Integer.toOctalString(8);
        System.out.println(number + " " + number01 + " " + number02 + " ");

//        valueOf 可以给String and int 转换成 Integer
        Integer string = Integer.valueOf("124");
        Integer int1 = Integer.valueOf(123);
    }
}

package StringMethods;

/**
 * @ClassName StringClass
 * @Description TODO
 * @Author
 * @Date 2020/11/18
 **/

    public class StringClass {
        public static void main(String[] args) {
//        在方法区里面储存的,在方法区当中开辟空间的
            String a = "zhoujian";
            String aa = "zhoujian";
//         new在堆内存当中开辟空间存储内存地址指向方法区常量池里的字符
            String b = new String("zhoujian");
            String bb = new String("zhoujian");
            System.out.println(a.hashCode());
            System.out.println(b.hashCode());

//         true输出的时候
            System.out.println(a == aa);
//        false输出的时候
            System.out.println(b == bb);

//        得出结论就是比较两个字符串的时候不能使用==要使用equals去比较
            System.out.println(a.equals(aa));
            System.out.println(a.equals(bb));
//        建议这样子书写代码,不会出现空指针的异常exception
            System.out.println("zhoujian".equals(a));


        }
    }



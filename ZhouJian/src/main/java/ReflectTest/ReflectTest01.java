package ReflectTest;

/**
 * @ClassName ReflectTest
 * @Description TODO
 *                                  Class三种获取方式
 *                                      1、Class.forName
 *                                      2、Object中的getClass
 *                                      3、每一类型的都有点class
 *
 * @Author Zhoujian
 * @Date 2020/12/18
 **/
public class ReflectTest01 {
    public static void main(String[] args) {
//        第一种获取class字节码文件的方法
        Class c  = null;
        try {
             c = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {

        }
//        第二种获取class字节码文件的方式
        String s = "你好";
        Class c1 = s.getClass();
//        他们代表是同一个对象
        System.out.println(c1 == c);
    }
//    第三种Class字节码获取方式
        Class cc = String.class;
        Class cc1 = int.class;
        Class ccc = Boolean.class;
}

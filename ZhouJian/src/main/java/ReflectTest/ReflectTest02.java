package ReflectTest;

/**
 * @ClassName ReflectTest02
 * @Description TODO
 *
 * @Author Zhoujian
 * @Date 2020/12/18
 **/
public class ReflectTest02 {
    public static void main(String[] args) {
        Other o = new Other(1);
        Class c = Other.class;
        try {
//            这里的newInstance叫做创建实例，要求就是类中要有一个无参构造
            Object o1 = c.newInstance();
            System.out.println(o1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
class Other{
    public Other(){}
    public Other(int a ){
        System.out.println("有参数的构造方法");
    }
}
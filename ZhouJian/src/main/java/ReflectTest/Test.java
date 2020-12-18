package ReflectTest;

/**
 * @ClassName Test
 * @Description TODO
 *                          通过Class中的newInstance方法去实例化一个对象
 *                          注意：newInstance方法是通过无参构造去实例化的
 * @Author ZhouJian
 * @Date 2020/12/18
 **/
public class Test {
    public Test(){
        System.out.println(111111111111L);
    }
    public Test(int a){
        System.out.println("test类实例化对象的有参数构造方法！");
    }
}
class aaaa{
    public static void main(String[] args) {
        try {
            Class c = Class.forName("ReflectTest.Test");
            try {
                Object o = c.newInstance();
                System.out.println(o);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
package ReflectTest;

/**
 * @ClassName ReflectTest04
 * @Description TODO
 *                                           Class.forName()会执行类加载，导致方法区里面的静态代码块执行
 * @Author ZhouJian
 * @Date 2020/12/19
 **/
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
//            会引发静态代码块的执行
            Class c= Class.forName("ReflectTest.StaticDaiMaKuai");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class StaticDaiMaKuai{
    static{
        System.out.println("这是一段静态的代码块！");
    }
}

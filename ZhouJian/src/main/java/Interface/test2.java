package Interface;

/**
 * @ClassName test2
 * @Description TODO
 * @Author
 * @Date 2020/10/29
 **/

/**
 * 接口和接口之间支持多继承
 * 类和接口之间也支持多继承
 *
 */
public class test2 {
    public static void main(String[] args) {
        A1 a1 = new B1();
        a1.doSome();
    }
}
interface A1{
    public abstract void doSome();
}
class B1 implements A1{

    @Override
    public void doSome() {
        System.out.println("多态的执行原则： 父类的引用调用父类的方法执行子类的overRide后的方法");
    }
}

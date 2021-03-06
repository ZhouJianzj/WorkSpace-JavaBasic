package TextClass;

/**
 * @ClassName ExtendsText
 * @Description TODO
 * @Author
 * @Date 2021/1/14
 **/
public class ExtendsText {
    public static void main(String[] args) {
        //向下转型的时候首先是需要new一个子类的对象再去转换成子类。下面的a调用不了B中的方法
        A a = new A();
        B b = (B) a;

        //这里是子类继承父类之后类中拥有的方法
        b.moving();
        b.running();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        //这样之后夫类型的引用就可以调用子类对象中的特有的方法了
        a.running();
        ((B) a).moving();

//        向上转型
        B b1 = new B();
        A a1 = (A) b1;
    }
}
class A {
    public void running(){
        System.out.println("在奔跑");
    }
}
class B extends A{
    public void moving(){
        System.out.println("在奔跑");
    }
}

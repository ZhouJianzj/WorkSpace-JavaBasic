package Interface;

/**
 * @ClassName Test3
 * @Description  继承和接口同时使用的时候    extends  and implements
 * @Author ZhouJian
 * @Date 2020/10/31
 **/
public class Test3 {
    public static void main(String[] args) {
//        FlyAble pig =  new Pig();
////        pig.fly();
        Pig pig = new Pig();
        pig.fly();
        pig.Run();
    }
}
interface FlyAble{
   public abstract void fly();
}
abstract class Animals{
    public abstract void Run();
}
class Pig extends Animals implements FlyAble{
    @Override   //这里需要重写抽象类当中的抽象方法
    public void Run() {
        System.out.println("我也会跑");
    }

    @Override   //这里需要重写接口当中的方法
    public void fly() {
        System.out.print("我是一直会飞翔的🐖");

    }
}
package TextClass;

/**
 * @ClassName StaticMethod
 * @Description TODO
 *                          父类的静态方法在 ，子类1中调 ，语句写道子类2中
 *                          执行到底是哪一个子类的方法
 * @Author ZhouJian
 * @Date 2020/12/13
 **/
public class StaticMethod {
    public static  void  name(){
        System.out.println("Test");
    }
    public void  s(){
        System.out.println("s");
    }
}
class ChildOne extends StaticMethod{
   StaticMethod ct = new Childtwo();
//   静态的方法不可以重写，所以在别的子类中调用的时候还是父类的方法输出

}
class Childtwo extends StaticMethod{
    @Override
    public void s() {
        super.s();
    }
}
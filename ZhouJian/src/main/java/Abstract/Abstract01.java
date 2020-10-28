package Abstract;

/**
 * @ClassName Abstract01
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/25
 **/

/**
 * 描述： 就是子类的每一个构造方法都带有super()都会去调用父类的无参构造目的就是初始化父类的参数
 */
public class Abstract01 {
    public static void main(String[] args) {
            new B(1);
    }
}

abstract  class A {
   public A(){
       System.out.println("当子类不是无参构造的时候，第一行是不是还有super（）呢？");
   }
}
 class B extends A{
    public B(int a){

    }
}

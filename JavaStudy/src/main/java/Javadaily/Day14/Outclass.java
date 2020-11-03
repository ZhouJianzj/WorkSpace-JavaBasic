package Javadaily.Day14;

/**
 * @ClassName Outclass
 * @Description
 * 局部类
 * 1、局部类不能使用任何的访问修饰符修饰
 * 2、局部类如果在方法中，可以直接使用方法中的变量，不需要通过Outclass.this.method方法获得
 *
 * @Author
 * @Date 2020/11/3
 **/
public class Outclass {
    public void doOther(){
        class InnerClass{
            InnerClass(String name){
                System.out.println("这是一个局部类的方法" + name);
            }
        }
        new InnerClass("zj");
        System.out.println("这是一个外部类方法");
    }
}
class TestClass{
    public static void main(String[] args) {
        new Outclass().doOther();
    }
}

package Javadaily.Day14;

/**
 * @ClassName OuterClass
 * @Description
 * 静态的的内部类: 就是再类前面加上static修饰
 *          注意不能再静态的成员内部访问非静态的外部类对象reference代码21行
 * @Author
 * @Date 2020/11/3
 **/
public class OuterClass {
    public OuterClass(){
        System.out.println("外部类方法");
    }
    public void doOther(){

    }
    protected static class InnerClass{
        public void doOther(){
            System.out.println("静态内部类的方法");
//            静态类内部不能访问非静态的外部类对象
//             OuterClass.this.doOther();
        }
    }
}
class TextClass{
    public static void main(String[] args) {
//        OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
//        注意这里的new内部类对象的时候 一之前的不同
        OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass();
        innerClass1.doOther();
    }
}

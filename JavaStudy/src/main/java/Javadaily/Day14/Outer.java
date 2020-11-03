package Javadaily.Day14;

/**
 * @ClassName Outer
 * @Description
 *  1、外部类访问内部内需要先new一个内部类的对象：new 内部类.method/var;
 *  2、内部类访问外部类：外部类.this.method/var;
 *  3、关于修饰符修饰的方法以及变量（除去static),外部类调用内部类或者内部类调用外部类不受限制
 * @Author
 * @Date 2020/11/3
 **/

/**
 * 成员类的创建
 */
public class Outer {
    private  String name ;
    public int a;
    public void SayHi(){
        System.out.println("外部类方法");
    }
    public Outer(){
        System.out.println("这是Outer类");
    }
   public void doInner(){
        new Inner().SayHi();
}


    class Inner{
        public Inner(){
            System.out.println("这是一个成员类");
        }
        public void doOther(){
            System.out.println("成员类当中的方法的调用是和引用点方法名");
        }
        public void SayHi(){
            Outer.this.SayHi();
           String a = Outer.this.name;
            System.out.println("成员类的方法");
            System.out.println(Outer.this.name);
        }
    }
}
/**
 * 内部类的也就是成员类的使用
 */
class OuterTest{
    public static void main(String[] args){
        Outer outer = new Outer();
//        创建成员类对象
//        语法结构：外面的类.成员类 对象名 = 外面对象名.new  成员类；
        Outer.Inner inner = outer.new Inner();
//        Outer outer1 = new Outer();
//        Outer.Inner inner1 = outer1.new Inner();
//        还可以这样new
        Outer.Inner inner1 = new Outer().new Inner();

//        内部类访问外部类
//        语法格式： 外部类.this.方法名    疑问??为什么sout可以输出但是但对访问的时候不可以 Outer.this.name;
//       ·                                       解决需要一个类型的变量来接受
//        Outer.this.xxx;

//        外部类访问内部类
//        语法格式: new 内部类().内部类方法/属性
    }
}
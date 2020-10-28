package Javadaily.Day04;

/**
 * @ClassName MyClassText
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/23
 **/
public class MyClassText {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
//        不建议下面的写法
       obj.methodStatic();

        MyClass.methodStatic();

        myMethod();
        MyClassText.myMethod();
    }
    public static void myMethod(){
        System.out.println("本类当中的静态方法可以直接省略类名直接写");
    }
}

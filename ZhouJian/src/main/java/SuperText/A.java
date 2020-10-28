package SuperText;

/**
 * @ClassName A
 * @Description TODO
 * @Author
 * @Date 2020/10/21
 **/

/**
 * 继承不了构造方法 但是可以使用super();调用，子类当中的构造方法也会执行当新建对象的时候
 * 意思就是在思考super的使用记住就是方法的调用父类的构造方法
 */
public class A{
    public A(){
        System.out.println("这是一个无参构造器");
    }
    public A(int a ){
        System.out.println("这是一个int类型的数据");
    }
    public A (String a){
        System.out.println("这是一个String类型的数据");
    }
    public A(boolean a ){
        System.out.println("这是一个 布尔类型的数据");
    }
}

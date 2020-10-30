package TextClass;

/**
 * @ClassName Test11
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/29
 **/
public class Test11 {

        final int a ;

    public Test11(int a){

        this.a = a;
    }
//    在无参的构造方法后面 为final修饰的变量（常量）赋值时不对的，要抢先在无参构造前面赋值。
//    public void doOther(){
//        a = 1;
//    }
}

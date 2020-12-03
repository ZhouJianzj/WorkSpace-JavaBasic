package Exception;

/**
 * @ClassName ExceptionTest03
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/3
 **/

/**
 *编译时的异常必须进行处理不然编译器不给过,会报错.
 *
 */
public class ExceptionTest03 {
    public static void main(String[] args) throws ClassNotFoundException {
//        这里直接调用doSome方法的时候会报错,因该在main方法的上面 throws 相关的异常,也可以throws给相关Exception的父类
//        doSome();
//        也可以采取捕获的方法进行处理
        try {
            doSome();
        } catch (Exception q){
            System.out.println("没有发现相关类的错误!");
            return;
        }
    }

    /**
     * 这里的Exception时编译时候的异常必须在编写程序的时候进行处理,不然编译器会报错
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException {
            System.out.println("异常的处理");
    }
}

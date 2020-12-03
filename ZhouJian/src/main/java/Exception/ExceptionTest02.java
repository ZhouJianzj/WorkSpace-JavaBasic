package Exception;

/**
 * @ClassName ExceptionTest02
 * @Description TODO
 *
 *    *****************注意：******所有的异常都是发生在运行的时候
 *
 *
 * 异常是以类的形式存在的当对象有异常的时候jvm会new一个异常并且在控制台输出
 *
 *          几个常用的异常Exception
 *              ArithmeticException
 *              OutOfIndexException
 *              NullPointerException
 *              NumberFormatException
 *
 * 异常处理机制
 *         UML图来描述一下继承的结构
 *              是一种统一的建模语言，是一种图标式语言，可以描述类与类之间的关系
 *                          Object
 *                             *
 *                         Throwable
 *                      *            *
 *                    error         Exception
 *                            （所有的异常都是在运行的时候发生的）
 *                    *         *               *
 *                IOError   ExceptionSubClass        RunTimeException（异常可以处理）
 *               *         直接子类(编译时候的异常)            （运行时候的异常）
 *（所有的错误一旦发生错误程序就直接退出，错误是不可以处理的）
 *
 *注解： 编译异常（直接子类）：要求程序员在编写程序的时候预先对这些异常进行处理，不然编译器会报错
 *       运行时异常RunTimeException：在编写程序的的时候可以不管，可以管都行
 *编译时异常（受检异常）和运行时异常（非受检异常）的区别是什么呢！
 *        编译时的异常发生的概率比较高
 *        运行时候的异常发生的概率比较低
 * @Author ZhouJian
 * @Date 2020/12/3
 **/

/**
 * 有两种处理异常的方式
 *  1、使用throws
 *  对异常上抛，抛给上一级
 *  2、使用try{}catch(){}
 *  捕获住进行处理
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
//        这里的的异常时运行时的异常，当异常发生的时候会抛给main方法，main方法
//        没有进行相应的处理,然后就继续向上一级抛最终到JVM,JVM就是的程序终止

        System.out.println(100 / 0);
        System.out.println("Hello World !");
    }
}

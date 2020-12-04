package Exception;

/**
 * @ClassName ExceptionTest04
 * @Description TODO
 *
 *                      Exception 当中有两个方法
 *                          1、打印异常信息
 *                          2、打印异常的堆栈信息
 * @Author ZhouJian
 * @Date 2020/12/4
 **/
public class ExceptionTest04    {
    public static void main(String[] args) {
        NullPointerException nullPointerException = new NullPointerException("空指针异常"   );
//         打印异常的信息
        String msg = nullPointerException.getMessage();
        System.out.println(msg);
//        打印异常的堆栈信息
        nullPointerException.printStackTrace();
    }
}

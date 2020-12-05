package Exception;

/**
 * @ClassName ExceptionFinallyAndTry
 * @Description TODO
 *                              try可以和finally一起使用的
 *                                  当try中有return的时候先执行finally中的最后执行return
 *                                  始终要记得return执行方法接结束了
 *                             System.exit( int  status);  表示关闭JVM 里面的int 类型数据表示关闭JVM时候 int 参数为 0
 * @Author ZhouJian
 * @Date 2020/12/5
 **/
public class ExceptionFinallyAndTry {
    public static void main(String[] args) {
        try {
            System.out.println("try执行");
            String a = null;
            a.toString();
//            这一段语句表示的就是结束jvm 下面的finally中的就不会执行了
            System.exit(0);
            return;
        }finally {
            System.out.println("finally");
        }
//       下面的代码就不会执行了，编写的时候就会报错， unreachable statement
//        System.out.println("nihao");
    }
}

/**
 * 这里的将的finally其实是在return之后执行的
 * 整个程序执行的过程：
 *     int i —— ++i —— return ++i —— 执行finally中的 —— 在执行return++i
 */
class faceTest{
    public static void main(String[] args) {
        int i1 = doSome();
        System.out.println(i1);
    }
    public static int doSome(){
        int i = 100;
//        ++i;
        try{
//            这里的++i 和 i++ 的区别就是++i是先加加，要是换成i++返回的是100
//            return ++i;    输出101
//            详情请参考IAddAndAddI
            return i++;
        }finally {
            System.out.println("finally当中的i：" + i);
        }
    }
}
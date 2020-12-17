package ThreadStudy.ThreeRelizeThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CallableTest
 * @Description TODO
 *                                  Callable接口第三种方式创建新的线程
 *                                      可以得到一个对象型的返回值
 * @Author ZhouJian
 * @Date 2020/12/17
 **/
public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//       创建一个未来任务对象
//        参数需要传递一个Callable实现对象，有返回值的,返回的是一个对象类型的
        FutureTask f = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Callable method begin ");
                Thread.sleep(5000);
                System.out.println("Callable method end");
                int a = 10;
                int b = 10;
//        自动装箱成一个integer
                return a + b;
            }
        });
//        创建一个线程对象
        Thread thread = new Thread(f);
        thread.start();
//        这里的get方法会导致main线程的阻塞，因为get的返回值是从分支线程中得到的
        Object integer = f.get();
        System.out.println(integer);
        System.out.println("main线程执行结束");
    }

}

package ThreadStudy.FirstThread;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/11
 **/
public class MyThreadTest extends Thread {
    @Override
    public void run() {

     for (int a = 0;a < 1000; a++){
         System.out.println("分支线程执行！FFFFFFFF");
     }
    }
}

package ThreadStudy.SecondRelizeThread;

/**
 * @ClassName RunnableTest
 * @Description TODO
 *
 *                          实现一个接口还可以继承别的类
 * @Author ZhouJian
 * @Date 2020/12/12
 **/
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        for (int a = 0;a < 1000;a++){
            System.out.println("主线程");
        }
    }
}

/**
 * 实现一个接口必须实现她的public abstract void method
 *      这里也就是run（）；
 *      这里还可以继承别的类
 */
class MyRunnable extends Object implements Runnable{

    @Override
    public void run() {
        int[]  i = new int[10];
        for (int a = 0; a <= 9; a++){
            i[a] =  a;
        }
        for (int ii : i){
            System.out.println("分支线程"+ii);
        }
    }
}

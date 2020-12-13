package ThreadStudy.OnThreadMethods;

/**
 * @ClassName ThreadGetNameTest
 * @Description TODO
 *                  1、获取线程对象
 *                      currentThread.var 返回值是一个线程类型的
 *                      Thread提供这样的方法： static Thread currentThread();
 *                  2、获取线程的名字
 *                      getName();
 *                  3、修改线程名字
 *                      setName();
 * @Author ZhouJian
 * @Date 2020/12/13
 **/
public class ThreadGetNameTest {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        MyThread2 mt1 = new MyThread2();
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread);
//        设置分支线程的名字
        mt.setName("分支线程1");
        mt1.setName("分支线程2");
//        获取分支线程的名字并且输出
        System.out.println(mt.getName());
        System.out.println(mt1.getName());
        mt1.start();
        mt.start();
    }
}
class MyThread2 extends Thread {
    public void getCurrentThreadName(){
        System.out.println("");
//        如果这里使用this.currentThread();就会报错误
//        Thread t = this.currentThread();

        Thread t = MyThread2.currentThread();
//        下面的效果是和this.currentThread();效果一样的
        Thread tt = currentThread();
    }
    @Override
    public void run() {
        for (int a = 0;a < 10; a++){
/**
 *              这里表示的就是获取当前的线程对象current当前的返回的是一个Thread类
 *              只要是继承的关系，继承Thread，还可以使用MyThread.currentThread();
 *              还可以使用super.currentThread();还可以使用this.currentThread();
 *              使用其它的方法中的时候就不可以了
  */
            Thread threadName =Thread.currentThread();
            System.out.println(threadName.getName() + "-->" + a);
        }
    }
}

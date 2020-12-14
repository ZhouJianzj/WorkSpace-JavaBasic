package ThreadStudy.OnThreadMethods;

import java.sql.SQLOutput;

/**
 * @ClassName InterruptMethod
 * @Description TODO
 *                          1、interrupt不是一个静态的方法
 *                          引用点的话是控制的分支线程
 *                          2、stop使得线程直接终止
 *                          3、打一个boolean标记
 * @Author ZHouJian
 * @Date 2020/12/13
 **/
public class InterruptMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 mt = new MyThread1();
        mt.setName("分支线程----1");
//        System.out.println(mt.getName());
        mt.start();
        Thread.sleep(1000);
//        这里通过异常的机制实现睡眠的中断
//        mt.interrupt();
//        stop这样的终止会丢数据，使得线程直接结束
//        mt.stop();
//        打一个boolean标记
        System.out.println("main线程苏醒");
        mt.runn = false;
    }

}
class MyThread1 extends Thread{
    boolean runn  = true;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        if(runn) {
            System.out.println("分支线程----begin");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("分支线程----end");
        }else{
//            虽然主线程的run已经设置成false了但是branch线程没办法再回到if判断了
//            下面的代码没有执行暂且理解为线程已经死亡了
            System.out.println("保存数据！");
//            上面可以设置要保存的数据结束
            return;
        }
    }
}


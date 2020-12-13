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
        System.out.println(mt.getName());
        mt.start();
        Thread.sleep(1000 *3);
//        这里通过异常的机制实现睡眠的中断
//        mt.interrupt();
//        stop这样的终止会丢数据，使得线程直接结束
//        mt.stop();
//        打一个boolean标记
        mt.run = false;
    }

}
class MyThread1 extends Thread{
    boolean run  =true;
    @Override
    public void run() {
//        System.out.println(Thread.currentThread().getName());
        if(run) {
//            执行
            System.out.println("分支线程----begin");
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("分支线程----end");
        }else{
//            上面可以设置要保存的数据结束
            return;
        }
    }
}

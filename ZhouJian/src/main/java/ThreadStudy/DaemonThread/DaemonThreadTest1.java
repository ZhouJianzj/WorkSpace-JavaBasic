package ThreadStudy.DaemonThread;

/**
 * @ClassName DaemonThreadTest1
 * @Description TODO
 *                          守护线程的实现
 *                              1、守护线程是一个死的循环
 *                              2、使用setDaemon();方法给自己的线程设置成守护线程
 *                              3、守护线程的在用户线程执行结束之后就会自己停止
 * @Author ZhouJian
 * @Date 2020/12/16
 **/
public class DaemonThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.setName("保存数据");
        mt.setDaemon(true);
        mt.start();
         for (int index = 1;index <= 10;index++){
             System.out.println(index);
             Thread.sleep(1000);
         }
    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (true){
            System.out.println(Thread.currentThread().getName() +(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
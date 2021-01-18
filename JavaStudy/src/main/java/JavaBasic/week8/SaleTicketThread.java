package JavaBasic.week8;

import jdk.jfr.StackTrace;

/**
 * @ClassName SaleTicketThread
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/7
 **/
public class SaleTicketThread implements Runnable{
    int total;
public SaleTicketThread(int total){
    this.total = total;
}
public SaleTicketThread(){

}
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if (total > 0){
                    System.out.println( Thread.currentThread().getName() + "剩余票数：" + --total);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("票已经买完!");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
//        这里的不是启用的多线，只是调用saleTicketThread中的run方法
        SaleTicketThread saleTicketThread = new SaleTicketThread(20);
        Thread thread = new Thread(saleTicketThread);
        thread.setName("窗口1：");
        Thread thread1 = new Thread(saleTicketThread);
        thread1.setName("窗口2：");
        thread.start();
        thread1.start();

    }
}
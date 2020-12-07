package JavaBasic.week8;

import jdk.jfr.StackTrace;

/**
 * @ClassName SaleTicketThread
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/7
 **/
public class SaleTicketThread implements Runnable{
public int total;
public SaleTicketThread(){
    total = 10;
}
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if (total > 0){
                    System.out.println("剩余票数：" + --total);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("票已经买完!");
                }
            }
        }
    }
}
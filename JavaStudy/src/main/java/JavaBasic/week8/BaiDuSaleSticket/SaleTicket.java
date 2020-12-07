package JavaBasic.week8.BaiDuSaleSticket;

/**
 * @ClassName SaleTicket
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/7
 **/

import java.util.Random;


public class SaleTicket implements Runnable {
    public int total;
    public int count;
    public SaleTicket() {
        total = 10;
        count = 0;
    }
    @Override
    public void run() {
        while (total > 0) {
            synchronized (this) {
                if(total > 0) {
                    try {
                        //Thread.sleep(800);
                        Thread.sleep(new Random().nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                    total--;
                    System.out.println(Thread.currentThread().getName() + "\t剩余票数：" + total);
                }
            }
        }
    }
    public static void main(String[] args) {
        SaleTicket st = new SaleTicket();
        for(int i=1; i<=3; i++) {
            new Thread(st, "售票点" + i).start();
        }
    }
}
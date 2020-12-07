package JavaBasic.week8.BaiDuSaleSticket;

public class SaleTicket1 {
    public static void main(String[] args) {
        for (int a = 1; a<= 3;a++){
            TicketWindow tw = new TicketWindow();
            tw.setName("窗口" + a);
            tw.start();
        }

        }
    }


class TicketWindow extends Thread {
    private  static int tickets = 10;
    //车票总量
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (tickets > 0) {
//                    System.out.println(Thread.currentThread().getName() + "准备出票,剩余票数:" + tickets + "张");
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "卖出一张,剩余票数:" + tickets + "张");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "余票不足,停止售票!");
                    break;
                }
            }
        }
    }
}
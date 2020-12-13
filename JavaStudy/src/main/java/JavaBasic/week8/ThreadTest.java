package JavaBasic.week8;

import JavaBasic.week8.BaiDuSaleSticket.SaleTicket;

/**
 * @ClassName ThreadTest
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/7
 **/
public class ThreadTest {
    public static void main(String[] args) {
//        这里的不是启用的多线，只是调用saleTicketThread中的run方法
        SaleTicketThread saleTickrtThread = new SaleTicketThread();
        saleTickrtThread.run();

    }
}

package ThreadStudy.ThreadSafe;

/**
 * @ClassName TestOutMoney
 * @Description TODO
 *                             这样的写法会导致数据同步不及时（解决方法就是使用排队的方法执行线程，使用join的局限性是branch线程
 *                             只能有两个，实现错误就注解掉join方法）
 *                                  1、是同步的编程模型
 *                                  2、数据同步及时不及时，就全看线程的执行是否延迟
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class TestOutMoney {
    public static void main(String[] args) throws InterruptedException {
        Bank bank = new Bank("周健",80000);
        OutMoneyThread omt = new OutMoneyThread(bank);
        OutMoneyThread omt1 = new OutMoneyThread(bank);
        omt.setName("窗口1：");
        omt1.setName("窗口2：");
        bank.money = 2000;
        omt.start();
//        join语句写到start之后，只有在等待的时候被执行了才能有效的执行join，
//        停止main线程执行omt，执行完在执行main线程在执行omt1线程
        omt.join();
        bank.money = 2000;
        omt1.start();
    }
}

package ThreadStudy.ThreadSafe.BankTest2;

/**
 * @ClassName TestThread
 * @Description TODO
 *                      三大变量的线程问题
 *                          1、实例变量
 *                          2、静态的变量
 *                          3、局部变量 ：没有线程安全的问题
 * @Author ZhouJian
 * @Date 2020/12/15
 **/
public class TestThread {
    public static void main(String[] args) {
        Bank bank = new Bank("zhouJian",8000);
//        下面的bank参数的传递进去，就触发了对象锁
        OutMoneyThread t1 = new OutMoneyThread(bank);
        OutMoneyThread t2 = new OutMoneyThread(bank);
//        下面的则不会触发对象锁
        Bank bank1 = new Bank("zhoujian",11000);
        OutMoneyThread t3 = new OutMoneyThread(bank1);
        t3.setName("中国银行windowOne");
//        t3.start();


        t1.setName("农业银行windowOne");
        t2.setName("农业银行windowTwo");
//        线程t1启动，找到bank中的账户信息进行打印输出，因为account balance 不是锁放法里面的参数所以
//        这时候的线程还没有触发锁，还是同时的进行的，直到运行outMoney()的时候才会触发
        t1.start();
//        线程t2就绪，找到bank中的账户信息进行打印输出
        t2.start();
    }
}

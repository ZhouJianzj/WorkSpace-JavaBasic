package ThreadStudy.ThreadSafe.BankTest2;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @ClassName Bank
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/15
 **/
public class Bank {
    private String account;
    private double balance;
    public Bank(){}
    public Bank(String account,double balance){
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 取钱的方法
     */
    public void outMoney(double money){
//        这里的传递时需要同步的对象，例如线程1 、2都要在bank account里面取钱，这里的account类创建的对象就是需要同步的对象
//        只用共享的时候才会触发锁的启动，触发机制参见TestThread.class
//        当这里的this换成一个常量的时候就会所有的线程参执行相关对象的操作都会自锁
        synchronized(this) {
            double before = this.getBalance();
            System.out.println("取 ：" + money);
            double begin = before - money;
            this.setBalance(begin);
            System.out.println("账户余额：" + getBalance());
        }
    }
}

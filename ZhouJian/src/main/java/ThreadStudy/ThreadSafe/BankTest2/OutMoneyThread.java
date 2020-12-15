package ThreadStudy.ThreadSafe.BankTest2;

/**
 * @ClassName OutMoneyThread
 * @Description TODO
 * @Author Z'houJian
 * @Date 2020/12/15
 **/
public class OutMoneyThread extends Thread{
    private Bank bank;
    public OutMoneyThread(){}
    public OutMoneyThread(Bank bank ){
        this.bank = bank;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + ":" + bank.getAccount() + bank.getBalance());
        bank.outMoney(2000);
    }

}

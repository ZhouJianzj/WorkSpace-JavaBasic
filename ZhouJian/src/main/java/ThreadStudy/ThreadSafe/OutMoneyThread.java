package ThreadStudy.ThreadSafe;

/**
 * @ClassName OutMoneyThead
 * @Description TODO
 * @Author
 * @Date 2020/12/14
 **/
public class OutMoneyThread extends Thread{
    private Bank bank;
    public OutMoneyThread(){}
    public OutMoneyThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + bank.getCount() + bank.getBalance());
        bank.outPutMoney(bank.money);

    }
}

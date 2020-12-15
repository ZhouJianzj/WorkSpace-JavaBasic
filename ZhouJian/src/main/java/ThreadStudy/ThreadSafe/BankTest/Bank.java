package ThreadStudy.ThreadSafe.BankTest;

/**
 * @ClassName Bank
 * @Description TODO
 *                      synchronized(){}锁的是{}里面的东西
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class Bank {
//    账户
    private  String  count;
//    余额
    private  double  balance;

    public Bank(){}
    public Bank(String count,double balance){
        this.count = count;
        this.balance = balance;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

/**
 * 创建一个取钱的方法
 * 1、取款前账户的余额
 * 2、取多钱
 * 3、取完之后账户还有多少钱
 * 4、更新账户余额
 */
double money = 0;
public void outPutMoney(double money){
    this.money = money;
    double before = getBalance();
    double after = before - money;
    System.out.println("取款：" + money);
    this.setBalance(after);
    System.out.println("取款成功！");

}
}

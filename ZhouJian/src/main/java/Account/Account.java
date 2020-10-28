package Account;

/**
 * @ClassName Text11
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/22
 **/


/**
 * 总结
 *         这里面涉及到 super();方法，涉及到继承，涉及到构造方法，涉及到封装，涉及到this关键字，涉及到
 *
 */
class Text{
    public static void main(String[] args) {
        Customer jane = new Customer("jane Smith","10000",2000,1.23);
//        这是继承的是Account的方法
        jane.deposit(100);
        jane.withdraw(960);
        jane.withdraw(2000);
    }
}

public class Account {
    /**
     * 私有化的账户,余额，年利率
     */
     private  String id;
     private double balance;
     private double annualInterestRate;


    /**
     * 无参构造器
     */
    public Account(){

    }
    /**
     * 存款方法
     */
    public void  deposit(double balance){
//        也可以这样写
//      this.getBalance() += balance;
        this.balance += balance;
        System.out.println("成功存入：" + balance);
        System.out.println("账户的余额：" + balance);
    }
    /**
     * 取款方法
     */
    public void withdraw(double balance1){
        if(this.balance < balance1){
            System.out.println("余额不足，取钱失败！");
            return;
        }
        this.balance -= balance1;
        System.out.println("成功取出：" + balance1);
        System.out.println("账户的余额：" + this.balance);
    }
    /**
    * set and get方法
    */
    public String getAccount() {
        System.out.println(id);
        return id;
    }

    public void setAccount(String account) {
        this.id = account;
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        System.out.println(annualInterestRate);
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

}

/**
 * 这里表示的是创建一个用户类来拓展
 */
class Customer extends Account{
    String name;

    public Customer(){
    }

    public Customer(String name,String account,double balance,double annualInterestRate){

        System.out.println(name = "Jane Smith");

//      这里也很关键继承是Account里的setter and getter 这里表示穿参数进去
//        账户1000
        setAccount(account);
//        余额2000
        setBalance(balance);
//        利率
        setAnnualInterestRate(annualInterestRate);
    }

}

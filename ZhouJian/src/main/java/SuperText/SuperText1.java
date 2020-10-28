package SuperText;

/**
 * @ClassName SuperText1
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/21
 **/
public class SuperText1 {
    public static void main(String[] args) {
        CreditAccount ca1 = new CreditAccount();
        System.out.println();
        CreditAccount ca2 = new CreditAccount("11111",100000.0,0.99);
        System.out.println();
    }
}

/**
 * 账户类
 */
class Account{
//    属性
    private String actno;
    private double balance;
//    构造方法
    public Account(){
//        super();
//        this.actno = null;
//        this.balance = 0.0
    }
    public Account(String acton,double balance){
        this.actno = acton;
        this.balance = balance;
    }

    /**
     * acton属性的set和get方法
     * @return
     */

    public String getActno(){
        return actno;
    }
    public void setActno(String actno){
        this.actno = actno ;
    }

    /**
     *   balance属性的set get方法
     * @return
     */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

/**
 * 信用账户
 */
class CreditAccount  extends com.ZhouJian.Text.Account.Account {
//    私有的属性
    private double credit;
    public CreditAccount(){
//     super();
    }

       public CreditAccount(String acton, double balance, double credit){
//        这里是关键,如果是下面的代码就会出错
//        this.acton = acton;
//        super(acton ,balance);
        this.credit = credit;

    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}


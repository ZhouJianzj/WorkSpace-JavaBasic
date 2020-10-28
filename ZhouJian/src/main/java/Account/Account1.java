package Account;

/**
 * @ClassName Account1
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/22
 **/
class Text1{
    public static void main(String[] args) {
        Account1 acc = new Account1("8888",2000,1.23);
        Customer1 art = new Customer1("周健",acc);
        art.getAccount().inputMoney(100);
        art.getAccount().outMoney(960);
        art.getAccount().outMoney(2000);

    }
}

public class Account1 {
//    私有化的属性
    private String id;
    private double balance;
    private double lilve;
//    无参构造器
    public Account1(){

    }
/**
 * 有参数构造方法
  */

    public Account1(String id,double balance,double lilve ){
        this.id= id;
        this.balance = balance;
        this.lilve = lilve;

    }

    /**
     * 取钱的方法 outMoney
     * @param money
     */
    public void outMoney(double money){
        if( money < this.balance){
            System.out.println("你的余额不足！");
        }

        System.out.println("取出的钱：" + money + "\n" + (this.balance -= money));
    }

    /**
     * 存钱的放啊inputMoney
      * @param money
     */
    public void inputMoney(double money){
        System.out.println("存入的钱：" + money + "\n" + ( this.balance = money));

    }

    /**
     *  setter and getter 方法
      * @return
     */
    public String  getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getLilve(){
        return lilve;
    }
    public void setLilve(double lilve){
        this.lilve = lilve;
    }

}

/**
 * 一个用户类
 */
class Customer1{
    private String  name;
    private Account1 account;

    public Customer1(){

    }
    public Customer1(String name,Account1 account){
        System.out.println(this.name = name);

    }

    public Account1 getAccount() {
        return account;
    }

    public void setAccount(Account1 account) {
        this.account = account;
    }

    /**
     * setter and getter 方法
     * @param name
     */
    public void setName(String name){
        this.name =  name;
    }
    public String getName(){
        return name;
    }
//    public void setAccount(Account1 account){
//        this.account = account;
//    }
//    public Account1 getAccount(){
//        return account;
//    }
}

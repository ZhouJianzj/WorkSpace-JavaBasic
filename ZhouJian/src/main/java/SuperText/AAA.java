package SuperText;

/**
 * @ClassName AAA
 * @Description TODO
 * @Author
 * @Date 2021/1/14
 **/
public class AAA {
    Integer  integer = 10;
    public AAA(){

    }
    public AAA(int a){
        System.out.println("");
    }
    public void doOther(){
        System.out.println("doOther方法");
    }

}
class BBB extends AAA{
    public static void main(String[] args) {
        BBB bbb = new BBB();
        bbb.dodo();
    }
    public void dodo(){
        //super使用可以调用父类的方法也可以调用父类的属性除去私有化的，super不可以写在静态的方法中
        super.doOther();
        System.out.println(super.integer);
    }
}

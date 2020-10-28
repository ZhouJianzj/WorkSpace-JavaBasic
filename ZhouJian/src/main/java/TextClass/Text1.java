package TextClass;

/**
 * @ClassName Text1
 * @Description TODO
 * @Author Zhoujian
 * @Date 2020/10/23
 *
 *
 * 这里的主要测试的就是 有参构造器是否自带super（）；
 **/
public class Text1 {
    public static void main(String[] args) {
//        BB b = new BB(1);
        BBB bbb = new BBB();
        bbb.doOther();
    }

}

class AA {
    public AA(){
        System.out.println("super被调用了");
    }
}

class BB extends AA{

    public BB(int a ){

    }
}

class AAA {
    int a;
    public AAA(){

    }
    public AAA(int a ){

    }
    public void doSome(){
        int a = 2;
        System.out.println("====");
    }
}

class BBB extends AAA{
    public BBB(){

        super(1);
        super.doSome();


    }
    public  void doOther(){
              doSome();
    }
}
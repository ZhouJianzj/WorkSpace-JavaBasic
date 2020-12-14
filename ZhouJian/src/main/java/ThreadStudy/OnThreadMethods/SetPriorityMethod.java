package ThreadStudy.OnThreadMethods;

/**
 * @ClassName SetPriorityMethod
 * @Description TODO
 * @Author ZHouJian
 * @Date 2020/12/14
 **/
public class SetPriorityMethod extends Thread {
    @Override
    public void run() {
        for (int a = 0 ; a < 100;a++)
        System.out.println(Thread.currentThread().getName() + "branch thread execute");
    }
}
class TestPriority{
    public static void main(String[] args) {
        SetPriorityMethod sp = new SetPriorityMethod();
        sp.setName("branch thread");
        System.out.println(sp.getPriority());
//        设置优先级
        sp.setPriority(10);
        sp.start();
        Thread.currentThread().setName("main thread");
        for (int a = 0; a < 100 ; a++){
            System.out.println(Thread.currentThread().getName() + "main thread execute");
        }
    }
}
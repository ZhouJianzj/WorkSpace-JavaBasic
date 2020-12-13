package ThreadStudy.ThreeRelizeThread;

/**
 * @ClassName NimingNeiBuLei
 * @Description TODO
 *                      线程的第三种方法实现    匿名内部类
 * @Author ZHouJian
 * @Date 2020/12/13
 **/
public class NimingNeiBuLei {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是一个匿名内部类，整个类就是一个对象");
            }
        });
        t.start();
        System.out.println("这是一个主线程的输出");
    }
}

package ThreadStudy.WaitAndNotify;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Work
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/18
 **/
public class Work {
    public static void main(String[] args) {
       Number a = new Number();
        Thread t1 = new Thread(new OuShu(a));
        Thread t2 = new Thread(new JiShu(a));
        t1.setName("t1------>");
        t2.setName("t2------>");
        t1.start();
        t2.start();
    }
}
class Number{
      int a ;
     public Number(){
         this.a = 1;
     }
}

/**
 * 输出偶数线程
 */
class OuShu implements Runnable{
    private Number a ;
    public OuShu(){}
    public OuShu(Number a){
        this.a = a;
    }
    @Override
    public void run() {
        while (true){
            synchronized (a){
                if (a.a % 2 != 0){
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println( Thread.currentThread().getName() + a.a);
                a.a++;
                a.notify();

            }
        }
    }
}
/**
 *输出奇数
 */
 class JiShu implements Runnable{
     private Number a ;
     public JiShu(){}
     public JiShu(Number  a){
         this.a = a;
     }

    @Override
    public void run() {
        while (true){
            synchronized (a){
                if (a.a % 2 == 0){
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println( Thread.currentThread().getName()+ a.a);
                a.a++;
                a.notify();

            }
        }
    }
}
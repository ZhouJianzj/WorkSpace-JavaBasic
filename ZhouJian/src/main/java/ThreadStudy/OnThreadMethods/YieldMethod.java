package ThreadStudy.OnThreadMethods;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

/**
 * @ClassName YieldMethod
 * @Description TODO
 *                          yield();静态的方法，强到位置放弃优先权的意思
 *                              表示让位，表现的不明显
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class YieldMethod implements Runnable {

    @Override
    public void run() {
        for (int a = 1; a <= 10000; a++){
            System.out.println(a);
        }
    }
}
class TestYield{
    public static void main(String[] args) {
        YieldMethod ym = new YieldMethod();
        Thread ymt = new Thread(ym);
        ymt.start();
//        静态的方法，暂停的是main线程

        for (int a = 20000 ;a< 30000;a++){
//            放这里会更加的明显
            Thread.yield();
            System.out.println(a);
        }
    }
}

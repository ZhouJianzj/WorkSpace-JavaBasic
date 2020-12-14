package JavaBasic.week9.Work;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @ClassName Student2
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class Student2 extends Thread{
    @Override
    public void run() {

        try {
            sleep(1000 * 60 * 60 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "睡觉一个小时上课");
    }


}

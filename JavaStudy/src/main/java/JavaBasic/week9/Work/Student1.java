package JavaBasic.week9.Work;

/**
 * @ClassName Student1
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class Student1 extends Thread {
    @Override
    public void run() {
//        输出学生的名字

        try {
            sleep(1000* 60 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "睡觉十分钟起来上课");

    }
}

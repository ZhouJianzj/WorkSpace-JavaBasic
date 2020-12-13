package ThreadStudy.OnThreadMethods;

/**
 * @ClassName SleepMethod
 * @Description TODO
 *                          sleep();使线程的睡眠，参数是毫秒，最终导致线程进入阻塞状态
 * @Author ZhouJian
 * @Date 2020/12/13
 **/
public class SleepMethod {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("5秒到了苏醒了！");
    }
}

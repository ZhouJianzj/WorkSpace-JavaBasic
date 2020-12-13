package ThreadStudy.OnThreadMethods;

/**
 * @ClassName FaceTestSleep
 * @Description TODO
 *                              想要休眠哪一个线程就直接在哪一个线程里面写sleep（）
 *                                  使用对象点的形式只会休眠你写的当前线程中使其睡眠
 *                                  原因是sleep（）是静态的方法
 * @Author ZhouJian
 * @Date 2020/12/13
 **/
public class FaceTestSleep {
    public static void main(String[] args) {
        TestSleep ts = new TestSleep();
        ts.setName("分支线程");
        ts.start();
        try {
//            ts.sleep(1000 * 5);这样的写法最终还是会转换到下面的写法
//            下面的写法表示是当前线程的睡眠，也就是main线程进行休眠
            Thread.sleep(1000 *5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class TestSleep extends Thread{
    @Override
    public void run() {
        try {
//           这里才会使得分支线程睡眠
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int a = 1; a <10; a++){
            System.out.println(Thread.currentThread().getName() + a);
        }
    }
}

package ThreadStudy.OnThreadMethods;

/**
 * @ClassName SignBoolean
 * @Description TODO
 *                          打断线程睡眠的方法之： 打一个boolean标记
 *                            （代码运行的时候需要注解掉join方法）
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class SignBoolean implements Runnable{
        Boolean run = true;
    @Override
    public void run() {
        for (int a = 1;a <10; a++){
            if (run) {
                try {
//                睡眠一秒钟
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("save data");
                return;
            }

        }
    }
}
class mainThread {
    public static void main(String[] args) {
//        创建一个可捕获的对象
        SignBoolean sb = new SignBoolean();
//        参数传递创建一个线程
        Thread tsb = new Thread(sb);
//        设置线程的名字
        tsb.setName("branch thread --->");
//        继续线程
        tsb.start();
        try {
//            把线程tsb加入到main线程中去，这时候的main线程会停止直到tsb线程执行结束才会执行main线程
            tsb.join();
            Thread.sleep(4000);
//            下面的代码写的没有效果，因为branch thread已经执行结束了 join的特性
            sb.run = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("branch thread execute end main thread output 程序执行结束");
    }
}

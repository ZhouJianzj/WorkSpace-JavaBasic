package JavaBasic.week9;

import java.sql.SQLOutput;
import java.util.NavigableMap;

/**
 * @ClassName JoinMethod
 * @Description TODO
 *                      join方法
 *                        1、当一个线程使用join（）的时候主线程会停止让出来等待使用join的线程执行完再继续执行
 *                        2、join的使用之后就会使得主线程停止知道使用join线程执行结束
 *                        3、参照下面的例子
 * @Author ZHouJian
 * @Date 2020/12/14
 **/
public class JoinMethod implements Runnable{
    private String name;
    public JoinMethod(String name ){
        this.name = name;
    }

    @Override
    public void run() {
        for (int a = 0; a < 30;a++){
            System.out.println(name + "---》" + a);
            try {
                Thread.sleep(1000 *3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JoinMethod jm = new JoinMethod("分支线程");
        Thread t = new Thread(jm);
        t.start();
        for (int a = 0; a < 30; a++){
            if (a == 10){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("主线程" + a);
        }

    }
}

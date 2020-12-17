package ThreadStudy.WaitAndNotify;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WaitAndNotifyTest
 * @Description TODO
 * @Author Zhoujian
 * @Date 2020/12/17
 **/
public class WaitAndNotifyTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread t1 = new Thread(new Producter(list));
        Thread t2 = new Thread(new Customer(list));
        t1.setName("t1线程");
        t2.setName("t2线程");
        t1.start();
        t2.start();
    }
}

/**
 * 生产类
 */
class Producter implements Runnable {
    private List list;
    public Producter(){}
    public Producter(List list){
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            创建对象，加入集合
                Object o = new Object();
                list.add(o);
                System.out.println("增加元素成功！");
//            唤醒消费
                list.notify();
            }
        }
    }
}

/**
 * 消费
 */
class Customer implements Runnable{
    private List list;
    public Customer(){}
    public Customer(List list){
        this.list = list;
    }

    @Override
    public void run() {
//             给出一个循环
        while(true) {
            synchronized (list) {
//            当集合里的元素为空的时候
                if (list.size() == 0) {
                    try {
//                    线程等待，释放线程锁
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.remove(0);
                System.out.println("元素移除成功！");
                list.notify();
            }
        }
    }
}
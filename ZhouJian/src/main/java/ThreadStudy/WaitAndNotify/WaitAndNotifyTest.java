package ThreadStudy.WaitAndNotify;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName WaitAndNotifyTest
 * @Description TODO
 *                                  生产者以消费者模式
 *                                      1、创建一个集合当作厂库，使用list集合并且创库的容量只有一个元素
 *                                      2、创建两个线程t1 、t2，t1代表消费线程，指的是到创库中去取一个元素，
     *                                      t2代表的是生产给厂库加一个元素
 *                                      3、当list中的元素没有时候，也就是一开始的时候，线程启动的时候会去执行里面的
 *                                          while死循环（小技巧死循环会导致下一次的线程启动之后会继续的进行上面的判断）
 *                                          生产线程检测到厂库是空的就会去执行list.add()方法去为仓库生产一个元素，
 *                                          生产完之后使用一下唤醒notify唤醒一下在此对象上面睡眠的线程，不是死循环吗，
 *                                          接着在一次判断这时候仓库里面有元素了，就会停下来使用到就是wait方法，wait方法
 *                                          使得当前生产线程暂停，并且释放锁
 *                                      4、当生产线程暂停之后后面的排队（之所排队是因为wait and notify是建立在synchronized
 *                                          之上的）的线程就开始执行了，这时候会判断出集合中有一个元素就会执行lsit.remove();
 *                                          方法，移除仓库里面的元素就没有了 就是使用notify方法去唤醒之前在此对象上面的睡眠的线程
 *                                          ，然而notify不会释放锁线程还在执行，再一次的循环一次，只是后会判断仓库中没有元素了，
 *                                          就开始调用wait方法释放锁
 *
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
//    仓库对象引入
    private List list;
    public Producter(){}
//    传递参数
    public Producter(List list){
        this.list = list;
    }

    @Override
    public void run() {
//        死循环是使得在做加减元素之后执行唤醒之后再执行wait使得线程暂停之后再一次苏醒之后还能进行判断的关键，不然线程就不会再一次
//        回到上面再一次进行判断
        while (true) {
//            同步代码块是wait释放锁的关键，锁的是仓库对象
            synchronized (list) {
//              需要修改仓库的存储大小在这里设置，下面的消费不需要改
                if (list.size() == 2) {
                    try {
//                        暂停生产线程
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            创建对象，加入集合
                Object o = new Object();
                list.add(o);
                System.out.println("增加元素成功！");
//            唤醒消费。本线程还是在执行的
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
//                不会释放线程的锁这时候线程还是在执行的
                list.notify();
            }
        }
    }
}
package ThreadStudy.FirstThread;

import ThreadStudy.FirstThread.MyThreadTest;

/**
 * @ClassName ThreadTest
 * @Description TODO
 *                      线程的学习（是一个执行单元）
 *                          1、进程是大哥线程是小弟
 *                          2、一个线程对应一个独立的栈
 *                             涉及到多线程并发
 *                          3、程序执行的时候JVM最少执行两个线程
 *                          4、多线程加快执行速度，提高程序的效率
 *                          5、main方法线程结束了，不不代表程序的结束
 *                             还有可能别的线程在进行弹栈压栈的操作
 * @Author ZhouJian
 * @Date 2020/12/11
 **/
public class ThreadTest {
    public static void main(String[] args) {
//        创建一个分支线程
        MyThreadTest myThreadTest = new MyThreadTest();
//        启动分支线程
        myThreadTest.start();
//        这里强调一下子使用下面的方式执行不会触发多线的只是调用了方法而已
//        myThreadTest.run();

/**
 * 在执行的时候会发现先是执行的sout然后才执行分支线程的
 *     道理还是那个道理自上而下的执行
 *     只是start()执行了，表示开辟分支栈
 *     两个栈式并行的一起执行的
 */

        for (int t = 0;t < 1000; t++) {
            System.out.println("main线程在执行！MMMMMMMMMMMMMM");
        }
    }
}

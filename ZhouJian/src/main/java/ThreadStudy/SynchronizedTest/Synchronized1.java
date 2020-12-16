package ThreadStudy.SynchronizedTest;

import java.sql.SQLOutput;

/**
 * @ClassName Synchronized1
 * @Description TODO
 * `                                死锁的实现 synchronized的嵌套的写法
 * @Author ZhouJian
 * @Date 2020/12/16
 **/
public class Synchronized1 {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        Thread thread1 = new MyThread1(t1,t2);
        Thread thread2 = new MyThread2(t1,t2);
        thread1.start();
        thread2.start();
    }
}
class Test1{
    public void Test1(){
        System.out.println("Test1对象的方法");
    }
}
class Test2{
    public void  Test2(){
        System.out.println("Test2对象的方法");
    }
}
class MyThread1 extends Thread{
    private Test1 t1;
    private Test2 t2;
    public MyThread1(Test1 t1,Test2 t2){
        this.t1 =  t1;
        this.t2 =  t2;
    }
    public void MyThread1(){}
    @Override
    public void run(){
//        线程的自锁就体现在下面的嵌套的synchronized
        synchronized(t1){
            t1.Test1();
            synchronized(t2){
                t2.Test2();
            }
        }
    }
}
class MyThread2 extends Thread{
    private Test1 t1;
    private Test2 t2;
    public MyThread2(){}
    public MyThread2(Test1 t1 ,Test2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    @Override
    public void run(){
        synchronized(t2){
            t2.Test2();
            synchronized(t1){
                t1.Test1();
            }
        }
    }
}
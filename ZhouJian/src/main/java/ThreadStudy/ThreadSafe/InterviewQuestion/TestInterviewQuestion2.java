package ThreadStudy.ThreadSafe.InterviewQuestion;



/**
 * @ClassName TestSynchronized
 * @Description TODO
 *                      面试题
 *                      判断的时候都不影响
 *                          1、线程的枷锁只是锁的那一块的代码不影响别的执行，
 *                              下面的线程执行不会影响的
 * @Author ZhouJian
 * @Date 2020/12/15
 **/
 class TestSynchronized1 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        MyThread t1 = new MyThread(mc);
        MyThread t2 = new MyThread(mc);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

}
class MyThread1 extends Thread{
    private MyClass mc;
    public MyThread1(){}
    public MyThread1(MyClass mc){
        this.mc = mc;
    }
    @Override
    public void run(){
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}
class MyClass1{
    public synchronized void doSome(){
        System.out.println("doSome----------start");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("doSome------------end");
    }

    /**
     * 这里同步枷锁的时候是需要等的，只有线程t1执行完t2才会开始执行
     */
    public synchronized void doOther(){
        System.out.println("doOther-----------start");
        System.out.println("doOther------------end");
    }
}
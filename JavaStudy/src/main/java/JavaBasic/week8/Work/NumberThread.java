package JavaBasic.week8.Work;

import javax.swing.*;

/**
 * @ClassName NumberThread
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/8
 **/
public class NumberThread implements  Runnable{
    private  JLabel numberLabel;
    public void setNumLabel(JLabel numberLabel){
        this.numberLabel = numberLabel;
    }
    private  final  Object lock = new Object();
    private boolean pause = false;

    /**
     * 调用方法实现线程暂停
     */
    void  pauseThread(){
        pause = true;
    }

    /**
     * 调用方法实现线程的运行
     */
    void resumeThread(){
        pause = false;
        synchronized (lock){
            lock.notify();
        }
    }

    /**
     * 方法只能用run方法实现，不然会阻塞主线程导致主线程无法正常运行
     */
    void onPause(){
        synchronized (lock){
            try {
                lock.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        int index  = 0;
        while (true){
            while (pause){
                onPause();
            }try{
                numberLabel.setText(String.valueOf(index));
                Thread.sleep(500);
                ++index;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

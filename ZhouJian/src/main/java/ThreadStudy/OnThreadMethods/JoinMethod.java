package ThreadStudy.OnThreadMethods;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

/**
 * @ClassName JoinMethod
 * @Description TODO
 *                          join 方法的使用 此方法是一个静态的方法 直接是一个线程去调用就好了
 * @Author ZhouJian
 * @Date 2020/12/14
 **/
public class JoinMethod  extends  Thread{
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("branch method");
            }
        });
        thread.start();
        int a = 0;
        while (true){
            a++;
            System.out.println(a);
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(a == 20){
                break;
            }
        }



    }

}

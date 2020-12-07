package JavaBasic.week8.Carousel;

import com.sun.xml.internal.bind.v2.runtime.Coordinator;

import java.awt.*;
import java.util.Random;

/**
 * @ClassName LineThread
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/7
 **/
public class LineThread implements Runnable{
    private int x = 100;
    private  int y = 200;
    private Frame frame;
    private Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN};
public void setColors(Frame frame){
        this.frame = frame;
}

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException  e){
                e.printStackTrace();
            }
            Graphics g = this.frame.getGraphics();
            Random random = new Random();
            int index = random.nextInt(colors.length);
            g.setColor(colors[index]);
            g.drawLine(x,y,200,400);
            x+= 20; y+=30;
            if (y >= 1000){
                break;
            }
        }
    }
}

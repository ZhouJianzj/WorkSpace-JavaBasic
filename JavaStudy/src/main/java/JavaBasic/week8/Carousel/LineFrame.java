package JavaBasic.week8.Carousel;

import sun.security.util.Length;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author fengxu
 * @date 2020/12/7 16:29
 */
 class CarouselThread  implements Runnable{
    private  String[] imgs = {
            "https://pic88.com/pic/12020111317325692034.html\n",
            "https://pic88.com/pic/120200805125250217440.html\n",

    };

    //创建显示图片的组件
    private  JLabel bgLabel;
    public void setBgLabel(JLabel bgLabel){
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int index = 0;
        int len = imgs.length;
        while (true){
            //创建网络连接
            try {
                URL url = new URL(imgs[index]);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(5000);
                //得到连接目标的输入流
                InputStream is = conn.getInputStream();
                //字节缓冲输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                //缓冲区
                byte[] buffer = new byte[1024];
                int length = 0;
                //通过缓冲区读取文件
                while ((length = is.read(buffer)) != -1 ){
                    baos.write(buffer,0, length);
                }
                byte[] bytes = baos.toByteArray();
                //将字节数组通过字节输入流读入
                is.read(bytes);
                //通过bytes构建图标icon
                Icon icon = new ImageIcon(bytes);
                //将icon设置为背景标签的图标
                this.bgLabel.setIcon(icon);
                Thread.sleep(2000);
                baos.close();
                is.close();
            }catch (Exception e){
                e.printStackTrace();

            }
            index++;
            //处理数组最后一个元素
            if (index == len){
                index = 0;
            }
        }

    }
}
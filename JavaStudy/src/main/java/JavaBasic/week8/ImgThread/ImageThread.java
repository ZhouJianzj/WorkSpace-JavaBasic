package JavaBasic.week8.ImgThread;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @ClassName CarouselThread
 * @Description TODO
 * @Author ZHouJIan
 * @Date 2020/12/7
 **/
public class ImageThread implements Runnable {
    private  String[] imgs ={
            "https://ae04.alicdn.com/kf/H81a1aa186a1b45dfb699c0bd90d005fcx.png",
            "https://ae01.alicdn.com/kf/H368171623f594fcd9a7879f67e4d6f0eh.png",
            "https://ae04.alicdn.com/kf/H34f198fefdcf4f3cb5721023dda740140.png"
    };
    private JLabel bgLabel;
    public void setBgLabel(JLabel bgLabel){
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int index = 0;
        int len = imgs.length;
        while (true) {
            try {
//            创建URL
            URL url = new URL(imgs[index]);
//            创建了链接
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
//            得到链接某表的字节输入流
            InputStream is = conn.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            字节缓冲区
            byte[] buffer = new byte[1024];
            int length = 0;
//            通过缓冲区读取文件
            while ((length = is.read(buffer)) != -1){
                baos.write(buffer,0,length);

            }
            byte[] bytes = baos.toByteArray();
            is.read(bytes);
            Icon icon = new ImageIcon(bytes);
            this.bgLabel.setIcon(icon);
            Thread.sleep(2000);
            baos.close();
            is.close();

        }catch (Exception e){
                e.printStackTrace();
            }
            index++;
            if (index == len){
                index =0;
            }
        }
    }
}

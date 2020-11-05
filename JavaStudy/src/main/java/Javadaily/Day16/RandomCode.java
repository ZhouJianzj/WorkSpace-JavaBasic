package Javadaily.Day16;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.util.Random;

/**
 * @ClassName RandomCode
 * @Description
 * 随机的生成字符串验证码
 * @Author
 * @Date 2020/11/5
 **/
public class RandomCode {
    private static final int LENGTH = 4;
    private static final int BOUNDS = 15;

    public static void main(String[] args) throws IOException {
        Random random = new Random();
//        指定图片的大小和类型
        BufferedImage bufferedImage = new BufferedImage(120,40, BufferedImage.TYPE_INT_RGB);
//        获取画笔
        Graphics graphics = bufferedImage.getGraphics();
//        获取字体
        Font font = new Font("方正华隶简体",Font.BOLD,20);
        graphics.setFont(font);
        graphics.setColor(Color.WHITE);
//        开始绘制
        graphics.fillRect(0,0,120,40);
        String s = "ABCDEFGHIJKLMIOPQESTUVWXYZabcdefghijklmaopqrstuvwxyz1234567890";
        char[] chs = s.toCharArray();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i< LENGTH; i++){
            char ch = chs[random.nextInt(60)];
            string.append(ch);
        }
//       生成随机的验证码
        graphics.setColor((Color.BLACK));
        graphics.drawString(string.toString(),40,28);
//        生成干扰线
        for(int i = 0;i<BOUNDS;i++){
//            随机颜色
            int redRandom = random.nextInt(256);
            int greenRandom = random.nextInt(256);
            int blueRandom = random.nextInt(256);
//            随机生成坐标
            int x1 = random.nextInt(120);
            int y1 = random.nextInt(40);
            int x2 = random.nextInt(120);
            int y2 = random.nextInt(40);
            Color color = new Color(redRandom,greenRandom,blueRandom);
            graphics.setColor(color);
            graphics.drawLine(x1,y1,x2,y2);
        }
//        输出图片，并指定文件路径，自己注意修改
        File file = new File("C:\\Users\\Administrator\\Desktop.jpg");
//        获取输出流
        OutputStream outputStream = new FileOutputStream(file);
//        将图片从缓存区通过字节写到文件中去
        ImageIO.write(bufferedImage,"jpg",outputStream);
//        关闭输出流
        outputStream.close();
    }
}

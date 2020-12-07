package JavaBasic.week8.ImgThread;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TitleThread
 * @Author zhoujian
 * @Date 2020/12/7
 **/
public class TitleThread implements Runnable {

    private JLabel titleLabel;
    List<String> context = null;
    private int index = 0;

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }

    public static List<String> getFileContext(String path) throws Exception {
        FileReader fileReader =new FileReader(path);
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        List<String> list =new ArrayList<String>();
        String str=null;
        while((str=bufferedReader.readLine())!=null) {
            if(str.trim().length()>2) {
                list.add(str);
            }
        }
        return list;
    }

    @Override
    public void run() {
        try {
            context = getFileContext("C:\\Users\\Administrator\\Desktop\\AAA.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            if (index == context.size()){
                index = 0;
            }
            this.titleLabel.setText(context.get(index++));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

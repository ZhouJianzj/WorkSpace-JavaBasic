package Swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

/**
 * @ClassName Test14
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/
public class Test14 extends JFrame {
    public Test14(){
        setTitle("JTable");
        setBounds(10,10,500,500);
        setLayout(new BorderLayout());
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLACK);

        JTable jTable = new JTable();
//       这是属性行的集合，数据类型
        Object[] data1 = {"id","name","class","grade"};

        Object[][] data = {
                new Object[]{"01","zhang1","软件班","100"},
                new Object[]{"02","zhang2","软件班","100"},
                new Object[]{"03","zhang3","软件班","100"},
                new Object[]{"04","zhang4","软件班","100"}
        };
      DefaultTableModel dm = new DefaultTableModel(data,data1);
        JTable jt = new JTable(data,data1);
        JScrollPane js = new JScrollPane();
        js.add(jt);
        contentPane.add(js);
//        jt.setBounds(10,10,300,100);
        contentPane.add(jt);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
            new Test14();
    }
}


package Swing;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName Test09
 * @Description TODO
 *                          JList列表框
 *                          scrollPane 滚动条
 * @Author ZhouJian
 * @Date 2020/12/29
 **/
public class Test09 extends JFrame {
    public Test09(){

        setTitle("scrollPane and JList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(20,20,800,800);
        setLayout(null);

        Container contentPane = getContentPane();

        String [] itmes = {"数据1","数据1","数据1","数据1",
                "数据1","数据1","数据1",
                "数据1","数据1","数据1","数据1",
                "数据1","数据1","数据1"};
        JList<String> jList = new JList<>(itmes);
//        contentPane.add(jList);
        JScrollPane jScrollPane =new JScrollPane(jList);
        jScrollPane.setBounds(40,40,100,100);
        contentPane.add(jScrollPane);
        setVisible(true);

//        添加事件的监听
        JButton jButton = new JButton("确定");
        jButton.setBounds(180,40,80,30);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//      得到选取的值是一个List集合
                List<String> svl = jList.getSelectedValuesList();
//                迭代器对集合进行遍历
                Iterator<String> iterator = svl.iterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                System.out.println("-------End-------");
            }
        });
        contentPane.add(jButton);
    }


    public static void main(String[] args) {
        new Test09();
    }
}

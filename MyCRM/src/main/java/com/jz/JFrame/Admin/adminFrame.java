package JFrame.Admin;


import com.mysql.cj.xdevapi.Client;

import javax.swing.*;
import javax.swing.text.AbstractDocument;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


/**
 *          创建一个JTable
 *     需要定义一个table模型,需要的参数是一个二位的数组来保存数据的，和一个列的属性一维数组
 *     底层来说的话还是转换成连个Vector集合来进行数据的操作
 *         先创建一个Vector集合来存储列的属性
 *         创建范型为Vector<Object>的集合来存储data
 *         设置表的上面
 */
public class  adminFrame extends JFrame {
//   北面
    JPanel northjPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton addJBt = new JButton("添加");
    JButton upDateJBt = new JButton("修改");
    JButton delJBt = new JButton("删除");
    JTextField searchText = new JTextField(12);
    JButton searchJBt = new JButton("查询");


//    南面
    JPanel south = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    JButton nextJBt = new JButton("NEXT");
    JButton preJBt  = new JButton("PREVIOUS");

//   西面
    JPanel west = new JPanel();
    JComboBox<String>jComboBox = null;
    JButton jButton = new JButton("确定");
//   东边放数据
    JPanel eastJPanel = new JPanel(new CardLayout());


    public adminFrame(){
        setTitle("管理员界面");
        setBounds(10,10,800,600);
        URL pic = adminFrame.class.getClassLoader().getResource("pic4.jpg");
        Image pic1 = new ImageIcon(pic).getImage();
        setIconImage(pic1);
        Container contentPane = getContentPane();
        //North
        contentPane.add(northjPanel,BorderLayout.NORTH);
        northjPanel.add(addJBt);
        northjPanel.add(upDateJBt);
        northjPanel.add(searchText);
        northjPanel.add(searchJBt);
        // sourth
        contentPane.add(south,BorderLayout.SOUTH);
        south.add(preJBt);
        south.add(nextJBt);
        //east
        //这里的eastpanel为卡片布局
        contentPane.add(eastJPanel,BorderLayout.CENTER);
        //放员工的界面的表数据
        LinkmanTable linkmanTable = new LinkmanTable();
        eastJPanel.add(linkmanTable);
        ClientTable clientTable = new ClientTable();
        eastJPanel.add(clientTable);
        DingDanTable dingDanTable = new DingDanTable();
        eastJPanel.add(dingDanTable);
        PlanTable planTable = new PlanTable();
        eastJPanel.add(planTable);
        ProductTable productTable = new ProductTable();
        eastJPanel.add(productTable);
        //west
        String[] jFrames = {"员工表","客户表","客户所购表","计划表","产品表"};
        jComboBox = new JComboBox<>(jFrames);

//        west.setBackground(Color.BLACK);
        //当选中哪一个表的时候，点击确定按钮 出现表
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String text = (String) jComboBox.getSelectedItem();
               switch (text){
                   case "员工表":
                       linkmanTable.show(true);
                       clientTable.show(false);
                       dingDanTable.show(false);
                       planTable.show(false);
                       productTable.show(false);
                       break;
                   case"客户表":
//                      获取客户表的table
                       linkmanTable.show(false);
                       clientTable.show(true);
                       dingDanTable.show(false);
                       planTable.show(false);
                       productTable.show(false);
                       break;
                   case"客户所购表":
                       linkmanTable.show(false);
                       clientTable.show(false);
                       dingDanTable.show(true);
                       planTable.show(false);
                       productTable.show(false);
                       break;
                   case"计划表":
                       linkmanTable.show(false);
                       clientTable.show(false);
                       dingDanTable.show(false);
                       planTable.show(true);
                       productTable.show(false);
                       break;
                   case "产品表":
                       linkmanTable.show(false);
                       clientTable.show(false);
                       dingDanTable.show(false);
                       planTable.show(false);
                       productTable.show(true);
                       break;
               }
            }
        });
        west.add(jComboBox);
        west.add(jButton);
        contentPane.add(west,BorderLayout.WEST);
//      东边



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new adminFrame();
    }

}
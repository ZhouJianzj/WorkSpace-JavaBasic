package JFrame;

import javax.lang.model.element.VariableElement;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.WeakHashMap;

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



    public adminFrame(){
        setTitle("管理员界面");
        setBounds(10,10,800,600);
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
        JTable jTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane(jTable);
        contentPane.add(jScrollPane);
//      west
        String[] jFrames = {"员工表","客户表","客户所购表","计划表","产品表"};
        jComboBox = new JComboBox<>(jFrames);
//        west.setBackground(Color.BLACK);
        //当选中哪一个表的时候，点击确定按钮 出现表
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("nihao");
                if (jComboBox.getSelectedItem().equals("员工表")){
//                    contentPane.add(,BorderLayout.CENTER);
                }else{
                    System.out.println("nug");
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
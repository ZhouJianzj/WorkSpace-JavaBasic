import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Vector;

/**
 * @ClassName class02
 * @Description TODO
 * @Author zhoujian
 * @Date 2021/1/2
 **/
public class Test02 extends JFrame {
    public Test02(){
        setTitle("JTable");
        setBounds(10,10,600,600);
        Container contentPane = getContentPane();
        JTable jTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane(jTable);
        contentPane.add(jScrollPane);
//        setLayout(null);

//       创建一个JTable
        //需要定义一个table模型,需要的参数是一个二位的数组来保存数据的，和一个列的属性一维数组
        //底层来说的话还是转换成连个Vector集合来进行数据的操作
        DefaultTableModel  defaultTableModel = new DefaultTableModel();
//        先创建一个Vector集合来存储列的属性
        Vector<String> colunm = new Vector<>();
        colunm.addElement("编号");
        colunm.addElement("姓名");
        colunm.addElement("部门");
        colunm.addElement("产品类型");
        colunm.addElement("计划表编号");
        colunm.addElement("薪资");
//        创建范型为Vector<Object>的集合来存储data
        Vector<Vector<Object>> data = new Vector<>();
        Vector<Object> linkman1 = new Vector<>();
        linkman1.addElement("01");
        linkman1.addElement("Mrs shang");
        linkman1.addElement("销售部");
        linkman1.addElement("电子");
        linkman1.addElement("02");
        linkman1.addElement("2000");
        Vector<Object> linkman2 = new Vector<>();
        linkman2.addElement("02");
        linkman2.addElement("Mr ZhouJian");
        linkman2.addElement("技术部");
        linkman2.addElement("机械");
        linkman2.addElement("08");
        linkman2.addElement("10000");
        Vector<Object> linkman5 = new Vector<>();
        linkman5.addElement("02");
        linkman5.addElement("Mr ZhouJian");
        linkman5.addElement("技术部");
        linkman5.addElement("机械");
        linkman5.addElement("08");
        linkman5.addElement("10000");
        Vector<Object> linkman4 = new Vector<>();
        linkman4.addElement("02");
        linkman4.addElement("Mr ZhouJian");
        linkman4.addElement("技术部");
        linkman4.addElement("机械");
        linkman4.addElement("08");
        linkman4.addElement("10000");
        Vector<Object> linkman3 = new Vector<>();
        linkman3.addElement("02");
        linkman3.addElement("Mr ZhouJian");
        linkman3.addElement("技术部");
        linkman3.addElement("机械");
        linkman3.addElement("08");
        linkman3.addElement("10000");

        //往集合里面装linkman集合
        data.addElement(linkman1);
        data.addElement(linkman2);
        data.addElement(linkman3);
        data.addElement(linkman4);
        data.addElement(linkman5);
        defaultTableModel.setDataVector(data,colunm);
        jTable.setModel(defaultTableModel);
//        设置表的上面

//      设置表的格式例如：表格线条、表格字体、表格的行高
        JTableHeader tableHeader = jTable.getTableHeader();
        tableHeader.setFont(new Font(null,Font.BOLD,16));
        tableHeader.setForeground(Color.PINK);

        jTable.setFont(new Font(null,Font.PLAIN,14));

//        jTable.setRowHeight(20);
        jTable.setSelectionForeground(Color.RED);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Test02();
    }
}

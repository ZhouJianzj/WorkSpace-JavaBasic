package JFrame;

import com.mysql.cj.xdevapi.Column;
import com.mysql.cj.xdevapi.Table;

import javax.lang.model.element.VariableElement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.xml.bind.ValidationException;
import java.awt.*;
import java.awt.print.PrinterAbortException;
import java.util.Vector;

/**
 * @ClassName admin
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/
public class adminFrame extends JFrame {
    private  TableModel1 tableModel1;
    public adminFrame(){
        setTitle("管理员界面");
        setBounds(20,20,800,600);
        setResizable(false);
//        setLayout(new FlowLayout());
        Container contentPane = getContentPane();
//        添加JTable  -   员工的表
        //创建一个二维的集合
        //具体的思路就是创建一个员工对象使其拥有其下的属性，一个循环创建一个对象并且设置里面的参数值，使得Vectoe
        //等于这个对象，在使用下面的方法把vector（对象）加进二维的集合中去
        Vector<Vector<Object>> data = new Vector<>();
        //创建一个对象
        Vector<Object> linkman1 = new Vector<>();
        linkman1.addElement("01");
        linkman1.addElement("许峰");
        linkman1.addElement("销售部");
        linkman1.addElement("情趣用品");
        linkman1.addElement("05");
        linkman1.addElement("8888");
        data.add(linkman1);
        data.addElement(linkman1);
//        创建表格的model
        TableModel1 tableModel1 = TableModel1.setData(data);
        JTable table = new JTable(tableModel1);
        //设置表头
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setFont(new Font("微软雅黑",Font.BOLD,16));
        tableHeader.setForeground(Color.PINK);
        //设置表数据

//        默认的情况下是不会显示列头的，放在滚动的面板下是展示的
        JScrollPane jScrollPane = new JScrollPane(table);
        contentPane.add(jScrollPane);
//        窗口的关闭和可见
//        table.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new adminFrame();
    }
}

/**
 *封装一个自己的table类型
 */
class TableModel1 extends DefaultTableModel{
    static Vector<String> column = new Vector();
    static {
        //设置属性也就是列
        Vector<String> coulmn = new Vector<>();
        coulmn.addElement("编号");
        coulmn.addElement("姓名");
        coulmn.addElement("部门");
        coulmn.addElement("销售产品类型");
        coulmn.addElement("计划单编号");
        coulmn.addElement("薪资");
    }
    TableModel1(){
        super(null,column);
    }
//    单例模式
    private static TableModel1 tableModel1 = new TableModel1();

    /**
     * 传入数据
     * @param data  二位的数据
     * @return
     */
    public static TableModel1 setData(Vector<Vector<Object>> data){
        tableModel1.setDataVector(data,column);
        return tableModel1;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
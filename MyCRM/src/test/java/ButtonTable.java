import JFrame.Client.MyRender;
import Service.ClientServicePackage.ImplementClientService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

/**
 * @ClassName ButtonTable
 * @Description TODO
 * @Author
 * @Date 2021/1/6
 **/
public class ButtonTable extends JFrame{
    private static final long serialVersionUID = 1L;
    private JTable table = null;
    private JScrollPane js=null ;
    public ButtonTable(){
        table = new JTable();
        ImplementClientService implementClientService = new ImplementClientService();
        implementClientService.linkJdbc();
        Vector<Vector<Object>> data = implementClientService.data;
        Vector<Object> column = new Vector<>();
        column.addElement("编号");
        column.addElement("产品");
        column.addElement("生产时间");
        column.addElement("产品类型");
        column.addElement("价格");
        column.addElement("选购");
        DefaultTableModel defaultTableModel = new DefaultTableModel(data,column);
        table.setModel(defaultTableModel);

        table.getColumnModel().getColumn(5).setCellEditor(new MyRender());
        //设置编辑器
         table.getColumnModel().getColumn(5).setCellRenderer(new MyRender() );
         js = new JScrollPane(table);
         this.add(js);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setVisible(true);
         this.setSize(399, 300);
         this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new ButtonTable();
    }
}

package JFrame.Admin;

import Service.ClientServicePackage.ImplementClientService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

/**
 * @ClassName ProductTable
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class ProductTable extends JPanel {
    public ProductTable(){
        JTable jTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane(jTable);
        this.add(jScrollPane);
        Vector<String> vector = new Vector<>();
        vector.addElement("编号");
        vector.addElement("产品名称");
        vector.addElement("生产日期");
        vector.addElement("产品类型");
        vector.addElement("价格");
        new ImplementClientService().linkJdbc();
        jTable.setModel(new DefaultTableModel(ImplementClientService.data,vector));

    }
}

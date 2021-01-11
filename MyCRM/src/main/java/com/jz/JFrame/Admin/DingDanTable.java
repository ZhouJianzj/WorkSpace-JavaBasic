package JFrame.Admin;

import Service.ClientServicePackage.ImplementClientService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

/**
 * @ClassName DingDanTable
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class DingDanTable extends JPanel {
    public DingDanTable(){
        JTable jTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane(jTable);
        this.add(jScrollPane);
        ImplementClientService implementClientService = new ImplementClientService();
        implementClientService.dingDanTable();
        Vector<String> vector = new Vector<>();
        vector.addElement("编号");
        vector.addElement("产品名称");
        vector.addElement("生产日期");
        vector.addElement("产品类型");
        vector.addElement("价格");
        DefaultTableModel defaultTableModel = new DefaultTableModel(ImplementClientService.data, vector);
        jTable.setModel(defaultTableModel);
    }
}

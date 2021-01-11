package JFrame.Admin;

import Service.ImplementAdminService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

/**
 * @ClassName PlanTable
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class PlanTable extends JPanel {
    public PlanTable(){
        JTable jTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane(jTable);
        this.add(jScrollPane);
        Vector<String> vector = new Vector<>();
        vector.addElement("任务计划编号");
        vector.addElement("联系人编号");
        vector.addElement("客户数量");
        vector.addElement("计划利润");
        vector.addElement("计划时间");
        vector.addElement("实施情况");
        new ImplementAdminService().planTable();
        jTable.setModel(new DefaultTableModel(ImplementAdminService.data,vector));

    }
}

package JFrame.Admin;

import JFrame.Linkman.LinkmanModel;
import Service.ClientServicePackage.ImplementClientService;
import Service.ImplementLinkmanService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

/**
 * @ClassName LinkmanTable
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class LinkmanTable extends JPanel  {


    public LinkmanTable() {
        JTable clientTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane(clientTable);
        this.add(jScrollPane);
        //设置表格
        ImplementLinkmanService implementLinkmanService = new ImplementLinkmanService();
        implementLinkmanService.linkJdbc();

        clientTable.setModel(LinkmanModel.mySetTableModel(ImplementLinkmanService.data));

    }
}

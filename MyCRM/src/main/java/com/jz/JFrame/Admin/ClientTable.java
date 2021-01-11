package JFrame.Admin;

import JFrame.Linkman.LinkmanModel;
import Service.ClientServicePackage.ImplementClientService;
import Utils.JdbcUtil;
import org.apache.xmlbeans.impl.xb.xsdschema.All;

import javax.lang.model.element.VariableElement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 * @ClassName ClientTable
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class ClientTable extends JPanel{


    public ClientTable(){
        JTable clientTable = new JTable();
        JScrollPane jScrollPane = new JScrollPane(clientTable);
        this.add(jScrollPane);

        //设置表格
        Vector<Vector<Object>> data = new Vector<>();
        ImplementClientService implementClientService = new ImplementClientService();
        implementClientService.client();
        Vector<String> colunm = new Vector<>();
        colunm.addElement("编号");
        colunm.addElement("姓名");
        colunm.addElement("联系方式");
        colunm.addElement("地址");
        colunm.addElement("信用度");
        colunm.addElement("购买的产品");
        colunm.addElement("购买的时间");
        colunm.addElement("销售编号");
        DefaultTableModel defaultTableModel = new DefaultTableModel(ImplementClientService.data,colunm);
        clientTable.setModel(defaultTableModel);


    }
}

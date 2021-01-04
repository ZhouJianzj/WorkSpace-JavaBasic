package JFrame;

import Service.ImplementClientService;
import Service.ImplementLoginService;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Vector;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/
public class ClientFrame extends JFrame {
    JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton search = new JButton("查询");
    JTextField  searchText = new JTextField(12);
    JTable productTable = new JTable();
    public ClientFrame(){
        setTitle("尊敬的客户你好！");
        setBounds(20,20,800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.add(northPanel,BorderLayout.NORTH);
        northPanel.add(search);
        northPanel.add(searchText);
//        连接数据库
        ImplementClientService implementClientService = new ImplementClientService();
        implementClientService.linkJdbc();
//        获取data 使用模型
        productTable.setModel(ClientModel.mySetTableModel(ImplementClientService.data));
        JScrollPane jScrollPane = new JScrollPane(productTable);
        contentPane.add(jScrollPane);
//      装饰表格
        JTableHeader tableHeader = productTable.getTableHeader();
        tableHeader.setFont(new Font(null,Font.BOLD,16));
        tableHeader.setForeground(Color.BLACK);
        productTable.setFont(new Font(null,Font.PLAIN,14));
        Vector<String> colunm = ClientModel.getColunm();
        for (int a = 0;a < colunm.size();a++){
            TableColumn column =  productTable.getColumn(colunm.get(a));
            column.setCellRenderer(new DefaultTableCellRenderer(){
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    if (row % 2 == 0){
                        setBackground(Color.LIGHT_GRAY);
                    }else{
                        setBackground(Color.WHITE);
                    }
                    setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                }
            });
//            如果是第一个列就设置列的宽度大小
            if(a == 0){
                column.setPreferredWidth(20);
            }
        }
        productTable.setSelectionForeground(Color.RED);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClientFrame();
    }
}
class ClientModel extends DefaultTableModel {
    //    表格的列的属性的集合
    private static Vector<String> colunm = new Vector<>();

    public static Vector<String> getColunm() {
        return colunm;
    }

    //    使用静态的代码块来执行方法
    static{
        colunm.addElement("编号");
        colunm.addElement("产品");
        colunm.addElement("生产时间");
        colunm.addElement("产品类型");
        colunm.addElement("价格");
    }
    @Override
    public boolean isCellEditable(int row, int column) {
        //    表示不可以编辑表格的内容
        return  false ;
    }
    //    使用到单例模式
    private static ClientModel clientModel = new ClientModel();

    /**
     * 传入data数据创建tablemodel
     * @param data
     * @return
     */
    public static ClientModel mySetTableModel(Vector<Vector<Object>> data){
        clientModel.setDataVector(data,colunm);
        return clientModel ;
    }
}

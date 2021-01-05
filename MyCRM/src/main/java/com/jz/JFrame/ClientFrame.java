package JFrame;

import Service.ImplementClientService;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/
public class ClientFrame extends JFrame {
    SpringLayout springLayout = new SpringLayout();
    JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton search = new JButton("查询");
    JTextField  searchText = new JTextField(12);
    JTable productTable = new JTable();
    //左边的按钮
    JPanel jPanelLfet = new JPanel(new FlowLayout());
    JButton jButton1 = new JButton("商城");
    JButton jButton2 = new JButton("订单");
    JButton jButton3 = new JButton("反馈表");
    //右边的data区域,需要给所得right加入到data面板中,设置data为卡片布局
    JPanel jPaneldata  = new JPanel();
    JPanel jPanelRight1 = new JPanel(springLayout);
    JPanel jPanelRight2 = new JPanel(springLayout);
        JTable dingDanJTable = new JTable();
    JPanel jPanelRight3 = new JPanel(springLayout);
    JPanel jPanelRightSearch = new JPanel(springLayout);
        JTable jTableSearch = new JTable();
    //反馈信息的组件
        JTextField productinfor = new JTextField(20);
        JTextArea backinfor = new JTextArea(20,20);


    public ClientFrame(){
        setTitle("尊敬的客户你好！");
        setBounds(20,20,800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.add(northPanel,BorderLayout.NORTH);
        northPanel.add(search);
        northPanel.add(searchText);

        jPanelLfet.add(jButton1);
        jPanelLfet.add(jButton2);
        jPanelLfet.add(jButton3);
        contentPane.add(jPanelLfet,BorderLayout.WEST);
//        data面板中的小面板加组件
        //backinfor的面板
        SpringLayout.Constraints cbackinfor = springLayout.getConstraints(backinfor);
        cbackinfor.setY(Spring.constant(40));

//        设置datapanel的布局,添加组件
        CardLayout cardLayout = new CardLayout();
        jPaneldata.setLayout(cardLayout);
        jPaneldata.add(jPanelRight1);
        jPaneldata.add(jPanelRight2);
        jPaneldata.add(jPanelRight3);
        jPaneldata.add(jPanelRightSearch);
//      往cardLayout的上面板加组件
        JScrollPane jScrollPane = new JScrollPane(productTable);
        jPanelRight1.add(jScrollPane);
        jPanelRight2.add(dingDanJTable);
        jPanelRight3.add(productinfor);
        jPanelRight3.add(backinfor);
        jPanelRightSearch.add(jTableSearch);
//        data面板加到主面板上去
        contentPane.add(jPaneldata,BorderLayout.CENTER);

//        连接数据生成table
        //商店table
       ImplementClientService implementClientService = new ImplementClientService();
        implementClientService.linkJdbc();

//       获取data 使用模型
        productTable.setModel(ClientModel.mySetTableModel(implementClientService.data));
        productTable.setRowHeight(22);
        jTableSearch.setModel(ClientModel.mySetTableModel(implementClientService.data));

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
                column.setPreferredWidth(30);
            }
        }
        productTable.getColumnModel().getColumn(5).setCellRenderer(new MyButtonRender());
        productTable.setSelectionForeground(Color.RED);
//        商城的按钮事件
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelRight1.show(true);
                jPanelRight2.show(false);
                jPanelRight3.show(false);
                jPanelRightSearch.show(false);

            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelRight1.show(false);
                jPanelRight2.show(true);
                jPanelRight3.show(false);
                jPanelRightSearch.show(false);
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanelRight1.show(false);
                jPanelRight2.show(false);
                jPanelRight3.show(true);
                jPanelRightSearch.show(false);
            }
        });
//        按钮的查询
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //查询table
//                String text = searchText.getText();
//                implementClientService.search(text);
//                jTableSearch.setModel(ClientModel.mySetTableModel(implementClientService.data));
                jPanelRight1.show(false);
                jPanelRight2.show(false);
                jPanelRight3.show(false);
                jPanelRightSearch.show(true);
            }
        });
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
        colunm.addElement("选购");
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
     * @param data22
     * @return
     */
    public static ClientModel mySetTableModel(Vector<Vector<Object>> data22){
        clientModel.setDataVector(data22,colunm);
        return clientModel ;
    }
}

/**
 * 设置表格最后一列为按钮的时候,参入的参数是tablecellRander 接口的一个实现类所以有下面的操作
 */
class MyButtonRender implements TableCellRenderer {
    private JPanel jPanel;
    private JButton jButton;

    public MyButtonRender() {
        initJPanel();
        initButton();
        jPanel.add(jButton);
    }

    private void initButton() {
        jButton = new JButton();
        jButton.setBounds(0, 0, 88, 22);
        jButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("" + e.getActionCommand());
                        System.out.println(jButton.getText());
                    }
                });
    }

    private void initJPanel() {
        jPanel = new JPanel();
        jPanel.setLayout(null);
    }

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        jButton.setText("购买");
        return jPanel;
    }

}

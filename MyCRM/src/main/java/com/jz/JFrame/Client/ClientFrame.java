package JFrame.Client;

import Service.ClientServicePackage.ImplementClientService;
import com.google.gson.JsonObject;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

/**
 * @ClassName Client
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/
public class ClientFrame extends JFrame {
    public static Vector<Object> column;
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
    JPanel jPanelRight1 = new JPanel();
    //订单面板的组件
    JPanel jPanelRight2 = new JPanel(springLayout);
     JTable dingDanJTable = new JTable();

    JPanel jPanelRightSearch = new JPanel();
        JTable jTableSearch = new JTable();
    //反馈信息的组件
    JPanel jPanelRight3 = new JPanel(springLayout);
    JTextField id = new JTextField(10);
    JLabel jLabelId = new JLabel("序号 :");
    JTextField name = new JTextField(10);
    JLabel jLabelName = new JLabel("姓名 :");
    JTextField time = new JTextField(10);
    JLabel jLabelTime = new JLabel("购买时间 :");
    JTextField solve = new JTextField(10);
    JLabel jLabelSolve = new JLabel("是否解决 :");
    JTextField productId = new JTextField(10);
    JLabel jLabelProductId = new JLabel("产品编号 :");
    JTextArea backinfor = new JTextArea(20,30);
    JLabel jLabelBackinfor = new JLabel("反馈内容 :");
    JButton jButtonSubmit = new JButton("提交");


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
        SpringLayout.Constraints cID = springLayout.getConstraints(jLabelId);
        cID.setX(Spring.constant(10));
        SpringLayout.Constraints cjLableName = springLayout.getConstraints(jLabelName);
        cjLableName.setY(Spring.constant(30));
        cjLableName.setX(Spring.constant(10));
        springLayout.getConstraints(jLabelTime).setY(Spring.constant(60));
        springLayout.getConstraints(jLabelSolve).setY(Spring.constant(90));
        springLayout.getConstraints(jLabelProductId).setY(Spring.constant(120));
        springLayout.getConstraints(jLabelBackinfor).setY(Spring.constant(150));
        SpringLayout.Constraints cid = springLayout.getConstraints(id);
        cid.setX(Spring.constant(60));
        SpringLayout.Constraints cname = springLayout.getConstraints(name);
        cname.setX(Spring.constant(60));
        cname.setY(Spring.constant(30));
        SpringLayout.Constraints ctime = springLayout.getConstraints(time);
        ctime.setX(Spring.constant(60));
        ctime.setY(Spring.constant(60));
        SpringLayout.Constraints cslove = springLayout.getConstraints(solve);
        cslove.setX(Spring.constant(60));
        cslove.setY(Spring.constant(90));
        SpringLayout.Constraints cproductid = springLayout.getConstraints(productId);
        cproductid .setX(Spring.constant(60));
        cproductid .setY(Spring.constant(120));
        SpringLayout.Constraints cbackinfor = springLayout.getConstraints(backinfor);
        cbackinfor.setX(Spring.constant(60));
        cbackinfor.setY(Spring.constant(150));
        SpringLayout.Constraints cjButtonSubmit = springLayout.getConstraints(jButtonSubmit);
        cjButtonSubmit.setX(Spring.constant(180));


//        设置datapanel的布局,添加组件
        CardLayout cardLayout = new CardLayout();
        jPaneldata.setLayout(cardLayout);
        jPaneldata.add(jPanelRight1);
        jPaneldata.add(jPanelRight2);
        jPaneldata.add(jPanelRight3);
        jPaneldata.add(jPanelRightSearch);
//      往cardLayout上的面板加组件
        //商店
        JScrollPane jScrollPane = new JScrollPane(productTable);
        productTable.setRowHeight(30);
        jPanelRight1.add(jScrollPane);

        //订单的表加入面板
        JScrollPane jScrollPane1 = new JScrollPane(dingDanJTable);
        dingDanJTable.setRowHeight(30);
        jPanelRight2.add(jScrollPane1);
        SpringLayout.Constraints cjs = springLayout.getConstraints(jScrollPane1);
        cjs.setWidth(Spring.constant(550));


        jPanelRight3.add(id);
        jPanelRight3.add(jLabelId);
        jPanelRight3.add(name);
        jPanelRight3.add(jLabelName);
        jPanelRight3.add(time);
        jPanelRight3.add(jLabelTime);
        jPanelRight3.add(productId);
        jPanelRight3.add(jLabelProductId);
        jPanelRight3.add(solve);
        jPanelRight3.add(jLabelSolve);
        jPanelRight3.add(backinfor);
        jPanelRight3.add(jLabelBackinfor);
        jPanelRightSearch.add(jTableSearch);
        jPanelRight3.add(jButtonSubmit);
//        data面板加到主面板上去
        contentPane.add(jPaneldata,BorderLayout.CENTER);

//        连接数据生成table
        //商店table
        ImplementClientService implementClientService = new ImplementClientService();
        implementClientService.linkJdbc();
        column = new Vector<>();
        column.addElement("编号");
        column.addElement("产品");
        column.addElement("生产时间");
        column.addElement("产品类型");
        column.addElement("价格");
        column.addElement("选购");

//       获取data 使用模型
        DefaultTableModel defaultTableModel = new DefaultTableModel(implementClientService.data,column);
        productTable.setModel(defaultTableModel);
        setTableGeShi(productTable,5);
        productTable.setSelectionForeground(Color.RED);

//        商城的按钮事件
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                implementClientService.linkJdbc();
                productTable.setModel(defaultTableModel);
                setTableGeShi(productTable,5);
                productTable.setSelectionForeground(Color.RED);
                jPanelRight1.show(true);
                jPanelRight2.show(false);
                jPanelRight3.show(false);
                jPanelRightSearch.show(false);

            }
        });
//        订单页面的跳转
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //表中存数据
               implementClientService.dingDanTable();
               //设置列的个数
               //设置表格模型显示数据
               dingDanJTable.setModel( new DefaultTableModel(implementClientService.data,column));
               setTableGeShi(dingDanJTable,5);
                jPanelRight1.show(false);
                jPanelRight2.show(true);
                jPanelRight3.show(false);
                jPanelRightSearch.show(false);
            }
        });
//        反馈信息页面的跳转
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
//                查询table
                String text = searchText.getText();
                implementClientService.search(text);
                jTableSearch.setModel(new DefaultTableModel(implementClientService.data,column));
                jTableSearch.getColumnModel().getColumn(5).setCellRenderer(new MyRender());
                setTableGeShi(jTableSearch,5);
                jTableSearch.setRowHeight(22);
                jPanelRight1.show(false);
                jPanelRight2.show(false);
                jPanelRight3.show(false);
                jPanelRightSearch.show(true);
            }
        });
//        反馈信息的按钮事件
        jButtonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!"".equals(id.getText()) && !"".equals(name.getText()) && !"".equals(time.getText()) && !"".equals(productId
                        .getText()) && !"".equals(solve.getText()) && !"".equals(backinfor.getText()) ){
                implementClientService.backInformation(id.getText(), name.getText(), time.getText(), productId.getText(), solve.getText(),backinfor.getText());
                    JOptionPane.showMessageDialog(jButtonSubmit.getParent(), "提交成功");
                }else {
                    JOptionPane.showMessageDialog(jButtonSubmit.getParent(), "请输入反馈内容");
                }
            }
        });
        setResizable(false);
        setVisible(true);
    }
    /*
     * 装饰表格
     */

    public void setTableGeShi(JTable table,int columnNum) {
        //获取表格的属性列
        JTableHeader tableHeader = table.getTableHeader();
        //设置属性列的字体和颜色
        tableHeader.setFont(new Font(null, Font.BOLD, 16));
        tableHeader.setForeground(Color.BLACK);
        //设置表格内容的字体颜色大小
        table.setFont(new Font(null, Font.PLAIN, 14));
        Vector<Object> column1 = ClientFrame.column;
        for (int a = 0; a < column1.size(); a++) {
            TableColumn column = table.getColumn(column1.get(a));
            column.setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    if (row % 2 == 0) {
                        setBackground(Color.LIGHT_GRAY);
                    } else {
                        setBackground(Color.WHITE);
                    }
                    setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
                    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                }
            });
//            如果是第一个列就设置列的宽度大小
            if (a == 0) {
                column.setPreferredWidth(30);
            }
        }
        if (table!= dingDanJTable) {
            MyRender myRender = new MyRender();
            table.getColumnModel().getColumn(columnNum).setCellRenderer(myRender);
            table.getColumnModel().getColumn(columnNum).setCellEditor(myRender);
        }
    }
        public static void main(String[] args) {
        new ClientFrame();
    }
}
/**
 * 通过MyBUttonRander实现默认的单元格渲染器已经为表格添加了默认的渲染器，但是还无法触发事件，触发事件是没有反应的，因为在点击表格时，
 * 会触发表格的编辑事件，而要想触发渲染的按钮的事件，还需要通过修改表格的默认编辑器来实现：
 */



/**
 * 设置表格最后一列为按钮的时候,参入的参数是tablecellRander 接口的一个实现类所以有下面的操作
 */



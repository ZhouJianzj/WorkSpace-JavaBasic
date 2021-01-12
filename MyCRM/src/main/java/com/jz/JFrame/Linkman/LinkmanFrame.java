package JFrame.Linkman;

import Service.ImplementLinkmanService;

import javax.lang.model.element.VariableElement;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/**
 * @ClassName Linkman
 * @Description TODO
 * @Author
 * @Date 2020/12/30
 **/

/**
 * 设计的理念
 *      1、员工自己登录成功之后会跳转到的界面
 *      2、可以看见自己的信息
 *      3、可以看见自己客户的信息
 */
public class LinkmanFrame extends JFrame {
    JTable jTable = new JTable();
    JButton jButton = new JButton("查询");
    JTextField jTextField = new JTextField(15);
    //目的就是实现点击查询按钮之后再一次的能够返回到主页面

    public  LinkmanFrame(){
        SpringLayout springLayout = new SpringLayout();
        setLayout(springLayout);
        setTitle("员工界面");
        setBounds(20,20,800,600);
        setResizable(false);
        Container contentPane = getContentPane();
        SpringLayout.Constraints cjTextField = springLayout.getConstraints(jButton);
        cjTextField.setX(Spring.constant(200));
        SpringLayout.Constraints cB= springLayout.getConstraints(jTextField);
        cB.setX(Spring.constant(30));
        cB.setY(Spring.constant(5));

//        连接数据库获取data

            new ImplementLinkmanService().linkJdbc();
            jTable.setModel(LinkmanModel.mySetTableModel(ImplementLinkmanService.data));


//      表格的大小
        JScrollPane jScrollPane = new JScrollPane(jTable);
        SpringLayout.Constraints cjTable = springLayout.getConstraints(jScrollPane);
        cjTable.setY(Spring.constant(30));
        cjTable.setX(Spring.constant(30));
        cjTable.setWidth(Spring.constant(700));

        contentPane.add(jScrollPane);
        contentPane.add(jButton);
        contentPane.add(jTextField);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jTextField.getText();
                if (!"".equals(text)) {
                            new ImplementLinkmanService().search(text);
                            jTable.setModel(LinkmanModel.mySetTableModel(ImplementLinkmanService.data));

                        }

                }

        });

//        装饰表格
        JTableHeader tableHeader = jTable.getTableHeader();
        tableHeader.setFont(new Font(null,Font.BOLD,16));
        tableHeader.setForeground(Color.BLACK);
        jTable.setFont(new Font(null,Font.PLAIN,14));
        Vector<String> colunm = LinkmanModel.getColunm();
        for (int a = 0;a < colunm.size();a++){
            TableColumn column =  jTable.getColumn(colunm.get(a));
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
        jTable.setSelectionForeground(Color.RED);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        LinkmanFrame linkmanFrame = new LinkmanFrame();


    }
}



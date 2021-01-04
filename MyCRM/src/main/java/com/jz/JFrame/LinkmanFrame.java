package JFrame;

import Service.ImplementLinkmanService;
import Utils.JdbcUtil;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
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
    public  LinkmanFrame(){

        setTitle("员工界面");
        setBounds(20,20,800,800);
        Container contentPane = getContentPane();
//        连接数据库获取data
        ImplementLinkmanService implementLinkmanService = new ImplementLinkmanService();
        implementLinkmanService.linkJdbc();
        jTable.setModel(LinkmanModel.mySetTableModel(ImplementLinkmanService.data));
        JScrollPane jScrollPane = new JScrollPane(jTable);
        contentPane.add(jScrollPane);
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
class LinkmanModel extends DefaultTableModel {
    //    表格的列的属性的集合
    private static Vector<String> colunm = new Vector<>();

    public static Vector<String> getColunm() {
        return colunm;
    }

    //    使用静态的代码块来执行方法
    static{
        colunm.addElement("编号");
        colunm.addElement("姓名");
        colunm.addElement("部门");
        colunm.addElement("产品类型");
        colunm.addElement("计划表编号");
        colunm.addElement("薪资");
    }
    @Override
    public boolean isCellEditable(int row, int column) {
        //    表示不可以编辑表格的内容
        return  false ;
    }
    //    使用到单例模式
    private static LinkmanModel linkmanModel = new LinkmanModel();

    /**
     * 传入data数据创建tablemodel
     * @param data
     * @return
     */
    public static LinkmanModel mySetTableModel(Vector<Vector<Object>> data){
        linkmanModel.setDataVector(data,colunm);
        return linkmanModel;
    }

}

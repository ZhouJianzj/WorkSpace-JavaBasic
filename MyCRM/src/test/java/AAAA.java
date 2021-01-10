import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.lang.reflect.Array;

/**
 * @ClassName AAAA
 * @Description TODO
 * @Author
 * @Date 2021/1/10
 **/
public class AAAA extends JFrame {
    JTable jTable = null;

    public static void main(String[] args) {

    }
    public AAAA(){
        setSize(new Dimension(400,499));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTable = new JTable(4,4);
        Container contentPane = getContentPane();
        contentPane.add(jTable);
        Object[][] data = new Object[4][4];
        String[] column = new String[4];
        data = new Object[][]{{
            "id","name","address","birthday"
        }, {
                "id","name","address","birthday"
        }, {
                "id","name","address","birthday"
        }, {
                "id","name","address","birthday"
        }};
        column = new String[]{
                "编号" + "姓名" + "地址" + "生日"
        };
        jTable.setModel(new DefaultTableModel(data,column));
    }
    public void selectTableData(){
        int selectedRow = jTable.getSelectedRow();


    }

}

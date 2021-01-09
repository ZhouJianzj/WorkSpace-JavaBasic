import JFrame.Client.MyRender;
import Service.ClientServicePackage.ImplementClientService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @ClassName TableMethod
 * @Description TODO
 * @Author
 * @Date 2021/1/10
 **/
public class TableMethod {
    int rowww ;
    int colll ;
    public int getRowww() {
        return rowww;
    }
    public void setRowww(int rowww) {
        this.rowww = rowww;
    }
    public int getColll() {
        return colll;
    }
    public void setColll(int colll) {
        this.colll = colll;
    }
    /** 确定行和列*/
    public void TableRowCol(final JTable tJTable) {
        tJTable.setRowSelectionAllowed(true);//设置是否可以选择此模型中的行
        tJTable.setColumnSelectionAllowed(true);//设置是否可以选择此模型中的列
        tJTable.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent event)
            {
                int row = tJTable.rowAtPoint(event.getPoint());
                int col = tJTable.columnAtPoint(event.getPoint());
                tJTable.setRowSelectionInterval(row, row);
                tJTable.setColumnSelectionInterval(0, tJTable.getColumnCount()-1);
//                    tJTable.setColumnSelectionInterval(col, col);
                setRowww(row);
                setColll(col);
            }
        });
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JTable jb = new JTable(3,3);

        jf.add(jb);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TableMethod tableMethod = new TableMethod();
        tableMethod.TableRowCol(jb);
    }
}
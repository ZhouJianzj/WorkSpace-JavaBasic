import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
public class MBR implements TableCellRenderer {
    private JPanel panel;
    private JButton button;
    public MBR() {
        this.initButton();
        this.initPanel();
        // 添加按钮。
        this.panel.add(this.button);
    }
    private void initButton() {
        this.button = new JButton();
        // 设置按钮的大小及位置。
        this.button.setBounds(0, 0, 50, 15);
        // 在渲染器里边添加按钮的事件是不会触发的
        // this.button.addActionListener(new ActionListener()
    }
    private void initPanel() {
        this.panel = new JPanel();
        // panel使用绝对定位，这样button就不会充满整个单元格。
        this.panel.setLayout(null);
    }
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // 只为按钮赋值即可。也可以作其它操作，如绘背景等。
        this.button.setText(value == null ? "" : String.valueOf(value));
        return this.panel;
    }
}
class MyButtonEditor extends DefaultCellEditor {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -6546334664166791132L;
    private JPanel panel;
    private JButton button;
    public MyButtonEditor() {
        // DefautlCellEditor有此构造器，需要传入一个，但这个不会使用到，直接new一个即可
        super(new JTextField());
        // 设置点击几次激活编辑。
        this.setClickCountToStart(1);
        this.initButton();
        this.initPanel();
        // 添加按钮。
        this.panel.add(this.button);
    }
    private void initButton() {
        this.button = new JButton();
        // 设置按钮的大小及位置。
        this.button.setBounds(0, 0, 50, 15);
        // 为按钮添加事件。这里只能添加ActionListner事件，Mouse事件无效。
        this.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // 触发取消编辑的事件，不会调用tableModel的setValue方法。
                MyButtonEditor.this.fireEditingCanceled();
                // 这里可以做其它操作。
                // 可以将table传入，通过getSelectedRow,getSelectColumn方法获取到当前选择的行和列及其它操作等。
            }
        });
    }
    private void initPanel() {
        this.panel = new JPanel();
        // panel使用绝对定位，这样button就不会充满整个单元格。
        this.panel.setLayout(null);
    }
    /**
     * 这里重写父类的编辑方法，返回一个JPanel对象即可（也可以直接返回一个Button对象，但是那样会填充满整个单元格）
     */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        // 只为按钮赋值即可。也可以作其它操作。
        this.button.setText(value == null ? "" : String.valueOf(value));
        return this.panel;
    }
    /**
     * 重写编辑单元格时获取的值。如果不重写，这里可能会为按钮设置错误的值。
     */
    @Override
    public Object getCellEditorValue() {
        return this.button.getText();
    }
}
class TestTable {
    private JFrame frame;
    private JTable table;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TestTable window = new TestTable();
                    window.frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the application.
     */
    public TestTable() {
        this.initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        this.frame = new JFrame();
        this.frame.setBounds(100, 100, 450, 300);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.getContentPane().setLayout(null);
        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 414, 242);
        this.frame.getContentPane().add(panel);
        panel.setLayout(null);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 394, 222);
        panel.add(scrollPane);
        this.table = new JTable();
        scrollPane.setViewportView(this.table);
        this.table.setModel(new DefaultTableModel() {
            @Override
            public Object getValueAt(int row, int column) {
                return (row + 1) * (column + 1);
            }
            @Override
            public int getRowCount() {
                return 3;
            }
            @Override
            public int getColumnCount() {
                return 3;
            }
            @Override
            public void setValueAt(Object aValue, int row, int column) {
                System.out.println(aValue + "  setValueAt");
            }
            @Override
            public boolean isCellEditable(int row, int column)
            {
                // 带有按钮列的功能这里必须要返回true不然按钮点击时不会触发编辑效果，也就不会触发事件。
                if (column == 2)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        });
        this.table.getColumnModel().getColumn(2).setCellEditor(new MyButtonEditor());
        this.table.getColumnModel().getColumn(2).setCellRenderer(new MyButtonRender());
        this.table.setRowSelectionAllowed(false);// 禁止表格的选择功能。不然在点击按钮时表格的整行都会被选中。也可以通过其它方式来实现。
    }
}

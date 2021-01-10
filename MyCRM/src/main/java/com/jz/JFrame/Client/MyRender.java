package JFrame.Client;

import Service.ClientServicePackage.ImplementClientService;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRender extends AbstractCellEditor implements TableCellRenderer, ActionListener, TableCellEditor {
    private JButton button =null;
    public MyRender(){
        button = new JButton("购买");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImplementClientService implementClientService = new ImplementClientService();
                implementClientService.dingDanTableCun((JTable) button.getParent());
                JOptionPane.showMessageDialog(button.getParent(),"确定购买");

            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return button;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return button;
    }
}

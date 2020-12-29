package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Test07
 * @Description TODO
 * @Author
 *                  网格组布局
 * @Date 2020/12/29
 **/
public class Test07 extends JFrame {
//    约束
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
//    容器
    Container contentPane;

    public Test07(){
        setTitle("a");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(20,20,1000,1000);
         contentPane = getContentPane();
        setLayout(new GridBagLayout());
        setVisible(true);}

    /**
     * 创建参照的行列  10行10列
     */
    public void create(){

        for (int a = 0;a<=10;a++){
            gridBagConstraints.gridx = a;
            gridBagConstraints.gridy = 0;
            contentPane.add(new JButton("按钮" + a),gridBagConstraints);
        }
            for (int a = 0;a<=10;a++){
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = a;
                contentPane.add(new JButton("按钮" + a),gridBagConstraints);
            }

    }

    /**
     * 设置所占的单元格
     */
    public void createGridWidthAndGridHeigth(){
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridwidth = 2;
        contentPane.add(new JButton("按钮"),gridBagConstraints);
    }
    public void setFill(){
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
//        所占的单元格
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridwidth = 2;
//        fill的属性参数需要调用约束的静态属性
//        填充所占的单元格
//        gridBagConstraints.fill = GridBagConstraints.BOTH;
//        水平的拉伸到所占单元格的最大
//        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
//        垂直的拉伸最大的所占的单元格
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        contentPane.add(new JButton("fill按钮"),gridBagConstraints);
    }
    public void setAnchor(){
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
//        所占的单元格
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.CENTER;
        gridBagConstraints.anchor = GridBagConstraints.SOUTH;
        contentPane.add(new JButton("@"),gridBagConstraints);

        GridBagConstraints gbt = new GridBagConstraints();
        gbt.gridy = 6;
        gbt.gridx = 6;
        gbt.gridwidth = 2;
        gbt.gridheight = 2;
//        表示所占单元格的状态,是否填满,垂直拉升等等
        gbt.fill = GridBagConstraints.BOTH;
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        contentPane.add(panel,gbt);

    }
    public void setInset(){
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight =1;
        gridBagConstraints.gridwidth =1;
//        表示的是再指定的区域里面距离区域边缘的距离
        gridBagConstraints.insets = new Insets(5,5, 5, 10);
        contentPane.add(new JButton("%"),gridBagConstraints);
    }
    public void setIpadxAndIpady(){
//     设置默认的组件的大小
    }
    public void setweightxAndweight(){
//        当窗体拉大的时候就会按照设置的大小进行变化
        gridBagConstraints.weightx = 10;
        gridBagConstraints.weighty = 10;
    }
    public static void main(String[] args) {
        Test07 test07 = new Test07();
        test07.create();
        test07.createGridWidthAndGridHeigth();
        test07.setFill();
        test07.setAnchor();
        test07.setInset();
    }
}

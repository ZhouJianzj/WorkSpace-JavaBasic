package JFrame.Linkman;

import javax.swing.table.DefaultTableModel;
import java.util.Vector;

/**
 * @ClassName LinkmanModul
 * @Description TODO
 * @Author
 * @Date 2021/1/11
 **/
public class LinkmanModel extends DefaultTableModel {
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

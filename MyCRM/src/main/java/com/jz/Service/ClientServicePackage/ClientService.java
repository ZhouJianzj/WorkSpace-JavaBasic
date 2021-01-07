package Service.ClientServicePackage;

import javax.swing.*;

/**
 * @ClassName ClientService
 * @Description TODO
 * @Author
 * @Date 2021/1/4
 **/
public interface ClientService {
    /**
     * 查询按钮查询商店界面表中的产品数据
     * @param testSql
     */
    void search(String testSql);

    /**
     * 商店界面表中显示数据
     */
    void linkJdbc();

    /**
     * 反馈信息表中存数据
     * @param id
     * @param name
     * @param time
     * @param productid
     * @param solve
     * @param backInfor
     */
    void backInformation(String id,String name,String time,String productid,String solve,String backInfor);

    /**
     * 订单表存数据
     */
    void dingDanTableCun(JTable jTable);

    /**
     * 订单界面表中数据的显示
     */
    void dingDanTable();
}

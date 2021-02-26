package Jbdc.ConnTest1;

import Jbdc.ConnTest1.InterfaceJDBC;

/**
 * @ClassName MySQL
 * @Description TODO
 * @Author
 * @Date 2020/11/15
 **/
public class MySQL implements InterfaceJDBC
{
    @Override
    public void connection() {
        System.out.println("连接mysql数据库成功！");
    }
}

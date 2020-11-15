package Jbdc;

/**
 * @ClassName InterfaceJDBC
 * @Description TODO
 *              JDBC链接数据库的的基本的原理
 *          有三者的关系
 *              Java程序员
 *              jdbc接口
 *              数据库的实现类
 *          接下来我们来模拟以下基本的结构
 * @Author
 * @Date 2020/11/15
 **/
public interface InterfaceJDBC {
    public abstract void connection();
}

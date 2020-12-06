package Exception;

import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;

/**
 * @ClassName MyDenfinition
 * @Description TODO
 *                      这里主要讲的就是自定义的异常的用法与如何自己定义异常
 * @Author ZhouJian
 * @Date 2020/12/6  
 **/
public class MyDefinitionException extends Exception {
    /**
     * 模仿sun公司的写法 给一个wucangouzaofangfa
     */
    public MyDefinitionException(){

    }

    /**
     * 给一个有参数的构造方法
     * @param s
     */
    public MyDefinitionException(String s){
        super(s);
    }
}
class TestMyDefinitionException{
    public static void main(String[] args) {
        MyDefinitionException myDefinitionException = new MyDefinitionException("自定义异常");
        System.out.println(myDefinitionException);
    }
}

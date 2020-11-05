package Object.Clone;

/**
 * @ClassName Test01
 * @Description
 * clone()
 * 基本的语法结构
 *  protected native Object clone( ) throws cloneNotSupportedException;
     * 1、深克隆
     * 2、浅克隆
 * @Author
 * @Date 2020/11/5
 **/
public class Test01 {
   @Override
   public native Object clone() throws CloneNotSupportedException;
}

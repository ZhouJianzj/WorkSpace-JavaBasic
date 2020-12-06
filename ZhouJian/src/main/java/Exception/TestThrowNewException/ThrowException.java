package Exception.TestThrowNewException;

/**
 * @ClassName ThrowException
 * @Description TODO
 *                      自定义的异常需要继承Exception
 * @Author ZhouJian
 * @Date 2020/12/6
 **/
public class ThrowException extends Exception {
   public ThrowException(){

   }
   public ThrowException(String s){
       super(s);
   }
}

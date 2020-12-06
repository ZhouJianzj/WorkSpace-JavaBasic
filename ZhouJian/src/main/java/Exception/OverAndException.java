package Exception;

import Exception.TestThrowNewException.ThrowException;

/**
 * @ClassName OverAndException
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/6
 **/
public class OverAndException{
}
class Animals{
    public void doSome(){}
    public  void doOther() throws Exception{}
}
class Dog extends Animals{
    @Override
/**
 * public void doSome() throws ThrowException{}
 *  加入向上面的写法的话就会报错
 * 因为父类中的方法没有throw Exception
  */
    public void doSome() {}

    /**
     * 只要是父类中的方法含有Exception 在子类继承重写的时候方法就可以throws 异常，
     * 并且子类抛出的异常只能是小于等于父类中的异常
     */
    @Override
    public void doOther() throws Exception{}

}

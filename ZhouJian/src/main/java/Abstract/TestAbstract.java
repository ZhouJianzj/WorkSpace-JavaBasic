package Abstract;

/**
 * @ClassName testAbstract
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/29
 **/

/**
 * 测试 抽象类 是否能够继承 非抽象类
 *
 *
 *抽象的方法必须是一个static的方法     static abstract
 *
 *  非抽象的类extends抽象的类是需要overRide其中的abstract修饰的方法的
 */
public class TestAbstract {
}
abstract class TT extends TestAbstract {
}

//
//可以
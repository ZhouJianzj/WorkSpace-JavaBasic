package Javadaily.Day14;

/**
 * @ClassName AnonymityOuter
 * @Description TODO
 * 匿名的内部类：没有名字的内部类就叫做匿名类
 *              语法结构{overRide interface 当中的方法};
 *              匿名的类必须继承一个父类或者实现一个接口
 *              匿名的类不能定义任何的静态的成员和方法
 *              匿名的类当中不能再有抽象的方法
 *
 * @Author
 * @Date 2020/11/3
 **/
interface  AnonymityOuter {
    /**
     * 接口的方法全都是抽象的方法
     */
    public abstract void doOther();
}
class AnonymityText{
    public static void main(String[] args) {
        AnonymityOuter anonymityOuter = new AnonymityOuter()
//        下面的类就是匿名类，最后需要分号结束
        {
            @Override
            public void doOther() {
                System.out.println("这是一个匿名的类");
            }
        };
    }
}
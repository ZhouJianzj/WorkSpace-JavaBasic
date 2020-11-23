package Package.Integer;

/**
 * @ClassName IntegerConsstruction
 * @Description TODO
 *                      integer 类中的基本的方法
 * @Author ZhouJian
 * @Date 2020/11/22
 **/
public class IntegerConstruction {
    public static void main(String[] args) {
//        Integer 类中的构造方法
        Integer i= new Integer(100);
        Integer ii = new Integer("100");
//        最大值最小值的  Integer.MAX_VALUE;
        System.out.println("Integer类型的最大值 ：" + Integer.MAX_VALUE);
        System.out.println("Integer类型的最小值 ：" + Integer.MIN_VALUE);
    }
}

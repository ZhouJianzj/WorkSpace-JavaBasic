package Package.enumTest;


/**
 * @ClassName enumTest01
 * @Description TODO
 *          1、标识符不能使用关键字，比如这里的包使用Enum的时候package就会
 *             是一个不带圈的package
 *          2、首先引入的是异常的概念,当异常返回的时候是Boolean类型的时候
 *              就很局限，当一个事件有多种可能的时候就不能满足，所以需要改
 *              近
 *
 * @Author ZhouJian
 * @Date 2020/11/30
 **/
public class EnumTest01 {
    public static void main(String[] args) {
      boolean aa =  divide(10,0);

        System.out.println(aa ? "运算正确！" : "运算错误！");
    }

    /**
     * 这里的情况比较少只有两种，当Boolean类型的只能满足两个，超过两个的时候
     * 就需要枚举类的引入了Enum
     * @param a
     * @param b
     * @return
     */
    public static boolean divide(int a,int b){
        try{
            int c = a / b;
            return true;
        }catch (Exception e){
            System.err.println("分母不能为零哦！");
            return false;
        }
    }
}

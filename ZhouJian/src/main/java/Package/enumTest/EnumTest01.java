package Package.enumTest;

/**
 * @ClassName enumTest01
 * @Description TODO
 * 标识符不能使用关键字，比如这里的包使用Enum的时候package就会
 * 是一个不带圈的package
 * @Author ZhouJian
 * @Date 2020/11/30
 **/
public class EnumTest01 {
    public static void main(String[] args) {
      boolean aa =  divide(10,0);
        System.out.println(aa ? "运算正确！" : "运算错误！");
    }
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

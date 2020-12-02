package Package.enumTest;

/**
 * @ClassName EnumTest02
 * @Description TODO
 *                       enum  是一个引用数据类型
 * @Author ZhouJian
 * @Date 2020/12/2
 **/
public class EnumTest02 {
    public static void main(String[] args) {
//        switch 支持枚举类的使用
//        switch  还可以匹配int String char  类型的数据
      switch (Season.SPRING){
          case SPRING:
              System.out.println("春天到来了，万物复苏了！");
          break;
          case AUTUMN:
              System.out.println("秋天到了，树叶黄了！");
              break;
          case SUMMER:
              System.out.println("夏天来了，骄阳似火！");
              break;
          case WINNER:
              System.out.println("冬天来了，白雪皑皑！");
              break;
      }
    }
}
enum Season{
//    里面的数据类型可以看成是一个常量
    SPRING,AUTUMN,SUMMER,WINNER
}

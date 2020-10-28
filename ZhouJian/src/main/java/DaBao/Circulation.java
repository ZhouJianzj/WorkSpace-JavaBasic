package DaBao;

/**
 * @ClassName Circulation（循环）主要讲的就是for循环
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/23
 **/
public class Circulation {
    public static void main(String[] args) {
/*       九九乘法表的实现：
            注意点：
                    for循环的结构就是先执行前两段的的参数判断
                    第二次循环的时候是嵌套，最外部的每执行一次循环的时候嵌套在里面的循环就会重新的以参数初始值开始循环
                    实例：当a = 1 的时候 执行嵌套的循环b = 1,当嵌套循环的结束的时候当b = 1 ，b++ = 2的时候
                    就结束嵌套循环 b++的值throw；跳到上一层的循环体系开始a++满足条件开始执行嵌套循环，这时候还是从1开始
                    的，
                    大致的循环形状就是     最外面一个循环的值 后面加上 嵌套循环的所有值
*/
      for(int a = 1; a <= 9; a++){
          for (int b =1; b <= a; b++){
              System.out.print(a + "*" + b + " ");
              if(a == b){
                  System.out.print("\n");
              }
          }
      }
        For();

    }

    public static void For(){
        for(int a = 1; a <= 10; a++){
            for (int b = 1; b <= 5;b++){
                System.out.print(a + "*" + b + " ");
                if (b == 5){
                    System.out.println("\n");
                }
            }
        }
    }
}



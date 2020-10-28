package TextClass;

/**
 * @ClassName Text9
 * @Description 作业的测试
 * @Author Administrator
 * @Date 2020/10/15988
 **/
public class Text9 {
    public static void main(String[] args) {
//        Tom cat = new Tom();
        Tom.y = 100;
        Tom cat = new Tom();
//          cat.y ==200;
//        Tom.x = 300;
        Tom.showY();
    }
//}
//class Tom{
//    int x;
//    static int y;
//     Tom(){
//        System.out.println("ok");
//    }
//    Tom(int m){
//        System.out.println("你好-呀！");
//    }
//    public void a(){
//
//    }
//}
//class E{
//    int x;
//    public void f(int n ){
//        int m = 0;
//        int t = x + n;
//        int y = x + m;
//        m = 10;
//        y = x + m;
//    }
//}
static class Tom{
        int x ;
        static int y ;
        void showXY(){
            System.out.println("Nihao");
        }
        static void showY(){
            System.out.println("NIHAO");
        }
    }
}
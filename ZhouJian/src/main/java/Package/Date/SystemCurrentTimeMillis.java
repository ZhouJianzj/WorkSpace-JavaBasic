package Package.Date;

/**
 * @ClassName SystemCurrentTimeMillis
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/23
 **/
public class SystemCurrentTimeMillis {
    public static void main(String[] args) {
        Long a = System.currentTimeMillis();
        print();
        Long b = System.currentTimeMillis();
        System.out.println("本程序使用了：" + (b-a)+ "毫秒");
    }
    public static void print(){
        for (int i = 0; i < 10000000; i++){
//            System.out.println(i);
        }
    }
}

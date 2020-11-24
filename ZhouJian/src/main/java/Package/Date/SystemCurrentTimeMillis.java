package Package.Date;

/**
 * @ClassName SystemCurrentTimeMillis
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/23
 **/

/**
 * System.out   【out是一个静态的变量】
 * System.out.println(); 【println（）方法不是System类的，是printlnStream类的方法】
 * System.gc()     建议启动垃圾回收器
 * System.exit(0)   推出JVM
 * System.currentTimeMills()    获取1970-1-1到现在的时间返回的是毫秒
 */


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

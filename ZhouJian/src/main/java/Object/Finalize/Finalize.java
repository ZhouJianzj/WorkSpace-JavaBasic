package Object.Finalize;

/**
 * @ClassName Finalize
 * @Description
 * 垃圾回收器的调用的方法，在此方法下面写一些遗言
 * @Author ZhouJian
 * @Date 2020/11/5
 **/
public class Finalize {

}
class Students{
    int no ;
    String name;
    protected void Finalize() throws Throwable {
        System.out.println("请写下你的遗言！");
    }
}
class Test{
    public static void main(String[] args) {
//

        Students a = new Students();
        a = null;
        System.gc();//表示建议其启动垃圾回收器
    }
}

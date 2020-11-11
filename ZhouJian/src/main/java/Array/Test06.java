package Array;

/**
 * @ClassName Test06
 * @Description 数组一旦确定下来长度就不能再加以改变了
 *  所以我们扩容数组的时候就需要使用搭配System.arraycopy(原数组src ,原数组起始的下标srcPos,目的地数组dest， destPos,所需要克隆的数组长度)
 *  源代码是这样的
 *              System.arraycopy(Object src,int srcPos,Object best,int bestPos,int length );
 *     最好就不要进行copy比较繁琐影响程序的运行；
 * @Author
 * @Date 2020/11/8
 *
 **/
public class Test06 {
    public static void main(String[] args) {
        int[] aa = Array.a;
        int[] bb = Array.b ;
//        这里的srcPos:表示源数组的元素的起始下标  这里的dest代表目的数组
        System.arraycopy(aa,0,bb,0,aa.length);
    }


}
class Array{
    static int[] a = {1,2,3,45,3};
    static int[] b = new int[10];
}
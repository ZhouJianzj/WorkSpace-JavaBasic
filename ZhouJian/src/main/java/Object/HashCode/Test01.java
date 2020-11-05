package Object.HashCode;

/**
 * @ClassName Test01
 * @Description TODO
 *public native int hashCode();
 * 这不是抽象的方法 是带有native关键字的 调用底层C++程序
 * hashCode返回的是一个哈希码
 *      实际上就是一个Java对象的内存地址，经过哈希算法得出一个值，可以等同于一个Java内存地址
 *
 * @Author ZhouJian
 * @Date 2020/11/5
 **/
public class Test01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.hashCode();
        System.out.println(test01.hashCode());
    }
}

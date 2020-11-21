
package StringMethods;

/**
 * @ClassName StringBuffer
 * @Description TODO
 * BUffer 缓冲区
 * @Author ZhouJian
 * @Date 2020/11/21
 **/
public class StringBufferTest01 {
    /**
     * Buffer缓冲区为了是字符串拼接的时候使用的
     *      append()方法就是拼接字符串,初始化的一个byte[]数组是一个capacity(容量)为16字节的数组，在设计的时候最好预先设计好的容量大小
     *      优化:就是最好事先预设一个缓冲区byte数组的长度，以免省去后面字符串拼接导致数组的
     *          扩容System.arrayCopy()
     *
     */
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        System.out.println(stringBuffer);

    }
}

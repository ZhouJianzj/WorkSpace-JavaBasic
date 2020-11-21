
package StringMethods;

import sun.applet.Main;

/**
 * @ClassName StringBuilderTest
 * @Description TODO
 *                      StringBuilder : 也可以完成字符串的拼接
 *
 * @Author ZhouJian
 * @Date 2020/11/21
 **/
public class StringBuilderTest {
    /**StringBuffer() and StringBuilder 的区别
     * StringBuffer : 有线程安全
     * StringBuilder:没有线程安全的保护
     *
     * @param args
     */
    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("zhojian");
        stringBuilder.append("aaaa");
       stringBuilder.append("shinihoa");
       stringBuilder.append('j');
        System.out.println(stringBuilder);


    }
}

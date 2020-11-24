package Package.number;

import java.text.DecimalFormat;

/**
 * @ClassName Number
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/24
 **/
public class DecimalFormat1 {
    /**
     * ### 代表的是任意的数字
     * ，   千分位
     * 。    代表小数点
     * 0    代表不够位数补0
     *
     * decimal   十进位的，小数的
     * @param args
     */


    public static void main(String[] args) {
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("####,###.##");
        String number = decimalFormat.format(17723.773);
        System.out.println(number);
    }
}

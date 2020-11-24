package Package.number;

import java.math.BigDecimal;

/**
 * @ClassName BigDecimal
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/24
 **/
public class BigDecimalTest {
    public static void main(String[] args) {
        /**
         * Big Decimal  属于大数据，精度比较高
         *
         *
         * 当处理财务数据的时候用的一种数据类型 BigDecimal
         * java.math.BigDecimal
         */
        BigDecimal number = new BigDecimal(200);
        BigDecimal number01= new BigDecimal(100);
        BigDecimal number02 = number.add(number01);
//        下面输出的都是高精度的数据
        System.out.println(number02);
//        乘法
        System.out.println(number.multiply(number01));
//        除法
        System.out.println(number.divide(number01));
//        减法
        System.out.println(number.subtract(number01));
    }
}

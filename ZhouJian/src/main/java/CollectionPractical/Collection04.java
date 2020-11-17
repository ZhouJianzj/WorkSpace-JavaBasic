package CollectionPractical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName Collection04
 * @Description TODO
 *                      contain方法
 *                      注意：下面的例子
 *                          String类中的equals方法已经重写了
 * @Author ZhouJina
 * @Date 2020/11/17
 **/
public class Collection04 {
    public static void main(String[] args) {
        Collection cc = new ArrayList();
        String a = new String("abc");
        String b = new String("dfg");
        cc.add(a);
        cc.add(b);
        String c = new String("abc");
//       输出的结构时true,原因是contains调用了equals方法，然而String方法当中的equals重写过了
        System.out.println(cc.contains(c));
//       详情查看Collection05

    }


}

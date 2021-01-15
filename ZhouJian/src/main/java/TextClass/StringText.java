package TextClass;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

/**
 * @ClassName StringText
 * @Description TODO
 * @Author
 * @Date 2021/1/15
 **/
public class StringText {
    public static void main(String[] args) {
        String s = new String("zhouajian");
        //返回字符串的长度
        int length = s.length();
        System.out.println( length +"++++++++++++++++++++++++++");
        //返回的是Boolean类型
        System.out.println(s.equals("zhoujian"));

    }
}

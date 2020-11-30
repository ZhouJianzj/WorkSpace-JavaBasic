package JavaBasic.week7;

/**
 * @ClassName ThreeLianDong
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/30
 **/
public class ThreeLianDong {
    public static void main(String[] args) {
//        String[] china =new String[4];
//        String[] country = new String[2];
//        String[] qu = new String[3];
        String[] china ={"安徽","黑龙江","四川省","江苏"};
        String[] country ={"南京市","扬州市"};
        String[] qu = {"邗江区","广陵区","高邮"};
        for (int a = 0;a < country.length;a++){
           china[3] = country[a];
           if(a == 1) {
               for (int b = 0; b < qu.length; b++) {
                   country[2] = qu[b];
               }
           }
       }
        System.out.println(china[3].length());
//        for (int c = 0;c<china[3].length();c++){
//            for (int d = 0;d<china[3][1].)
//        }
    }
}

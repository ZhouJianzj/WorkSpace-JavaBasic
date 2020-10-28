package TextClass;

import java.sql.SQLOutput;

/**
 * @ClassName Text2
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/7
 **/
public class Text2 {
    public static void main(String[] args){
        boolean sex = true;
        char b = sex ? '女' : '男';
        System.out.println(b);
        sex = false;
        char c = sex ? '女' : '男';
        System.out.println(c);


        System.out.println("I \nLove \nYou");

        char a ='\u0070';
        System.out.println(a);

        char f='\\';
        System.out.println(f);

        int aa = 1;
        int bb = 2;
        if(aa > bb && aa < bb ){  // output false逻辑与只要第一个是false就是false
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(aa <bb || aa > bb){  //output is true 逻辑或只要第一个是true整个就是true
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}


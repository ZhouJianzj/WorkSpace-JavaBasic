package CollectionPractical;

import sun.java2d.pipe.SpanIterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName Collection05
 * @Description TODO
 * @Author
 * @Date 2020/11/17
 **/
public class Collection05 {
    public static void main(String[] args) {
        Collection s = new ArrayList();
        Students s1 = new Students("jack");
        Students s2 = new Students("jack");
        s.add(s1);
        s.add(s2);
//        这里会显示false因为students类中没有重写equals方法
//        Students默认的继承Object,object中equals方法时this = obj比较是两个内存地址
        System.out.println(s.contains(s2));
        System.out.println(s.contains(s2));

    }

}
class Students {
    private  String name;
    public Students(){

    }
    public Students(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object object){
        if(object == null && !(object instanceof Students)){
                return false;
        }
        if (this == object){
            return true;
        }
        Students s = (Students)object;
       return this.name.equals(s.name);

    }
}
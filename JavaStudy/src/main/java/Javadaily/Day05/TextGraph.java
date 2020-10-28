package Javadaily.Day05;

/**
 * @ClassName TextGraph
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/24
 **/
public class TextGraph {
    public static void main(String[] args) {

//        分别创建对象并且赋值
        Circle circle = new  Circle(2);
        System.out.println(circle.getCircumference());


        System.out.println("********************");
        Rectangle rect = new Rectangle(2,3);
        System.out.println(rect.getCircumference() );


        System.out.println("***********************");
//        用向上转型对象，这样的graph可以接受Circle的对象，也可以接受Rectangle ，体现了多态。
        BaseGraph graph = new Circle(2);
        System.out.println(graph.getCircumference() );
        graph = new Rectangle(2,3);
        System.out.println(graph.getCircumference());

    }
}

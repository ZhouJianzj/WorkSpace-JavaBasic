package Javadaily.Day11;

import JavaBasic.week2.Student;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName Day11
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/10/31
 **/
public class Day11 {
    public static void main(String[] args){
        Predicate<Integer> predicate = x -> x > 185;
        Student student = new Student("小明，23，180");
//        System.out.println("小明的身高高于185吗? :" + predicate.test(student.getStature()));
        Consumer<String> consumer = System.out::printf;
        consumer.accept("我命由我不由天！");

        Function<Student,String> function = Student::getName;
        String name = function.apply(student);
        System.out.println(name);

        Supplier<Integer> supplier = () ->Integer.valueOf((BigDecimal.TEN.toString()));
        System.out.println(supplier.get());

        UnaryOperator<Boolean>unaryOperator = uglily ->!uglily;
        Boolean apply2 = unaryOperator.apply(true);
        System.out.println(apply2);

        BinaryOperator<Integer> operator = (x,y)-> x * y;
        Integer integer = operator.apply(2,3);
        System.out.println(integer);

        test(()->"是一个演示函数接口");
    }

    /**
     * 演示自定义的函数式接口使用
     */

    public static void test(Worker worker){
        String work = worker.work();
        System.out.println(work);
    }
    public interface Worker{
        String work();
    }
}
 class TestCase {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("路飞", 22, 175),
                new Student("红发", 40, 180),
                new Student("白胡子", 50, 185)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
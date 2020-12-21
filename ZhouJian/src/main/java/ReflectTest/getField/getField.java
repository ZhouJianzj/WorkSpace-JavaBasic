package ReflectTest.getField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @ClassName getField
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/21
 **/
class Test{
    public static void main(String[] args) {
        try {
//            捕获class
            Class c = Class.forName("ReflectTest.getField.getField");
//            获取class的名字
            String cName = c.getName();
            System.out.println(cName);
            System.out.println("================================");

//           只能获取的是public修饰（modifier）的参数的名字
            Field[] field = c.getFields();
            for (Field field1 : field){
                System.out.println(field1.getName());
            }
            System.out.println("==============================");
//            获取所有的参数名字
            Field[] declaredFields = c.getDeclaredFields();
            for (Field declaredField1 : declaredFields){
//                获取数据的类型
                Class<?> type = declaredField1.getType();
//                获取数据类型的名字
                String name = type.getName();
//                获取参数修饰符,返回值是一个int类型的
                int modifiers = declaredField1.getModifiers();
//                int的数据代表的是类型的编号，使用修饰符点toString的方法转换
                String modifier = Modifier.toString(modifiers);
                System.out.println(modifier);
                System.out.println(name);
                System.out.println(declaredField1.getName());
            }
            System.out.println("==============================");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
public class getField {
    public int no;
    private String name;
    boolean flage;
    protected int birth;
}

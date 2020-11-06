package Array;

/**
 * @ClassName test02
 * @Description TODO
 * @Author
 * @Date 2020/11/6
 **/
public class Test02 {
    public static void main(String[] args) {
//        String 是一个引用的数据类型
//        默认值是null
        String a = null;
        System.out.println(a);
        String[] array = new String[9];
//        也可以这样的传递静态的数组 new String[]{"123","123" ,"131"}
        String[] array1 = { "da","dawd"};
        A.printArray(new String[]{"123","123" ,"131"});
}

}
class A{
    public static void printArray(String[]  array){
        for (int i = 0; i < array.length;i++){
            System.out.print(array[1]);
        }

    }
}

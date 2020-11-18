package Array.ArraysUtil;

/**
 * @ClassName ArraysSelected
 * @Description TODO
 *                          数组的查找
 *                             1.一个一个的找
 *                             2.二分查找
 * @Author
 * @Date 2020/11/18
 **/
public class ArraysSelected01 {
    public static void main(String[] args) {
          String[] a = new String[100];
          for (int i = 0; i<a.length;i++){
              a[i] = "zhoujian";
          }
          for (int i = 0 ;i < a.length;i++) {
              if (a[i] == "zhoujian") {
                  System.out.println(i);
//                  当不添加return的时候会查找出数组当中所有的元素
//                  当加上return的时候只会查找第一个出现的元素
//                  return;
              }
          }
    }
}

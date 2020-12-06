package Exception.TestThrowNewException;

import com.sun.org.apache.bcel.internal.generic.PUSH;

import javax.activation.MailcapCommandMap;

/**
 * @ClassName Test
 * @Description TODO
 *                          Exception 的应用
 * @Author ZhouJian
 * @Date 2020/12/6
 **/
public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
       try {
           PushAndPop pushAndPop = new PushAndPop(array);
//           压栈9次
           for (int b = 0;b< 9; b++){
               pushAndPop.push();
           }
//           弹栈10次
           for (int a = 0; a<10; a++) {
               pushAndPop.pop();
           }
       }catch (ThrowException e){
//           所以输出的是栈已空
           System.out.println(e.getMessage());
       }
//       异常发生之后代码还会执行
       for (int i = 0; i< array.length;i++){
           System.out.println(array[i]);
       }
    }
}

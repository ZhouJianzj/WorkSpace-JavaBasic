package Array.Work;

/**
 * @ClassName myStack
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/8
 **/

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Objects;
import java.util.regex.Matcher;

/**
 * 创建一个一维数组
 * 提供push 和 pop 方法进行数组的元素的增减
 * push 当栈中元素满的时候就不能压栈了
 * pop 当栈中的元素为空的时候就不能出栈了
 *
 */
public class MyStack {
    Object[] elements ;
    int index = 0;
/**
 * 主函数调用的时候直接传一个数组进来
  */

    public MyStack(Object[] objects){
        this.elements = objects;
    }

    /**
     * 无参构造器
     */
    public MyStack(){}
    /**
     * 压栈的操作
     */
    public void push(Object o){
//        下标的参数0-length-1 慢的时候就是index < length
        if(index < elements.length){
//            使其数组中的元素为 其输入的元素
            elements[index] = o;
//            下一次压栈的时候依次的往后面排，知道index < elements.length
            index++;
        }else{
            System.out.println("栈已满！无法压栈操作！");
        }
    }

    /**
     * 弹栈的操作,由于栈的进出是先进后出的原则所以在此设计的时候就不添加弹栈的元素了
     */
    public void pop(){
            index--;
//        当栈中没有元素的时候就是下标index < 0 的时候
        if(index < 0){
            System.out.println("当前的栈已空无法执行大人的弹栈操作!");
        }else{
//            弹栈是从当前的元素开始弹不可以当数组当中有五个元素你要弹下标为0的元素
            elements[index] = 0;

        }
    }
}
class ForArray{
    public static void forArray(Object[]  objects){
        //       数组的遍历
        for (int i = 0;i < objects.length;i++){
            System.out.print(objects[i]);
        }
        System.out.println();
    }
}
class Test{
    public static void main(String[] args) {
       Object[] objects = new Object[3];
       MyStack myStack = new MyStack(objects);



//       演示数组的压栈,为了方便使用了一个for循环
//         如果p大于了objects.length的长度就会显示栈已经满了
       for (int p = 1;p <= objects.length;p++){
           myStack.push("你好!");
       }
//        遍历数组,方法归类了
        ForArray.forArray(objects);




//          下面是弹栈的演示
        for(int pop = objects.length; pop > 0;pop--){
            myStack.pop();
        }
        ForArray.forArray(objects);
    }


}
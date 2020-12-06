package Exception.TestThrowNewException;



/**
 * @ClassName PushAndPop
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/6
 **/
public class PushAndPop  {
    public int[] array;
    public int i = 0;
    public PushAndPop(){

    }
    public PushAndPop(int[] array){
        this.array = array;
        this.i = 0;
    }

    public void push() throws ThrowException{
       array[i] = 2;
       i++;
       if (i>= array.length){
//           建一个异常抛出
           throw new ThrowException("栈已满");
       }
//         一开始程序卡在这里是因为 在上面的i++的时候整个类中的i都为10了，导致到下面的pop中使用的i
//        就是10，所以当数组为空的时候pop方法还需要执行一次
        --i;
    }
    public void pop() throws ThrowException{

        if (i< 0){
            throw new ThrowException("栈已空");
        }else{
            array[i] = 0;
            i--;
        }

    }
}

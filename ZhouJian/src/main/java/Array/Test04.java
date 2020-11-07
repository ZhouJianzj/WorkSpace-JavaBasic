package Array;

/**
 * @ClassName Test04
 * @Description
 * 这里呢就是搞一个用户登录的系统
 * 实现的基本的原理
 *  1、用户输入账户与密码 以空格的形式断开
 *  2、jvm调用main方法传递进去一个数组就是刚输入的
 *  3、判断用户输入的格式是否正确
 *  4、格式正确了判断输入的字符串是否相等 使用到数组当中的元素的调用以及字符串的比较
 *  5、if判断system输出结果
 * @Author ZhouJian
 * @Date 2020/11/6
 **/
public class Test04 {
    public static void main(String[] args){
        boolean resultName;
        boolean resultKey;
        if (args.length != 2) {
            System.out.println("请输入正确的用户密码和账户");
            return;
        }
//        这样子的写可以避免空指针异常的问题
        if ("zhoujian".equals(args[0])){
            resultName = true;
        }else{
            System.out.println("请输出正确的用户账户！");
            return;
        }
//        这样写的话如果密码没有输入的话会出现空指针Exception
        if (args[1].equals(12345)){
            resultKey = true;
        } else{
            System.out.println("请输入正确的用户密码！");
            return;
        }
        if (resultName = resultName ){
            System.out.println("登陆成功！");
        }
    }
}

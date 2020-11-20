package DaiDuTextPratice;

/**
 * @ClassName Frist
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/20
 **/
public class First {
    public static void main(String[] args) {
//        九九乘法表的书写
//        外循环九次，第一次循环从一开始，内循环一次
//        第二次循环从二开始，内循环两次
//        。。。。依次的我们就找到规律了
        for(int a = 1;a <=9;a++){
//         内循环的次数就是外循环次数的
            for(int b = 1; b <= a;b++){
                System.out.print(b + "*" + a + ' ');
//                要求的格式就是每到内循环的次数等于外循环第多少次的时候就需要换行，举一个例子就是2*2就需要换行了
                if(a == b){
                    System.out.println();
                }
            }
        }

    }
}

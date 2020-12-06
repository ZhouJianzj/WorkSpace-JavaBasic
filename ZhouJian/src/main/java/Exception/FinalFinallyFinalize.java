package Exception;

/**
 * @ClassName FinalFianllyFinalize
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/12/6
 **/
public class FinalFinallyFinalize {
    public static void main(String[] args) {
//        不可被修改的
        final int a = 100;
        try {

        }finally {
//            一定会执行的
            System.out.println("finally");
        }
//        当垃圾回收器执行的时候会留下提示
      FinalFinallyFinalize finalFinallyFinalize = new FinalFinallyFinalize();
        finalFinallyFinalize.finalize();
        System.gc();
    }
    @Override
    protected void finalize(){
        System.out.println("你的遗言是！");
    }
}

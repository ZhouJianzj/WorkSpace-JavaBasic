package JavaBasic.week5.Work;

/**
 * @ClassName TestPriceHigh
 * @Description TODO
 * @Author ZhouJian
 * @Date 2020/11/2
 **/
public class TestPriceHigh {
    public static void main(String[] args) {
        Books book1 = new Books("java基础",101);
        BookService bS = new BooksServiceIml();

        boolean result = false;
        try {
            bS.putAway(book1);
        } catch (PutAwayException e) {
            System.err.println(e.getInformation());

        }finally {
            System.out.println("书上架检测完成！");
        }
        if( result){
            System.out.println("可以上架！");
        }else{
            System.out.println("价格超标不可以上架！");
        }
    }
}

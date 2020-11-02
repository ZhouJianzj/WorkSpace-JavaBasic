package JavaBasic.week5.Work;

/**
 * @ClassName BooksService
 * @Description TODO
 * @Author zhouJian
 * @Date 2020/11/2
 **/
public class BooksServiceIml implements BookService {


    @Override
    public boolean putAway(Books books) throws PutAwayException {
        boolean falg = false;
        if (books.getPrice() >= 100){
            throw new PutAwayException("价格超过100元！不允许出版！");
        }else{

            falg = true;
        }
        return falg;
    }
}

package Frame;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author
 * @Date 2020/11/9
 **/
public class LoginService {
    public  boolean login(String account, String passWord){
        if("zhoujian".equals(account) && "12345".equals(passWord)){
            return true;
        }else{
            return false;
        }
    }
}

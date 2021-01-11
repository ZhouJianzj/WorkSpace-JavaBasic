package Service;

import Entity.login;
import Utils.JdbcUtil;

/**
 * @ClassName loginService
 * @Description TODO
 * @Author ZhouJian
 * @Date 2021/1/4
 **/
public interface loginService {
     Boolean checkedLogin(login login);
}

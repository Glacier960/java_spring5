import com.alibaba.elemesearch.qa.dao.UserMySQLImpl;
import com.alibaba.elemesearch.qa.dao.UserOracleImpl;
import com.alibaba.elemesearch.qa.service.UserSeriveImpl;
import com.alibaba.elemesearch.qa.service.UserService;

public class UserTest {
    public static void main(String[] args ){
        //用户实际调用
        UserService userService = new UserSeriveImpl();
        //((UserSeriveImpl)userService).setUserDao(new UserOracleImpl());
        ((UserSeriveImpl)userService).setUserDao(new UserMySQLImpl());
        userService.getUser();
    }
}

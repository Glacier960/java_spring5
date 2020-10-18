import com.alibaba.elemesearch.qa.dao.UserMySQLImpl;
import com.alibaba.elemesearch.qa.dao.UserOracleImpl;
import com.alibaba.elemesearch.qa.service.UserSeriveImpl;
import com.alibaba.elemesearch.qa.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  UserTest {
    public static void main(String[] args ){
        //用户实际调用
        UserService userService = new UserSeriveImpl();
        //((UserSeriveImpl)userService).setUserDao(new UserOracleImpl());
        ((UserSeriveImpl)userService).setUserDao(new UserMySQLImpl());
        userService.getUser();


        //通过bean进行获取对象，不再需要使用new关键字了
        //获取ApplicationContext，拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //容器拿到后，需要什么，就直接get什么

        UserSeriveImpl userSeriveImpl = (UserSeriveImpl)context.getBean("userServiceImpl");
        userSeriveImpl.getUser();



    }
}

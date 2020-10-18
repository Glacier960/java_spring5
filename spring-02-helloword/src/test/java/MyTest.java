import com.alibaba.elemesearch.qa.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象目前都在spring中管理，在spring中这些都叫做bean，要使用直接取出来就行,不需要再new一个对象了
        Hello hello = (Hello) context.getBean("Hello");
        System.out.println(hello.toString());
        //
        /**
         * 思考
         * Hello是哪边创建的?
         * Hello是由spring创建的
         *
         * Hello对象的属性是怎么设置的
         * Hello的对象是由Spring容器设置的
         *
         * 这个过程就是控制反转
         */
    }
}

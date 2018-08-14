import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: bean的初始化和销毁测试
 * @author: liuyongheng
 * @date: 2018/8/14 15:43
 */
public class InitAndDestroyBeanTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}

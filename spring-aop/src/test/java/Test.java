import com.study.spring.aop.impl.ArthmeticCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArthmeticCalculator arthmeticCalculator = ctx.getBean(ArthmeticCalculator.class);
        int result = arthmeticCalculator.add(6, 2);
        System.out.println("result : " + result);
    }
}

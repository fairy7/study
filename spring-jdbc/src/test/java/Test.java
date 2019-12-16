import com.study.spring.tx.BookShopDao;
import com.study.spring.tx.BookShopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {

    private ApplicationContext ctx = null;
    private BookShopDao bookShopDao = null;
    private BookShopService bookShopService = null;
    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        bookShopDao = ctx.getBean(BookShopDao.class);
        bookShopService = ctx.getBean(BookShopService.class);
    }

    @org.junit.Test
    public void test() throws SQLException {
        System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
    }

    @org.junit.Test
    public void testTx() {
        bookShopService.purchase("AA", "1001");
    }

    public void testA() {
        Thread a = new Thread("a");
        a.setDaemon(true);
    }
}

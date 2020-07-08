import com.wang.pojo.Book;
import com.wang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanTest {
    @Test
    public void bean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        for (Book book : bookServiceImpl.queryAllBook()) {
            System.out.println(book);
        }
    }
}

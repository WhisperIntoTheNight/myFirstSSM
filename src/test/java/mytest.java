import com.ssm.pojo.Books;
import com.ssm.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksServiceImpl = (BooksService) context.getBean("BooksServiceImpl");
        for (Books books : booksServiceImpl.findAllBooks()) {
            System.out.println(books);
        }
    }
}

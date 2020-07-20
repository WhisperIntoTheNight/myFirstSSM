import com.ssm.pojo.Book;
import com.ssm.service.BooksService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksServiceImpl = (BooksService) context.getBean("BooksServiceImpl");
        for (Book books : booksServiceImpl.queryAllBooks()) {
            System.out.println(books);
        }
    }
}

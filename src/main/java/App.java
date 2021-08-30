import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.HamletQuoter;
import quoters.Quoter;
import quoters.TerminatorQuoter;

import java.sql.Time;
import java.util.Arrays;
import java.util.Timer;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);

        context.getBean(TerminatorQuoter.class).sayQuote();
        while (true) {
            Thread.sleep(1000);
            context.getBean("hamletQuoter", Quoter.class).sayQuote();
        }
    }
}

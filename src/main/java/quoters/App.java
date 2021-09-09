package quoters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.Quoter;
import quoters.TerminatorQuoter;

import java.util.Arrays;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        context.getBean(TerminatorQuoter.class).sayQuote();
        context.getBean("hamletQuoter", Quoter.class).sayQuote();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);

//        Consumer<Object> o1 = a -> System.out.println(a);
//        Consumer<Object> o2 = System.out::println;
//
//        System.setOut(null);
//
//        o1.accept("First");
//        o2.accept("Second");
    }
}

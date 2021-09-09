package quoters;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
//        Consumer<Object> o1 = a -> System.out.println(a);
        Consumer<Object> o2 = System.out::println;

        System.setOut(null);

//        o1.accept("First");
        o2.accept("Second");
    }
}

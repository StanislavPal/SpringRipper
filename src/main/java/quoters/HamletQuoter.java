package quoters;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

@Profiling
public class HamletQuoter implements Quoter, InitializingBean {

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        for (int i = 1; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }

    public HamletQuoter() {
        System.out.print("Phase 1: ");
        System.out.println("HamletQuoter.Constructor");
        System.out.println("repeat = " + repeat);
    }

    @PostConstruct
    private void initAnnotationMethod() {
        System.out.print("Phase 2: ");
        System.out.println("HamletQuoter.initAnnotationMethod");
        System.out.println("repeat = " + repeat);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.print("Phase 2: ");
        System.out.println("HamletQuoter.afterPropertiesSet");
        System.out.println("repeat = " + repeat);
    }

    private void initXmlMethod() {
        System.out.print("Phase 2: ");
        System.out.println("HamletQuoter.initXmlMethod");
        System.out.println("repeat = " + repeat);
    }
}

package quoters;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quoter, InitializingBean {

    @InjectRandomInt(min = 2, max = 5)
    private int repit;

    private String message;

    public TerminatorQuoter() {
        System.out.print("Phase 1: ");
        System.out.println("TerminatorQuoter.Constructor");
        System.out.println("repit = " + repit);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repit; i++) {
            System.out.println("message = " + message);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.print("Phase 2: ");
        System.out.println("TerminatorQuoter.afterPropertiesSet");
        System.out.println("repit = " + repit);
    }

    private void initXmlMethod() {
        System.out.print("Phase 2: ");
        System.out.println("TerminatorQuoter.initXmlMethod");
        System.out.println("repit = " + repit);
    }

    @PostConstruct
    private void initAnnotationMethod() {
        System.out.print("Phase 2: ");
        System.out.println("TerminatorQuoter.initAnnotationMethod");
        System.out.println("repit = " + repit);
    }
}

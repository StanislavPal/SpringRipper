package quoters;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quoter, InitializingBean {

    @InjectRandomInt(min = 2, max = 5)
    private int repit;

    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
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
        System.out.println("TerminatorQuoter.afterPropertiesSet");
        System.out.println(initXmlMethod());
        System.out.println(initAnnotationMethod());
        System.out.println("TerminatorQuoter.afterPropertiesSet===");
    }

    private String initXmlMethod() {
        System.out.println("TerminatorQuoter.initXmlMethod");
        return "return: String from initXmlMethod";
    }

    @PostConstruct
    private String initAnnotationMethod() {
        System.out.println("Phase 2");
        System.out.println("TerminatorQuoter.initAnnotationMethod");
        return "return: String from initAnnotationMethod";
    }
}

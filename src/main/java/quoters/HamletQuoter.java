package quoters;

public class HamletQuoter implements Quoter {

    @InjectRandomInt(min = 1, max = 3)
    private int repeat;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        for (int i=1; i<repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}

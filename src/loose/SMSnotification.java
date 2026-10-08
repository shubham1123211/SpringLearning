package loose;

public class SMSnotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("SMS : "+message);
    }
}

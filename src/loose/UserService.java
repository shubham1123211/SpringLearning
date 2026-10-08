package loose;

public class UserService {
    Notification notification;
    public UserService(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser(String message) {
        notification.send(message);
    }
}

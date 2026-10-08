package tight;

public class UserService {
    Notification notification = new Notification();
    public void notifyUser(String message) {
        notification.send(message);
    }
}

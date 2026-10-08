import loose.EmailNotification;
import loose.SMSnotification;
import loose.UserService;

public class Main {
    static void main(String[] args) {
        UserService userService = new UserService(new EmailNotification());
        userService.notifyUser("notification sent");

        userService = new UserService(new SMSnotification());
        userService.notifyUser("notification sent");
//        userService.notifyUser("notification sent");
    }
}

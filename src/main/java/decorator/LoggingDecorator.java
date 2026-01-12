package decorator;

import domain.Notification;
import workflow.AbstractNotificationSender;
import workflow.Sender;

public class LoggingDecorator extends NotificationSenderDecorator {
    LoggingDecorator(Sender sender) {
        super(sender);
    }

    @Override
    public void sendNotification(Notification notification) {
        System.out.println("Logging: Sending notification to " + notification.getRecipient());
        super.sendNotification(notification);
        System.out.println("Logging process completed for " + notification.getRecipient());
    }
}

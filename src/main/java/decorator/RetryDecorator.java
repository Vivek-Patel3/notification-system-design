package decorator;

import domain.Notification;
import workflow.Sender;

public class RetryDecorator extends NotificationSenderDecorator{
    public RetryDecorator(Sender sender) {
        super(sender);
    }

    @Override
    public void sendNotification(Notification notification) {
        int attempts = 0;
        boolean sent = false;
        while (attempts < 3 && !sent) {
            try {
                super.sendNotification(notification);
                sent = true;
            } catch (Exception e) {
                attempts++;
                System.out.println("Retry attempt " + attempts + " for " + notification.getRecipient());
                if (attempts == 3) {
                    System.out.println("Failed to send notification to " + notification.getRecipient() + " after 3 attempts.");
                }
            }
        }
    }
}

package decorator;

import domain.Notification;
import strategy.NotificationStrategy;
import workflow.AbstractNotificationSender;
import workflow.NotificationSender;
import workflow.Sender;

public abstract class NotificationSenderDecorator implements Sender {
    protected Sender decoratedSender;

    NotificationSenderDecorator(Sender wrappedSender) {
        this.decoratedSender = wrappedSender;
    }

    public void sendNotification(Notification notification) {
        decoratedSender.sendNotification(notification);
    }
}

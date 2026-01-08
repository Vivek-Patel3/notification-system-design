package workflow;

import domain.Notification;
import strategy.NotificationStrategy;

public abstract class AbstractNotificationSender {
    protected final NotificationStrategy strategy;

    protected AbstractNotificationSender(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    // final because we dont want this order to change in the subclasses
    // template method
    public final void sendNotification(Notification notification) {
        validate(notification);
        buildMessage(notification);
        send(notification);
        postSend(notification);
    }

    // ===== FIXED STEPS =====
    protected void validate(Notification notification) {
        if (notification == null) {
            throw new IllegalArgumentException("Notification cannot be null");
        }
        if (notification.getRecipient() == null ||
                notification.getRecipient().isEmpty()) {
            throw new IllegalArgumentException("Destination cannot be empty");
        }
    }

    // ===== HOOK METHODS =====
    protected void buildMessage(Notification notification) {
        // default: do nothing
    }

    protected void postSend(Notification notification) {
        // default: do nothing
    }

    // ===== VARIABLE STEP =====
    // only this method varies across different strategies
    protected void send(Notification notification) {
        strategy.send(notification);
    }
}

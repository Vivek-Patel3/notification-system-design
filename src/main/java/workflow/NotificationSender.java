package workflow;

import strategy.NotificationStrategy;

public class NotificationSender extends AbstractNotificationSender{
    public NotificationSender(NotificationStrategy strategy) {
        super(strategy);
    }
}

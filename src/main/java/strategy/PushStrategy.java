package strategy;

import domain.Notification;

public class PushStrategy implements NotificationStrategy{
    @Override
    public void send(Notification notification) {
        System.out.println("Sending PUSH to " + notification.getRecipient()
                + " | Priority: " + notification.getPriority()
                + " | Content: " + notification.getContent());
    }
}

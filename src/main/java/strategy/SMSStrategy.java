package strategy;

import domain.Notification;

public class SMSStrategy implements NotificationStrategy{
    @Override
    public void send(Notification notification) {
        System.out.println("Sending SMS to " + notification.getRecipient()
                + " | Priority: " + notification.getPriority()
                + " | Content: " + notification.getContent());
    }
}

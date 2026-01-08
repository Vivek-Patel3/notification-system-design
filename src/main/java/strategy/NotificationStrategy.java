package strategy;

import domain.Notification;

public interface NotificationStrategy {
    /*
    * Sends the notification via a specific channel
    * eg. SMS, email, push etc.
    * This is designed as interface (and not abstract class) because we want it to be swappable to support strategy pattern.
    * Abstract classes are also swappable, but Strategy represents a behavioral contract, not shared implementation. Since notification channels don’t share state or logic, an interface better expresses intent
    * Also it must not include any channel-specific fields
    */
    public void send(Notification notification);
}

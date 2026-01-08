package factory;

import domain.NotificationType;
import strategy.NotificationStrategy;

public class NotificationFactory {
    public static NotificationStrategy create(NotificationType type) {
        return type.createStrategy();
        /*
        * no if-else (type==EMAIL) or switch
        * therefore the system is future-proof and Open-Closed principle is respected
        *
         */
    }
}
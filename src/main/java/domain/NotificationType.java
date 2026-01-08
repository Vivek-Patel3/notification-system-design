package domain;

import strategy.EmailStrategy;
import strategy.NotificationStrategy;
import strategy.PushStrategy;
import strategy.SMSStrategy;

import java.util.function.Supplier;

public enum NotificationType {
    EMAIL(() -> new EmailStrategy()),
    SMS(() -> new SMSStrategy()),
    PUSH(() -> new PushStrategy());

    private Supplier<NotificationStrategy> constructor;

    private NotificationType(Supplier<NotificationStrategy> constructor) {
        this.constructor = constructor;
    }

    public NotificationStrategy createStrategy() {
        return constructor.get();
    }
}
/*
Later (when you add):
1. Decorators
2. Config
3. Dependencies

This enum-based approach may start to feel tight.

At that point, you evolve to:
Map-based registry
Or Spring DI

But for now, your design is perfectly appropriate.
 */
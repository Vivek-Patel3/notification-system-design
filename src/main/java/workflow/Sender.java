package workflow;

import domain.Notification;

public interface Sender {
    void sendNotification(Notification notification);
}

package strategy;

import domain.Notification;

public class EmailStrategy implements NotificationStrategy{
//    private static Map<String, String> DATA_BASE = new HashMap();
//
//    static {
//        DATA_BASE.put("amanda1985", "amanda@ya.com");
//        DATA_BASE.put("john", "john@amazon.eu");
//    }

    // the above design was not good because strategies don't store database. Strategy just needs to know where it has to send
    // even so if you want to have a database, then do not hardcode it by instantiating it by new, rather have it injected

    @Override
    public void send(Notification notification) {
        System.out.println("Sending EMAIL to " + notification.getRecipient()
                + " | Priority: " + notification.getPriority()
                + " | Content: " + notification.getContent());
    }
}

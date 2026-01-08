package domain;

/*
  * reason for creating this class is so we don't have to pass recipient, content and priority as separate parameters everytime
  *
 */
public class Notification {
    private final String recipient;
    private final String content;
    private final Priority priority;

    public Notification(String recipient, String content, Priority priority)
    {
        this.recipient = recipient;
        this.content = content;
        this.priority = priority;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    public Priority getPriority() {
        return priority;
    }
}

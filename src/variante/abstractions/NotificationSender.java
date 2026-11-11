package variante.abstractions;

public abstract class NotificationSender {
    private final String type;

    protected NotificationSender(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void send(String message);
}
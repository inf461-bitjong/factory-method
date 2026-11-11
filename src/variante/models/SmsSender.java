package variante.models;

import variante.abstractions.NotificationSender;

public class SmsSender extends NotificationSender {
    public SmsSender() {
        super("SMS");
    }

    @Override
    public void send(String message) {
        System.out.println("[" + getType() + "] Envoi d'un SMS : " + message);
    }
}
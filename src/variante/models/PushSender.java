package variante.models;

import variante.abstractions.NotificationSender;

public class PushSender extends NotificationSender {
    public PushSender() {
        super("PUSH");
    }

    @Override
    public void send(String message) {
        System.out.println("[" + getType() + "] Envoi d'une notification push : " + message);
    }
}
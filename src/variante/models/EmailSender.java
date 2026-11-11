package variante.models;

import variante.abstractions.NotificationSender;

public class EmailSender extends NotificationSender {
    public EmailSender() {
        super("EMAIL");
    }

    @Override
    public void send(String message) {
        System.out.println("[" + getType() + "] Envoi d'un courriel : " + message);
    }
}
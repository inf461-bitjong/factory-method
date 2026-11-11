package variante.factories;

import variante.abstractions.NotificationSenderFactory;
import variante.abstractions.NotificationSender;
import variante.models.EmailSender;

public class EmailSenderFactory extends NotificationSenderFactory {
    @Override
    public NotificationSender createSender() {
        return new EmailSender();
    }
}
package variante.factories;

import variante.abstractions.NotificationSenderFactory;
import variante.abstractions.NotificationSender;
import variante.models.SmsSender;

public class SmsSenderFactory extends NotificationSenderFactory {
    @Override
    public NotificationSender createSender() {
        return new SmsSender();
    }
}
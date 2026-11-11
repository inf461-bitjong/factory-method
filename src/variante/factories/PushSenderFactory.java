package variante.factories;

import variante.abstractions.NotificationSenderFactory;
import variante.abstractions.NotificationSender;
import variante.models.PushSender;

public class PushSenderFactory extends NotificationSenderFactory {
    @Override
    public NotificationSender createSender() {
        return new PushSender();
    }
}
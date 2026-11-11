package variante;

import variante.abstractions.NotificationSenderFactory;
import variante.abstractions.NotificationSender;
import variante.factories.EmailSenderFactory;
import variante.factories.PushSenderFactory;
import variante.factories.SmsSenderFactory;

public class ClientVariante {
    public static void main(String[] args) {
        System.out.println("--- EXEMPLE MODIFIE : Factory de Senders de Notification ---");

        NotificationSenderFactory factorySms = new SmsSenderFactory();
        NotificationSender smsSender = factorySms.createSender();
        smsSender.send("Votre code de validation est 9832");

        NotificationSenderFactory factoryEmail = new EmailSenderFactory();
        NotificationSender emailSender = factoryEmail.createSender();
        emailSender.send("Bienvenue sur notre application !");

        NotificationSenderFactory factoryPush = new PushSenderFactory();
        NotificationSender pushSender = factoryPush.createSender();
        pushSender.send("Vous avez un nouveau message.");
    }
}
package InversionOfControl.Constructor;

// Class de test
public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailServiceImpl();
        MyApplication app = new MyApplication(emailService);
        app.processMessages("Hello", "example@example.com");
    }
}

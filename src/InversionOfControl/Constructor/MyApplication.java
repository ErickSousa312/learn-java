package InversionOfControl.Constructor;

// Class que depend do service de email
public class MyApplication {
    private final EmailService emailService;

    // Injection via constructor
    public MyApplication(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processMessages(String msg, String rec) {
        emailService.sendEmail(msg, rec);
    }
}

package InversionOfControl.InstantiationClass;

// Classe que depende do serviço de email
public class MyApplication {
    private EmailService emailService;

    // Setter para injeção
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processMessages(String msg, String rec) {
        // Processar a mensagem
        emailService.sendEmail(msg, rec);
    }
}

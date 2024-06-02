package InversionOfControl.Constructor;

public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with Message=" + message);
    }
}


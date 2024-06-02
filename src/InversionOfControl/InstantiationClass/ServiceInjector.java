package InversionOfControl.InstantiationClass;

// Classe de instância
public class ServiceInjector {
    public static MyApplication getApplication() {
        MyApplication app = new MyApplication();
        app.setEmailService(new EmailServiceImpl());
        return app;
    }
}

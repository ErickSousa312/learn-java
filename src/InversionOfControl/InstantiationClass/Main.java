package InversionOfControl.InstantiationClass;

// Classe de teste
public class Main {
    public static void main(String[] args) {
        MyApplication app = ServiceInjector.getApplication();
        app.processMessages("Hello2", "example@example.com");
    }
}

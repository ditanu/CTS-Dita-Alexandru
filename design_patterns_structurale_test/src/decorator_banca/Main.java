package decorator_banca;

public class Main {
    public static void main(String[] args) {
        IClient client = new Client("Ditanu");
        Decorator decoratorClient = new DecoratorClient(client);
        decoratorClient.plataContactLess();
        decoratorClient.plataNormala();
        decoratorClient.plataOnline();
    }
}

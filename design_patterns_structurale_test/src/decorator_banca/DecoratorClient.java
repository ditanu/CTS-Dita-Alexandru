package decorator_banca;

public class DecoratorClient extends Decorator{
    public DecoratorClient(IClient client) {
        super(client);
    }

    @Override
    public void plataContactLess() {
        System.out.println(super.getNume() + " ai facut o plata contact less");
    }
}

package decorator_banca;

public abstract class Decorator implements IClient {

    private IClient client;

    public Decorator(IClient client) {
        this.client = client;
    }

    @Override
    public void plataOnline() {
        client.plataOnline();
    }

    @Override
    public void plataNormala() {
        client.plataNormala();
    }

    public String getNume() {

        return client.getNume();
    }

    public abstract void plataContactLess();
}

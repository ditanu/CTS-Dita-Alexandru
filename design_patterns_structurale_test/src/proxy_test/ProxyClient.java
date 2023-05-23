package proxy_test;

public class ProxyClient implements  IClient{
    private IClient client;

    public ProxyClient(IClient client) {
        this.client = client;
    }

    @Override
    public void verificareAbonament(boolean esteAbonamentValabil) {
        if (esteAbonamentValabil) {
            this.client.verificareAbonament(esteAbonamentValabil);
        } else {
            System.out.println("Abonamentul nu este valid, deci nu putem sa-ti spalam masina");
        }
    }
}

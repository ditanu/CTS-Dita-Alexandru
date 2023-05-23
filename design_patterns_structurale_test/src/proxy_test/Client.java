package proxy_test;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void verificareAbonament(boolean esteAbonamentValabil) {
        System.out.println("Putem sa-ti spalam masina!");
    }
}

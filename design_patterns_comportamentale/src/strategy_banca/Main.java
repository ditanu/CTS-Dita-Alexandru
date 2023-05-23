package strategy_banca;

public class Main {
    public static void main(String[] args) {
        Ghiseu ghiseu = new Ghiseu("ghiseu");

        Client client1= new Client("DITANOS");

        ghiseu.verificareClient(client1);
        ghiseu.setStrategy(new PersoanaJuridica());
        ghiseu.verificareClient(client1);
    }
}

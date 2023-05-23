package strategy_banca;

public class Ghiseu {
    private Strategy strategy;
    private String nume;

    public Ghiseu(String nume) {
        this.nume = nume;
        this.strategy = new PersoanaFizica();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void verificareClient(Client client) {
        this.strategy.solicitareActe(client);
    }

}

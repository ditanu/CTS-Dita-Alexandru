package strategy_test;

public class Spalator {
    private Strategy strategy;
    private String nume;

    public Spalator(String nume) {
        this.nume = nume;
        this.strategy = new Exterior();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void spalareMasina(Client client) {
        this.strategy.modSpalare(client);
    }
}

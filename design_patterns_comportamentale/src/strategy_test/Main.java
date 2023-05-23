package strategy_test;

public class Main {
    public static void main(String[] args) {
        Spalator spalator = new Spalator("Gigel");

        Client client1 = new Client("Vice-versa");

        spalator.spalareMasina(client1);
        spalator.setStrategy(new ExteriorInterior());
        spalator.spalareMasina(client1);
    }
}

package strategy_test;


public class Exterior implements Strategy {
    @Override
    public void modSpalare(Client client) {
        System.out.println(client.getNume() + " doreste sa fie spalata doar in exterior");
    }
}

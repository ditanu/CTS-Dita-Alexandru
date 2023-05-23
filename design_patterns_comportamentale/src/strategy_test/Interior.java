package strategy_test;

public class Interior implements Strategy{
    @Override
    public void modSpalare(Client client) {
        System.out.println(client.getNume() + " doreste sa fie spalata doar in interior");
    }
}

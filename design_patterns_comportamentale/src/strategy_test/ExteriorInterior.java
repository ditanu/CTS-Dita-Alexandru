package strategy_test;

public class ExteriorInterior implements Strategy{
    @Override
    public void modSpalare(Client client) {
        System.out.println(client.getNume() + " doreste sa fie spalata in exterior si interior!");
    }
}

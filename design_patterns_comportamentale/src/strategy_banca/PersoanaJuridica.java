package strategy_banca;

public class PersoanaJuridica implements Strategy{

    @Override
    public void solicitareActe(Client client) {
        System.out.println(client.getNume() +  " arata actele de infiintare a firmei si dovada inregistrarii la Registrul comertului!");
    }
}

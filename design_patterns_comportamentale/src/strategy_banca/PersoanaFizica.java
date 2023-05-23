package strategy_banca;

public class PersoanaFizica implements Strategy{

    @Override
    public void solicitareActe(Client client) {
        System.out.println(client.getNume() + " arata buletinul si adeverinta de la munca!");
    }
}

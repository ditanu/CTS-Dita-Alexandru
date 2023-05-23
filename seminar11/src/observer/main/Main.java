package observer.main;

import observer.classes.Banca;
import observer.classes.Client;
import observer.classes.IBanca;
import observer.classes.IClient;

public class Main {
    public static void main(String[] args) {
        Banca banca1 = new Banca("BCR");
        IClient client1 = new Client("Ditanu");
        IClient client2 = new Client("Gigel");
        IClient client3 = new Client("Radu");

        banca1.actualizeazaAplicatia();

        banca1.adaugaObserver(client1);

        banca1.adaugaObserver(client2);

        banca1.actualizeazaAplicatia();

        banca1.adaugaTipCreditNou();
    }
}

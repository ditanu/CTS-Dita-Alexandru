package observer_banca;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("Alexandru");
        IClient client2 = new Client("Gigel");

        Banca banca1 = new Banca("Raifaisen");

        banca1.adaugaObserver(client1);
        banca1.adaugaObserver(client2);


        banca1.adaugaCreditNou();
        banca1.adaugaAplicatie();
    }
}

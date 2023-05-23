package observer_banca;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaMesaj(String mesaj) {
        System.out.println(this.nume + " a primit urmatorul mesaj " + mesaj);
    }
}

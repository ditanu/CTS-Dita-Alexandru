package observer_sportiv;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }


    @Override
    public void afiseazaMesaj(String mesaj) {
        System.out.println(this.nume + " " + mesaj);
    }
}

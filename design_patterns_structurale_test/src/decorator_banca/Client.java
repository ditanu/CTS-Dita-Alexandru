package decorator_banca;

public class Client implements IClient{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void plataOnline() {
        System.out.println(this.nume + " a facut o plata online!");
    }

    @Override
    public void plataNormala() {
        System.out.println(this.nume + " a facut o plata normala!");
    }

    public String getNume() {
        return nume;
    }
}

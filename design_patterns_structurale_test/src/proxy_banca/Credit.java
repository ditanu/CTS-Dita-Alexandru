package proxy_banca;

public class Credit implements ICredit{
    private String nume;

    public Credit(String nume) {
        this.nume = nume;
    }

    @Override
    public void creareCont(String moneda) {
        System.out.println("Felicitari ti-ai creat contul cu moneda in " + moneda);
    }
}

package proxy_banca;

public class ProxyCredit implements ICredit{
    private ICredit credit;

    public ProxyCredit(ICredit credit) {
        this.credit = credit;
    }

    @Override
    public void creareCont(String moneda) {
        if (moneda == "RON") {
            credit.creareCont(moneda);
        } else {
            System.out.println("Contul nu a fost creat doarece moneda trebuie sa fie neaparat RON!");
        }
    }
}

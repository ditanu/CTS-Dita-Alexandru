package proxy_banca;

public class Main {
    public static void main(String[] args) {
        ICredit credit1 = new Credit("Ditanu");
        ICredit credit2 = new Credit("Ezekiel");

        ProxyCredit proxyCredit = new ProxyCredit(credit1);
        proxyCredit.creareCont("EUR");
        proxyCredit.creareCont("RON");

    }
}

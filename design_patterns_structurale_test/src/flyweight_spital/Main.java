package flyweight_spital;

public class Main {
    public static void main(String[] args) {
        FabricaPacienti fabricaPacienti = new FabricaPacienti();

        Reteta reteta1 = new Reteta("Omega 3");
        Reteta reteta2 = new Reteta("Suplimente sportive");

        fabricaPacienti.getPacient(1, "Ditanu", 21).printareReteta(reteta1);
        fabricaPacienti.getPacient(2, "Yessir", 23).printareReteta(reteta1);
        fabricaPacienti.getPacient(3, "Alexandru", 45).printareReteta(reteta2);
    }
}

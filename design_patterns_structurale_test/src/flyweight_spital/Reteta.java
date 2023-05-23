package flyweight_spital;

public class Reteta {
    private String nume;

    public Reteta(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                '}';
    }
}

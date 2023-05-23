package flyweight_spital;

public class Pacient implements IPacient {
    private String nume;
    private int varsta;
    private int id;

    public Pacient(int id, String nume, int varsta) {
        this.id  = id;
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void printareReteta(Reteta reteta) {
        System.out.println(this.toString() + " " + reteta.toString());
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", varsta='" + varsta + '\'' +
                ", id=" + id +
                '}';
    }
}

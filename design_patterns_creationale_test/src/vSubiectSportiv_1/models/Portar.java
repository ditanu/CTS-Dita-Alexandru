package vSubiectSportiv_1.models;

public class Portar implements Jucator {
    private String nume;
    private int varsta;

    protected Portar(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void descriere() {
        System.out.println("Portarul: " + this.nume + " " + this.varsta);
    }

    @Override
    public String toString() {
        return "Portar{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

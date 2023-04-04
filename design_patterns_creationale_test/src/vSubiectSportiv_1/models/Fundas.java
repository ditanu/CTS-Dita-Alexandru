package vSubiectSportiv_1.models;

public class Fundas implements Jucator{
    private String nume;
    private int varsta;

    protected Fundas(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void descriere() {
        System.out.println("Fundasul: " + this.nume + " " + this.varsta);
    }

    @Override
    public String toString() {
        return "Fundas{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

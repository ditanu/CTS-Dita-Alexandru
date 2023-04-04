package vSubiectSportiv_1.models;

public class Atacant implements Jucator{
    private String nume;
    private int varsta;

    protected Atacant(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void descriere() {
        System.out.println("Atacantul: " + this.nume + " " + this.varsta);
    }

    @Override
    public String toString() {
        return "Atacant{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}

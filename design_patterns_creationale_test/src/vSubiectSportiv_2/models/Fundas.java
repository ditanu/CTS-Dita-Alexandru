package vSubiectSportiv_2.models;

import vSubiectSportiv_2.models.Jucator;

public class Fundas implements Jucator {
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
}

package vSubiectBanca_1.models;

public class NevoiPersonale implements Credit {

    private String nume;
    private int totalBani;

    protected NevoiPersonale(String nume, int totalBani) {
        this.nume = nume;
        this.totalBani = totalBani;
    }

    @Override
    public void descriere() {
        System.out.println("Credit nevoi personale: " + this.nume + " " + this.totalBani);
    }
}

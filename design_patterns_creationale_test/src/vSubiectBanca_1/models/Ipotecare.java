package vSubiectBanca_1.models;

public class Ipotecare implements Credit{

    private String nume;
    private int totalBani;

    protected Ipotecare(String nume, int totalBani) {
        this.nume = nume;
        this.totalBani = totalBani;
    }

    @Override
    public void descriere() {
        System.out.println("Credit ipotecar: " + this.nume + " " + this.totalBani);

    }
}

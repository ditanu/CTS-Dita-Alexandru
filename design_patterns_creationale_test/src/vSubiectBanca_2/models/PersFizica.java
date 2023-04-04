package vSubiectBanca_2.models;

public class PersFizica implements Persoana{
    private String nume;

    protected PersFizica(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Persoana fizica cu numele: " + this.nume);
    }
}

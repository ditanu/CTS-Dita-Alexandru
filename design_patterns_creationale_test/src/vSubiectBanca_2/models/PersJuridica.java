package vSubiectBanca_2.models;

public class PersJuridica implements Persoana{
    private String nume;

    protected PersJuridica(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Persoana juridica cu numele: " + this.nume);
    }
}

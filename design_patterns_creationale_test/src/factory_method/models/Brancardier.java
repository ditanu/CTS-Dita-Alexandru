package factory_method.models;

public class Brancardier implements PersonalSpital {
    private String nume;

    protected Brancardier(String nume) {
        this.nume = nume;
    }
    public void descriere() {
        System.out.println("Brancardierul: " + this.nume);
    }
}

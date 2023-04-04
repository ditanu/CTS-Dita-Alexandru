package vSubiectBanca_4.models;

public class Cont implements ICont {
    private String nume;
    private String prenume;

    public Cont(){

    }

    public Cont(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    @Override
    public ICont clone() {
        Cont contNou = new Cont();
        contNou.nume = this.nume;
        contNou.prenume = this.prenume;
        return contNou;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}

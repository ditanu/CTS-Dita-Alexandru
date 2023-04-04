package vSubiectBanca_2.models;

public class FactoryPersJuridica implements Factory {
    @Override
    public Persoana crearePersoana(String nume) {
        return new PersJuridica(nume);
    }
}

package vSubiectBanca_2.models;

public class FactoryPersFizica implements Factory{
    @Override
    public Persoana crearePersoana(String nume) {
        return new PersFizica(nume);
    }
}

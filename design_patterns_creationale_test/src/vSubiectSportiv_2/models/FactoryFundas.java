package vSubiectSportiv_2.models;

public class FactoryFundas implements Factory{
    @Override
    public Jucator creareJucator(String nume, int varsta) {
        return new Fundas(nume, varsta);
    }
}

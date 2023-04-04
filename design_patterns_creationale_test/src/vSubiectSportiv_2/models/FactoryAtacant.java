package vSubiectSportiv_2.models;

public class FactoryAtacant implements Factory {
    @Override
    public Jucator creareJucator(String nume, int varsta) {
        return new Atacant(nume, varsta);
    }
}

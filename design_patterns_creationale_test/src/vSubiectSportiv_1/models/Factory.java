package vSubiectSportiv_1.models;

public class Factory {
    public Jucator createObject(String nume, int varsta, TipJucator tipJucator) {
        switch(tipJucator) {
            case FUNDAS:
                return new Fundas(nume, varsta);
            case ATACANT:
                return new Atacant(nume, varsta);
            case PORTAR:
                return new Portar(nume, varsta);
            default:
                return null;
        }
    }
}

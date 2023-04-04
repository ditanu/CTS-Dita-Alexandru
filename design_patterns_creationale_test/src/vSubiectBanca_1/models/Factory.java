package vSubiectBanca_1.models;

public class Factory {
    public Credit creareObject(String nume, int totalBani, TipCredit tipCredit) {
        switch(tipCredit) {
            case Ipotecare:
                return new Ipotecare(nume, totalBani);
            case NevoiPersonale:
                return new NevoiPersonale(nume, totalBani);
            default:
                return null;
        }

    }
}

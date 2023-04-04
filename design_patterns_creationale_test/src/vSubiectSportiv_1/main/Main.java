package vSubiectSportiv_1.main;

import vSubiectSportiv_1.models.Factory;
import vSubiectSportiv_1.models.Jucator;
import vSubiectSportiv_1.models.Portar;
import vSubiectSportiv_1.models.TipJucator;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Jucator portar = factory.createObject("Ditanu", 21, TipJucator.PORTAR);
        portar.descriere();

        Jucator atacant = factory.createObject("Ionel", 65, TipJucator.ATACANT);
        atacant.descriere();

        Jucator fundas = factory.createObject("Dan", 34, TipJucator.FUNDAS);
        fundas.descriere();
    }
}

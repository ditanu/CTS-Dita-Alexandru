package vSubiectSportiv_2.main;

import vSubiectSportiv_2.models.*;

public class Main {
    public static void main(String[] args) {
        Factory factoryAtacant = new FactoryAtacant();
        Jucator atacant1 =  factoryAtacant.creareJucator("Ditanu", 29);
        atacant1.descriere();

        Factory factoryFundas = new FactoryFundas();
        Jucator fundas1 = factoryFundas.creareJucator("Ramos", 34);
        fundas1.descriere();

    }
}

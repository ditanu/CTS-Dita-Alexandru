package vSubiectBanca_1.main;

import vSubiectBanca_1.models.Credit;
import vSubiectBanca_1.models.Factory;
import vSubiectBanca_1.models.Ipotecare;
import vSubiectBanca_1.models.TipCredit;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Credit> listaCredite = new ArrayList<>();

        Factory factory = new Factory();
        Credit credit1 = factory.creareObject("Daa", 30000, TipCredit.NevoiPersonale);
        Credit credit2 = factory.creareObject("Nuuu", 10000, TipCredit.Ipotecare);
        Credit credit3 = factory.creareObject("Yesss", 550000, TipCredit.Ipotecare);

        listaCredite.add(credit1);
        listaCredite.add(credit2);
        listaCredite.add(credit3);

        for (Credit credit : listaCredite) {
            credit.descriere();
        }

    }
}

package vSubiectBanca_2.main;

import vSubiectBanca_2.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Factory factoryPersFizica = new FactoryPersFizica();
        Persoana persFizic1 = factoryPersFizica.crearePersoana("Ditanu");
        Persoana persFizic2 = factoryPersFizica.crearePersoana("Ionel");

        Factory factoryPersJuridica = new FactoryPersJuridica();
        Persoana persoanaJuridica1 = factoryPersJuridica.crearePersoana("Pascalopol");
        Persoana persoanaJuridica2 = factoryPersJuridica.crearePersoana("Iulia");

        List<Persoana> listaPersoane = new ArrayList<>();
        listaPersoane.add(persFizic1);
        listaPersoane.add(persFizic2);
        listaPersoane.add(persoanaJuridica1);
        listaPersoane.add(persoanaJuridica2);

        for (Persoana pers : listaPersoane) {
            pers.descriere();
        }

    }
}

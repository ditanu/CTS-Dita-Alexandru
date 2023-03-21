package factory_method.main;

import factory_method.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Factory factoryAsistenti = new FactoryAsistenti();
        Factory factoryMedici = new FactoryMedici();
        Factory factoriBrancardieri = new FactoryBrancardieri();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryAsistenti.crearePersonal("Ionescu"));
        listaPersonal.add(factoryAsistenti.crearePersonal("Andrei"));
        listaPersonal.add(factoryMedici.crearePersonal("Cristian"));
        listaPersonal.add(factoriBrancardieri.crearePersonal("Oprescu"));

        for(PersonalSpital personalSpital: listaPersonal) {
            personalSpital.descriere();
        }
    }

}


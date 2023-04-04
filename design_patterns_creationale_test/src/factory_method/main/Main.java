package factory_method.main;

import factory_method.models.Factory;
import factory_method.models.FactoryAsistenti;
import factory_method.models.FactoryBrancardieri;
import factory_method.models.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factoryAsistenti = new FactoryAsistenti();
        Factory factoryBrancardieri = new FactoryBrancardieri();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryAsistenti.crearePersonal("Ditanu"));
        listaPersonal.add(factoryAsistenti.crearePersonal("Ionut"));
        listaPersonal.add(factoryBrancardieri.crearePersonal("Diana"));
        listaPersonal.add(factoryBrancardieri.crearePersonal("Delia"));

        for (PersonalSpital personalSpital : listaPersonal) {
            personalSpital.descriere();
        }
    }
}

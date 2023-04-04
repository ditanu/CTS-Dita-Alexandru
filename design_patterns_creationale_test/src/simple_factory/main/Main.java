package simple_factory.main;

import simple_factory.models.Factory;
import simple_factory.models.PersonalSpital;
import simple_factory.models.TipPersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        PersonalSpital brancardier = factory.createObject(TipPersonalSpital.BRANCARDIER, "Ditanu");
        PersonalSpital asistent = factory.createObject(TipPersonalSpital.ASISTENT, "Iuliana");
        PersonalSpital medic = factory.createObject(TipPersonalSpital.MEDIC, "Matei");

        listaPersonal.add(brancardier);
        listaPersonal.add(asistent);
        listaPersonal.add(medic);

        for(PersonalSpital personalSpital : listaPersonal) {
            personalSpital.descriere();
        }
    }
}

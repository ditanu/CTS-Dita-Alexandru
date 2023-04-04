package simple_factory;

import simple_factory.clase.Factory;
import simple_factory.clase.PersonalSpital;
import simple_factory.clase.TipPersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        List<PersonalSpital> listaPersonal = new ArrayList<>();

        PersonalSpital brancardier = factory.createObject(TipPersonalSpital.BRANCARDIER, "Georgica");
        PersonalSpital asistent = factory.createObject(TipPersonalSpital.ASISTENT, "Iulia");
        PersonalSpital medic = factory.createObject(TipPersonalSpital.MEDIC, "Dan");

        listaPersonal.add(brancardier);
        listaPersonal.add(asistent);
        listaPersonal.add(medic);

        listaPersonal.add(factory.createObject(TipPersonalSpital.BRANCARDIER, "Alexandru"));
        listaPersonal.add(factory.createObject(TipPersonalSpital.MEDIC, "Maria"));
        listaPersonal.add(factory.createObject(TipPersonalSpital.ANESTEZIST, "Iustin", 20));

        for(PersonalSpital personalSpital: listaPersonal) {
            personalSpital.descriere();
        }



    }
}

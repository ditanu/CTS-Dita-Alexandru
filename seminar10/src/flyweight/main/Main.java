package flyweight.main;

import flyweight.models.FabricaSpectatori;
import flyweight.models.PozitieDesenare;

public class Main {
    public static void main(String[] args) {
        FabricaSpectatori fabricaSpectatori = new FabricaSpectatori();
        PozitieDesenare pozitie1 = new PozitieDesenare(20, 10, "Rosu");
        PozitieDesenare pozitie2 = new PozitieDesenare(25, 8, "Galben");
        PozitieDesenare pozitie3 = new PozitieDesenare(24, 12, "Albastru");

        fabricaSpectatori.getSpectator(1, 50, 100).deseneazaSpectator(pozitie3);
        fabricaSpectatori.getSpectator(2, 13.5f, 16).deseneazaSpectator(pozitie2);
        fabricaSpectatori.getSpectator(1, 50, 100).deseneazaSpectator(pozitie2);



    }
}

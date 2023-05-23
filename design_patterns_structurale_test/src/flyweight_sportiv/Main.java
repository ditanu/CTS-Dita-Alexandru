package flyweight_sportiv;

public class Main {
    public static void main(String[] args) {

        PozitieDesenare pozitieDesenare1 = new PozitieDesenare("ROSU");
        PozitieDesenare pozitieDesenare2 = new PozitieDesenare("Albastru");


        FabricaSpectator fabricaSpectator = new FabricaSpectator();
        fabricaSpectator.getSpectator(1, 15, 15).desenarePozitie(pozitieDesenare1);
        fabricaSpectator.getSpectator(2, 20, 30).desenarePozitie(pozitieDesenare1);
        fabricaSpectator.getSpectator(3, 50, 50).desenarePozitie(pozitieDesenare2);

    }
}

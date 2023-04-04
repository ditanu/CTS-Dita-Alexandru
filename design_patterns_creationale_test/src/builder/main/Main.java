package builder.main;

import builder.models.Builder;
import builder.models.BuilderPacient;
import builder.models.Pacient;

public class Main {
    public static void main(String[] args) {
        Builder builderPacient = new BuilderPacient();
        Pacient primPacient = builderPacient.setNume("Ditanu").setPatRabatabil(true).build();
        Pacient doiPacient = builderPacient.setNume("Lolec").setMicDejunInclus(true).setPatRabatabil(false).setHalatPentruInterior(true).build();

        System.out.println(primPacient.toString());
        System.out.println(doiPacient.toString());
    }
}

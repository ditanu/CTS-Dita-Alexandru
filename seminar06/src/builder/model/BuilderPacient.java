package builder.model;

public class BuilderPacient implements Builder{
    Pacient pacient;

    public BuilderPacient(String nume) {
        pacient = new Pacient(nume);
    }

    @Override
    public BuilderPacient setNume(String nume) {
       throw new IllegalArgumentException("Not applicabel!");
    }

    @Override
    public BuilderPacient setPatRabatabil(boolean patRabatabil) {
        pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    @Override
    public BuilderPacient setMicDejunsInclus(boolean micDejunsInclus) {
        pacient.setMicDejunsInclus(micDejunsInclus);
        return this;
    }

    @Override
    public BuilderPacient setPapuciDeCamera(boolean papuciDeCamera) {
        pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    @Override
    public BuilderPacient setHalatPentruInterior(boolean halatPentruInterior) {
        pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}

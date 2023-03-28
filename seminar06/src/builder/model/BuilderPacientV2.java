package builder.model;

public class BuilderPacientV2 implements Builder{
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunsInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;


    public BuilderPacientV2() {
        this.nume = "Anonim";
        this.halatPentruInterior = false;
        this.patRabatabil = false;
        this.micDejunsInclus = false;
        this.papuciDeCamera = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume, this.patRabatabil, this.micDejunsInclus, this.papuciDeCamera, this.halatPentruInterior);
    }

    @Override
    public Builder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    @Override
    public Builder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    @Override
    public Builder setMicDejunsInclus(boolean micDejunsInclus) {
        this.micDejunsInclus = micDejunsInclus;
        return this;
    }

    @Override
    public Builder setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    @Override
    public Builder setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
        return this;
    }
}

package builder.models;

public class BuilderPacient implements Builder {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public BuilderPacient() {
        this.nume = "Anonim";
        this.halatPentruInterior = false;
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
    }

    public Builder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public Builder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public Builder setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public Builder setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
        return this;
    }

    public Builder setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(this.nume, this.patRabatabil, this.micDejunInclus, this.papuciDeCamera, this.halatPentruInterior);
    }
}

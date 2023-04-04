package builder.models;

public class Pacient {
    private String nume;
    private boolean patRabatibil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Pacient(String nume, boolean patRabatibil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.nume = nume;
        this.patRabatibil = patRabatibil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setPatRabatibil(boolean patRabatibil) {
        this.patRabatibil = patRabatibil;
    }

    protected void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    protected void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    protected void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", patRabatibil=" + patRabatibil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }
}

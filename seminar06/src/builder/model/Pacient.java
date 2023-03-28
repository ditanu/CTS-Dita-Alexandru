package builder.model;

public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunsInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;

    public Pacient(String nume) {
        this.nume = nume;
        this.patRabatabil = false;
        this.micDejunsInclus = false;
        this.papuciDeCamera = false;
        this.halatPentruInterior = false;
    }

    protected Pacient(String nume, boolean patRabatabil, boolean micDejunsInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.nume = nume;
        this.patRabatabil = patRabatabil;
        this.micDejunsInclus = micDejunsInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejunsInclus(boolean micDejunsInclus) {
        this.micDejunsInclus = micDejunsInclus;
    }

    protected void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    protected void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "builder.model.Pacient{" +
                "nume='" + nume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejunsInclus=" + micDejunsInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }
}

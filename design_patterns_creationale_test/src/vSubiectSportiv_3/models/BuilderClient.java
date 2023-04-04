package vSubiectSportiv_3.models;

public class BuilderClient implements Builder{
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacarotioare;
    private boolean muzicaAmbientala;

    public BuilderClient() {
        this.mancareInclusa = false;
        this.scaunErgonomic = false;
        this.bauturaRacarotioare = false;
        this.muzicaAmbientala = false;
    }

    @Override
    public Client build() {
        return new Client(this.mancareInclusa, this.scaunErgonomic, this.bauturaRacarotioare, this.muzicaAmbientala);
    }

    public Builder setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public Builder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public Builder setBauturaRacarotioare(boolean bauturaRacarotioare) {
        this.bauturaRacarotioare = bauturaRacarotioare;
        return this;
    }

    public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }
}

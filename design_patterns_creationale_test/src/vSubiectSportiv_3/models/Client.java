package vSubiectSportiv_3.models;

public class Client {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacarotioare;
    private boolean muzicaAmbientala;

    protected Client(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacarotioare, boolean muzicaAmbientala) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacarotioare = bauturaRacarotioare;
        this.muzicaAmbientala = muzicaAmbientala;
    }

    @Override
    public String toString() {
        return "Client{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacarotioare=" + bauturaRacarotioare +
                ", muzicaAmbientala=" + muzicaAmbientala +
                '}';
    }
}

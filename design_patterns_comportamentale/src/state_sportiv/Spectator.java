package state_sportiv;

import state_bancomat.StateAreCard;

public class Spectator {
    private IState stare;
    private String nume;

    public Spectator(String nume) {
        this.nume = nume;
        this.stare = new Liber();

    }
    public IState getStare() {
        return stare;
    }

    public void setStare(IState stare) {
        this.stare = stare;
    }

    public void staiJos() {
        IState staJos = new Ocupat();
        stare.schimbareStare(this);
    }

}

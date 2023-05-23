package strategy_sportiv;

public class Jandarm {
    private Strategy strategie;
    private String nume;

    public Jandarm(String nume) {
        this.nume = nume;
        this.strategie = new VerificarePeluza();
    }

    public void setStrategie(Strategy strategie){
        this.strategie = strategie;
    }

    public void verificaSpectator(Spectator spectator) {
        this.strategie.modVerificare(spectator);
    }
}

package strategy_sportiv;

public class Main {
    public static void main(String[] args) {
        Spectator spectator1 = new Spectator("Gigel");
        Spectator spectator2 = new Spectator("Doom");
        Spectator spectator3 = new Spectator("Puff");

        Jandarm jandarm1 = new Jandarm("Aurel");
        jandarm1.verificaSpectator(spectator1);

        jandarm1.setStrategie(new VerificareTribuna());
        jandarm1.verificaSpectator(spectator1);
    }
}

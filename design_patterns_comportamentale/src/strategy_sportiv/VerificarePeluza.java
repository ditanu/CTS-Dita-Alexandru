package strategy_sportiv;

public class VerificarePeluza implements Strategy{
    @Override
    public void modVerificare(Spectator spectator) {
        System.out.println("Este verificat la peluza " + spectator.getNume());
    }
}

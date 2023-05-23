package strategy_sportiv;

public class VerificareTribuna implements Strategy{
    @Override
    public void modVerificare(Spectator spectator) {
        System.out.println("Este verificat la tribuna " + spectator.getNume());

    }
}

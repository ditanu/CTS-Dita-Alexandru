package state_sportiv;

public class Liber implements IState{
    @Override
    public void schimbareStare(Spectator spectator) {
        if (spectator.getStare() instanceof Ocupat) {
            System.out.println("Locul este liber acum!");
            spectator.setStare(this);
        } else {
            System.out.println("Locul nu este inca liber");
        }
    }
}

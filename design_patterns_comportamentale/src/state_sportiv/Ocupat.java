package state_sportiv;

public class Ocupat implements IState{

    @Override
    public void schimbareStare(Spectator spectator) {
        if (spectator.getStare() instanceof Liber) {
            System.out.println("Locul a fost ocupat!");
             spectator.setStare(this);
        } else {
            System.out.println("Locul nu a fost ocupat!");
        }
    }
}

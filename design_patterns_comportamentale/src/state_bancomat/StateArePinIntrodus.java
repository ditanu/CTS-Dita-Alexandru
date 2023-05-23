package state_bancomat;

public class StateArePinIntrodus implements IState {
    @Override
    public void modificaStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StateAreCard) {
            bancomat.setStare(this);
            System.out.println("Acum se introduce pin-ul cardului!");
        } else {
            System.out.println("Introduceti pin-ul corect!");
        }
    }
}

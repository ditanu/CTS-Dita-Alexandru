package state_bancomat;

public class StateAreCard implements IState {
    @Override
    public void modificaStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StateNuAreCard) {
            bancomat.setStare(this);
            System.out.println("A fost introdus un card in bancomat!");
        } else {
            System.out.println("Este deja un card introdus in bancomat!");
        }
    }
}

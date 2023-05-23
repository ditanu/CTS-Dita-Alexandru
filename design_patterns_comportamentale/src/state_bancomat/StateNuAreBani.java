package state_bancomat;

public class StateNuAreBani implements IState{
    @Override
    public void modificaStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StateAreCard) {
            bancomat.setStare(this);
            System.out.println("Vezi ca nu ai destui bani!");
        }
    }
}

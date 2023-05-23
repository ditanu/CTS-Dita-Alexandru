package state_bancomat;

public class StateNuAreCard implements IState {
    @Override
    public void modificaStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StateAreCard || bancomat.getStare() instanceof StateNuAreBani) {
            bancomat.setStare(this);
            System.out.println("Cardul a fost scos din bancomat!");
        } else {
            System.out.println("Cardul nu este bagat in bancomat!");
        }
    }
}

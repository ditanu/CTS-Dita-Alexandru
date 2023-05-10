package state.classes;

public class StareArePinIntrodus implements  IStare{
    @Override
    public void modificaStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof StareAreCard) {
            bancomat.setStare(this);
            System.out.println("A fost introdus PIN-ul");
        } else {
            System.out.println("Introduceti pin-ul corect");
        }
    }
}

package state.classes;

public class StareNuAreBani implements IStare{
    @Override
    public void modificaStare(Bancomat bancomat) {
        if (bancomat.getStare() instanceof  StareAreCard) {
            bancomat.setStare(this);
            System.out.println("Bancomatul nu are bani");
        }
    }
}

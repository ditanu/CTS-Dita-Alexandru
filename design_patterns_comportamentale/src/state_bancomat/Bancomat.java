package state_bancomat;

public class Bancomat {
    private IState stare;
    private int baniRamasi;

    public Bancomat(int baniRamasi) {
        this.stare = new StateNuAreCard();
        this.baniRamasi = baniRamasi;
    }

    public IState getStare() {
        return stare;
    }

    public void setStare(IState stare) {
        this.stare = stare;
    }

    public void introduceCard() {
        IState areCard = new StateAreCard();
        stare.modificaStare(this);
    }


}

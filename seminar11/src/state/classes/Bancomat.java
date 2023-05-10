package state.classes;

public class Bancomat {
    private IStare stare;
    private Integer baniRamasi;

    public Bancomat(Integer baniRamasi) {
        this.baniRamasi = baniRamasi;
        stare = new StareNuAreCard();
    }

    public IStare getStare() {
        return stare;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }

    public void introduceCard() {
        IStare areCard = new StareAreCard();
        stare.modificaStare(this);
    }

    public void introducePIN(){
        IStare stare = new StareArePinIntrodus();
        stare.modificaStare(this);
    }

    public void retrageBani(Integer suma) {
        if (stare instanceof StareArePinIntrodus) {
            if (baniRamasi >= suma) {
                System.out.println("A fost retrasa suma de " + suma);
                baniRamasi = baniRamasi - suma;
                if (baniRamasi == 0) {
                    IStare stare =new StareNuAreBani();
                    stare.modificaStare(this);
                }
            }
        }
    }

    public void retrageCard() {
        IStare stare = new StareNuAreCard();
        stare.modificaStare(this);
    }


}

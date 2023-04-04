package vSubiectBanca_3.models;

public class Cont {
    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    protected Cont(boolean contSalariu, boolean cardAtasat, boolean internetBanking) {
        this.contSalariu = contSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    protected void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    protected void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    protected void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "contSalariu=" + contSalariu +
                ", cardAtasat=" + cardAtasat +
                ", internetBanking=" + internetBanking +
                '}';
    }
}

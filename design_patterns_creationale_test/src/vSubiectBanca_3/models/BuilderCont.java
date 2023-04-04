package vSubiectBanca_3.models;

public class BuilderCont implements Builder {
    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public BuilderCont() {
        this.contSalariu = false;
        this.cardAtasat = false;
        this.internetBanking = false;
    }

    @Override
    public Cont build() {
        return new Cont(this.contSalariu, this.cardAtasat, this.internetBanking);
    }

    @Override
    public Builder setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
        return this;

    }

    @Override
    public Builder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    @Override
    public Builder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

}


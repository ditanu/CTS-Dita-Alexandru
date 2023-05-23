package decorator_sportiv2;

public abstract class Decorator implements IBilet {
    private IBilet bilet;

    public Decorator(IBilet bilet) {
        this.bilet = bilet;
    }

    public IBilet getBilet() {
        return bilet;
    }

    @Override
    public void printBilet() {
        this.getBilet().printBilet();
        printeazaEchipaGazda();
    }

    @Override
    public String getNumeEchipa1() {
        return this.getBilet().getNumeEchipa1();
    }

    public abstract void printeazaEchipaGazda();
}

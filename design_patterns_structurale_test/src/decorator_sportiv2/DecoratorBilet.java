package decorator_sportiv2;

public class DecoratorBilet extends Decorator {

    public DecoratorBilet(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeazaEchipaGazda() {
        System.out.println("Sustinem echipa gazda " + super.getNumeEchipa1());
    }
}

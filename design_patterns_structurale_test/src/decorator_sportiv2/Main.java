package decorator_sportiv2;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1 = new Bilet("Steaua", "Dinamo", "Dita");
        Decorator decoratorBilet = new DecoratorBilet(bilet1);

        decoratorBilet.printBilet();
    }
}

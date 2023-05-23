package decorator_sportiv;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new Bilet("Mircea", "Romania", "Germania");
        IBilet bilet2 = new Bilet("Mircea", "Romania", "Spania");
        IBilet bilet3 = new Bilet("Mircea", "Qatar", "Islanda");

        bilet.printareBilet();
        bilet2.printareBilet();
        bilet3.printareBilet();
        System.out.println("-----------------");

        Decorator decoratorBilet = new DecoratorBilet(bilet);
        Decorator decoratorBilet2 = new DecoratorBilet(bilet2);
        decoratorBilet.printareBilet();
        decoratorBilet2.printareBilet();

    }
}
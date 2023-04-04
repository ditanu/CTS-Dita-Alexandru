package prototype.deep.main;

import prototype.deep.models.Autobuz;
import prototype.deep.models.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("IF01DIT", 30);
        Autobuz autobuzCopy = (Autobuz) autobuz.clone();

        autobuzCopy.setNrLocuri(80);

        System.out.println(autobuz);
        System.out.println(autobuzCopy);
    }
}

package prototype.shallow.main;

import prototype.shallow.models.Autobuz;
import prototype.shallow.models.MijlocTransport;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz = new Autobuz("IF01DIT", 30);
        Autobuz autobuzCopy = (Autobuz) autobuz.copiaza();

        autobuzCopy.setNrLocuri(80);

        System.out.println(autobuz);
        System.out.println(autobuzCopy);


    }
}

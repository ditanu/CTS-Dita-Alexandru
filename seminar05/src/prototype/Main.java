package prototype;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("IF01DIT", 25);
        MijlocTransport autobuzCopy = autobuz.clone();
        Autobuz autobuzCopy2 =(Autobuz)autobuzCopy.clone();

        System.out.println(autobuz.toString());
        System.out.println(autobuzCopy.toString());

        autobuzCopy2.setNumarInmatriculare("IF22XML");
        System.out.println(autobuzCopy2.toString());
    }
}

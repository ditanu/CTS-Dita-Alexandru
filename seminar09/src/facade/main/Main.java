package facade.main;

import facade.clase.Autobuz;
import facade.clase.AutobuzSimplificat;

public class Main {
    public static void main(String[] args) {
//        Autobuz autobuz = new Autobuz("B109RFG");
//
//        autobuz.deschideUsaMijloc();
//        autobuz.deschideUsaFata();
//        autobuz.deschideUsaSpate();

        System.out.println("Autobuz => FACADE");
        AutobuzSimplificat autobuzFacade = new AutobuzSimplificat("B109RFG");
        autobuzFacade.deschideUsi();

    }
}

package composite_banca;

import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        IFiliala filiala1 = new Filiala("filiala1");
        IFiliala filiala2 = new Filiala("filiala2");
        IFiliala filiala3 = new Filiala("filiala3");
        IFiliala filiala4 = new Filiala("filiala4");

        IFiliala agentie1 = new Grup("Agentii");
        agentie1.adaugaNod(filiala1);
        agentie1.adaugaNod(filiala2);
//        agentie.afisareFiliale();

        IFiliala agentie2 = new Grup("Agentii2");
        agentie2.adaugaNod(filiala3);
        agentie2.adaugaNod(filiala4);

        IFiliala sucursala = new Grup("Surcusala");
        sucursala.adaugaNod(agentie1);
        sucursala.adaugaNod(agentie2);
        sucursala.afisareFiliale();

    }
}

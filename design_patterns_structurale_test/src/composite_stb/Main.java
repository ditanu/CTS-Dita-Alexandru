package composite_stb;


import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Element autobuz1 = new Autobuz("Mercedez", 1000, 9);
        Element autobuz2 = new Autobuz("Mercedez", 500, 5);
        Element autobuz3 = new Autobuz("BMW", 2000, 30);

        autobuz1.afisareSumaAsigurare();

        Element grup1 = new Grup("grup-mica");
        grup1.adaugaGrup(autobuz1);
        grup1.adaugaGrup(autobuz2);

        grup1.afisareSumaAsigurare();

        Element  flota = new Grup("flota");
        flota.adaugaGrup(grup1);
        flota.adaugaGrup(autobuz3);
        flota.afisareSumaAsigurare();


    }
}

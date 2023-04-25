package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Grup;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        Element autobuz1 = new Autobuz("Mercedes", 3000, 9);
        Element autobuz2 = new Autobuz("Mercedes", 2500, 7);

        Element grupAutobuzeMici = new Grup("Autobuze Mici");
        try {
            grupAutobuzeMici.adaugaGrup(autobuz1);
            grupAutobuzeMici.adaugaGrup(autobuz2);
            grupAutobuzeMici.afisareSumaAsigurare();
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }

        Element autobuz3 = new Autobuz("BMW", 5000, 15);
        Element autobuz4 = new Autobuz("FORD", 4000, 15);

        Element grupAutobuzeMijlocii = new Grup("Autobuze Mijlocii");
        try {
            grupAutobuzeMijlocii.adaugaGrup(autobuz3);
            grupAutobuzeMijlocii.adaugaGrup(autobuz4);
            grupAutobuzeMijlocii.afisareSumaAsigurare();
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }

        Element flota = new Grup("Autobuze");
        try {
            flota.adaugaGrup(grupAutobuzeMici);
            flota.adaugaGrup(grupAutobuzeMijlocii);
            flota.afisareSumaAsigurare();
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }

        Element autobuzVIP = new Autobuz("VIP", 9000, 34);
        try {
            flota.adaugaGrup(autobuzVIP);
            flota.afisareSumaAsigurare();
        } catch (ExecutionControl.NotImplementedException e) {
            throw new RuntimeException(e);
        }
    }
}

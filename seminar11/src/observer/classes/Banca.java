package observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca{

    public List<IClient> obsevatori;
    public String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.obsevatori = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IClient client) {
        this.obsevatori.add(client);
    }

    @Override
    public void stergereObserver(IClient client) {
        this.obsevatori.remove(client);
    }

    @Override
    public void notifica(String mesaj) {
        for(IClient observator: obsevatori) {
            observator.afiseazaMesaj(mesaj);
        }
    }

    public void adaugaTipCreditNou() {
        notifica(numeBanca + ": Am adaugat un nou tip de credit, daca doriti sa il accesati ne puteti contacta pentru mai multe detalii!");
    }

    public void actualizeazaAplicatia() {
        notifica(numeBanca + ": Aplicatia a fost actualizata");
    }
}

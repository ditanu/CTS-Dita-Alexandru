package observer_banca;

import java.util.ArrayList;
import java.util.List;

public class Banca implements IBanca{
    private String nume;
    private List<IClient> listaObservatori;


    public Banca(String nume) {
        this.nume = nume;
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IClient client) {
        this.listaObservatori.add(client);
    }

    @Override
    public void stergeOvserver(IClient client) {
        this.listaObservatori.remove(client);
    }

    @Override
    public void notifica(String mesaj) {
        for (IClient client : listaObservatori) {
            client.afiseazaMesaj(mesaj);
        }
    }

    public void adaugaCreditNou(){
        notifica(this.nume + " Bai vedeti ca s-a adaugat un credit nou!");
    }

    public void adaugaAplicatie(){
        notifica(this.nume + " Bai vedeti ca s-a adaugat o aplicatie noua!");
    }

}

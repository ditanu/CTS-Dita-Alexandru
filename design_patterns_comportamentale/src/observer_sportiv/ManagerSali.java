package observer_sportiv;

import java.util.ArrayList;
import java.util.List;

public class ManagerSali implements IManagerSali {
    private List<IClient> observatori;
    private String nume;

    public ManagerSali(String nume) {
        this.nume = nume;
        this.observatori = new ArrayList<>();
    }

    @Override
    public void notifica(String mesaj) {
        for (IClient client : observatori) {
            client.afiseazaMesaj(mesaj);
        }
    }

    @Override
    public void abonareClient(IClient client) {
        this.observatori.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.observatori.remove(client);
    }

    public void meciDeFotbal(){
        notifica("Vezi ca vin niste meciuri de fotbal");
    }
}

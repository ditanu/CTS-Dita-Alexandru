package observer_sportiv;

import observer_sportiv.Client;
import observer_sportiv.IClient;

public class Main {
    public static void main(String[] args) {
        ManagerSali managerSali = new ManagerSali("Gigek");

        IClient client1 = new Client("Baros");
        IClient client2 = new Client("Beton");

        managerSali.abonareClient(client1);
        managerSali.abonareClient(client2);

        managerSali.meciDeFotbal();

    }
}

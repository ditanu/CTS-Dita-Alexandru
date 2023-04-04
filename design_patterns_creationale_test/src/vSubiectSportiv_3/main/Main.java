package vSubiectSportiv_3.main;

import vSubiectSportiv_3.models.Builder;
import vSubiectSportiv_3.models.BuilderClient;
import vSubiectSportiv_3.models.Client;

public class Main {
    public static void main(String[] args) {
        BuilderClient builderClient = new BuilderClient();

        Client client1= builderClient.setMancareInclusa(true).build();
        System.out.println(client1.toString());

        Client client2 = builderClient.setScaunErgonomic(true).build();
        System.out.println(client2.toString());

        BuilderClient builderClient2 = new BuilderClient();
        Client client3 = builderClient2.setMuzicaAmbientala(true).build();
        System.out.println(client3.toString());
    }
}

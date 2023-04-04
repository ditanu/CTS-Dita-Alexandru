package vSubiectSportiv_4.main;

import vSubiectSportiv_4.models.Client;
import vSubiectSportiv_4.models.IClient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaPreturi = new ArrayList<>();
        listaPreturi.add(10);
        listaPreturi.add(30);
        listaPreturi.add(50);

        System.out.println(listaPreturi);

        IClient client1 = new Client("Ditanu", listaPreturi);
        IClient client2 = client1.copiaza();

        listaPreturi.add(80);
        System.out.println(client1.toString());
        System.out.println(client2.toString());
    }
}

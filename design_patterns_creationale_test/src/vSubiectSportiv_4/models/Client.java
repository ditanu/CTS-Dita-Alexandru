package vSubiectSportiv_4.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client implements IClient, Serializable {

    private String nume;
    private List<Integer> preturiBileteCumparate;

    public Client() {
        preturiBileteCumparate = new ArrayList<>();
    }

    public Client(String nume, List<Integer> preturiBileteCumparate) {
        this.nume = nume;
        this.preturiBileteCumparate = preturiBileteCumparate;
    }

    @Override
    public IClient copiaza() {
        Client client = new Client();
        client.nume = this.nume;
        List<Integer> listaTemporara = new ArrayList<>();
        for (Integer pret: preturiBileteCumparate) {
            listaTemporara.add(pret);
        }

        client.preturiBileteCumparate = listaTemporara;
        return client;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", preturiBileteCumparate=" + preturiBileteCumparate +
                '}';
    }
}

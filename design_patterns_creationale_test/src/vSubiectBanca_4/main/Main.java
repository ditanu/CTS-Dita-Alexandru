package vSubiectBanca_4.main;

import vSubiectBanca_4.models.Cont;

public class Main {
    public static void main(String[] args) {
        Cont cont = new Cont("ditanu", "alexandru");

        Cont contCopie = (Cont) cont.clone();

        System.out.println(cont.toString());
        System.out.println(contCopie.toString());
    }
}

package command_stb2;

import command_stb.Automobil;

public class Autobuz implements Automobil {
    private int numar;

    public Autobuz(int numar) {
        this.numar = numar;
    }

    @Override
    public void plecareInCursa(int nrLinie) {
        System.out.println("Autobuzul cu nr " + this.numar + " a plecat pe linia " + nrLinie);
    }
}

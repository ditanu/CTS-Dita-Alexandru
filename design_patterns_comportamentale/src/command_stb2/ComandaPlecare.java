package command_stb2;

import command_stb.Automobil;
import command_stb.ICommand;

import java.util.ArrayList;
import java.util.List;

public class ComandaPlecare implements ICommand {
    private int nrLinie;
    private Automobil automobil;

    public ComandaPlecare(int nrLinie, Automobil automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        this.automobil.plecareInCursa(this.nrLinie);
    }
}

package command_stb;

public class ComandaPlecare implements ICommand{

    private int numarLinie;
    private Automobil autobuz;

    public ComandaPlecare(int numarLinie, Automobil autobuz) {
        this.numarLinie = numarLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void execute() {
        this.autobuz.plecareInCursa(this.numarLinie);
    }
}

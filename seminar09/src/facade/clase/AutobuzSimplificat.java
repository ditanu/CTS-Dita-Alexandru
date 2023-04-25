package facade.clase;

//facade
public class AutobuzSimplificat {
    private Autobuz autobuz;

    public AutobuzSimplificat(String nrInmatriculare) {
        autobuz = new Autobuz(nrInmatriculare);
    }

    public void deschideUsi() {
        autobuz.deschideUsaFata();
        autobuz.deschideUsaSpate();
        autobuz.deschideUsaMijloc();
    }

    public void ramaneLiber() {
        autobuz.ramaneLiberFata();
        autobuz.ramaneLiberMijloc();
        autobuz.ramaneLiberSpate();
    }


}

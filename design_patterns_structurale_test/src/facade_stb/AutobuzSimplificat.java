package facade_stb;

public class AutobuzSimplificat {
    private Autobz autobuz;

    public AutobuzSimplificat(String nrInmatriculare) {
        autobuz = new Autobz(nrInmatriculare);
    }

    public void deschidereUsi(){
        autobuz.deschidereUsaFata();
        autobuz.deschidereUsaSpate();
        autobuz.deschidereUsaMijloc();
    }

    public void ramaneLiber(){
        autobuz.ramaneLiberMijloc();
        autobuz.ramaneLiberFata();
        autobuz.ramaneLiberSpate();
    }


}

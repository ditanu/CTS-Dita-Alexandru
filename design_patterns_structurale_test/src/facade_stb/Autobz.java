package facade_stb;

public class Autobz {
    private String nrInmatriculare;

    public Autobz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void deschidereUsaFata() {
        System.out.println("Usa din fata a fost deschisa de catre sofer " + this.nrInmatriculare);
    }

    public void deschidereUsaMijloc() {
        System.out.println("Usa din mijloc a fost deschisa de catre sofer");
    }

    public void deschidereUsaSpate() {
        System.out.println("Usa din spate a fost deschisa de catre sofer");
    }

    public void ramaneLiberFata() {
        System.out.println("Usa din fata poate fi deschisa de catre calatori");
    }

    public void ramaneLiberMijloc() {
        System.out.println("Usa din mijloc poate fi deschisa de catre calatori");
    }

    public void ramaneLiberSpate() {
        System.out.println("Usa din spate poate fi deschisa de catre calatori");
    }

}

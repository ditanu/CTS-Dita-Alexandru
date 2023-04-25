package facade.clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void deschideUsaFata() {
        System.out.println("Usa din fata s-a deschis pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void deschideUsaMijloc() {
        System.out.println("Usa din mijloc s-a deschis pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void deschideUsaSpate() {
        System.out.println("Usa din spate s-a deschis pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void ramaneLiberFata() {
        System.out.println("Usa din fata poate fi deschisa de catre calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void ramaneLiberMijloc() {
        System.out.println("Usa din mijloc poate fi deschisa de catre calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

    public void ramaneLiberSpate() {
        System.out.println("Usa din spate poate fi deschisa de catre calatori pentru autobuzul cu numarul " + this.nrInmatriculare);
    }

}

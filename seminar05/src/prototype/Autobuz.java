package prototype;

public class Autobuz implements MijlocTransport {
    private String numarInmatriculare;
    private int nrLocuri;

    public Autobuz() {
    }

    public Autobuz(String numarInmatriculare, int nrLocuri) {
        if (nrLocuri > 1 && nrLocuri < 50) {
            this.nrLocuri = nrLocuri;
        }
        if (numarInmatriculare.length() == 7) {
            this.numarInmatriculare = numarInmatriculare;
        }
    }

    @Override
    public MijlocTransport clone() {
        Autobuz autobuz = new Autobuz();
        autobuz.numarInmatriculare = this.numarInmatriculare;
        autobuz.nrLocuri = this.nrLocuri;
        return autobuz;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numarInmatriculare='" + numarInmatriculare + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}

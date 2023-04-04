package prototype.shallow.models;

public class Autobuz implements MijlocTransport {

    private String numarInmatriculare;
    private int nrLocuri;

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
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
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numarInmatriculare='" + numarInmatriculare + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}

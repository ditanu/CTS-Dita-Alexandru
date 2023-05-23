package adapter_banca;

public class Firma implements IFirma{
    private String nume;

    public Firma(String nume) {
        this.nume = nume;
    }

    @Override
    public void vanzareBiletTeatru() {
        System.out.println(this.nume + " ai achizionat un bilet la teatru!");
    }
}

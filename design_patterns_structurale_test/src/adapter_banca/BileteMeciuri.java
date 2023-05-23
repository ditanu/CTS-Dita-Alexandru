package adapter_banca;

public class BileteMeciuri implements IBileteMeciuri {
    private String nume;

    public BileteMeciuri(String nume) {
        this.nume = nume;
    }

    @Override
    public void vanzareMeci() {
        System.out.println(this.nume + " ai achizionat un bilet la meci!");
    }
}

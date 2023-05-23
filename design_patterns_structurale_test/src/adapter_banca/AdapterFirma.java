package adapter_banca;

import adapter_restaurant.classes.bar.SoftBar;

public class AdapterFirma extends BileteMeciuri implements IFirma{
    public AdapterFirma(String nume) {
        super(nume);
    }

    @Override
    public void vanzareBiletTeatru() {
        super.vanzareMeci();
    }
}

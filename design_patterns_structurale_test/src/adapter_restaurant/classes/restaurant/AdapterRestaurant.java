package adapter_restaurant.classes.restaurant;

import adapter_restaurant.classes.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftRestaurant {
    public AdapterRestaurant(String bautura) {
        super(bautura);
    }

    @Override
    public void printeazaNota(float totalSuma) {
        super.printeazaNotaBar(totalSuma);
    }
}

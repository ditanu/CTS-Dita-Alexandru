package adapter_restaurant.classes.restaurant;

import adapter_restaurant.classes.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant{

    private ISoftBar softBar;

    public AdapterObiecteRestaurant(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(float totalSuma) {
        this.softBar.printeazaNotaBar(totalSuma);
    }
}

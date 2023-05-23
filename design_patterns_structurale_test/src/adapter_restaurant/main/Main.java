package adapter_restaurant.main;

import adapter_restaurant.classes.bar.ISoftBar;
import adapter_restaurant.classes.bar.SoftBar;
import adapter_restaurant.classes.restaurant.AdapterObiecteRestaurant;
import adapter_restaurant.classes.restaurant.AdapterRestaurant;
import adapter_restaurant.classes.restaurant.ISoftRestaurant;
import adapter_restaurant.classes.restaurant.SoftRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant softRestaurant, float notaPlata) {
        softRestaurant.printeazaNota(notaPlata);
    }

    public static void main(String[] args) {
        ISoftRestaurant restaurant = new SoftRestaurant("Vasile");
        restaurant.printeazaNota(100);
        AdapterRestaurant adapterRestaurant = new AdapterRestaurant("Desperados");
        adapterRestaurant.printeazaNota(100);

        ISoftBar softBar = new SoftBar("Cuba libre");

        AdapterObiecteRestaurant adapterObiecteRestaurant = new AdapterObiecteRestaurant(softBar);
        adapterObiecteRestaurant.printeazaNota(200);

        imprimare(adapterObiecteRestaurant, 200);
    }
}

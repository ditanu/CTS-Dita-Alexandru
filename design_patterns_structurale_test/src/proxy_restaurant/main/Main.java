package proxy_restaurant.main;

import proxy_restaurant.classes.IRestaurant;
import proxy_restaurant.classes.ProxyResturant;
import proxy_restaurant.classes.Restaurant;

public class Main {
    public static void main(String[] args) {
        IRestaurant restaurant = new Restaurant("Resturantos");
        IRestaurant proxyRestaurant = new ProxyResturant(restaurant);
        proxyRestaurant.rezervareMasa(2);
        proxyRestaurant.rezervareMasa(5);
    }
}

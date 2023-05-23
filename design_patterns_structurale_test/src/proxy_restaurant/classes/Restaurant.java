package proxy_restaurant.classes;

public class Restaurant implements IRestaurant{
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    @Override
    public void rezervareMasa(int nrLocuri) {
        System.out.println("Ai facut rezervare de " + nrLocuri + " persoane la restaurantul " + this.name);
    }
}

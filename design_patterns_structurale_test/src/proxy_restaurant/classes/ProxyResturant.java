package proxy_restaurant.classes;

public class ProxyResturant implements IRestaurant{
    private IRestaurant iRestaurant;

    public ProxyResturant(IRestaurant iRestaurant) {
        this.iRestaurant = iRestaurant;
    }

    @Override
    public void rezervareMasa(int nrLocuri) {
        if (nrLocuri >= 4) {
            iRestaurant.rezervareMasa(nrLocuri);
        } else {
            System.out.println("Rezervarea nu a putut fi efecuata deoarece nu sunt 4 sau mai multe persoane!");
        }
    }
}

package restaurant.adapter.bucatarie;

public class Restaurant implements ISoftRestaurant {
    private String numeBucatar;

    public Restaurant(String numeBucatar) {
        this.numeBucatar = numeBucatar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        System.out.println("Nota dumneavoastra este in valoare de " + totalPlata);
    }
}

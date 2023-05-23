package adapter_restaurant.classes.restaurant;

public class SoftRestaurant implements  ISoftRestaurant{
    private String bucatar;

    public SoftRestaurant(String bucatar) {
        this.bucatar = bucatar;
    }

    @Override
    public void printeazaNota(float totalSuma) {
        System.out.println("Mancarea gatita de " + this.bucatar + " costa " + totalSuma);
    }
}

package adapter_restaurant.classes.bar;

public class SoftBar implements ISoftBar{
    private String bautura;

    public SoftBar(String bautura) {
        this.bautura = bautura;
    }

    @Override
    public void printeazaNotaBar(float totalSuma) {
        System.out.println("Nota totala la bautura " + this.bautura + " este de " + totalSuma);
    }
}

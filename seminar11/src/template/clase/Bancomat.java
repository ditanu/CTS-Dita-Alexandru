package template.clase;

public class Bancomat extends BancomatAbstract{

    public Bancomat(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("A fost introdus cardul in bancomatul din " + super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pin-ul " + super.getAdresa());
    }

    @Override
    protected void specificareSuma(int suma) {
        System.out.println("A fost specificata pentru retragere suma de " + suma + " " + super.getAdresa());
    }

    @Override
    protected void retrageSuma() {
        System.out.println("A fost retrasa suma " + " " + super.getAdresa());
    }

    @Override
    protected void retragereCard() {
        System.out.println("A fost retras card-ul " + " " + super.getAdresa());
    }
}

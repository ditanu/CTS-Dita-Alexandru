package composite_stb;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements Element {

    private String producator;
    private int capacitateCilindrica;
    private int nrLocuri;

    public Autobuz(String producator, int capacitateCilindrica, int nrLocuri) {
        this.producator = producator;
        this.capacitateCilindrica = capacitateCilindrica;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        return (float) (capacitateCilindrica * 1.5);
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma de asigurare este " + this.calculeazaSumaAsigurare());
    }

    @Override
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu se poate folosi aceasta metoda!");
    }

    @Override
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu se poate folosi aceasta metoda!");

    }

    @Override
    public Element getGeneralGrup(int index) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu se poate folosi aceasta metoda!");

    }
}

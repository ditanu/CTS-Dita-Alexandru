package composite.clase;

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
        float suma = 1.5f * this.capacitateCilindrica;
        return suma;
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma asigurare autobuz este: " + calculeazaSumaAsigurare());
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

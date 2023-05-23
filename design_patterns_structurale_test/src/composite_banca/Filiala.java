package composite_banca;

import jdk.jshell.spi.ExecutionControl;

public class Filiala implements IFiliala {
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }


    @Override
    public void adaugaNod(IFiliala filiala) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu se poate apela aceasta metoda!");
    }

    @Override
    public void stergeNod(IFiliala filiala) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu se poate apela aceasta metoda!");

    }

    @Override
    public IFiliala getNodCopi(int index) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu se poate apela aceasta metoda!");

    }

    @Override
    public void afisareFiliale() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Filiala{" +
                "nume='" + nume + '\'' +
                '}';
    }
}

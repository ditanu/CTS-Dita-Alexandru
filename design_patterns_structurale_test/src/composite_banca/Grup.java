package composite_banca;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Grup implements IFiliala{
    private String nume;
    private List<IFiliala> filiale;

    public Grup(String nume) {
        this.nume = nume;
        this.filiale = new ArrayList<>();
    }


    @Override
    public void adaugaNod(IFiliala filiala) throws ExecutionControl.NotImplementedException {
        filiale.add(filiala);
    }

    @Override
    public void stergeNod(IFiliala filiala) throws ExecutionControl.NotImplementedException {
        filiale.remove(filiala);
    }

    @Override
    public IFiliala getNodCopi(int index) throws ExecutionControl.NotImplementedException {
        return filiale.get(index);
    }

    @Override
    public void afisareFiliale() {
        for (IFiliala filiala : filiale) {
            filiala.afisareFiliale();
        }
    }
}

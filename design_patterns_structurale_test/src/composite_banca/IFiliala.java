package composite_banca;

import jdk.jshell.spi.ExecutionControl;

public interface IFiliala {
    public void adaugaNod(IFiliala filiala) throws ExecutionControl.NotImplementedException;
    public void stergeNod(IFiliala filiala) throws ExecutionControl.NotImplementedException;
    public IFiliala getNodCopi(int index) throws ExecutionControl.NotImplementedException;
    public void afisareFiliale();

}

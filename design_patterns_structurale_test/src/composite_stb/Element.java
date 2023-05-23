package composite_stb;

import jdk.jshell.spi.ExecutionControl;

public interface Element {
    public float calculeazaSumaAsigurare();
    public void afisareSumaAsigurare();
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException;
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException;
    public Element getGeneralGrup(int index) throws ExecutionControl.NotImplementedException;
}

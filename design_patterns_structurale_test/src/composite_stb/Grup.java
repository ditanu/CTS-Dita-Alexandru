package composite_stb;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {
    private List<Element> elementList;
    private String numeGrup;

    public Grup(String numeGrup) {
        this.numeGrup = numeGrup;
        this.elementList = new ArrayList<>();
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma = 0;
        for(Element element: elementList) {
            suma += element.calculeazaSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma asigurare la grup este: " + calculeazaSumaAsigurare());
    }

    @Override
    public void adaugaGrup(Element element) throws ExecutionControl.NotImplementedException {
        elementList.add(element);
    }

    @Override
    public void stergeGrup(Element element) throws ExecutionControl.NotImplementedException {
        elementList.remove(element);
    }

    @Override
    public Element getGeneralGrup(int index) throws ExecutionControl.NotImplementedException {
        return elementList.get(index);
    }
}

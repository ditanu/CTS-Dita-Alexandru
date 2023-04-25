package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Element {
    public List<Element> elemente;
    private String denumireGrup;

    public Grup(String denumireGrup) {
        this.elemente = new ArrayList<>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma = 0;
        for (Element element : elemente) {
            suma += element.calculeazaSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void afisareSumaAsigurare() {
        System.out.println("Suma asigurare pentru grup este: " + calculeazaSumaAsigurare());
    }

    @Override
    public void adaugaGrup(Element element) {
        this.elemente.add(element);
    }

    @Override
    public void stergeGrup(Element element) {
        this.elemente.remove(element);
    }

    @Override
    public Element getGeneralGrup(int index) {
        return elemente.get(index);
    }
}
